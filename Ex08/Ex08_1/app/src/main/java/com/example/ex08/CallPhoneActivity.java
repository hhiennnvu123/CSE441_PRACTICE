package com.example.ex08;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CallPhoneActivity extends AppCompatActivity {
    EditText edtcall;
    ImageButton btncall;
    Button btnback1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_call_phone);

        edtcall = (EditText) findViewById(R.id.edtcall);
        btnback1 = (Button) findViewById(R.id.btnback1);
        btncall = (ImageButton) findViewById(R.id.btncall);
        btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callintent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + edtcall.getText().toString()));
                //yêu cầu ngưi dùng đồng ý quền truy cập vào tính nang goi điện
                if (ActivityCompat.checkSelfPermission(CallPhoneActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions(CallPhoneActivity.this, new String[]{
                            Manifest.permission.CALL_PHONE}, 1);
                    return;
                }
                startActivity(callintent);
            }
        });
        btnback1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}