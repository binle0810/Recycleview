package com.example.buoi6_recyclerv;

public class item {
    String tieude;
    String mota;
    int image;

    public item(String tieude, String mota, int image) {
        this.tieude = tieude;
        this.mota = mota;
        this.image = image;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public item() {
    }
}
