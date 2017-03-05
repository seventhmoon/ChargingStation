package com.androidfung.chargingstation.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by fung on 3/5/2017.
 */
@Root (name="area")
public class Area {

    @Element (name="name", required = false)
    private String name;

    @Element (name="districtList", required=false)
    private DistrictList districtList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DistrictList getDistrictList() {
        return districtList;
    }

    public void setDistrictList(DistrictList districtList) {
        this.districtList = districtList;
    }
    //
//    @Element (name="district", required = false)
//    private District district;

}
