package monopoly.monopolygame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Dice extends JPanel implements ActionListener {
   private final int numberOfSides;
   private int faceValue;
   private final JButton rollButton;

   public Dice(int numberOfSides) {
      this.numberOfSides = numberOfSides;
      this.rollButton = new JButton("Roll");
      this.rollButton.addActionListener(this);
      this.add(rollButton);
   }

   @Override
   public void paintComponent(Graphics g) {
      super.paintComponent(g);
      int panelWidth = getWidth();
      int panelHeight = getHeight();
      int diceSize = Math.min(panelWidth, panelHeight) - 50;
      int x = (panelWidth - diceSize) / 2;
      int y = (panelHeight - diceSize) / 2;
      g.setColor(Color.white);
      g.fillRect(x, y, diceSize, diceSize);
      g.setColor(Color.black);
      g.drawRect(x, y, diceSize, diceSize);
      if (faceValue == 1 || faceValue == 3 || faceValue == 5) {
         g.fillOval(x + diceSize / 2 - 5, y + diceSize / 2 - 5, 10, 10); 
      }
      if (faceValue == 2 || faceValue == 3 || faceValue == 4 || faceValue == 5 || faceValue == 6) {
         g.fillOval(x + 10, y + 10, 10, 10); 
         g.fillOval(x + diceSize - 20, y + diceSize - 20, 10, 10);
      }
      if (faceValue == 4 || faceValue == 5 || faceValue == 6) {
         g.fillOval(x + 10, y + diceSize - 20, 10, 10); 
         g.fillOval(x + diceSize - 20, y + 10, 10, 10); 
      }
      if (faceValue == 6) {
         g.fillOval(x + 10, y + diceSize / 2 - 5, 10, 10); 
         g.fillOval(x + diceSize - 20, y + diceSize / 2 - 5, 10, 10); 
      }
   }

   @Override
   public void actionPerformed(ActionEvent e) {
      Random rand = new Random();
      this.faceValue = rand.nextInt(this.numberOfSides) + 1;
      repaint();
   }
   public void roll() {
    Random rand = new Random();
    this.faceValue = rand.nextInt(6) + 1;
  }

  public int getFaceValue() {
    return this.faceValue;
  }
   public static void main(String[] args) {
      JFrame frame = new JFrame("Dice Panel");
      Dice dicePanel = new Dice(6);
      frame.getContentPane().add(dicePanel);
      frame.setSize(300, 300);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}