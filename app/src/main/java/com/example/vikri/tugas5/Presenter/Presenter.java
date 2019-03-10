package com.example.vikri.tugas5.Presenter;

import android.content.Context;

import com.example.vikri.tugas5.Model.Model;
import com.example.vikri.tugas5.R;
import com.example.vikri.tugas5.Views.MainView;

import java.util.ArrayList;
import java.util.List;

public class Presenter {
    Context context;
    List<Model> Models = new ArrayList<>();
    MainView view;
    public Presenter(MainView view, Context context){
        this.view=view;
        this.context=context;
    }

    public void setData(){
        Model deskripsi;
        deskripsi= new Model("AGUNG HAPSAH", R.drawable.agung);
        Models.add(deskripsi);
        deskripsi= new Model("ATTA HALILINTAR",R.drawable.atta);
        Models.add(deskripsi);
        deskripsi= new Model("DEDDY COBUZIER",R.drawable.deddy);
        Models.add(deskripsi);
        deskripsi= new Model("EDHOZELL",R.drawable.edhozell);
        Models.add(deskripsi);
        deskripsi= new Model("JESS NO LIMIT",R.drawable.jessnolimit);
        Models.add(deskripsi);
        deskripsi= new Model("MIAWUAG",R.drawable.miawuag);
        Models.add(deskripsi);
        deskripsi= new Model("RADITYA DIKA",R.drawable.radityadika);
        Models.add(deskripsi);
        deskripsi= new Model("RIA RICIS",R.drawable.riaricis);
        Models.add(deskripsi);
        view.onSuccess(Models);
    }
}
