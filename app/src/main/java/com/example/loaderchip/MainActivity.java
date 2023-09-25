package com.example.loaderchip;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import com.abhinav.chouhan.loaderchip.LoaderChip;

public class MainActivity extends AppCompatActivity {

    LoaderChip loaderChip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loaderChip = findViewById(R.id.loaderChip1);

        loaderChip.setLoaderStartColor(getColor(R.color.black));
        loaderChip.setLoaderColor(getColor(R.color.green));
        loaderChip.setLoaderEndColor(getColor(R.color.red));
        loaderChip.setLapDuration(2000);
        loaderChip.setShouldStartLoadingOnClick(true);
        loaderChip.setOnClickListener(v -> Toast.makeText(MainActivity.this, "Clicked...", Toast.LENGTH_SHORT).show());
    }
}