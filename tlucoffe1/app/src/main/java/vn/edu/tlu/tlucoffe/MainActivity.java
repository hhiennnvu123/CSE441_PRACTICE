package vn.edu.tlu.tlucoffe;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Ánh xạ các thành phần từ XML
        drawerLayout = findViewById(R.id.main);
        navigationView = findViewById(R.id.navigation_view);
        toolbar = findViewById(R.id.toolbar);

        // Thiết lập Toolbar như một ActionBar
        setSupportActionBar(toolbar);

        // Thiết lập nút mở Navigation Drawer
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close
        );
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        // Xử lý sự kiện khi chọn các mục trong Navigation Drawer
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                // Xử lý các mục được chọn
                switch (id) {
                    case R.id.nav_cafe:
                        // Xử lý khi chọn "Cafe"
                        Toast.makeText(MainActivity.this, "Cafe selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_juice:
                        // Xử lý khi chọn "Nước ép trái cây"
                        Toast.makeText(MainActivity.this, "Juice selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_tea:
                        // Xử lý khi chọn "Trà đặc biệt"
                        Toast.makeText(MainActivity.this, "Tea selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_sweet:
                        // Xử lý khi chọn "Bánh ngọt"
                        Toast.makeText(MainActivity.this, "Sweet selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_salty:
                        // Xử lý khi chọn "Bánh mặn"
                        Toast.makeText(MainActivity.this, "Salty selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_settings:
                        // Xử lý khi chọn "Cài đặt"
                        Toast.makeText(MainActivity.this, "Settings selected", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.nav_logout:
                        // Xử lý khi chọn "Đăng xuất"
                        Toast.makeText(MainActivity.this, "Logout selected", Toast.LENGTH_SHORT).show();
                        break;
                }

                // Đóng Navigation Drawer sau khi chọn một mục
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });
    }
}
