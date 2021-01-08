package com.example.prototype;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class Home_karyawan extends Fragment {

    ImageView peminjaman;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View root = inflater.inflate(R.layout.fragment_home_karyawan, container, false);
                peminjaman=root.findViewById(R.id.peminjaman_mobil);
                peminjaman.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getActivity(), From_peminjaman.class);
                        startActivity(intent);
                    }
                });

        return root;
    }
}