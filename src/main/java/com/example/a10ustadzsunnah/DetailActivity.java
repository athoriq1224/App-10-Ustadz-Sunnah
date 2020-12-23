package com.example.a10ustadzsunnah;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    public TextView textTitle, textDetail;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.detail_ustadz);
        textTitle = findViewById(R.id.tv_lang_title);
        Ustadz extra = getIntent().getParcelableExtra("objek");
        textTitle.setText(extra.getName());

        imageView = findViewById(R.id.imgphoto);
        imageView.setImageResource(extra.getPhoto());

        textDetail = findViewById(R.id.detail_halaman);
        textDetail.setText(extra.getDetail());
    }
}
