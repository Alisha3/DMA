package com.example.todo_first;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String[] tasks = {"breakfast", "study", "lunch", "college", "snacks", "internet"};
    private TextView textView;
    int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);

    }

    public void preButton(View view){
        currentIndex--;
        textView.setText(tasks[currentIndex]);
    }

    public void nextButton(View view){
        currentIndex++;
        textView.setText(tasks[currentIndex]);
    }
}
