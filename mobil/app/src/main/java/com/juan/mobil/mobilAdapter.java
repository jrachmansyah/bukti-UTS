package com.juan.mobil;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class mobilAdapter extends RecyclerView.Adapter<mobilAdapter.ListViewHolder> {
    private ArrayList<mobilProduct> listSoftware;
    private OnItemClickCallback onItemClickCallback;

    public mobilAdapter(ArrayList<mobilProduct> list) {
        this.listSoftware = list;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_mobil, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final mobilAdapter.ListViewHolder holder, int position) {
        mobilProduct ep = listSoftware.get(position);

        Glide.with(holder.itemView.getContext())
                .load(ep.getFotomobil()).apply(new RequestOptions().override(60, 60))
                .into(holder.imgmobil);
        holder.tvNama.setText(ep.getNamamobil());
//        holder.tvDeskripsi.setText(ep.getKeteranganProduk());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listSoftware.get(holder.getAdapterPosition()));
            }
        });
    }

    @Override
    public int getItemCount() {
        return listSoftware.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgmobil;
        TextView tvNama, tvDeskripsi;

        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgmobil = itemView.findViewById(R.id.tv_mobil_photo);
            tvNama = itemView.findViewById(R.id.tv_mobil_name);
            tvDeskripsi = itemView.findViewById(R.id.tv_keterangan);
        }
    }

    public interface OnItemClickCallback {
        void onItemClicked(mobilProduct data);
    }
}

