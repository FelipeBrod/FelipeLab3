package felipe.rodrigues.s301032048.fragments;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import felipe.rodrigues.s301032048.R;

public class FelipeFragment extends Fragment {


    private Button start, clear;
    private ImageView reusableImageView;
    private TextView textView;
    //
    private int startx = 10;
    private int starty = 10;
    private int endx = 300;
    private int endy = 300;
    //
    private Paint paint;
    private Bitmap bitmap;
    private Canvas canvas;

    public FelipeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_felipe, container, false);



        return view;
    }// end of onCreate


}