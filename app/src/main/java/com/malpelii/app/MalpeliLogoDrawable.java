package com.malpelii.app;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public class MalpeliLogoDrawable extends Drawable {
    private Paint paint;
    private String text = "MALPELI";

    public MalpeliLogoDrawable() {
        paint = new Paint();
        paint.setColor(Color.WHITE);
        paint.setTextSize(80f);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setFakeBoldText(true);
    }

    @Override
    public void draw(Canvas canvas) {
        int width = getBounds().width();
        int height = getBounds().height();
        
        // Center the text
        float x = width / 2f;
        float y = height / 2f + paint.getTextSize() / 3f; // Adjust for text baseline
        
        canvas.drawText(text, x, y, paint);
    }

    @Override
    public void setAlpha(int alpha) {
        paint.setAlpha(alpha);
    }

    @Override
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        paint.setColorFilter(colorFilter);
    }

    @Override
    public int getOpacity() {
        return android.graphics.PixelFormat.TRANSLUCENT;
    }
} 