package com.oce.mall.activity;

import android.os.Bundle;
import android.view.View;

import com.oce.mall.R;
import com.oce.mall.utils.GotoActivity;
import com.oce.mall.utils.UserManager;

/**
 * Created by oce on 2016/7/17.
 */
public class MoreSettingActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_setting);
        initView();
    }

    @Override
    protected void initView() {
        super.initView();
        super.setNormalTitle(R.string.more_settings);
        findViewById(R.id.logout_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
        switch (v.getId()){
            case R.id.logout_button:{
                UserManager.getInstance().setLogin(false);
                GotoActivity.gotoActiviy(this, MainActivity.class, true);
                //TODO 退出登录请求
                break;
            }
        }
    }
}
