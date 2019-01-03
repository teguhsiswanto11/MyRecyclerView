package com.unikom.teguhsis.myrecyclerview;

import android.view.View;

//    Kelas ini nantinya yang berfungsi untuk menangani aksi ketika itemnya di klik
public class CustomOnClickListener implements View.OnClickListener{

    private int position;
    private OnItemClickCallback onItemClickCallback;

    CustomOnClickListener(int position, OnItemClickCallback onItemClickCallback) {
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View v) {
        onItemClickCallback.onItemClicked(v, position);
    }

    public interface OnItemClickCallback {
        void onItemClicked(View view, int position);
    }

}
