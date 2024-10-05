package com.example.ex04_bmi;

 import android.os.Bundle;
 import android.app.Activity;
 import android.view.View;
 import android.widget.Button;
 import android.widget.EditText;
public class MainActivity extends Activity {
    Button btnBMI;
    EditText editTen,editChieucao,editCannang,editBMI,editChandoan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnBMI= findViewById(R.id.btnBMI);
        editTen=findViewById(R.id.editTen);
        editChieucao= findViewById(R.id.editChieucao);
        editCannang= findViewById(R.id.editCannang);
        editBMI= findViewById(R.id.editBMI);
        editChandoan= findViewById(R.id.editChuanDoan);
        btnBMI.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View v) {
// TODO Auto-generated method stub
            double H=Double.parseDouble(editChieucao.getText()+"");
            double W=Double.parseDouble(editCannang.getText()+"");
            double BMI=W/Math.pow(H,2);
            String chandoan="";
            if(BMI<18)
            {
                chandoan="Bạn gầy";

            }
            else if(BMI<=24.9)
            {
                chandoan="Bạn bình thường";
            }
            else if(BMI<=29.9)
            {
                chandoan="Bạn béo phì độ 1";
            }
            else if(BMI<=34.9)
            {


            }
            else
            {

            }

            chandoan="Bạn béo phì độ 2";



            chandoan="Bạn béo phì độ 3";




        }
        });
    }
}
