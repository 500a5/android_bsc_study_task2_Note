package com.example.taske2_note.view;



import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import android.widget.Toast;

import com.example.taske2_note.R;
import com.example.taske2_note.model.Model;
import com.example.taske2_note.presenter.MainActivityPresenter;

import static androidx.core.content.ContextCompat.startActivity;

public class View extends Activity {

    private  EditText editText;
    private MainActivityPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        presenter = new MainActivityPresenter(this);


        editText = (EditText) findViewById(R.id.editText);
        findViewById(R.id.button).setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                presenter.save();
            }
        });

        findViewById(R.id.button2).setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {
                Intent intent = new Intent(View.this, View2.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.button4).setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                Uri address = Uri.parse("https://www.google.ru/");
                Intent  intent = new Intent(Intent.ACTION_VIEW, address);
                startActivity( intent);


            }
        });
        findViewById(R.id.button3).setOnClickListener(new android.view.View.OnClickListener() {
            @Override
            public void onClick(android.view.View view) {

                String text = "ee";
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,text);
                //почему то это не работает и рушится, пишет что в следующей строке ошибка
                startActivity(intent);
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
}