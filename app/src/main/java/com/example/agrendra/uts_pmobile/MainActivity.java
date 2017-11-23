package com.example.agrendra.uts_pmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    Intent intent;
    ListView listView;

    int[] imgid = {
            R.drawable.ic_android_black_24dp,
            R.drawable.ic_android_black_24dp,
            R.drawable.ic_android_black_24dp,
            R.drawable.ic_android_black_24dp,
            R.drawable.ic_android_black_24dp
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


        CustomListAdapters adapter = new CustomListAdapters();
        listView = (ListView) findViewById(R.id.listdata);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
        intent = new Intent(MainActivity.this, DetailActivity.class);
        intent.putExtra("title", descriptionitem[position]);
        startActivity(intent);
    }

    /*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("title", descriptionitem[position]);
                startActivity(intent);
            }
        });*/


    class CustomListAdapters extends BaseAdapter {

        @Override
        public int getCount() {
            return imgid.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup parent) {
            view =getLayoutInflater().inflate(R.layout.instrumentlist,null);
            ImageView imageView=(ImageView)view.findViewById(R.id.icon);
            //TextView item=(TextView)view.findViewById(R.id.item);
            TextView descrip=(TextView)view.findViewById(R.id.item);

            imageView.setImageResource(imgid[i]);
            //item.setText(itemname[i]);
            descrip.setText(descriptionitem[i]);

            return view;
        }
    }

}
