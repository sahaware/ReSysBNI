package com.sahaware.resysbni.view.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.sahaware.resysbni.R;

/**
 * Created by CR055 on 24-Dec-15.
 */
public class CustomTextSliderView extends BaseSliderView {

    public CustomTextSliderView(Context context){
        super(context);
    }

    @Override
    public View getView() {
        View v = LayoutInflater.from(getContext()).inflate(R.layout.item,null);
        ImageView target = (ImageView)v.findViewById(R.id.daimajia_slider_image);
        //TextView description = (TextView)v.findViewById(R.id.description);
        //description.setText(getDescription());
        bindEventAndShow(v, target);
        return v;
    }
}
