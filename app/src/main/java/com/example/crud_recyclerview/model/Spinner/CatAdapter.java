package com.example.crud_recyclerview.model.Spinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.crud_recyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class CatAdapter extends RecyclerView.Adapter<CatAdapter.CatViewHolder> {
    private Context context;
    private List<Cat> mList;

    public CatAdapter(Context context) {
        this.context = context;
        this.mList = new ArrayList<>();
    }

    public void addCat(Cat cat){
        mList.add(cat);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new CatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CatViewHolder holder, int position) {
        Cat cat = mList.get(position);
        if(cat == null) return;
        holder.img.setImageResource(cat.getImg());
        holder.tvName.setText(cat.getName());
        holder.tvPrice.setText(cat.getPrice()+"k");
        holder.tvDescribe.setText(cat.getDescripe());
    }

    @Override
    public int getItemCount() {
        if(mList!=null)
            return mList.size();
        return 0;
    }

    public class CatViewHolder extends RecyclerView.ViewHolder{
        private ImageView img;
        private TextView tvName,tvDescribe,tvPrice;
        private Button btnRemove;

        public CatViewHolder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            tvName = itemView.findViewById(R.id.txtName);
            tvDescribe = itemView.findViewById(R.id.txtDescription);
            tvPrice = itemView.findViewById(R.id.price);
            btnRemove = itemView.findViewById(R.id.btnRemove);
        }
    }
}
