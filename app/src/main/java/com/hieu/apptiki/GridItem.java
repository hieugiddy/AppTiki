package com.hieu.apptiki;

public class GridItem {
    int img_item;
    String txt_item,mota;
    public GridItem(){}
    public GridItem(int img_item, String txt_item, String mota) {
        this.img_item = img_item;
        this.txt_item = txt_item;
        this.mota = mota;
    }

    public int getImg_item() {
        return img_item;
    }

    public void setImg_item(int img_item) {
        this.img_item = img_item;
    }

    public String getTxt_item() {
        return txt_item;
    }

    public void setTxt_item(String txt_item) {
        this.txt_item = txt_item;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
