package com.example.weather2.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 智治 on 2018/2/8.
 */

public class Province extends DataSupport {
    private int id;
    private  String provinceName;
    private  int provinceCode;
    public int getId(){
        return id;
    }
    public void  setId(int id){
        this.id=id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName)
    {
        this.provinceName=provinceName;
    }
    public  int getProvinceCode(){
        return provinceCode;
    }
    public void setProvinceCode(int provinceCode){
        this.provinceCode=provinceCode;
    }


}
