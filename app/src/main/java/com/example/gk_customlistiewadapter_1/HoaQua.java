package com.example.gk_customlistiewadapter_1;

import java.io.Serializable;

public class HoaQua implements Serializable {
    private String name,mau,mota;
    private int soluong;

    public HoaQua(String name, String mau, String mota, int soluong) {
        this.name = name;
        this.mau = mau;
        this.mota = mota;
        this.soluong = soluong;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }
}
