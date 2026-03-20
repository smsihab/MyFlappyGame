package com.flappyclone.game;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class GameView extends View {
    private Paint paint;

    public GameView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public GameView(Context context) {
        super(context);
        init();
    }

    private void init() {
        paint = new Paint();
        paint.setColor(0xFF00FF00); // Example color
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // Custom rendering logic here
        canvas.drawRect(0, 0, getWidth(), getHeight(), paint);
    }
}