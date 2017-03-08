package a001.and.com.homeworkapp.thread;

import android.content.Context;

/**
 * Created by zhaojipu on 2017/2/16.
 */

public class Animal {
    private static Animal animal;

    private Animal(Context context) {
    }
    public static Animal getAnimal(Context context){
        if(animal==null){
            animal=new Animal(context.getApplicationContext());
            context.getResources();
        }
        return animal;
    }
}
