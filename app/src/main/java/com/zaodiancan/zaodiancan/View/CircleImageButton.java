package com.zaodiancan.zaodiancan.View;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.widget.ImageButton;

/**
 * Created by charles on 4/22/15.
 */
public class CircleImageButton extends ImageButton {
    public CircleImageButton(Context context) {
        super(context);
    }

    public CircleImageButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CircleImageButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int mWidth = Math.min(getMeasuredWidth(), getMeasuredHeight());
        int mRadius = mWidth / 2;
        setMeasuredDimension(mWidth, mWidth);

    }
}
