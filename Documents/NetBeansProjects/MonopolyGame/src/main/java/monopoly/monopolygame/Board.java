/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package monopoly.monopolygame;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author PC
 */
public class Board extends JFrame{

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
        JLabel lblMonopoly = new JLabel("MONOPOLY") {
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
