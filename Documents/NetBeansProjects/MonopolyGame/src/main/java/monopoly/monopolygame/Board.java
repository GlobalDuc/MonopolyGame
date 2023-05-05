/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monopoly.monopolygame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Board extends JFrame {

    protected ArrayList<Square> allSquare = new ArrayList<>();
    protected ArrayList<Square> unBuyAbleSquares = new ArrayList<>();
    protected int screenWidth = 1536;
    protected int screenHeight = 864;

    public Board() {
        setTitle("Monopoly");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Board panel
        JPanel panelGame = new JPanel();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelGame.setBounds(0, 0, screenWidth, screenHeight);
        panelGame.setBackground(new Color(236, 185, 57));
        initializeCell();
    }

    public void initializeCell() {
        String[] squareNames = {
            "GO",
            "Ha Noi",
            "Community Chest",
            "Hai Phong",
            "Phu Yen",
            "Cao Bang",
            "Lang Son",
            "Thai Nguyen",
            "JAIL",
            "Son La",
            "Squeeze Play",
            "Ha Tien",
            "Da Nang",
            "Community Chest",
            "Binh Thuan",
            "Ninh Thuan",
            "FREE PARKING",
            "Khanh Hoa",
            "Pay Taxes",
            "Binh Duong",
            "Ho Chi Minh",
            "Dong Nai",
            "Squeeze Play",
            "Tay Ninh",
            "GO TO JAIL",
            "Vung Tau",
            "Long An",
            "Ben Tre",
            "Chance",
            "Vinh Long",
            "Phan Thiet",
            "Quang Ngai"
        };

        // squares on the top
        int x_top = 6;
        int y_top = 6;

        Square square00 = new Square(16, y_top, 110, 100, squareNames[0], -45);
        this.add(square00);
        allSquare.add(square00);
        unBuyAbleSquares.add(square00);

        Square square01 = new Square(126, y_top, 80, 100, squareNames[1], 0);
        this.add(square01);
        allSquare.add(square01);

        Square square02 = new Square(206, y_top, 105, 100, squareNames[2], 0);
        this.add(square02);
        allSquare.add(square02);
        unBuyAbleSquares.add(square02);

        Square square03 = new Square(306, y_top, 80, 100, squareNames[3], 0);
        this.add(square03);
        allSquare.add(square03);

        Square square04 = new Square(386, y_top, 80, 100, squareNames[4], 0);
        this.add(square04);
        allSquare.add(square04);

        Square square05 = new Square(466, y_top, 80, 100, squareNames[5], 0);
        this.add(square05);
        allSquare.add(square05);

        Square square06 = new Square(546, y_top, 80, 100, squareNames[6], 0);
        this.add(square06);
        allSquare.add(square06);

        Square square07 = new Square(626, y_top, 80, 100, squareNames[7], 0);
        this.add(square07);
        allSquare.add(square07);

        Square square08 = new Square(706, y_top, 110, 100, squareNames[8], 45);
        this.add(square08);
        allSquare.add(square08);
        unBuyAbleSquares.add(square08);

        // squares on the right
        int x_right = 706;
        int y_right = 106;

        Square square09 = new Square(x_right, 106, 110, 80, squareNames[9], 0);
        this.add(square09);
        allSquare.add(square09);

        Square square10 = new Square(x_right, 186, 110, 80, squareNames[10], 0);
        this.add(square10);
        allSquare.add(square10);
        unBuyAbleSquares.add(square10);

        Square square11 = new Square(x_right, 266, 110, 80, squareNames[11], 0);
        this.add(square11);
        allSquare.add(square11);

        Square square12 = new Square(x_right, 346, 110, 80, squareNames[12], 0);
        this.add(square12);
        allSquare.add(square12);

        Square square13 = new Square(x_right, 426, 110, 80, squareNames[13], 0);
        this.add(square13);
        allSquare.add(square13);
        unBuyAbleSquares.add(square13);

        Square square14 = new Square(x_right, 506, 110, 80, squareNames[14], 0);
        this.add(square14);
        allSquare.add(square14);

        Square square15 = new Square(x_right, 586, 110, 80, squareNames[15], 0);
        this.add(square15);
        allSquare.add(square15);

        Square square16 = new Square(x_right, 666, 110, 100, squareNames[16], -45);
        this.add(square16);
        allSquare.add(square16);
        unBuyAbleSquares.add(square16);

        // squares on the bottom
        int x_bot = 606;
        int y_bot = 666;

        Square square17 = new Square(626, y_bot, 80, 100, squareNames[17], 0);
        this.add(square17);
        allSquare.add(square17);

        Square square18 = new Square(546, y_bot, 80, 100, squareNames[18], 0);
        this.add(square18);
        allSquare.add(square18);
        unBuyAbleSquares.add(square18);

        Square square19 = new Square(466, y_bot, 80, 100, squareNames[19], 0);
        this.add(square19);
        allSquare.add(square19);

        Square square20 = new Square(386, y_bot, 80, 100, squareNames[20], 0);
        this.add(square20);
        allSquare.add(square20);

        Square square21 = new Square(306, y_bot, 80, 100, squareNames[21], 0);
        this.add(square21);
        allSquare.add(square21);

        Square square22 = new Square(206, y_bot, 100, 100, squareNames[22], 0);
        this.add(square22);
        allSquare.add(square22);
        unBuyAbleSquares.add(square22);

        Square square23 = new Square(126, y_bot, 80, 100, squareNames[23], 0);
        this.add(square23);
        allSquare.add(square23);

        Square square24 = new Square(16, y_bot, 110, 100, squareNames[24], 45);
        this.add(square24);
        allSquare.add(square24);
        unBuyAbleSquares.add(square24);

        // squares on the left
        int x_left = 16;
        int y_left = 586;

        Square square25 = new Square(x_left, 586, 110, 80, squareNames[25], 0);
        this.add(square25);
        allSquare.add(square25);

        Square square26 = new Square(x_left, 506, 110, 80, squareNames[26], 0);
        this.add(square26);
        allSquare.add(square26);

        Square square27 = new Square(x_left, 426, 110, 80, squareNames[27], 0);
        this.add(square27);
        allSquare.add(square27);

        Square square28 = new Square(x_left, 346, 110, 100, squareNames[28], 0);
        this.add(square28);
        allSquare.add(square28);
        unBuyAbleSquares.add(square28);

        Square square29 = new Square(x_left, 266, 110, 80, squareNames[29], 0);
        this.add(square29);
        allSquare.add(square29);

        Square square30 = new Square(x_left, 186, 110, 80, squareNames[30], 0);
        this.add(square30);
        allSquare.add(square30);

        Square square31 = new Square(x_left, 106, 110, 80, squareNames[31], 0);
        this.add(square31);
        allSquare.add(square31);

        JLabel lblMonopoly = new JLabel("MONOPOLY") {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                super.paintComponent(g);
            }
        };
        lblMonopoly.setForeground(new Color(107, 227, 29));
        lblMonopoly.setBackground(Color.WHITE);
        lblMonopoly.setOpaque(true);
        lblMonopoly.setHorizontalAlignment(SwingConstants.CENTER);
        lblMonopoly.setFont(new Font("Lucida Grande", Font.BOLD, 60));
        lblMonopoly.setBounds(176, 316, 500, 120);
        this.add(lblMonopoly);

    }
}
