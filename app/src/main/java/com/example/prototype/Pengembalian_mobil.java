package com.example.prototype;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Pengembalian_mobil extends Fragment {

        Button update;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View root = inflater.inflate(R.layout.fragment_pengembalian_mobil, container, false);
        update = root.findViewById(R.id.btn_update_car);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Form_pengembalian_mobil.class);
                startActivity(intent);
            }
        });
        return root;
    }
}