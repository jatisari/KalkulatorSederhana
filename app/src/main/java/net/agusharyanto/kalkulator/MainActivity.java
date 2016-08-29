package net.agusharyanto.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editTextBil1;
    private EditText editTextBil2, editTextHasil;
    Button buttonTambah, buttonKurang;
    Button buttonKali, buttonBagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextBil1 = (EditText) findViewById(R.id.editTextBil1);
        editTextBil2 = (EditText) findViewById(R.id.editTextBil2);
        editTextHasil = (EditText) findViewById(R.id.editTextHasil);
        buttonTambah = (Button) findViewById(R.id.buttonTambah);
        buttonKurang = (Button) findViewById(R.id.buttonKurang);
        buttonKali = (Button) findViewById(R.id.buttonBagi);
        buttonBagi = (Button) findViewById(R.id.buttonBagi);

        buttonTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitung("+");
            }
        });

        buttonKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitung("-");
            }
        });

        buttonKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitung("x");
            }
        });

        buttonBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitung("/");
            }
        });
    }

    private  void hitung(String tanda){
        int hasil =0;
        int bil1 = Integer.parseInt(editTextBil1.getText().toString());
        int bil2 = Integer.parseInt(editTextBil2.getText().toString());
        if (tanda.equals("+")) {
            hasil = bil1 + bil2;
        }else if (tanda.equals("-")) {
            hasil = bil1 - bil2;
        }else if (tanda.equals("x")) {
            hasil = bil1 * bil2;
        }else if (tanda.equals("/")) {
            hasil = bil1 / bil2;
        }
        editTextHasil.setText(String.valueOf(hasil));

    }


}
