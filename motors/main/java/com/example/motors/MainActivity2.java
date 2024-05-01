package com.example.motors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private TextView nome_usuario2;
    private Button hayabusa_btn;
    private Button h2r_btn;
    private Button repsol_btn;
    private Button s1000_btn;
    private Button z1000_btn;
    private TextView hayabusa_txt;
    private TextView h2r_txt;
    private TextView repsol_txt;
    private TextView s1000_txt;
    private TextView z1000_txt;
    private RadioButton radioButton;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String hayabusa_info, h2r_info, repsol_info, s1000_info, z1000_info;
        hayabusa_info= "Lançamento em 1999, 1.340 cc";
        h2r_info="Lançamento em 2019, 998 cc";
        repsol_info="Lançamento em 2013, 999,8 cc";
        s1000_info="Lançamento em 2009, 999 cc ";
        z1000_info="Lançamento em 2012, 1.043 cc";


        nome_usuario2 = (TextView) findViewById(R.id.nome_usuario2);
        String user = getIntent().getStringExtra("Chave");
        nome_usuario2.setText(user);

        Button Enviar_btn = findViewById(R.id.Enviar_btn);
        radioGroup = findViewById(R.id.radioGroup);

        hayabusa_btn = findViewById(R.id.hayabusa_btn);
        h2r_btn = findViewById(R.id.h2r_btn);
        repsol_btn = findViewById(R.id.repsol_btn);
        s1000_btn = findViewById(R.id.s1000_btn);
        z1000_btn = findViewById(R.id.z1000_btn);

        hayabusa_txt = findViewById(R.id.hayabusa_txt);
        h2r_txt = findViewById(R.id.h2r_txt);
        repsol_txt = findViewById(R.id.repsol_txt);
        s1000_txt = findViewById(R.id.s1000_txt);
        z1000_txt = findViewById(R.id.z1000_txt);

        ///////////////////////////////////////////////////////////////////////////////
        Enviar_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radioId = radioGroup.getCheckedRadioButtonId();

                radioButton = findViewById(radioId);

                if(radioButton.getText().equals("NÃO")){
                    Toast.makeText(getApplicationContext(), "Vamos melhorar!", Toast.LENGTH_SHORT).show();
                }else if(radioButton.getText().equals("SIM")){
                    Toast.makeText(getApplicationContext(), "Muito obrigado", Toast.LENGTH_SHORT).show();

                }

            }
        });

        hayabusa_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String moto1;
                moto1 = hayabusa_txt.getText().toString();
                Intent i = new Intent(getApplicationContext(), PopActivity.class);
                i.putExtra("auto", moto1);
                i.putExtra("info", hayabusa_info);
                startActivity(i);
            }
        });
        h2r_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String moto2;
                moto2 = h2r_txt.getText().toString();
                Intent i = new Intent(getApplicationContext(), PopActivity.class);
                i.putExtra("auto", moto2);
                i.putExtra("info", h2r_info);
                startActivity(i);
            }
        });
        repsol_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String moto3;
                moto3 = repsol_txt.getText().toString();
                Intent i = new Intent(getApplicationContext(), PopActivity.class);
                i.putExtra("auto", moto3);
                i.putExtra("info", repsol_info);
                startActivity(i);
            }
        });
        s1000_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String moto4;
                moto4 = s1000_txt.getText().toString();
                Intent i = new Intent(getApplicationContext(), PopActivity.class);
                i.putExtra("auto", moto4);
                i.putExtra("info", s1000_info);
                startActivity(i);
            }
        });
        z1000_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String moto5;
                moto5 = z1000_txt.getText().toString();
                Intent i = new Intent(getApplicationContext(), PopActivity.class);
                i.putExtra("auto", moto5);
                i.putExtra("info", z1000_info);
                startActivity(i);
            }
        });
    }
    public void checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.motorsmenu, menu);
        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.Bikes:
                String nome1;
                nome1 = nome_usuario2.getText().toString();
                Intent i1 = new Intent(getApplicationContext(), MainActivity2.class);
                i1.putExtra("Chave",nome1);
                startActivity(i1);
                return true;
            case R.id.Cars:
                String nome2;
                nome2 = nome_usuario2.getText().toString();
                Intent i2 = new Intent(getApplicationContext(), MainActivity.class);
                i2.putExtra("Chave",nome2);
                startActivity(i2);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }



    }


}