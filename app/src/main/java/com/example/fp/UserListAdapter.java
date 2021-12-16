package com.example.fp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fp.db.User;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.MyViewHolder>{
    private Context context;
    private List<User> userList;
    private View.OnClickListener itemClick;
    private int rem;

    public UserListAdapter(Context context, View.OnClickListener itemClick) {
        this.context = context;
        this.itemClick = itemClick;

    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public UserListAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_adduser, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserListAdapter.MyViewHolder holder, int position) {
        holder.name.setText(this.userList.get(position).Name);
        holder.email.setText(this.userList.get(position).Eamil);
        holder.phone.setText(this.userList.get(position).Phone);
        rem = position %10;
        if (rem ==0){
            holder.img.setImageResource(R.drawable.icon01_01);
        }else if (rem == 1){
            holder.img.setImageResource(R.drawable.icon01_02);
        }else if (rem == 2){
            holder.img.setImageResource(R.drawable.icon01_03);
        }else if (rem == 3){
            holder.img.setImageResource(R.drawable.icon01_04);
        }else if (rem == 4){
            holder.img.setImageResource(R.drawable.icon01_05);
        }else if (rem == 5){
            holder.img.setImageResource(R.drawable.icon01_06);
        }else if (rem == 6){
            holder.img.setImageResource(R.drawable.icon01_07);
        }else if (rem == 7){
            holder.img.setImageResource(R.drawable.icon01_08);
        }else if (rem == 8){
            holder.img.setImageResource(R.drawable.icon01_09);
        }else if (rem == 9){
            holder.img.setImageResource(R.drawable.icon01_10);
        }

        holder.itemView.setTag(position);
        holder.itemView.setOnClickListener(itemClick);
    }

    @Override
    public int getItemCount() {
        return  this.userList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name,email,phone;
        ImageView img;

        public MyViewHolder(View view) {
            super(view);
            name = view.findViewById(R.id.tv_name);
            email = view.findViewById(R.id.tv_email);
            phone = view.findViewById(R.id.tv_phone);
            img = view.findViewById(R.id.img);

        }
    }
}
