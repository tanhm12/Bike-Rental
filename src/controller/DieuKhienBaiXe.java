package controller;

import database.BaiXeDAO;
import entity.BaiXe;
import entity.Xe;

import java.util.ArrayList;
import java.util.List;

/**
 * Project Ecobike System
 * User: Nhom 11
 * Create at 9:46 AM , 12/16/2020
 */

public class DieuKhienBaiXe {

    public DieuKhienBaiXe() {
    }
    public List getAllBaiXe(){
        return BaiXeDAO.getInstance().getAll();
    }

    public List getLoaiXe(String loaiXe){
        return BaiXeDAO.getInstance().getAll();
    }

}
