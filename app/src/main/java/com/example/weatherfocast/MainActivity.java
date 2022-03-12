package com.example.weatherfocast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.weatherfocast.model.Banhxe;
import com.example.weatherfocast.model.Dongco;
import com.example.weatherfocast.model.Xehoi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Dongco dongco=new Dongco();
        Banhxe banhxe=new Banhxe();

        Xehoi xehoi=new Xehoi(dongco,banhxe);

    }
}