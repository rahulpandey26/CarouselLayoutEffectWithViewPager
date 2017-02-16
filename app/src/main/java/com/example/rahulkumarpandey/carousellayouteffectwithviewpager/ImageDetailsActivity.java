package com.example.rahulkumarpandey.carousellayouteffectwithviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by Rahul Kumar Pandey on 16-02-2017.
 */

public class ImageDetailsActivity extends AppCompatActivity {

    private static final String DRAWABLE_RESOURE = "resource";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_full_image);

        ImageView imageView = (ImageView) findViewById(R.id.img);
        Button button = (Button) findViewById(R.id.btnClose);

        int drawbleResource = getIntent().getIntExtra(DRAWABLE_RESOURE, 0);
        imageView.setImageResource(drawbleResource);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
