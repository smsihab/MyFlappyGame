package com.flappyclone.game.objects;

import java.util.Random;

public class Pipe {
    private int height;
    private int width;
    private int gap;
    private Random random;

    public Pipe(int width, int gap) {
        this.width = width;
        this.gap = gap;
        this.random = new Random();
        this.height = randomHeight();
    }

    private int randomHeight() {
        // Generate a random height for the pipe
        return random.nextInt(300) + 100; // height between 100 and 400
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getGap() {
        return gap;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}