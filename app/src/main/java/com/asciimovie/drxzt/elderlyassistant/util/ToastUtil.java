package com.asciimovie.drxzt.elderlyassistant.util;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

import com.alibaba.fastjson.JSONObject;
import com.asciimovie.drxzt.elderlyassistant.entity.ResponseDo;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.Objects;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

import static com.asciimovie.drxzt.elderlyassistant.enumtype.constant.SERVICE_URL;


/**
 * toast工具类
 */
public class ToastUtil {
    /**
     * 传入toast的Activity和内容
     * @param context
     * @param text
     */
    public static void toast(Context context, String text){
        Toast toast=Toast.makeText(context,text,Toast.LENGTH_SHORT    );
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    public static void main(String[] args) throws Exception{
        new Thread(() -> {
            String userPhone ="13588089260";
            String password="1234561";
            try {
                JSONObject jsonObject =new JSONObject();
                jsonObject.put("phone",userPhone);
                jsonObject.put("password",password);
                MyOkHttpPost.PostJSONObject(SERVICE_URL+"/user/login",jsonObject.toString(), new Callback() {
                    @Override
                    public void onFailure(@NotNull Call call, @NotNull IOException e) {
                        e.printStackTrace();
                    }
                    @Override
                    public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                        String responseData = Objects.requireNonNull(response.body()).string();
                        parseJSONWithGSON(responseData);
                    }
                });

            }catch (Exception e){
                e.printStackTrace();

            }

        }).start();
    }
    //解析密码登录返回token
    private static void parseJSONWithGSON(String jsonData) {
        System.out.println(jsonData);
        ResponseDo loginInformation = JSONObject.parseObject(jsonData,ResponseDo.class);
        if (loginInformation.getCode().equals("0000")){
            System.out.println(jsonData);
        }else{
            throw new RuntimeException(loginInformation.getDescription());
        }
    }

}
