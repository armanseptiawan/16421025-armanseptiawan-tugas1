package com.example.microsoft.tugas14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class tugas1 extends AppCompatActivity {
    EditText npm;
    EditText nama;
    EditText universitas;
    EditText fakultas;
    EditText prodi;
    TextView tampil;
    TextView tampil2;
    TextView tampil3;
    TextView tampil4;
    TextView tampil5;
    Button tinput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas1);
        nama=(EditText) findViewById(R.id.NPM);
        npm=(EditText) findViewById(R.id.NAMA);
        universitas=(EditText) findViewById(R.id.UNIVERSITAS);
        fakultas=(EditText) findViewById(R.id.FAKULTAS);
        prodi=(EditText) findViewById(R.id.PRODI);
        tampil=(TextView) findViewById(R.id.tampildata1);
        tampil2=(TextView) findViewById(R.id.tampildata2);
        tampil3=(TextView) findViewById(R.id.tampildata3);
        tampil4=(TextView) findViewById(R.id.tampildata4);
        tampil5=(TextView) findViewById(R.id.tampildata5);
        tinput=(Button) findViewById(R.id.btnsimpan);

        tinput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtnpm,txtnama,txtuniversitas,txtfakultas,txtprodi;
                txtnpm=npm.getText().toString();
                txtnama=nama.getText().toString();
                txtuniversitas=universitas.getText().toString();
                txtfakultas=fakultas.getText().toString();
                txtprodi=prodi.getText().toString();

                tampil.setText(txtnpm);
                tampil2.setText(txtnama);
                tampil3.setText(txtuniversitas);
                tampil4.setText(txtfakultas);
                tampil5.setText(txtprodi);
            }
        });
    }
}
