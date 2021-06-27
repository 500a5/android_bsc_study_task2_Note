package com.example.taske2_note.view;

public interface ViewInterface {

     interface Presenter{
          void save(String s);
          void onDestroy();
     }

     interface MainActivity{
          void showToast();
          void putText(String s);
          String getText();
          void openGoole();
          void share();
          void about();
     }

     interface Model{
          void save(String text);
     }
}
