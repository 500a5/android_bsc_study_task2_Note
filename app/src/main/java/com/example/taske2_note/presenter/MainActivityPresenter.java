package com.example.taske2_note.presenter;

import android.content.Intent;

import com.example.taske2_note.model.Model;
import com.example.taske2_note.view.View;
import com.example.taske2_note.view.View2;

import static androidx.core.content.ContextCompat.startActivity;

public class MainActivityPresenter {

    private View view;
    private Model model;


    public MainActivityPresenter(View view) {
        this.model = new Model();
        this.view = view;
    }

    public void save() {
        model.save(view.getText());
        view.showToast();

    }



}