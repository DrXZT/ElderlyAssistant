package com.asciimovie.drxzt.elderlyassistant.fragment;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.asciimovie.drxzt.elderlyassistant.R;
import com.asciimovie.drxzt.elderlyassistant.activity.food.Note1Activity;

import java.util.List;

public class MemoAdapter extends RecyclerView.Adapter<MemoAdapter.ViewHolder> {

//    private List<Memorial> memoList;
    private List<Note> mNoteList;
    private Context mContext;


    public interface OnRecyclerViewListener{            //定义接口和接口中的方法
        void onItemClick(int position);
        boolean onItemLongClick(int position);

    }
    public OnRecyclerViewListener onRecyclerViewListener;
    public void setOnRecyclerViewListener(OnRecyclerViewListener onRecyclerViewListener){
        this.onRecyclerViewListener = onRecyclerViewListener;

    }


//    public MemoAdapter(Context context) {
//        this.mContext = context;
//    }


//    public MemoAdapter(List<Memorial> pictureList){
//        memoList = pictureList;
//
//    }

    public MemoAdapter(List<Note> noteList){
        mNoteList = noteList;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.picture_item,parent,false);
//        final ViewHolder holder = new ViewHolder(view);
//        holder.NoteView.setOnClickListener(v -> {
//            int position = holder.getAdapterPosition();
//            Memorial memorial = memoList.get(position);
//            Toast.makeText(v.getContext(),memorial.getImageId(),Toast.LENGTH_SHORT).show();
//        });
//        holder.NoteImage.setOnClickListener(v -> {
//            int position = holder.getAdapterPosition();
//            Memorial memorial = memoList.get(position);


//            Toast.makeText(v.getContext(),memorial.getImageId(),Toast.LENGTH_SHORT).show();
//                Intent intent1 = new Intent(mContext, Note1Activity.class);
//                mContext.startActivity(intent1);
//        });
//        以上为设置点击事件弹出Toast
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Note data=mNoteList.get(position);
//        Memorial memorial = memoList.get(position);

        holder.NotetTitle.setText(data.getTitle());
//        holder.NoteImage.setImageResource(memorial.getImageId());

    }

    @Override
    public int getItemCount() {
        return mNoteList.size();
    }




    class ViewHolder extends RecyclerView.ViewHolder {

//        View NoteView;
//        ImageView NoteImage;
        TextView NotetTitle;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
//            NoteView = itemView;
//            NoteImage = itemView.findViewById(R.id.note_image);
            NotetTitle = itemView.findViewById(R.id.note_title);
        }
    }

}
