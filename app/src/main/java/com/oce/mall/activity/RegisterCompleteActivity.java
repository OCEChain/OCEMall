package com.oce.mall.activity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import com.oce.mall.R;
import com.oce.mall.utils.GotoActivity;
import com.oce.mall.view.CountDownTimerView;
import com.oce.mall.view.OnCountDownTimerListener;

/**
 * Created by oce on 2016/7/17.
 */
public class RegisterCompleteActivity extends BaseActivity {

    private CountDownTimer countDownTimer;
    private TextView tvCountTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_complete);
        initView();
    }

    @Override
    protected void initView() {
        super.initView();
        super.setNormalTitle(R.string.approval_tip);
        tvCountTimer = (TextView) findViewById(R.id.count_timer);
        createCountDownTimer();
        countDownTimer.start();
    }

    /**
     * 创建倒计时
     */
    private void createCountDownTimer() {
        countDownTimer = new CountDownTimer(4000, 1000) {

            @Override
            public void onTick(long millisUntilFinished) {
                tvCountTimer.setText(String.valueOf(millisUntilFinished/1000));
            }

            @Override
            public void onFinish() {
                GotoActivity.gotoActiviy(RegisterCompleteActivity.this, MainActivity.class, true);
            }
        };
    }
}
