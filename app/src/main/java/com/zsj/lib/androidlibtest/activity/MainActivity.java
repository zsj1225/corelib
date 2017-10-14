package com.zsj.lib.androidlibtest.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.zsj.lib.androidlib.uitils.ConvertUtils;
import com.zsj.lib.androidlibtest.R;
import com.zsj.lib.androidlibtest.adapter.ProductAdapter;
import com.zsj.lib.androidlibtest.entity.Product;

import java.util.ArrayList;

public class MainActivity extends AppBaseActivity {


    private Button mBtnLogin;
    private ListView mListView;
    private Button mBtn_convert;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    public void initVariables() {

    }

    @Override
    protected void initViews() {
        /*
        统一事件编程模型
        比较推崇的方式，有以下两个优点：
        1）直接在btnLogin 这个按钮对象上增加点击事件，是面向对象的写法。
        2）将onClick 方面的实现，封装成一个gotoLoginActivity 方法*/
        // 登录事件
        mBtnLogin = (Button) findViewById(R.id.sign_in_button);
        mBtn_convert = (Button) findViewById(R.id.btn_convert);
        mListView = (ListView) findViewById(R.id.listview);

        mBtnLogin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        gotoLoginActivity();
                    }
                });
        mBtn_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convert2Int();
            }
        });

    }


    private void convert2Int() {
        int anInt = ConvertUtils.convertToInt("123s", 0);
        Log.d("zsj", "zsj anInt = " + anInt);
    }

    private void gotoLoginActivity() {
        Toast.makeText(this, "登录", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void loadData() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("123", "456", "789", "zsj1", "30", "10"));
        products.add(new Product("123", "456", "789", "zsj2", "30", "10"));
        products.add(new Product("123", "456", "789", "zsj3", "30", "10"));
        products.add(new Product("123", "456", "789", "zsj4", "30", "10"));

        ProductAdapter productAdapter = new ProductAdapter(products);
        mListView.setAdapter(productAdapter);
    }
}
