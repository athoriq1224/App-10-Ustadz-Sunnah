package com.example.a10ustadzsunnah;

import android.content.Intent;
import android.media.Image;
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

public class ListUstadzAdapter extends RecyclerView.Adapter<ListUstadzAdapter.ListViewHolder> {
    private ArrayList<Ustadz> listUstadz;

    public ListUstadzAdapter(ArrayList<Ustadz> list){
        this.listUstadz = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_ustadz, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        Ustadz ustadz = listUstadz.get(position);
        Glide.with(holder.itemView.getContext())
                .load(ustadz.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(ustadz.getName());
        holder.tvDetail.setText(ustadz.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent moveIntent = new Intent(view.getContext(), DetailActivity.class);
                moveIntent.putExtra("objek", listUstadz.get(position));
                view.getContext().startActivity(moveIntent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listUstadz.size();
    }


    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;

         ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}
