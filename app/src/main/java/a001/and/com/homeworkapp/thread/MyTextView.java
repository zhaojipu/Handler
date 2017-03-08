package a001.and.com.homeworkapp.thread;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/**
 * Created by zhaojipu on 2017/1/9.
 */

public class MyTextView extends TextView {
    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        super.onMeasure(measureWidth(widthMeasureSpec), measureHeight(heightMeasureSpec));
    }

    private int measureWidth(int width){
        int result=200;
        int specMode=MeasureSpec.getMode(width);
        int size=MeasureSpec.getSize(width);
        if(specMode==MeasureSpec.EXACTLY){
            result=size;

        }else {
            result=200;
            if(specMode==MeasureSpec.AT_MOST){
                result=Math.min(size,result);
            }
        }
     return result;
    }

    private int measureHeight(int height){
        int resule=50;
        int specMode=MeasureSpec.getMode(height);
        int size=MeasureSpec.getSize(height);
        if(specMode==MeasureSpec.EXACTLY){
            resule=size;
        }else{
            if(specMode==MeasureSpec.AT_MOST){
                resule=Math.min(resule,size);
            }
        }
        return resule;
    }
}
