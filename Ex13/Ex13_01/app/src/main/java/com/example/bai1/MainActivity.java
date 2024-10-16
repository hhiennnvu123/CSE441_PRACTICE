package com.example.bai1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    TextView selection;
    AutoCompleteTextView singleComplete;
    MultiAutoCompleteTextView multiComplete;
    String[] arr = {"Hà Nội","Huế","Hưng yên","Hà Giang","Hồ Chí Minh","Sài Gòn","Thái Bình","Lâm Đồng"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selection = (TextView) findViewById(R.id.selection);
        singleComplete = (AutoCompleteTextView) findViewById(R.id.editauto);
        ArrayAdapter myadapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1,arr
        });
    }
}
