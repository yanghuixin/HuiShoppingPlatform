package com.yhx.huishoppingplatform.activity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.yhx.huishoppingplatform.R;
import com.yhx.huishoppingplatform.adapter.ImageListAdapter;
import com.yhx.huishoppingplatform.adapter.ProductInformationListAdapter;
import com.yhx.huishoppingplatform.pojo.ProductInformation;

import java.util.List;

public class MainActivity extends Activity {

    private ListView lv_image_list;
    private ListView lv_product_information_list;
    private ListView lv_product_information_list_two;

    private List<ProductInformation> productInformationList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_image_list = findViewById(R.id.lv_image_list);
        lv_product_information_list = findViewById(R.id.lv_product_information_list);
        lv_product_information_list_two = findViewById(R.id.lv_product_information_list_two);

        lv_image_list.setAdapter(new ImageListAdapter(this));
        lv_product_information_list.setAdapter(new ProductInformationListAdapter(this, productInformationList));
        lv_product_information_list_two.setAdapter(new ProductInformationListAdapter(this, productInformationList));
    }
}
