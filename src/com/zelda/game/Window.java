package com.zelda.game;

import javax.swing.JFrame;

public class Window extends JFrame {


    public Window(){
        setTitle("You Mom"); // Titulo
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Fechar
        setContentPane(new GamePanel(1280, 720));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
