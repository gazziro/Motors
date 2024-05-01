package com.example.motors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class PopActivity extends MainActivity {

    private EditText nome_auto;
    private EditText info;
    private RadioButton sim_rbtn;
    private RadioButton nao_rbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);
        getSupportActionBar().hide();

        nome_auto = (EditText) findViewById(R.id.nome_auto);
        info = (EditText) findViewById(R.id.info);


        String auto = getIntent().getStringExtra("auto");
        String informacao = getIntent().getStringExtra("info");

        nome_auto.setText(auto);
        info.setText(informacao);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8), (int)(height*.7));

        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.gravity = Gravity.CENTER;
        params.x=0;
        params.y= -20;

        getWindow().setAttributes(params);

    }
}