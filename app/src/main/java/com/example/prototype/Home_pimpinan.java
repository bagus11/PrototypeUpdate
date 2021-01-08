package com.example.prototype;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Home_pimpinan extends Fragment {

    ImageView acc_pinjaman,histori;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View root = inflater.inflate(R.layout.fragment_home_pimpinan, container, false);
        acc_pinjaman=root.findViewById(R.id.acc_pinjaman);
        acc_pinjaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), List_acc_pinjaman.class);
                startActivity(intent);
            }
        });

        histori=root.findViewById(R.id.history);
        histori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), History_pinjaman.class);
                startActivity(intent);
            }
        });
        return root;
    }
}