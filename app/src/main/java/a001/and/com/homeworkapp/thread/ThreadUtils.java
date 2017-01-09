package a001.and.com.homeworkapp.thread;

import android.os.Handler;
import android.os.Message;

/**
 * 线程工具类
 *
 * Created by zhaojipu on 2016/12/15.
 */

public class ThreadUtils {
    public Thread xiaohong;
    public Thread xiaowang;
    Handler handler;
    public void thread1(){
        xiaohong=new Thread(){
            @Override
            public void run() {
                handler=new Handler(new Handler.Callback() {
                    @Override
                    public boolean handleMessage(Message msg) {
                        return false;
                    }
                });
            }
        };

    }

}
