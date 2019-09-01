package com.asciimovie.drxzt.elderlyassistant.fragment;

import org.litepal.crud.LitePalSupport;

public class Note extends LitePalSupport {
    private String mTitle;

    public Note(String note){
        this.mTitle=note;
    }

    public String getTitle(){
        return mTitle;
    }

    public void setTitle(String note){
        mTitle = note;
    }
}
