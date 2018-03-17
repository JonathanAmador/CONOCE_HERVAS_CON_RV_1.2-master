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
import com.local.conoce_hervs.rv_hoteles.AdaptadorHotel;
import com.local.conoce_hervs.rv_hoteles.Hoteles;

import java.util.ArrayList;
import java.util.List;

public class Alojamiento extends Fragment {

    List<Hoteles> hotels  = new ArrayList<>();
    RecyclerView rv;
    AdaptadorHotel adapter;
    Hoteles ht;

    public Alojamiento(){
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.alojamiento_layout, container, false);


        rv = view.findViewById(R.id.RVHoteles);

        adapter = new AdaptadorHotel(hotels);

        //Ésta subclase LayoutManager por defecto hará que tu RecyclerView parezca una ListView.
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(llm);

        rv.setAdapter(adapter);

        rellenarHoteles();

        // Devolvemos la vista al fragment
        return view;

    }


    public void rellenarHoteles(){

        hotels.add(new Hoteles( "Hotel Hervás", R.mipmap.ic_launcher));

    }

}