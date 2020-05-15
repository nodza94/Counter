package com.example.licznik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

class ExtraMessage extends MainActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
}

public class MainActivity extends AppCompatActivity {

    private int _counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void updateCounterView(){
        TextView tv = findViewById(R.id.counter_view);
        String counterVal = String.valueOf(_counter);
        tv.setText(counterVal);
    }

    public void inc(View view) {
        _counter++;
        updateCounterView();
    }
    public void dec(View view) {
        _counter--;
        updateCounterView();
    }
    public void zero(View view) {
        _counter = 0;
        updateCounterView();
        TextView offsetTV = findViewById(R.id.offset_view);
        offsetTV.setText("");
    }
    public void insert(View view) {
        EditText editText = (EditText) findViewById(R.id.offset_view);
        String message = editText.getText().toString();
        if (!message.isEmpty()) {
            _counter = Integer.parseInt(message);
            updateCounterView();
        }
    }
}
