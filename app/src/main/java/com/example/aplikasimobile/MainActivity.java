package com.example.aplikasimobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText TextNama; //mendeklarasikan variable
    TextView Hasil; //mendeklatasikan variabel

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextNama=(EditText)findViewById(R.id.TxtNama); //pada bagian ini adalah bagaimana cara tex nama mengambil
        Hasil=(TextView)findViewById(R.id.Lbl_Nama); //pada bagian ini untuk mengambil nama yang dimasukan
    }

    public void  TampiNama(View v){
        Hasil.setText("Nama Anda: "+TextNama.getText()); //menampilkan nama yang dimasukan pada TextNama
    }
}
