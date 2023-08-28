package com.djax.getmenu.responsebody;

import com.djax.getmenu.model.Menu;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class ResponseModel {


    @SerializedName("menu")
    @Expose
    ArrayList<Menu> menuArrayList;


    public ArrayList<Menu> getMenuArrayList() {
        return menuArrayList;
    }

    public void setMenuArrayList(ArrayList<Menu> menuArrayList) {
        this.menuArrayList = menuArrayList;
    }
}
