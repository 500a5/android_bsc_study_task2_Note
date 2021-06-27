package com.example.taske2_note.presenter;

import android.util.Log;

import com.example.taske2_note.model.Model;
import com.example.taske2_note.view.MainActivity;
import com.example.taske2_note.view.ViewInterface;

import static androidx.constraintlayout.motion.utils.Oscillator.TAG;

public class Presenter implements ViewInterface.Presenter {

    private ViewInterface.MainActivity view;
    private Model model;


    public Presenter(MainActivity view) {
        this.model = new Model();
        this.view = view;
    }

    public void save(String s) {
        model.save(view.getText());
        view.putText(s);
        view.showToast();
    }

    public void openGoogle (){
        view.openGoole();
    }

    public void share(){
        view.share();
    }

    public void about(){
        view.about();
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy()");
    }


}