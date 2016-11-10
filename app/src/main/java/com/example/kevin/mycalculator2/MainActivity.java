package com.example.kevin.mycalculator2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1;
    EditText editText2;
    TextView viewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = (EditText) findViewById(R.id.editNumber1);
        editText2 = (EditText) findViewById(R.id.editNumber2);
        viewResult = (TextView) findViewById(R.id.textResult);
    }
    public void calcWork(View view){
        String num1String=editText1.getText().toString();
        String num2String=editText2.getText().toString();

        double num1=0;
        double num2=0;

        try {
            num1=Double.parseDouble(num1String);
            num2=Double.parseDouble(num2String);
            double result=num1/num2;
            viewResult.setText(String.format(num1String+"/"+num2String+"=%.2f",result));
        }
        catch (NumberFormatException e) {
            viewResult.setText("Falsche Eingabe");
            e.printStackTrace();
        }
    }
    public void buttonAbout(View view){
        Intent indent=new Intent(this,DisplayAboutActivity.class);
        String message=viewResult.getText().toString();
        indent.putExtra("MyMessage",message);
        startActivity(indent);
    }

}
