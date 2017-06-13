package com.bawei.jiekoudemo;

/**
 * Created by Administrator on 2017/6/13/0013.
 */

public class Text1 {


    public void add(int a, int b){

        int result = a + b;

        listener.success(result);

    }


    //定义一个接口
    public interface Listener{

        //接口里的方法
        public void success(int result);


    }

    //给接口提供set方法
    public Listener listener;
    public void setListener(Listener listener){

        this.listener = listener;

    }



}
