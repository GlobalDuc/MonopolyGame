package Controller;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.TexturePaint;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.HashMap;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;


public class Player extends JPanel{

	private int playerNumber;
	JLabel lblPlayerNumber;
	static int totalPlayers = 0; // we might need this number later on
	static HashMap<Integer, Integer> ledger= new HashMap<>();
	private int currentSquareNumber = 0; // where player is currently located on (0 - 31). initially zero
	private ArrayList<Integer> titleDeeds = new ArrayList<Integer>(); // squares that the player has
	private int wallet = 1000; // initial money
	private JLabel tInfo = new JLabel();
	protected BufferedImage bufferedImage1, bufferedImage2;
	protected Image img1, img2;




	public ArrayList<Integer> getTitleDeeds() {
		return titleDeeds;
	}
	
	public int getWallet() {
		return wallet;
	}

	public void withdrawFromWallet(int withdrawAmount) {
		if(withdrawAmount > wallet) {
			setVisible(false);
			tInfo.setText("Player "+ playerNumber + " went bankrupt!"); //pop-up box to show the message
			JOptionPane.showMessageDialog(null,tInfo);
		} else {
			wallet -= withdrawAmount;
		}
	}

	public void depositToWallet(int depositAmount) {
		wallet += depositAmount;
		tInfo.setText("Payday for player "+getPlayerNumber()+". You earned $200!"); //pop-up box to show the message
		JOptionPane.showMessageDialog(null,tInfo);
	}

	public int getCurrentSquareNumber() {
		return currentSquareNumber;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public boolean hasTitleDeed(int squareNumber) {
		return titleDeeds.contains(squareNumber) ? true : false;
	}

	public void buyTitleDeed(int squareNumber) {
		if(ledger.containsKey(squareNumber)) {
			tInfo.setText("It's already bought by someone. You cannot buy here.");
			JOptionPane.showMessageDialog(null,tInfo);
		} else {
			titleDeeds.add(this.getCurrentSquareNumber());
			ledger.put(squareNumber, this.getPlayerNumber()); // everytime a player buys a title deed, it is written in ledger, for example square 1 belongs to player 2
		
		}
	}

	private void importImg() {
        InputStream is1 = getClass().getResourceAsStream("/img/cat.png");
        InputStream is2 = getClass().getResourceAsStream("/img/hat.png");

        try {
            bufferedImage1 = ImageIO.read(is1);
        } catch (IOException e) {
            e.printStackTrace();
        }	
		img1 = bufferedImage1.getScaledInstance(40, 40, Image.SCALE_DEFAULT);
		

        try {
            bufferedImage2 = ImageIO.read(is2);
        } catch (IOException e) {
            e.printStackTrace();
        }	
		img2 = bufferedImage2.getScaledInstance(40, 40, Image.SCALE_DEFAULT);

    }

	public Player(int xCoord, int yCoord, int width, int height) {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		setBounds(xCoord, yCoord, 50, 50);
		this.setLayout(null);
		
	}


	public Player(int playerNumber, Color color) {
		importImg();
		this.playerNumber = playerNumber;
	
		if(this.playerNumber == 1){
		ImageIcon icon = new ImageIcon(img1);
		lblPlayerNumber = new JLabel();
		lblPlayerNumber.setIcon(icon);
		this.add(lblPlayerNumber); 
		this.setBounds(playerNumber*20, 33, 30, 30); // need to fix here for adjustable player numbers
		totalPlayers++;}
		
		if(this.playerNumber == 2){
			ImageIcon icon = new ImageIcon(img2);
			lblPlayerNumber = new JLabel();
			lblPlayerNumber.setIcon(icon);
			this.add(lblPlayerNumber); 
			this.setBounds(playerNumber*30,33, 30, 25); // need to fix here for adjustable player numbers
			totalPlayers++;}

	}


	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
	}
	
	int x_top = 6;
	int y_top = 6;
	int x_right =  706;
    int y_right = 106;
	int x_bot = 606;
	int y_bot = 666;
	int x_left = 16;
	int y_left = 586;

	int[] xLocationsOfPlayer1 = {16 + 25,
		126 + 25,
		206 + 25,
		306 + 25,
		386 + 25,
		466 + 25,
		546 + 25,
		626 + 25,
		706 + 25,
		x_right + 25,
		x_right + 25,
		x_right + 25,
		x_right + 25,
		x_right + 25,
		x_right + 25,
		x_right + 25,
		x_right + 25,
		626 + 25,
		546 + 25,
		466 + 25,
		386 + 25,
		306 + 25,
		206 + 25,
		126 + 25,
		16 + 25,
		x_left + 25,
		x_left + 25,
		x_left + 25,
		x_left + 25,
		x_left + 25,
		x_left + 25,
		x_left + 25};

	int[] yLocationsOfPlayer1 = {y_top + 27,
		y_top + 27,
		y_top + 27,
		y_top + 27,
		y_top + 27,
		y_top + 27,
		y_top + 27,
		y_top + 27,
		y_top + 27,
		106 + 27,
		186 + 27,
		266 + 27,
		346 + 27,
		426 + 27,
		506 + 27,
		586 + 27,
		666 + 27,
		y_bot + 27,
		y_bot + 27,
		y_bot + 27,
		y_bot + 27,
		y_bot + 27,
		y_bot + 27,
		y_bot + 27,
		y_bot + 27,
		586 + 27,
		506 + 27,
		426 + 27,
		346 + 27,
		266 + 27,
		186 + 27,
		106 + 27};
	
	int[] xLocationsOfPlayer2 = {16 + 55,
		126 + 55,
		206 + 55,
		306 + 55,
		386 + 55,
		466 + 55,
		546 + 55,
		626 + 55,
		706 + 55,
		x_right + 55,
		x_right + 55,
		x_right + 55,
		x_right + 55,
		x_right + 55,
		x_right + 55,
		x_right + 55,
		x_right + 55,
		626 + 55,
		546 + 55,
		466 + 55,
		386 + 55,
		306 + 55,
		206 + 55,
		126 + 55,
		16 + 55,
		x_left + 55,
		x_left + 55,
		x_left + 55,
		x_left + 55,
		x_left + 55,
		x_left + 55,
		x_left + 55};

		int[] yLocationsOfPlayer2 = {y_top + 27,
			y_top + 27,
			y_top + 27,
			y_top + 27,
			y_top + 27,
			y_top + 27,
			y_top + 27,
			y_top + 27,
			y_top + 27,
			106 + 27,
			186 + 27,
			266 + 27,
			346 + 27,
			426 + 27,
			506 + 27,
			586 + 27,
			666 + 27,
			y_bot + 27,
			y_bot + 27,
			y_bot + 27,
			y_bot + 27,
			y_bot + 27,
			y_bot + 27,
			y_bot + 27,
			y_bot + 27,
			586 + 27,
			506 + 27,
			426 + 27,
			346 + 27,
			266 + 27,
			186 + 27,
			106 + 27};
	

	public void move(int dicesTotal) {
		if(currentSquareNumber + dicesTotal > 31) {
			depositToWallet(200);
		}
		int targetSquare = (currentSquareNumber + dicesTotal) % 32; //%20
		currentSquareNumber = targetSquare;
		
		if(Board.nowPlaying == 0) {
			if(targetSquare == 24) {
				this.setLocation(xLocationsOfPlayer1[8], yLocationsOfPlayer1[8]);
				currentSquareNumber = 8;
			} else 
				this.setLocation(xLocationsOfPlayer1[targetSquare], yLocationsOfPlayer1[targetSquare]);
		} else {
			if(targetSquare == 24) {
				this.setLocation(xLocationsOfPlayer2[8], yLocationsOfPlayer2[8]);
				currentSquareNumber = 8;
			} else
				this.setLocation(xLocationsOfPlayer2[targetSquare], yLocationsOfPlayer2[targetSquare]);
		}
		
		if(ledger.containsKey(this.getCurrentSquareNumber())) {
			Board.infoConsole.setText("This property belongs to player "+ledger.get(this.getCurrentSquareNumber()));
		}
		//ledger.put(this.getCurrentSquareNumber(), this.getPlayerNumber());
	}

	
}