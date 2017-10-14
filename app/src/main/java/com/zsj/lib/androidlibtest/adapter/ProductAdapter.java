package com.zsj.lib.androidlibtest.adapter;


import com.zsj.lib.androidlib.adapter.BaseAdapter;
import com.zsj.lib.androidlib.adapter.BaseHolder;
import com.zsj.lib.androidlibtest.entity.Product;

import java.util.List;

/**
 * Created by shkstart on 2016/12/5 0005.
 */
public class ProductAdapter extends BaseAdapter<Product> {
    public ProductAdapter(List<Product> list) {
        super(list);
    }

    @Override
    protected BaseHolder<Product> getHolder() {
        return new ProductHolder();
    }
}
