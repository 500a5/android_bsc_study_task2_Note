package com.example.taske2_note.view;



import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.text.Editable;
import android.widget.EditText;
import android.widget.Toast;

import com.example.taske2_note.R;
import com.example.taske2_note.presenter.Presenter;

public class MainActivity extends Activity implements ViewInterface.MainActivity {

    private  EditText editText;
    private Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){

        presenter = new Presenter(this);

        editText = (EditText) findViewById(R.id.editText);

        findViewById(R.id.button).setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                presenter.save(getText());
            }
        });

        findViewById(R.id.button2).setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
               presenter.about();
            }
        });

        findViewById(R.id.button4).setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                presenter.openGoogle();
            }
        });

        findViewById(R.id.button3).setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                presenter.share();
            }
        });

    }

    public void showToast() {
        Toast.makeText(this, "Данные сохранены", Toast.LENGTH_SHORT).show();
    }

    public String getText(){
        Editable text = editText.getText();
        return text.toString();
    }
    public void putText(String s){
        editText.setText(s);
    }

    public void openGoole(){
        Uri address = Uri.parse("https://www.google.ru/");
        Intent  intent = new Intent(Intent.ACTION_VIEW, address);
        startActivity( intent);
    }

    public void share(){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("plan/text") ;
        intent.putExtra(Intent.EXTRA_TEXT, getText());
        startActivity(intent);
    }
    public void about(){
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

}