package com.example.fragmentsapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        TextView title = findViewById(R.id.textView);
        Button button1 = findViewById(R.id.firstFragment);
        button1.setOnClickListener(v -> loadFragment(new FirstFragment()));
        Button button2 = findViewById(R.id.secondFragment);
        button2.setOnClickListener(v -> loadFragment(new FirstFragment()));



    }

    //method to display fragments
    public void loadFragment(Fragment fragment){

        //managing the fragments in the activity; add, remove, hide, shoe
        //for 27 and below API
        FragmentManager fm = getSupportFragmentManager();


        FragmentTransaction ft = fm.beginTransaction(); //to change fragments at runtime

        //replace the layout with diff fragment
        ft.replace(R.id.mainFramelayout, fragment);
        ft.commit();
    }



    void Fragments(){
        /*
        Definition:
        A fragment represents a reusable portion of your app's UI

        defines and manages its own layout, has its own lifecycle, and can handle its own input events.


        uses: different view pager tabs like feed, messages, profile
              navigation : home, search, notifications, profile


        can't live on their own. must be hosted by an activity or fragment.

        Life Cycle:
        When a user navigates and interacts with your app, your fragments transition through states when they ae
        added, removed, or enter or exit

        includes callbacks onCreate(), onStart(), onResume(), onPause(), onStop(), onDestroy()

        onCreate();
            onAttach();  when the fragment is attached to the activity
            onCreate ; when the fragment is initialized
            onCreateView; fragments creates UI by inflating layout or constructing UI elements; ui is prepared here
            onActivityCreated; called when oncreate is finished executing good place to perform any user interface operations
            that require the activity to be fully created

         onStart();
            onStart; when the fragment started

          onResume();
            onResume; when the fragment is visible to the user

           onPause();
           onPause; when the fragment is about to be covered by another fragment or activity
                    for saving fragment state

           onStop();
           onStop; when the fragment is no longer visible to the user to release resource that are no longer needed

           onDestroy();
           onDestroyView; when the  fragment UI is destroyed; Views, adapters etc
           onDestroy; when the fragment is about to be destroyed

           onDetach; when the fragment is detached from the hosting activity

         */
    }
}