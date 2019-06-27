package com.example.test_app2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.test_app2.R;

public class MainActivity extends AppCompatActivity {
    private Button valide;
    private EditText chp_txt;
    private LinearLayout layout;
    private LinearLayout layout2;
    //private Button Btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //setContentView(R.layout.activity_main2);

        this.valide = (Button) findViewById(R.id.valide);
        this.chp_txt = (EditText) findViewById(R.id.champ_txt);
        this.layout = (LinearLayout) findViewById(R.id.dynamic_layout);
        this.layout2 = (LinearLayout) findViewById(R.id.dynamic_layout2);

        Button btn2 = new Button(this);
        btn2.setText(getResources().getString(R.string.btn2));
        btn2.setTextSize(25);

        this.layout2.addView(btn2);

        valide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent otherActivity = new Intent(getApplicationContext(), TestActivity.class);
                startActivity(otherActivity);
                finish();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // setContentView(R.layout.activity_main2);

                ImageView img = new ImageView(getApplicationContext());
                ViewGroup.LayoutParams params = new ActionBar.LayoutParams(100, 100);
                img.setLayoutParams(params);
                img.setBackgroundResource(R.drawable.roi_b);

                layout2.addView(img);
            }
        });
    }
}
