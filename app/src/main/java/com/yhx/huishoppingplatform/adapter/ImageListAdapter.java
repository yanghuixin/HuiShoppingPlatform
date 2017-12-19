package com.yhx.huishoppingplatform.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.yhx.huishoppingplatform.R;

/**
 * Created by Administrator on 2017/12/19.
 */

public class ImageListAdapter extends BaseAdapter {

    private Context context;

    public ImageListAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = View.inflate(context, R.layout.item_image_list, null);
        return view;
    }
}
