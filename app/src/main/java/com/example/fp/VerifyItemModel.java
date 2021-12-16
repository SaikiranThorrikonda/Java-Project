package com.example.fp;

public class VerifyItemModel {
    private int img;
    private int id;
    private boolean isSelected = false;

    public VerifyItemModel(int img ,int id, boolean isSelected) {
        this.img = img;
        this.id = id;
        this.isSelected = isSelected;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img){
        this.img = img;
    }

    public int getid(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public boolean isSelected() {
        return isSelected;
    }
}
