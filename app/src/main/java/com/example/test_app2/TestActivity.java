package com.example.test_app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.test_app2.R;

public class TestActivity extends AppCompatActivity {
    private TextView pts, txt_pseudo;
    private EditText chp_pseudo;
    private ImageView roi;
    private int compte = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        this.pts = (TextView) findViewById(R.id.txt_pts);
        this.roi = (ImageView) findViewById(R.id.img_roi);
        // this.txt_pseudo = (TextView) findViewById(R.id.txt_pseudo);
        // this.chp_pseudo = (EditText) findViewById(R.id.champ_txt);

        // txt_pseudo.setText(chp_pseudo.getText());

        this.roi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compte++;
                pts.setText("points : " + compte);
            }
        });
    }
}
