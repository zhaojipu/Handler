package a001.and.com.homeworkapp.thread;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by zhaojipu on 2017/1/9.
 */

public class MyTextView extends View {
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
        widthMeasureSpec=MeasureSpec.AT_MOST;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
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
}
