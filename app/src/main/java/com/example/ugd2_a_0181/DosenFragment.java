package com.example.ugd2_a_0181;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ugd2_a_0181.entity.Dosen;

public class DosenFragment extends Fragment {

    public DosenFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //  Proses menghubungkan layout fragment_dosen.xml dengan fragment ini
        return inflater.inflate(R.layout.fragment_dosen, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Menghubungkan rvDosen dengan recycler view yang ada pada layout
        RecyclerView rvDosen = view.findViewById(R.id.rv_dosen);

        //  Set Layout Manager dari recycler view
        rvDosen.setLayoutManager(new LinearLayoutManager(this.getContext(),LinearLayoutManager.VERTICAL,false));

        //  Set Adapter dari recycler view.
        rvDosen.setAdapter(new RVDosenAdapter(Dosen.listOfDosen));
    }
}