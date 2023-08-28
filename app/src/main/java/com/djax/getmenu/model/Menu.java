package com.djax.getmenu.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class Menu {

    @SerializedName("level_id")
    @Expose
    String levelId;

    @SerializedName("status")
    @Expose
    String status;

    @SerializedName("menu_id")
    @Expose
    String menuId;

    @SerializedName("menu_name")
    @Expose
    String menuName;

    @SerializedName("original_menu_name")
    @Expose
    String originalMenuName;


    public Menu(String levelId, String status, String menuId, String menuName, String originalMenuName) {
        this.levelId = levelId;
        this.status = status;
        this.menuId = menuId;
        this.menuName = menuName;
        this.originalMenuName = originalMenuName;
    }

    public String getLevelId() {
        return levelId;
    }

    public void setLevelId(String levelId) {
        this.levelId = levelId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getOriginalMenuName() {
        return originalMenuName;
    }

    public void setOriginalMenuName(String originalMenuName) {
        this.originalMenuName = originalMenuName;
    }
}
