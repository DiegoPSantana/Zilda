package com.zelda.game;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

public class GamePanel extends JPanel implements Runnable {

    public static int width;
    public static int height;

    private Thread thread;
    private BufferedImage img;
    private Graphics2D g;
    private boolean running = false;

    public GamePanel(int width, int height){
        this.width = width;
        this.height = height;
        setPreferredSize(new Dimension(width, height));
        setFocusable(true);
        requestFocus();
    }

    public void addNotify(){
        super.addNotify();

        if(thread == null){
            thread = new Thread(this, "GameThread");
            thread.start();
        }
    }

    public void init(){
        running = true;

        img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        g = (Graphics2D) img.getGraphics();
    }

    public void run(){
        init();

        while(running){
            update();
            render();
            draw();
        }
    }

    private int x = 0;

    public void update(){
    x++;
    System.out.println(x);
    }

    public void render(){

    }
    public void draw(){

    }
    // stop the minutes 12:03

}
