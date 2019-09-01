package com.asciimovie.drxzt.elderlyassistant.fragment;

public class Memorial {
    private int imageId;
    private String title;

    public Memorial(String title,int imageId){
        this.imageId = imageId;
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
    public int getImageId(){
        return imageId;
    }
}
