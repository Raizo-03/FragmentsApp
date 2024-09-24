package com.example.fragmentsapp;

import android.content.Context;
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

public class FirstFragment extends Fragment {




    //ONCREATE
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);


        Toast.makeText(context,
                "OnAttach is called", Toast.LENGTH_SHORT).show();




    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Toast.makeText(getActivity(),
                "OnAttach is called", Toast.LENGTH_SHORT).show();



        }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(getActivity(),
                "OnAttach is called", Toast.LENGTH_SHORT).show();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // Inflate the fragment's layout
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        Button button = view.findViewById(R.id.btn);
        TextView textView = view.findViewById(R.id.title);

        button.setOnClickListener(v -> {
            Toast.makeText(getActivity(), "Welcome to the first fragment", Toast.LENGTH_SHORT).show();
        });


        // Return the inflated view
        return view;
    }


    //ActivityCreated is deprecated

    /*Reasons for Deprecation
    onActivityCreated() was often used to perform tasks that depended on the Activity being fully created, such as accessing the ViewModel or initializing LiveData.
    However, this method was seen as unnecessary since you could achieve the same results by using onViewCreated() or onCreate() with a cleaner lifecycle.*/

    /*Key Differences Between onCreateView() and onViewCreated():
    onCreateView() is responsible for inflating the layout for the fragment.
    It returns the root view of the fragment's layout, but the UI components may not be fully initialized at this stage. You typically should only handle view inflation in this method, not complex UI logic.

    onViewCreated() is called after the fragment's view has been created and fully initialized.
    It is the ideal place for UI logic, such as setting up ViewModel or attaching observers to LiveData.
    */


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


}