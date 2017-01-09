package a001.and.com.homeworkapp;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    Context allContext;
    Context mContext;
    @Bind(R.id.tv_movie)
    TextView tvMovie;
    @Bind(R.id.activity_main)
    RelativeLayout activityMain;


    private Handler handler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        allContext = getApplicationContext();
        mContext = this;

        Message message = handler.obtainMessage();
        message.sendToTarget();

    }

    public void onClick(View view) {

        startActivity(new Intent(this,HandlerActivity.class));


        new AsyncTask<String,Void,String>(){
            @Override
            protected String doInBackground(String... params) {
                return null;
            }

            @Override
            protected void onPostExecute(String s) {

            }
        };





    }
}
