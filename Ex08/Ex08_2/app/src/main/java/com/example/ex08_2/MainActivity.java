//package com.example.ex08_2;
//
//import android.Manifest;
//import android.content.Intent;
//import android.content.pm.PackageManager;
//import android.graphics.Bitmap;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ImageButton;
//import android.widget.ImageView;
//
//import androidx.activity.EdgeToEdge;
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.core.app.ActivityCompat;
//import androidx.core.content.ContextCompat;
//
//import static android.provider.MediaStore.ACTION_IMAGE_CAPTURE;
//
//public class MainActivity extends AppCompatActivity {
//    ImageView myimg;
//    ImageButton btncapture;
//    private static final int CAMERA_REQUEST_CODE = 99;
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (requestCode == CAMERA_REQUEST_CODE && resultCode == RESULT_OK) {
//            // Lấy hình ảnh từ Intent và hiển thị lên ImageView
//            Bitmap imageBitmap = (Bitmap) data.getExtras().get("data");
//            myimg.setImageBitmap(imageBitmap);
//        }
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_main);
//        myimg = findViewById(R.id.myimg);
//        btncapture = findViewById(R.id.btncapture);
//        btncapture.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent myintent = new Intent(ACTION_IMAGE_CAPTURE);
//                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED) {
//                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CAMERA}, CAMERA_REQUEST_CODE);
//                    return;
//                }
//                startActivityForResult(myintent, CAMERA_REQUEST_CODE); // Sửa ở đây
//            }
//        });
//    }
//
//    @Override
//    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
//        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//        if (requestCode == CAMERA_REQUEST_CODE) {
//            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
//                // Quyền đã được cấp, tiếp tục mở camera
//                Intent myintent = new Intent(ACTION_IMAGE_CAPTURE);
//                startActivityForResult(myintent, CAMERA_REQUEST_CODE);
//            } else {
//                // Quyền bị từ chối, thông báo cho người dùng
//                // Có thể thêm mã hiển thị thông báo ở đây
//            }
//        }
//    }
//}
