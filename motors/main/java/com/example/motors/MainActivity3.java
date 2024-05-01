package com.example.motors;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    private Button button;
    private CheckBox captcha;
    private EditText Name;
    private EditText Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button = (Button) findViewById(R.id.button);
        captcha = findViewById(R.id.captcha);
        Name = findViewById(R.id.Name);
        Password = findViewById(R.id.Password);
        button.setOnClickListener(new EscutadorBotao());
        }

        private class EscutadorBotao implements View.OnClickListener{
            @Override
            public void onClick(View view) {
                String nome, senha;
                nome = Name.getText().toString();
                senha = Password.getText().toString();
                if (captcha.isChecked()) {
                    if (nome.isEmpty()==false && senha.isEmpty()==false) {
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        i.putExtra("Chave", nome);
                        startActivity(i);
                        Toast.makeText(MainActivity3.this, "Login realizado!", Toast.LENGTH_LONG).show();
                    }else{
                        Toast.makeText(MainActivity3.this, "Login faltando informação!", Toast.LENGTH_LONG).show();

                    }
                }else{
                    Toast.makeText(MainActivity3.this, "Login bloqueado!", Toast.LENGTH_LONG).show();

                }
            }

        }



}