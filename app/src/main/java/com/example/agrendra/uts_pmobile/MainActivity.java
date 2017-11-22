package com.example.agrendra.uts_pmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    ListView list;
    String[] itemname = {
            "Rumus Luas dan Keliling",
            "Rumus Luas dan Kelilingi",
            "Rumus Luas dan Keliling",
            "Rumus Luas dan Keliling",
            "Rumus Luas dan Keliling",
            "Rumus Luas dan Keliling"
    };

    Integer[] imgid = {
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon,
            R.drawable.icon
    };

    String[] descriptionitem = {
            "Persegi Panjang",
            "Persegi",
            "Lingkaran",
            "Segitiga",
            "Trapesium",
            "Jajar Genjang"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
