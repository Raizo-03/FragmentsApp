package com.example.fragmentsapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class SecondFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_second, container, false);

        TextView textView = view.findViewById(R.id.title2);
        Button button2 = view.findViewById(R.id.btn2);

        button2.setOnClickListener(v ->{
            Toast.makeText(getActivity(), "Goodbye from second fragment", Toast.LENGTH_SHORT).show();
        });


        return view;
    }
}