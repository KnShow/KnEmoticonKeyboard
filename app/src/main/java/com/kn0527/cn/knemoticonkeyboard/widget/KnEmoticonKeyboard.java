package com.kn0527.cn.knemoticonkeyboard.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;

import com.kn0527.cn.knemoticonkeyboard.R;

/**
 * auto：xkn on 2018/4/10 14:34
 */

public class KnEmoticonKeyboard extends RelativeLayout{

    private LayoutInflater mInflater;

    public KnEmoticonKeyboard(Context context) {
        super(context);
    }

    public KnEmoticonKeyboard(Context context, AttributeSet attrs) {
        super(context, attrs);
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflateKeyboardBar();
    }

    private void inflateKeyboardBar() {
        mInflater.inflate(R.layout.view_keyboard_userdef,this);
    }


}
