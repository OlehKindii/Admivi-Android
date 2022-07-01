package com.application.adimviandroid.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;

import com.application.adimviandroid.R;

public class MuroFeatureSuccessDialog extends Dialog {
    private Context mContext;

    public MuroFeatureSuccessDialog(@NonNull Context context) {
        super(context);
        mContext = context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_destacar_muro_success);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        LinearLayout okay = findViewById(R.id.lltOkay);
        okay.setOnClickListener(v -> {
            dismiss();
        });
        ImageView imgClose = findViewById(R.id.imgClose);
        imgClose.setOnClickListener(v -> dismiss());
    }

}
