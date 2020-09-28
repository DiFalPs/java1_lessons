package ru.geekbrains;
import java.awt.*;

public class Sprite {
    protected float x;
    protected float y;
    protected float halfWidth;
    protected float halfHeight;
    protected float WIN_W;
    protected float WIN_H;


    protected float getW_W () {
        return WIN_W;
    }
    protected float getW_H () {
        return WIN_H;
    }

    protected float getLeft() {
        return x - halfWidth;
    }
    protected void setLeft(float left) {
        x = left + halfWidth;
    }
    protected float getRight() {
        return x + halfWidth;
    }
    protected void setRight(float right) {
        x = right - halfWidth;
    }
    protected float getTop() {
        return y - halfHeight;
    }
    protected void setTop(float top) {
        y = top + halfHeight;
    }
    protected float getBottom() {
        return y + halfHeight;
    }
    protected void setBottom(float bottom) {
        y = bottom - halfHeight;
    }
    protected float getWidth() {
        return 2f * halfWidth;
    }
    protected float getHeight() {
        return 2f * halfHeight;
    }
    void update(GameCanvas canvas, float deltaTime) {}
    void render(GameCanvas canvas, Graphics g) {}
}
