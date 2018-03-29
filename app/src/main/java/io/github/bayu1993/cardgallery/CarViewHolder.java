package io.github.bayu1993.cardgallery;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by dell on 3/29/18.
 */

class CarViewHolder extends RecyclerView.ViewHolder{
    private TextView tvId;
    private TextView tvMerk;
    private TextView tvYear;

    public CarViewHolder(View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View view) {
        tvId = view.findViewById(R.id.tv_id);
        tvMerk = view.findViewById(R.id.tv_merk);
        tvYear = view.findViewById(R.id.tv_year);
    }

    public void showData(Car car) {
        tvId.setText(String.valueOf(car.getId()));
        tvYear.setText(String.valueOf(car.getYear()));
        tvMerk.setText(String.valueOf(car.getMerk()));
    }
}
