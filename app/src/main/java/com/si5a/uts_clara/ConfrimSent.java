package com.si5a.uts_clara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ConfrimSent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confrim_sent);

        String nama, nomor, jalur;

        TextView tvNama, tvNomor, tvOpt;

        tvNama = findViewById(R.id.tvNama);
        tvNomor = findViewById(R.id.tvNomor);
        tvOpt = findViewById(R.id.tvOpt);

        Intent terima = getIntent();

        nama = terima.getStringExtra("VarNama");
        nomor = terima.getStringExtra("VarNomor");
        jalur = terima.getStringExtra("VarJalur");

        tvNama.setText(nama);
        tvNomor.setText(nomor);
        tvOpt.setText(jalur);



    }
}