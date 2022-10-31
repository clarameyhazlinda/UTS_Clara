package com.si5a.uts_clara;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    EditText et_nama, et_nomor;
    Button btn_konfir;
    CheckBox cb_konfir;
    Spinner sp_jalur;

    String nama, nomor, jalur;

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
                nama = et_nama.getText().toString();
                nomor = et_nomor.getText().toString();
//                jalur = sp_jalur.getOnItemClickListener();


                if (nama.trim().equals("")){
                    et_nama.setError("Nama Tidak Boleh Kosong");
                }
                else if (nomor.trim().equals("")){
                    et_nomor.setError("Nomor Pendaftaran Tidak boleh kosong");
                } else{
                    Intent sent = new Intent(MainActivity.this, ConfrimSent.class);
                    sent.putExtra("VarNama", String.valueOf(et_nama));
                    sent.putExtra("VarNomor", String.valueOf(et_nomor));
                    sent.putExtra("VarJalur", String.valueOf(sp_jalur));
                    startActivity(sent);
                }
            }
        });


    }
}