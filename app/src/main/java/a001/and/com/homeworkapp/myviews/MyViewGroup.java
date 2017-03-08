package a001.and.com.homeworkapp.myviews;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;
import android.widget.LinearLayout;

/**
 * Created by zhaojipu on 2017/2/22.
 */

public class MyViewGroup extends LinearLayout {
    public static String tag="MyViewGroup";
    public MyViewGroup(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.i(tag,"onDraw");
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }
}
