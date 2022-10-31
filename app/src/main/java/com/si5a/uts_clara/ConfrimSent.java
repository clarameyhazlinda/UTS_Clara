package com.si5a.uts_clara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class ConfrimSent extends AppCompatActivity {

    String Namalengkap, Nomorpendaftaran, Jalurpendaftaran;

    TextView tvNama, tvNomor, tvJalur;
    Spinner sp_jalur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confrim_sent);

        tvNama = findViewById(R.id.tvNama);
        tvNomor = findViewById(R.id.tvNomor);
        tvJalur = findViewById(R.id.tvJalur);

        Intent intent = getIntent();

        tvNama.setText(intent.getStringExtra("VarNamaPendaftaran"));
        tvNomor.setText(intent.getStringExtra("VarNomorPendaftaran"));
        tvJalur.setText(intent.getStringExtra("VarJalurPendaftaran"));



    }
}