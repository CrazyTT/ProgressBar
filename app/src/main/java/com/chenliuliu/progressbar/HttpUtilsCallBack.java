package com.chenliuliu.progressbar;

/**
 * Created by liuliuchen on 16/1/21.
 */
public interface HttpUtilsCallBack<T> {

    void onError(String str);


    void onSuccess(T object);

}
