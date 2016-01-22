package com.chenliuliu.progressbar;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.zhy.http.okhttp.callback.StringCallback;

import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;

public class MainActivity extends Activity {
    private ImageView btn_anim, btn_anim2, btn_anim3, btn_anim4;
    private AnimationDrawable animationDrawable, animationDrawable2, animationDrawable3, animationDrawable4;
    private int flag = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initOne();
        initTwo();
        initThree();
        initFour();
        Map<String, String> params = new HashMap<String, String>();
        params.put("SENSORID", "500004DF6A4A");
        params.put("KEY", "v34uvm9y839vg6y23mhLSKDF84f10a");
        HttpUtils.getInstance().executePost("http://weiguo.hanwei.cn/smart/hwmobile/smart/d002!retrieveRealData", params, new HttpUtilsCallBack<Testw>() {

            @Override
            public void onError(String str) {
                Toast.makeText(MainActivity.this, str, Toast.LENGTH_LONG);
            }

            @Override
            public void onSuccess(Testw reponse) {
                Toast.makeText(MainActivity.this, reponse.getMessage(), Toast.LENGTH_LONG).show();

            }
        }, Testw.class);
        HttpUtils.getInstance().executeGet("http://www.baidu.com", null, new StringCallback() {
            @Override
            public void onError(Call call, Exception e) {

            }

            @Override
            public void onResponse(String response) {
                Log.d("test++++++", response);

            }
        });
    }

    private void initFour() {
        btn_anim4 = (ImageView) findViewById(R.id.btn_anim4);
        animationDrawable4 = (AnimationDrawable) btn_anim4.getDrawable();
        animationDrawable4.start();
    }

    private void initThree() {
        btn_anim3 = (ImageView) findViewById(R.id.btn_anim3);
        btn_anim3.setImageResource(R.drawable.animation3);
        animationDrawable3 = (AnimationDrawable) btn_anim3.getDrawable();
        animationDrawable3.start();
    }

    private void initOne() {
        btn_anim = (ImageView) findViewById(R.id.btn_anim);
        btn_anim.setImageResource(R.drawable.animation);
        animationDrawable = (AnimationDrawable) btn_anim.getDrawable();
        btn_anim.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {

                Map<String, String> params = new HashMap<String, String>();
                params.put("SENSORID", "500004DF6A4A");
                params.put("KEY", "v34uvm9y839vg6y23mhLSKDF84f10a");
                HttpUtils.getInstance().executePost("http://weiguo.hanwei.cn/smart/hwmobile/smart/d002!retrieveRealData", params, new HttpUtilsCallBack<Testw>() {

                    @Override
                    public void onError(String str) {
                        Toast.makeText(MainActivity.this, str, Toast.LENGTH_LONG);
                    }

                    @Override
                    public void onSuccess(Testw reponse) {
                        Toast.makeText(MainActivity.this, reponse.getMessage(), Toast.LENGTH_LONG).show();

                    }
                }, Testw.class);


                if (flag == 0) {
                    btn_anim.setImageResource(R.drawable.animation);
                    animationDrawable.start();
                    flag = 1;
                    System.out.println("你喜欢了");
                    btn_anim.setEnabled(false);
                    new Handler().postDelayed(new Runnable() {

                        @Override
                        public void run() {
                            btn_anim.setEnabled(true);
                        }
                    }, 1000);
                } else if (flag == 1) {
                    animationDrawable.selectDrawable(0);
                    animationDrawable.stop();
                    flag = 0;
                    System.out.println("你不喜欢了");
                    btn_anim.setEnabled(false);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            btn_anim.setEnabled(true);
                        }
                    }, 1000);
                }
            }
        });
    }

    private void initTwo() {
        btn_anim2 = (ImageView) findViewById(R.id.btn_anim2);
        btn_anim2.setImageResource(R.drawable.animation2);
        animationDrawable2 = (AnimationDrawable) btn_anim2.getDrawable();
        animationDrawable2.start();
    }
}
