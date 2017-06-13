package com.bawei.jiekoudemo;

/**
 * Created by Administrator on 2017/6/13/0013.
 */

public class Text2 {

    public static void main(String[] arg){

        Text1 text1 = new Text1();

        text1.setListener(new Text1.Listener() {
            @Override
            public void success(int result) {

                System.out.println("a+b = "+result);

            }
        });

        text1.add(2, 3);

    }



}
