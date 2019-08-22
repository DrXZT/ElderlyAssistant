package com.asciimovie.drxzt.elderlyassistant.util;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;

public class MyOkHttpPost {
    public static void PostJSONObject(String address, String jsonObject, okhttp3.Callback callback) {
        final MediaType MEDIA_TYPE_MARKDOWN = MediaType.parse("application/json");
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .post(RequestBody.create(jsonObject, MEDIA_TYPE_MARKDOWN))
                .build();
        client.newCall(request).enqueue(callback);

    }

    public static void PostJSONObject(String address, String jsonObject, okhttp3.Callback callback, String token) {
        final MediaType MEDIA_TYPE_MARKDOWN = MediaType.parse("application/json");
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .header("token",token)
                .url(address)
                .post(RequestBody.create(jsonObject, MEDIA_TYPE_MARKDOWN))
                .build();
        client.newCall(request).enqueue(callback);

    }

    public static void PostFrom(String address, RequestBody requestBody, okhttp3.Callback callback, String token) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .header("token",token)
                .url(address)
                .post(requestBody)
                .build();
        client.newCall(request).enqueue(callback);

    }
}
