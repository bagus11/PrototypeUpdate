package com.example.prototype;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class Profile_fragment extends Fragment {

    TextView account_info,security_key;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View root = inflater.inflate(R.layout.fragment_profile_fragment, container, false);

        account_info=root.findViewById(R.id.account_info_btn);
        security_key=root.findViewById(R.id.security_kode_btn);

        account_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Setting_profile.class);
                startActivity(intent);
            }
        });

        security_key.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Security_code.class);
                startActivity(intent);
            }
        });
        return root ;
    }
}