package io.github.bayu1993.cardgallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMobil;
    private CarAdapter carAdapter;

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
    }

    private void initView() {
        rvMobil = findViewById(R.id.rv_mobil);
        rvMobil.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
    }
}
