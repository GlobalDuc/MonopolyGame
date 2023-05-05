package monopoly.monopolygame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JPanel;

public abstract class Dice extends JPanel implements ActionListener {
   private int faceValue;
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
   public void roll() {
    Random rand = new Random();
    this.faceValue = rand.nextInt(6) + 1;
  }

  public int getFaceValue() {
    return this.faceValue;
  }
}