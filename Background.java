package ru.geekbrains;
import java.awt.*;
import javax.swing.*;

public class Background extends Sprite {
    private static int WINDOW_BG_WIDTH = 800;
    private static int WINDOW_BG_HEIGHT = 600;


    private final Color color = new Color(
            (int)(Math.random() * 255),
            (int)(Math.random() * 255),
            (int)(Math.random() * 255)
    );

    private final Color color1 = new Color(51, 153, 255);



    Background() {
        WIN_W = WINDOW_BG_WIDTH;
        WIN_H = WINDOW_BG_HEIGHT;

    }

    @Override
    void render(GameCanvas canvas, Graphics g) {
        g.setColor(color);
        g.fillRect(0, 0,(int) getW_W(), (int) getW_H());
    }

}
