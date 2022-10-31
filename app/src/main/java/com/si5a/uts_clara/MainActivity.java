package com.si5a.uts_clara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_nama, et_nomor;
    Button btn_konfir;
    CheckBox cb_konfir;
    Spinner sp_jalur;

    String Namalengkap, Nomorpendaftaran, Jalurpendaftaran;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        et_nama = findViewById(R.id.et_nama);
        et_nomor = findViewById(R.id.et_nomor);
        btn_konfir = findViewById(R.id.btn_konfir);
        cb_konfir = findViewById(R.id.cb_konfir);
        sp_jalur = findViewById(R.id.sp_jalur);

        btn_konfir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Namalengkap = et_nama.getText().toString();
                Nomorpendaftaran = et_nomor.getText().toString();
                Jalurpendaftaran = sp_jalur.getSelectedItem().toString();


                if (Namalengkap.trim().equals("")){
                    et_nama.setError("Nama Tidak Boleh Kosong");
                }
                else if (Nomorpendaftaran.trim().equals("")){
                    et_nomor.setError("Nomor Pendaftaran Tidak boleh kosong");
                } else{
                    Intent kirim = new Intent(MainActivity.this, ConfrimSent.class);
                    kirim.putExtra("VarNamaPendaftaran", String.valueOf(Namalengkap));
                    kirim.putExtra("VarNomorPendaftaran", String.valueOf(Nomorpendaftaran));
                    kirim.putExtra("VarJalurPendaftaran", String.valueOf(Jalurpendaftaran));
                    startActivity(kirim);
                }
            }
        });

        cb_konfir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb_konfir.isChecked()) {
                    Toast.makeText(MainActivity.this, "Checkbox is Checked", Toast.LENGTH_SHORT).show();
                } else if (!cb_konfir.isChecked()){
                    Toast.makeText(MainActivity.this, "Checkbox is not Checked", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}