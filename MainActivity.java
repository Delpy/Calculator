package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0,
    buttonadd,buttonsub,buttondiv,buttoneql,buttonmult,button10,buttoncancel;
   EditText crunchifyEditText;
   boolean crunAdd,crunDiv,crunMult,crunSub;
   float num1,num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button10=(Button)findViewById(R.id.button10);
     button0=(Button)findViewById(R.id.button0);
     button1=(Button)findViewById(R.id.button1);
     button2=(Button)findViewById(R.id.button2);
     button3=(Button)findViewById(R.id.button3);
     button4=(Button)findViewById(R.id.button4);
     button5=(Button)findViewById(R.id.button5);
     button6=(Button)findViewById(R.id.button6);
     button7=(Button)findViewById(R.id.button7);
     button8=(Button)findViewById(R.id.button8);
     button9=(Button)findViewById(R.id.button9);
     buttonadd=(Button)findViewById(R.id.buttonadd);
     buttondiv=(Button)findViewById(R.id.buttondiv);
     buttonsub=(Button)findViewById(R.id.buttonsub);
     buttoneql=(Button)findViewById(R.id.buttoneql);
     buttonmult=(Button)findViewById(R.id.buttonmul);
     buttoncancel=(Button)findViewById(R.id.buttonC);
     crunchifyEditText=(EditText)findViewById(R.id.edt1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "1");
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(crunchifyEditText.getText() + "0");
            }
        });

        buttonadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (crunchifyEditText == null) {
                    crunchifyEditText.setText("");
                } else {
                    num1 = Float.parseFloat(crunchifyEditText.getText() + "");
                    crunAdd = true;
                    crunchifyEditText.setText(null);
                }
            }
        });

        buttonsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(crunchifyEditText.getText() + "");
                crunSub = true;
                crunchifyEditText.setText(null);
            }
        });

        buttonmult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 = Float.parseFloat(crunchifyEditText.getText() + "");
                crunMult = true;
                crunchifyEditText.setText(null);
            }
        });

        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1= Float.parseFloat(crunchifyEditText.getText() + "");
                crunDiv = true;
                crunchifyEditText.setText(null);
            }
        });
        buttoneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num2 = Float.parseFloat(crunchifyEditText.getText() + "");

                if (crunAdd == true) {
                    crunchifyEditText.setText(num1 + num2 + "");
                    crunAdd = false;
                }

                if (crunSub == true) {
                    crunchifyEditText.setText(num1 - num2 + "");
                    crunSub = false;
                }

                if (crunMult == true) {
                    crunchifyEditText.setText(num1 * num2 + "");
                    crunMult = false;
                }

                if (crunDiv == true) {
                    crunchifyEditText.setText(num1 / num2 + "");
                   crunDiv= false;
                }
            }
        });

        buttoncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                crunchifyEditText.setText(  crunchifyEditText.getText() + ".");
            }
        });
        }
    }




