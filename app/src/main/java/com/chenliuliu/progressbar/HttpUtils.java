package com.chenliuliu.progressbar;

import com.socks.library.KLog;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.Callback;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.http.okhttp.request.RequestCall;

import java.util.Map;

import okhttp3.Call;

/**
 * Created by liuliuchen on 16/1/21.
 */
public class HttpUtils<T> {

    private volatile static HttpUtils instance;

    private HttpUtils() {
    }

    public static HttpUtils getInstance() {
        if (null == instance) {
            synchronized (HttpUtils.class) {
                if (null == instance) {
                    instance = new HttpUtils();
                }
            }
        }
        return instance;
    }

    /**
     * @param url      地址
     * @param params   form表单
     * @param callback 自定义回掉
     * @param mClass   回掉类型
     */
    protected void executeGet(final String url, Map<String, String> params, final HttpUtilsCallBack<T> callback, final Class<T> mClass) {
        OkHttpUtils.get().url(url).params(params).build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e) {
                callback.onError("网络错误");
            }

            @Override
            public void onResponse(String response) {
                if (BuildConfig.DEBUG) {
                    KLog.json(url, response);
                }
                T responseObject = JsonUtils.getInstance().json2object(response, mClass);
                if (responseObject != null) {
                    callback.onSuccess(responseObject);
                } else {
                    callback.onError("网络错误");
                }
            }
        });
    }


    /**
     * @param url      地址
     * @param params   form表单
     * @param callback okhttp自带的回掉
     */
    protected void executeGet(final String url, Map<String, String> params, Callback callback) {
        OkHttpUtils.get().url(url).params(params).build().execute(callback);
    }

    /**
     * @param url      地址
     * @param params   form表单
     * @param callback okhttp自带的回掉
     */
    protected void executePost(final String url, Map<String, String> params, Callback callback) {
        OkHttpUtils.post().url(url).params(params).build().execute(callback);
    }

    /**
     * @param url      地址
     * @param params   form表单
     * @param callback 自定义回掉
     * @param mClass   回掉类型
     */
    protected void executePost(final String url, Map<String, String> params, final HttpUtilsCallBack<T> callback, final Class<T> mClass) {
        OkHttpUtils.post().url(url).params(params).build().execute(new StringCallback() {
            @Override
            public void onError(Call call, Exception e) {
                callback.onError("网络错误");
            }

            @Override
            public void onResponse(String response) {
                if (BuildConfig.DEBUG) {
                    KLog.json(url, response);
                }
                T responseObject = (T) JsonUtils.getInstance().json2object(response, mClass);
                if (responseObject != null) {
                    callback.onSuccess(responseObject);
                } else {
                    callback.onError("网络错误");
                }
            }
        });
    }


    /**
     * @param url 根据访问地址，cancle request
     */
    protected void cancle(String url) {
        RequestCall call = OkHttpUtils.get().url(url).build();
        call.cancel();
    }
}