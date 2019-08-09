package com.asciimovie.drxzt.elderlyassistant.util;

import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.Objects;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OkHttpUtil {

    private static void GetOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .build();
        client.newCall(request).enqueue(callback);
    }


    private static void PostJSONObject(String address, okhttp3.Callback callback, JSONObject jsonObject) {
        String jsonSting = jsonObject.toString();
        final MediaType MEDIA_TYPE_MARKDOWN = MediaType.parse("application/json");
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .post(RequestBody.create(jsonSting, MEDIA_TYPE_MARKDOWN))
                .build();
        client.newCall(request).enqueue(callback);

    }


    public static JSONObject HttpPostRequest (String address, JSONObject jsonObject){
        final JSONObject[] json = new JSONObject[0];
        OkHttpUtil.PostJSONObject(address, new okhttp3.Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try {
                    json[0] = new JSONObject(Objects.requireNonNull(response.body()).string());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, jsonObject);
        return json[0];
    }


    public static JSONObject getJSONObject (String address){
        final JSONObject[] jsonObject = new JSONObject[1];
        OkHttpUtil.GetOkHttpRequest(address, new okhttp3.Callback() {
            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                try {
                    jsonObject[0] = new JSONObject(Objects.requireNonNull(response.body()).string());
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        });
        return jsonObject[0];
    }



}
