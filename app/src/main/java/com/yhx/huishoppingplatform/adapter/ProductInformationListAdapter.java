package com.yhx.huishoppingplatform.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yhx.huishoppingplatform.R;
import com.yhx.huishoppingplatform.pojo.ProductInformation;

import java.util.List;

/**
 * Created by Administrator on 2017/12/19.
 */

public class ProductInformationListAdapter extends BaseAdapter {

    private Context context;
    private List<ProductInformation> productInformationList;

    public ProductInformationListAdapter(Context context, List<ProductInformation> productInformationList) {
        this.context = context;
        this.productInformationList = productInformationList;
    }

    @Override
    public int getCount() {
        return productInformationList.size();
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
        View view = View.inflate(context, R.layout.item_product_information, null);
        return view;
    }

    private ViewHolder getHolder(View view){
        ViewHolder holder = (ViewHolder) view.getTag();
        if (holder == null){
            holder = new ViewHolder(view);
            view.setTag(holder);
        }
        return holder;
    }

    class ViewHolder{
        private ImageView iv_product_image;
        private TextView tv_commodity_name;
        private TextView tv_comment;
        private TextView tv_consumption;
        private RelativeLayout rl_price;
        private TextView tv_price;
        private TextView tv_address;
        private TextView tv_distance;
        private TextView tv_char_introduction_one;
        private TextView tv_char_introduction_two;
        private TextView tv_char_introduction_three;
        private TextView tv_char_introduction_four;

        public ViewHolder(View view){
            iv_product_image = view.findViewById(R.id.iv_product_image);
            tv_commodity_name = view.findViewById(R.id.tv_commodity_name);
            tv_comment = view.findViewById(R.id.tv_comment);
            tv_consumption = view.findViewById(R.id.tv_consumption);
            rl_price = view.findViewById(R.id.rl_price);
            tv_price = view.findViewById(R.id.tv_price);
            tv_address = view.findViewById(R.id.tv_address);
            tv_distance = view.findViewById(R.id.tv_distance);
            tv_char_introduction_one = view.findViewById(R.id.tv_char_introduction_one);
            tv_char_introduction_two = view.findViewById(R.id.tv_char_introduction_two);
            tv_char_introduction_three = view.findViewById(R.id.tv_char_introduction_three);
            tv_char_introduction_four = view.findViewById(R.id.tv_char_introduction_four);
        }
    }
}
