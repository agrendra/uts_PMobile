package com.example.agrendra.uts_pmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    Intent intent;
    ListView list;
    String[] itemname = {
            "Rumus Luas dan Keliling",
            "Rumus Luas dan Kelilingi",
            "Rumus Luas dan Keliling",
            "Rumus Luas dan Keliling",
            "Rumus Luas dan Keliling"
    };

    Integer[] imgid = {
            R.drawable.panjang,
            R.drawable.persegi,
            R.drawable.lingkaran,
            R.drawable.segitiga,
            R.drawable.trapesium
    };

    String[] descriptionitem = {
            "Persegi Panjang",
            "Persegi",
            "Lingkaran",
            "Segitiga",
            "Trapesium"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
        CustomListAdapter adapter = new CustomListAdapter(this, itemname, imgid, descriptionitem);
        list.setAdapter(adapter);
        intent = new Intent(MainActivity.this, DetailActivity.class);
        list.setOnItemClickListener((AdapterView.OnItemClickListener) this);
    }
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                intent.putExtra("Tit", descriptionitem);
                startActivity(intent);
                break;
            case 1:
                intent.putExtra("Tit", descriptionitem);
                startActivity(intent);
                break;
            case 2:
                intent.putExtra("Tit", descriptionitem);
                startActivity(intent);
                break;
            case 3:
                intent.putExtra("Tit", descriptionitem);
                startActivity(intent);
                break;
            case 4:
                intent.putExtra("Tit", descriptionitem);
                startActivity(intent);
                break;
            case 5:
                intent.putExtra("Tit", descriptionitem);
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
