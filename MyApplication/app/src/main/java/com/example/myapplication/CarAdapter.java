package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

public class CarAdapter extends ArrayAdapter{

    int mLayoutID;
    Context mContext;
    List<Car> mCars;

    public CarAdapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        mLayoutID = resource;
        mContext = context;
        mCars = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //Get a reference to the current ListView item
        View currentListViewItem = convertView;

        // Check if the existing view is being reused, otherwise inflate the view
        if (currentListViewItem == null) {
            currentListViewItem = LayoutInflater.from(getContext()).inflate(mLayoutID, parent, false);
        }
        //Get the Number object for the current position
        Car currentNumber = mCars.get(position);

        TextView PhonePrice = (TextView) currentListViewItem.findViewById(R.id.CarPrice);

        int Price = currentNumber.getPrice();
        String Price_str = Integer.toString(Price);

        PhonePrice.setText(Price_str);


        //Set the attributed of list_view_number_item views
        ImageView iconImageView = (ImageView) currentListViewItem.findViewById(R.id.CarImage);
        int i = mContext.getResources().getIdentifier(
                String.valueOf(currentNumber.getImageName()[0]), "drawable",
                mContext.getPackageName());

        //Setting the icon
        iconImageView.setImageResource(i);

        TextView ModelName = (TextView) currentListViewItem.findViewById(R.id.Text_name);
        ModelName.setText(currentNumber.getCarName());


        return currentListViewItem;
    }


}
