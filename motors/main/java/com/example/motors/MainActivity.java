package com.example.motors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    private TextView nome_usuario;
    private Button gt3000_btn;
    private Button n350z_btn;
    private Button lancer_btn;
    private Button rx7_btn;
    private Button skyline_btn;
    private TextView gt3000_txt;
    private TextView n350z_txt;
    private TextView lancer_txt;
    private TextView rx7_txt;
    private TextView skyline_txt;
    private RadioButton radioButton;
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome_usuario = (TextView)findViewById(R.id.nome_usuario);
        String user = getIntent().getStringExtra("Chave");
        nome_usuario.setText(user);

        Button Enviar_btn = findViewById(R.id.Enviar_btn);
        radioGroup = findViewById(R.id.radioGroup);

        String gt3000_info, n350z_info, lancer_info, rx7_info, skyline_info;
        gt3000_info = "lançamento em 1990, 300 cavalos";
        n350z_info = "lançamento em 2001, 312 cavalos";
        lancer_info = "lançamento em 2017, 160 cavalos";
        rx7_info = "lançamento em 2002, 260 cavalos";
        skyline_info = "lançamento em 2000, 280 cavalos";

        gt3000_btn = findViewById(R.id.gt3000_btn);
        n350z_btn = findViewById(R.id.n350z_btn);
        lancer_btn = findViewById(R.id.lancer_btn);
        rx7_btn = findViewById(R.id.rx7_btn);
        skyline_btn = findViewById(R.id.skyline_btn);

        gt3000_txt = findViewById(R.id.gt3000_txt);
        n350z_txt = findViewById(R.id.n350z_txt);
        lancer_txt = findViewById(R.id.lancer_txt);
        rx7_txt = findViewById(R.id.rx7_txt);
        skyline_txt = findViewById(R.id.skyline_txt);


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


        gt3000_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String carro;
                carro = gt3000_txt.getText().toString();
                Intent i = new Intent(getApplicationContext(), PopActivity.class);
                i.putExtra("auto", carro);
                i.putExtra("info", gt3000_info);
                startActivity(i);
            }
        });
        n350z_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String carro;
                carro = n350z_txt.getText().toString();
                Intent i = new Intent(getApplicationContext(), PopActivity.class);
                i.putExtra("auto", carro);
                i.putExtra("info", n350z_info);
                startActivity(i);
            }
        });
        lancer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String carro;
                carro = lancer_txt.getText().toString();
                Intent i = new Intent(getApplicationContext(), PopActivity.class);
                i.putExtra("auto", carro);
                i.putExtra("info", lancer_info);

                startActivity(i);
            }
        });
        rx7_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String carro;
                carro = rx7_txt.getText().toString();
                Intent i = new Intent(getApplicationContext(), PopActivity.class);
                i.putExtra("auto", carro);
                i.putExtra("info", rx7_info);
                startActivity(i);
            }
        });
        skyline_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String carro;
                carro = skyline_txt.getText().toString();
                Intent i = new Intent(getApplicationContext(), PopActivity.class);
                i.putExtra("auto", carro);
                i.putExtra("info", skyline_info);

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
                nome1 = nome_usuario.getText().toString();
                Intent i1 = new Intent(getApplicationContext(), MainActivity2.class);
                i1.putExtra("Chave",nome1);
                startActivity(i1);
                return true;
            case R.id.Cars:
                String nome2;
                nome2 = nome_usuario.getText().toString();
                Intent i2 = new Intent(getApplicationContext(), MainActivity.class);
                i2.putExtra("Chave",nome2);
                startActivity(i2);
                return true;
            default:
                return super.onOptionsItemSelected(item);

        }



    }

}

