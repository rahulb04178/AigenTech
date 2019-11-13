package com.example.aigentech;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aigentech.model.Cars;

import java.util.List;
import java.util.zip.Inflater;

public class CarRecyclerView extends RecyclerView.Adapter<CarRecyclerView.ViewHoler> {

    List<Cars> data;
    Context context;
    private onCarListener onCarListener;


    public CarRecyclerView(List<Cars> data, Context context,onCarListener onCarListener) {
        this.data = data;
        this.context = context;
        this.onCarListener = onCarListener;
    }

    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.car_list_layout,parent,false);
        return new ViewHoler(view, onCarListener);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoler holder, int position) {
         holder.textView.setText(data.get(position).getnName());
         holder.imageView.setImageResource(data.get(position).getnImage());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHoler extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView textView;
        ImageView imageView;
        onCarListener onCarListener;
        public ViewHoler(@NonNull View itemView,onCarListener onCarListener) {
            super(itemView);
            textView = itemView.findViewById(R.id.txt_car);
            imageView = itemView.findViewById(R.id.img_car);
            this.onCarListener = onCarListener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            onCarListener.oncarClick(getAdapterPosition());
        }
    }

    public interface onCarListener{
        void oncarClick(int position);
    }
}
