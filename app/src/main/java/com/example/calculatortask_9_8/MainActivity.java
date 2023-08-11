package com.example.calculatortask_9_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 TextView t1;
 EditText ed1,ed2;
 Button bC,bPlus,bsub,bmult,bdiv,bequals,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bC=findViewById(R.id.bC);bPlus=findViewById(R.id.bPlus);
        bsub=findViewById(R.id.bsub);bmult=findViewById(R.id.bmult);
        bdiv=findViewById(R.id.bdiv);bequals=findViewById(R.id.bequals);
        b7=findViewById(R.id.b7);b8=findViewById(R.id.b8);
        b9=findViewById(R.id.b9);b10=findViewById(R.id.b10);
        b11=findViewById(R.id.b11);b12=findViewById(R.id.b12);
        b13=findViewById(R.id.b13);b14=findViewById(R.id.b14);
        b15=findViewById(R.id.b15);b16=findViewById(R.id.b16); b17=findViewById(R.id.b17);


    }
    public void clicknumber(){

    }
    
}