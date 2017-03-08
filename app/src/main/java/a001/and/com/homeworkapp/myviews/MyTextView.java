package a001.and.com.homeworkapp.myviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.TextView;

import a001.and.com.homeworkapp.R;

/**
 * Created by zhaojipu on 2017/2/22.
 */

public class MyTextView extends TextView {
    public Paint mPaint;
    public Paint mPaint1;
    public Paint mPaint2;

    public int mWidth;
    public MyTextView(Context context) {
        super(context);
        init();
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint1=new Paint();
        mPaint1.setColor(getResources().getColor(R.color.colorAccent));
        mPaint1.setStyle(Paint.Style.FILL);
        mPaint2=new Paint();
        mPaint2.setColor(getResources().getColor(R.color.colorPrimary));
        mPaint2.setStyle(Paint.Style.FILL);
    }

    int mTranslate=0;
    @Override
    protected void onDraw(Canvas canvas) {
//        canvas.drawRect(0,0,getMeasuredWidth()-10,getMeasuredHeight()-10,mPaint1);
//        canvas.drawRect(10,10,getMeasuredWidth()-20,getMeasuredHeight()-20,mPaint2);
////        canvas.save();
//
//        canvas.translate(10,0);
        super.onDraw(canvas);
//        canvas.restore();

        if(matrix!=null){
            mTranslate+=mWidth/5;
            if(mTranslate>2*mWidth)
                mTranslate=-mWidth;
            matrix.setTranslate(mTranslate,0);
            mLinearGradient.setLocalMatrix(matrix);
            postInvalidateDelayed(1000);
        }
    }

    LinearGradient mLinearGradient;
    Matrix matrix;

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        mWidth=getMeasuredWidth();
        if (mWidth==0){
            mWidth=getMeasuredWidth();
            if(mWidth>0){
                mPaint=getPaint();
                mLinearGradient=new LinearGradient(0,
                        0,
                        mWidth,
                        0,
                        new int[]{
                                0xffffffff,
                                0xff00ffff,
                                0xff0000ff
                        },null, Shader.TileMode.CLAMP);
                mPaint.setShader(mLinearGradient);
                matrix=new Matrix();
            }
        }
    }
}
