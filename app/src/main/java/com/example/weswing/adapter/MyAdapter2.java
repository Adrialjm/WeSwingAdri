package com.example.weswing.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.weswing.R;
import com.example.weswing.data.MyData2;

import java.util.List;

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.ViewHolder> {

    private List<MyData2> dataList;

    public MyAdapter2(List<MyData2> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_3, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MyData2 data = dataList.get(position);

        holder.imageView.setImageResource(data.getImagen());
        holder.textViewTitle.setText(data.getTitulo());
        holder.textViewSubtitle.setText(data.getSubtitulo());
        holder.textViewSubtitle2.setText(data.getSubtitulo2());
        holder.textViewSubtitle3.setText(data.getSubtitulo3());
        holder.textViewSubtitle4.setText(data.getSubtitulo4());
    }

    @Override
    public int getItemCount() {

        return dataList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textViewTitle;
        private TextView textViewSubtitle;
        private TextView textViewSubtitle2;
        private TextView textViewSubtitle3;
        private TextView textViewSubtitle4;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textView1);
            textViewSubtitle = itemView.findViewById(R.id.textView2);
            textViewSubtitle2 = itemView.findViewById(R.id.textView3);
            textViewSubtitle3 = itemView.findViewById(R.id.textView4);
            textViewSubtitle4 = itemView.findViewById(R.id.textView5);

        }
    }
}


