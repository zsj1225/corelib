package com.zsj.lib.androidlibtest.adapter;

import android.view.View;
import android.widget.TextView;


import com.zsj.lib.androidlib.adapter.BaseHolder;
import com.zsj.lib.androidlibtest.MyApplication;
import com.zsj.lib.androidlibtest.R;
import com.zsj.lib.androidlibtest.entity.Product;

import butterknife.Bind;

/**
 * Created by shkstart on 2016/12/5 0005.
 */
public class ProductHolder extends BaseHolder<Product> {

    @Bind(R.id.p_name)
    TextView pName;
    @Bind(R.id.p_money)
    TextView pMoney;
    @Bind(R.id.p_yearlv)
    TextView pYearlv;
    @Bind(R.id.p_suodingdays)
    TextView pSuodingdays;
    @Bind(R.id.p_minzouzi)
    TextView pMinzouzi;
    @Bind(R.id.p_minnum)
    TextView pMinnum;

    @Override
    protected View initView() {
        return View.inflate(MyApplication.context, R.layout.item_product_list, null);
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
