package a001.and.com.homeworkapp;


import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.Map;

import a001.and.com.homeworkapp.thread.Animal;


public class HandlerActivity extends AppCompatActivity {

    static Map<String,Object> map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);

        Bundle bundle;
        test();

        Animal.getAnimal(this);

    }

    private void test(){
        map.put("this",this);
    }
    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    public void onClick(View view){
        finish();
        this.startService(new Intent());
        this.getApplicationContext();
    }
}
