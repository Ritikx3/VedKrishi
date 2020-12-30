package com.example.vedkrishi.Season;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vedkrishi.R;

public class ZaidActivity extends AppCompatActivity {
    CardView cardView;
    RecyclerView recyclerView;
    TextView crop_name,crop_desc;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zaid);

        cardView=findViewById(R.id.cardView);
        crop_name=findViewById(R.id.txt_name_crop);
        crop_desc=findViewById(R.id.txt_crop_desc);
        image=findViewById(R.id.img_crop);
        recyclerView=findViewById(R.id.recycle_zaid);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        String[] name={"Bitter Gourd","Pumpkin","Jute","Cucumber","Muskmelon","Watermelon"};
        int[] image={R.drawable.bittergourd,R.drawable.pumpkin,R.drawable.jute,R.drawable.cucumber,R.drawable.muskmelon,R.drawable.watermelon};
        String[] desc={"bbjhbj","bvhmbjhb","bmjhbjb","hhkuh","jghj","gjhvjgv"};

        recyclerView.setAdapter(new ZaidAdapter(image,name,getApplicationContext()));
    }
}