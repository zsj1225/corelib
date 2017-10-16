package com.zsj.lib.androidlibtest.adapter;

import android.view.View;
import android.widget.TextView;


import com.zsj.lib.androidlib.adapter.BaseHolder;
import com.zsj.lib.androidlibtest.MyApplication;
import com.zsj.lib.androidlibtest.R;
import com.zsj.lib.androidlibtest.entity.Product;


/**
 * Created by shkstart on 2016/12/5 0005.
 */
public class ProductHolder extends BaseHolder<Product> {

    TextView pName;
    TextView pMoney;
    TextView pYearlv;
    TextView pSuodingdays;
    TextView pMinzouzi;
    TextView pMinnum;

    @Override
    protected View initView() {
        View view = View.inflate(MyApplication.context, R.layout.item_product_list, null);
        pName = view.findViewById(R.id.p_name);
        pMoney = view.findViewById(R.id.p_money);
        pYearlv = view.findViewById(R.id.p_yearlv);
        pSuodingdays = view.findViewById(R.id.p_suodingdays);
        pMinzouzi = view.findViewById(R.id.p_minzouzi);
        pMinnum = view.findViewById(R.id.p_minnum);
        return view;
    }

    @Override
    protected void refreshData() {
        Product data = this.getData();

        //装数据
        pMinnum.setText(data.memberNum);
        pMinzouzi.setText(data.minTouMoney);
        pMoney.setText(data.money);
        pName.setText(data.name);
        pSuodingdays.setText(data.suodingDays);
        pYearlv.setText(data.yearRate);

    }
}
