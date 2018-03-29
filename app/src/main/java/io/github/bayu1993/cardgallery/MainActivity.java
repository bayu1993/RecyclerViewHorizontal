package io.github.bayu1993.cardgallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMobil;
    private CarAdapter carAdapter;
    private RecyclerView rvMobil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initAdapter();
    }

    private void initAdapter() {
        carAdapter = new CarAdapter(Car.generateData());
        rvMobil.setAdapter(carAdapter);
        rvMobil.setHasFixedSize(true);
        rvMobil2.setAdapter(carAdapter);
        rvMobil2.setHasFixedSize(true);

    }

    private void initView() {
        rvMobil = findViewById(R.id.rv_mobil);
        rvMobil2 = findViewById(R.id.rv_mobil2);
        rvMobil.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        rvMobil2.setLayoutManager(new LinearLayoutManager(this));
    }
}
