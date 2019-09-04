package com.example.myassignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void changeAction(View v) throws NumberFormatException {
        TextView messageText = findViewById(R.id.messageText);
        EditText copiesET = findViewById(R.id.copiesET);
        //String current=messageText.getText().toString();
        Integer myNum = 0;
        StringBuilder current=new StringBuilder();
        myNum = Integer.parseInt(copiesET.getText().toString());
        String na="na";
        current.append("Ba&");
        StringBuilder newString=new StringBuilder();
        EditText myFirstString = findViewById(R.id.myFirstString);
        newString.append(myFirstString.getText().toString());
        EditText mySecondString = findViewById(R.id.mySecondString);
        newString.append(mySecondString.getText().toString());
        if(myNum<=100) {
            for (int i = 0; i < myNum; i++) {
                current.append(na);
            }
            messageText.setText(current);
            messageText.setTextSize(15);
            messageText.setTextColor(Color.rgb(200, 0, 0));
            messageText.setTypeface(Typeface.SANS_SERIF);
            //messageText.setTypeface(Typeface.MONOSPACE);

            //((Button) v).setText("clicked");
            if (myNum <= 100) {
                for (int i = 0; i < myNum; i++) {
                    newString.append(na);
                }
                TextView messageText1= findViewById(R.id.messageText1);
                messageText1.setText(newString);
                //messageText.setTextSize(15);
                // messageText.setTextColor(Color.rgb(200, 0, 0));
                // messageText.setTypeface(Typeface.SANS_SERIF);
                //messageText.setTypeface(Typeface.MONOSPACE);

                //((Button) v).setText("clicked");
            }
        }
    }

}
