package felipe.rodrigues.s301032048.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import felipe.rodrigues.s301032048.R;

public class RodriguesFragment extends Fragment {


  public RodriguesFragment(){

  }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rodrigues, container, false);
    }
}