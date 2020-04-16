package com.example.recyclerviewa172101842;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView1 = (RecyclerView)findViewById(R.id.recyclerView1);

        List<NegaraModel> negaraModelList = new ArrayList<NegaraModel>();

        NegaraModel nm = new NegaraModel();
        nm.setNama("Nigeria");
        nm.setDeskripsi("Negara Ini Jauh Dari Indonesia");
        nm.setUrl("http://icons.iconarchive.com/icons/hopstarter/flag-borderless/48/Nigeria-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Indonesia");
        nm.setDeskripsi("Negara Kita Indonesia.");
        nm.setUrl("http://icons.iconarchive.com/icons/hopstarter/flag-borderless/48/Indonesia-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Arab");
        nm.setDeskripsi("Negara Banyak Minyak.");
        nm.setUrl("http://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/United-Arab-Emirates-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Afrika");
        nm.setDeskripsi("Negara ini banyak sobat misqueen");
        nm.setUrl("http://icons.iconarchive.com/icons/hopstarter/flag-borderless/48/South-Africa-icon.png");
        negaraModelList.add(nm);

        nm = new NegaraModel();
        nm.setNama("Bangladesh");
        nm.setDeskripsi("Negara ini Banyak bajak laut.");
        nm.setUrl("http://icons.iconarchive.com/icons/custom-icon-design/all-country-flag/48/Somalia-Flag-icon.png");
        negaraModelList.add(nm);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(MainActivity.this);
        recyclerView1.setLayoutManager(lm);

        NegaraAdapter na = new NegaraAdapter(getApplicationContext(), negaraModelList);
        recyclerView1.setAdapter(na);


    }
}