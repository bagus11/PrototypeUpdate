package com.example.prototype;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

public class Home_security extends Fragment {


    ImageView patroli, serah_terima_jaga, input_jurnal_harian,approve_peminjaman,history_peminjaman,panic_button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View root = inflater.inflate(R.layout.fragment_home_security, container, false);

        patroli = root.findViewById(R.id.btn_patroli);
        serah_terima_jaga = root.findViewById(R.id.serah_terima_jaga);
        input_jurnal_harian= root.findViewById(R.id.btn_input_jurnal_harian);
        history_peminjaman=root.findViewById(R.id.history_peminjaman);
        approve_peminjaman=root.findViewById(R.id.approve_peminjaman);
        panic_button=root.findViewById(R.id.panic_button);
        patroli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Patroli.class);
                startActivity(intent);
            }
        });

        serah_terima_jaga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Serah_terima_jaga.class);
                startActivity(intent);
            }
        });
        input_jurnal_harian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Input_jurnal_harian.class);
                startActivity(intent);
            }
        });

        history_peminjaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),History_peminjaman.class);
                startActivity(intent);
            }
        });
        approve_peminjaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Approve_peminjaman.class);
                startActivity(intent);
            }
        });

        panic_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Pemberitahuan anda akan diberitahukan ke Manager..", Toast.LENGTH_SHORT).show();
            }
        });
        return root;
    }
}