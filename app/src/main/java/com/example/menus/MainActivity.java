package com.example.menus;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    FrameLayout home;
    BottomNavigationView btn_navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InicioFragment inicio = new InicioFragment();
        NotificacionFragment noti = new NotificacionFragment();
        loadFragment(inicio);
        home = findViewById(R.id.home);
        btn_navigation = findViewById(R.id.btn_navigation);

        btn_navigation.setOnItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.nav_inicio){
                    loadFragment(inicio);
                    return true;
                } else if (menuItem.getItemId() == R.id.nav_notificaciones) {
                    loadFragment(noti);
                    return true;
                }
                return false;
            }
        });
    }

    public void loadFragment(Fragment fr){
        FragmentTransaction tr = getSupportFragmentManager().beginTransaction();
        tr.replace(R.id.home, fr);
        tr.commit();
    }

}