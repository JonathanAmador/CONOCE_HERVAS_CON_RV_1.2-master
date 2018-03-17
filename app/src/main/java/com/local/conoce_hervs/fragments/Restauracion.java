package com.local.conoce_hervs.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.local.conoce_hervs.R;
import com.local.conoce_hervs.rv_bares.AdaptadorBares;
import com.local.conoce_hervs.rv_bares.Bares;

import java.util.ArrayList;
import java.util.List;


public class Restauracion extends Fragment {

    List<Bares> bares = new ArrayList<>();
    RecyclerView rvBar;
    AdaptadorBares adapterBar;
    Bares bar;

    public Restauracion() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.restauracion_layout, container, false);

        rvBar = view.findViewById(R.id.RVbares);

        adapterBar = new AdaptadorBares(bares);

        //Ésta subclase LayoutManager por defecto hará que tu RecyclerView parezca una ListView.
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rvBar.setLayoutManager(llm);

        rvBar.setAdapter(adapterBar);

        rellenarBares();

        // Devolvemos la vista al fragment
        return view;

    }


    public void rellenarBares() {

        bares.add(new Bares("BAR HERVAS", R.mipmap.ic_launcher));

    }


}
