package com.example.androidtictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_1 = findViewById(R.id.btn1);
        btn_2 = findViewById(R.id.btn2);
        btn_3 = findViewById(R.id.btn3);
        btn_4 = findViewById(R.id.btn4);
        btn_5 = findViewById(R.id.btn5);
        btn_6 = findViewById(R.id.btn6);
        btn_7 = findViewById(R.id.btn7);
        btn_8 = findViewById(R.id.btn8);
        btn_9 = findViewById(R.id.btn9);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(view);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(view);
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(view);
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(view);
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(view);
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(view);
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(view);
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(view);
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnClick(view);
            }
        });
    }

    int count = 0;
    void btnClick(View view) {
        if (count % 2 ==0){
            ((Button) view).setText("X");
        }else{
            ((Button) view).setText("O");
        }
        count += 1;
        check_win();
    }

    //Function by the case so that X win, O win.
    void check_win(){
        // X win when:
        check_btnX(btn_1, btn_2, btn_3);
        check_btnX(btn_4, btn_5, btn_6);
        check_btnX(btn_7, btn_8, btn_9);
        check_btnX(btn_1, btn_4, btn_7);
        check_btnX(btn_2, btn_5, btn_8);
        check_btnX(btn_3, btn_6, btn_9);
        check_btnX(btn_1, btn_5, btn_9);
        check_btnX(btn_3, btn_5, btn_7);

        // O win when:
        check_btnO(btn_1, btn_2, btn_3);
        check_btnO(btn_4, btn_5, btn_6);
        check_btnO(btn_7, btn_8, btn_9);
        check_btnO(btn_1, btn_4, btn_7);
        check_btnO(btn_2, btn_5, btn_8);
        check_btnO(btn_3, btn_6, btn_9);
        check_btnO(btn_1, btn_5, btn_9);
        check_btnO(btn_3, btn_5, btn_7);
    }

    // Function check condition to X win.
    void check_btnX(Button a, Button b, Button c){
        if (a.getText().equals("X") && b.getText().equals("X") && c.getText().equals("X")){
            Toast.makeText(this,"X win", Toast.LENGTH_SHORT).show();
            set_btn();
        }
    }

    // Function check condition to O win.
    void check_btnO(Button a, Button b, Button c){
        if (a.getText().equals("O") && b.getText().equals("O") && c.getText().equals("O")){
            Toast.makeText(this,"O win", Toast.LENGTH_SHORT).show();
            set_btn();
        }
    }

    //  Function set the initial values of buttons to be null
    void set_btn(){
        btn_1.setText("");
        btn_2.setText("");
        btn_3.setText("");
        btn_4.setText("");
        btn_5.setText("");
        btn_6.setText("");
        btn_7.setText("");
        btn_8.setText("");
        btn_9.setText("");
    }
}
