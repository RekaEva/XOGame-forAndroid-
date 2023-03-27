package com.example.xo_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

public class KrestikiNoliki extends AppCompatActivity {
    Button button1, button2, button3, button4, button5, button6, button7, button8, button9;
    TextView textView;
    String krest, nolik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_krestiki_noliki);

        krest = "X";
        nolik = "O";

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        textView = findViewById(R.id.textView);
    }

    public void clcBtn1(View view) {
        button1.setText(krest);
        isPlayerWin();
    }
    public void clcBtn2(View view) {button2.setText(krest);
        isPlayerWin();}
    public void clcBtn3(View view) {button3.setText(krest);
        isPlayerWin();}
    public void clcBtn4(View view) {button4.setText(krest);
        isPlayerWin();}
    public void clcBtn5(View view) {button5.setText(krest);
        isPlayerWin();}
    public void clcBtn6(View view) {button6.setText(krest);
        isPlayerWin();}
    public void clcBtn7(View view) {button7.setText(krest);
        isPlayerWin();}
    public void clcBtn8(View view) {button8.setText(krest);
        isPlayerWin();}
    public void clcBtn9(View view) {button9.setText(krest);
        isPlayerWin();}

    public void isPlayerWin()
    {
        // horizontal
        if (button1.getText() == krest &&  button2.getText() == krest && button3.getText() == krest) {
            textView.setText(R.string.winner_message);
        }
        if (button4.getText() == krest &&  button5.getText() == krest && button6.getText() == krest) {
            textView.setText(R.string.winner_message);
        }
        if (button7.getText() == krest &&  button8.getText() == krest && button9.getText() == krest) {
            textView.setText(R.string.winner_message);
        }
        // vertical
        if (button1.getText() == krest &&  button4.getText() == krest && button7.getText() == krest) {
            textView.setText(R.string.winner_message);
        }
        if (button2.getText() == krest &&  button5.getText() == krest && button8.getText() == krest) {
            textView.setText(R.string.winner_message);
        }
        if (button3.getText() == krest &&  button6.getText() == krest && button9.getText() == krest) {
            textView.setText(R.string.winner_message);
        }
        // diagonal
        if (button1.getText() == krest &&  button5.getText() == krest && button9.getText() == krest) {
            textView.setText(R.string.winner_message);
        }
        if (button3.getText() == krest &&  button5.getText() == krest && button7.getText() == krest) {
            textView.setText(R.string.winner_message);
        }
    }
}