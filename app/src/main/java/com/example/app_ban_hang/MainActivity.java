package com.example.app_ban_hang;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car car= new Car(new Engine("Động cơ 4 mã lực"), new Wheel(4));
        car.showCarInfo();
    }
}