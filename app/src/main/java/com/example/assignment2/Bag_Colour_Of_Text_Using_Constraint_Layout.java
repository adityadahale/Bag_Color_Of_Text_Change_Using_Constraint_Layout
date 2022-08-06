//     -x-x-x-x-x-x-x-x-x-x-x-x-x- Assignment No->> 2 -x-x-x-x-x-x-x-x-x-x-x-x-x-

package com.example.assignment2;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.example.assignment2.R;

public class Bag_Colour_Of_Text_Using_Constraint_Layout extends Activity implements View.OnClickListener {
    private TextView text_View1, text_View2, text_View3;
    private EditText edit_text;
    private Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bag_colour_of_text_using_constraint_layout);
        initializeViews();
        initListeners();
    }
    private void initListeners() {
        button.setOnClickListener(this);
        text_View1.setOnClickListener(this);
        text_View2.setOnClickListener(this);
        text_View3.setOnClickListener(this);
    }
    private void initializeViews() {
        text_View1 = findViewById(R.id.one);
        text_View2 = findViewById(R.id.two);
        text_View3 = findViewById(R.id.three);
        edit_text = findViewById(R.id.text);
        button = findViewById(R.id.submit_button);
    }
    @Override
    public void onClick(View view) {
        switch (edit_text.getText().toString()){
            case "one":
            case "One":
            case "ONE":
                text_View1.setBackgroundColor(Color.RED);
                text_View2.setBackgroundColor(Color.YELLOW);
                text_View3.setBackgroundColor(Color.YELLOW);
                break;
            case "two":
            case "Two":
            case "TWO":
                text_View2.setBackgroundColor(Color.RED);
                text_View1.setBackgroundColor(Color.YELLOW);
                text_View3.setBackgroundColor(Color.YELLOW);
                break;
            case "three":
            case "Three":
            case "THREE":
                text_View3.setBackgroundColor(Color.RED);
                text_View1.setBackgroundColor(Color.YELLOW);
                text_View2.setBackgroundColor(Color.YELLOW);
                break;
            default:
                text_View1.setBackgroundColor(Color.BLUE);
                text_View2.setBackgroundColor(Color.BLUE);
                text_View3.setBackgroundColor(Color.BLUE);
        }
    }
}