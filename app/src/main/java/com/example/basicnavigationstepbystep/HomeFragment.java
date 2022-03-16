package com.example.basicnavigationstepbystep;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    private Fragment thisFragment=this;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.home_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //TODO STEP 2 - Set an OnClickListener, using Navigation.createNavigateOnClickListener()
        //END STEP 2

        //TODO STEP 3 - Set NavOptions
        //END STEP 3

        //TODO STEP 4 - OnClickListener to navigate using an action
        //END STEP 4

        //TODO STEP 7 - Update the OnClickListener to navigate using an action and using  ...Direction clases for arguments
        //END STEP 7

    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.main_menu, menu);
    }
}
