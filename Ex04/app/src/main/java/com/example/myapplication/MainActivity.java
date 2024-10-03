package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    Button btncf, btnfc;
    EditText edtdoC, edtdoF;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        edtdoC = findViewById(R.id.edtdoC);
        edtdoF = findViewById(R.id.edtdoF);
        btncf = (Button) findViewById(R.id.btncf);
        btnfc = (Button) findViewById(R.id.btnfc);

        btncf.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) {
        DecimalFormat dcf=new DecimalFormat("#.00");
        String doC = edtdoC.getText()+"";
            int C=Integer.parseInt(doC); edtdoF.setText(""+dcf.format(C*1.8+32));

        }
        });
        btnfc.setOnClickListener(new  View.OnClickListener()  {

            @Override
            public void onClick(View v) {
                DecimalFormat dcf=new DecimalFormat("#.00");
                String doF = edtdoF.getText()+"";
                int F=Integer.parseInt(doF);
                edtdoC.setText(""+dcf.format((F-32)/1.8));
            }
        });

    }
}