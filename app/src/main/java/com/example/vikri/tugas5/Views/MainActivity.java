package com.example.vikri.tugas5.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.vikri.tugas5.adapter.Adapter;
import com.example.vikri.tugas5.Model.Model;
import com.example.vikri.tugas5.Presenter.Presenter;
import com.example.vikri.tugas5.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {
    RecyclerView rv,rv1,rv2;
    Adapter adapter;
    Presenter data;
    List<Model> Models = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.recycler_vertikal);
        rv1 = findViewById(R.id.recycler_horizontal);
        rv2 = findViewById(R.id.recycler_grid);

        rv.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(this, Models);
        rv.setAdapter(adapter);
        data = new Presenter(this,this);
        data.setData();

        rv1.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true));
        adapter = new Adapter(this, Models);
        rv1.setAdapter(adapter);
        data = new Presenter(this,this);
        data.setData();

        rv2.setLayoutManager(new GridLayoutManager(MainActivity.this,2));
        adapter = new Adapter(this, Models);
        rv2.setAdapter(adapter);
        data = new Presenter(this,this);
        data.setData();
    }

    public void onSuccess(List<Model> Models){
        this.Models.clear();
        this.Models.addAll(Models);
        this.adapter.notifyDataSetChanged();
    }
}
