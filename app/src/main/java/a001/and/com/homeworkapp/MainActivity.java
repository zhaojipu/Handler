package a001.and.com.homeworkapp;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.Stack;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tv_movie)
    TextView tvMovie;
    @Bind(R.id.activity_main)
    RelativeLayout activityMain;


    @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        StringBuilder sb = new StringBuilder();

        ActivityManager manager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);

        int memory=manager.getMemoryClass();

        Log.d("------","memory:"+memory+"\n"+manager.getLargeMemoryClass()+"");

        tvMovie.setText("1111:"+memory);

    }

    public void onClick(View view){
        startActivity(new Intent(this,ListViewActivity.class));
    }
}
