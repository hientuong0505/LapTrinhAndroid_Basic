package com.example.gridview;

public class HinhAnh {
    private String TenHinh;
    private int Hinh;

    public HinhAnh(String tenHinh, int hinh) {
        TenHinh = tenHinh;
        Hinh = hinh;
    }

    public String getTenHinh() {
        return TenHinh;
    }

    public void setTenHinh(String tenHinh) {
        TenHinh = tenHinh;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
