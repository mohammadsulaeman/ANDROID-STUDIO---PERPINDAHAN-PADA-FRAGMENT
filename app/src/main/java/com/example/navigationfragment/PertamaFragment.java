package com.example.navigationfragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class PertamaFragment extends Fragment {

    private Button pindah;
    private View getView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        getView = inflater.inflate(R.layout.fragment_pertama,container,false);

        pindah = getView.findViewById(R.id.btn_pindah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KeduaFragment keduaFragment = new KeduaFragment();
                getFragmentManager().beginTransaction().replace(R.id.Container,keduaFragment).commit();
            }
        });
        return getView;
    }
}