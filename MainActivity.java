package com.example.android.quiz;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the order button is clicked.
     */


    public void points(View view) {

        int score = 0;


        // Question 1
        EditText editText = (EditText) findViewById(R.id.textfield1);
        Editable edi = editText.getText();
        String textfield = edi.toString();

        if (textfield.equals("Warszawa")) {
            score += 1;
        }

        // Question 2
        CheckBox checkBoxA = (CheckBox) findViewById(R.id.checkboxA);
        boolean ischeckBoxA = checkBoxA.isChecked();

        CheckBox checkBoxB = (CheckBox) findViewById(R.id.checkboxB);
        boolean ischeckBoxB = checkBoxB.isChecked();
        ischeckBoxB = !ischeckBoxB; // inverse the value!

        CheckBox checkBoxC = (CheckBox) findViewById(R.id.checkboxC);
        boolean ischeckBoxC = checkBoxC.isChecked();

        CheckBox checkBoxD = (CheckBox) findViewById(R.id.checkboxD);
        boolean ischeckBoxD = checkBoxD.isChecked();


        if (ischeckBoxA && ischeckBoxB && ischeckBoxC && ischeckBoxD) {
            score += 1;
        }


        //Question 3
        RadioButton Radiobutton3y = (RadioButton) findViewById(R.id.Q3y);
        boolean q3Correct = Radiobutton3y.isChecked();

        if (q3Correct) {
            score += 1;
        }

        //Question 4
        RadioButton Radiobutton4y = (RadioButton) findViewById(R.id.Q4y);
        boolean q4Correct = Radiobutton4y.isChecked();

        if (q4Correct) {
            score += 1;
        }

        Log.e("Info", "Result:" + score);


        Context context = getApplicationContext();
        CharSequence text;
        if (score == 4) {
            text = " Your score is: " + score + " out of 4. Congratulations!";
        } else {
            text = " Your score is: " + score + " out of 4";
        }


        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();


    }
}
