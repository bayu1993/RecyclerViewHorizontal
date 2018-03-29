package io.github.bayu1993.cardgallery;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by dell on 3/29/18.
 */

public class CarAdapter extends RecyclerView.Adapter<CarViewHolder> {
    private final List<Car> mCars;

    public CarAdapter(List<Car> cars) {
        mCars =cars;
    }

    @Override
    public CarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_car,parent,false);
        return new CarViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CarViewHolder holder, int position) {
        Car car = mCars.get(position);
        holder.showData(car);
    }

    @Override
    public int getItemCount() {
        return mCars.size();
    }
}
