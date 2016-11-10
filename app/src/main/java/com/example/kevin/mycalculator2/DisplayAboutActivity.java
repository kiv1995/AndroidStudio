package com.example.kevin.mycalculator2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.kevin.mycalculator2.R.id.activity_main;

public class DisplayAboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_about);
        Intent intent=getIntent();
        String message = intent.getStringExtra("MyMessage");
        TextView view=(TextView) findViewById(R.id.textView);
        view.setText(message);
    }
    public void goBack(View view){
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }

}
