package com.flappyclone.game.objects;

public class Bird {
    private float x;
    private float y;
    private float velocity;
    private final float gravity = 0.5f;

    public Bird(float startX, float startY) {
        this.x = startX;
        this.y = startY;
        this.velocity = 0;
    }

    public void flap() {
        this.velocity = -10; // Flap reduces velocity
    }

    public void update() {
        this.velocity += gravity; // Apply gravity
        this.y += velocity; // Update the bird's position
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}