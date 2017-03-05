package com.androidfung.chargingstation.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by fung on 3/5/2017.
 */
@Root (name="districtList")
public class DistrictList {
    @ElementList(inline = true, name="district", required = false)
    private List<District> districts;

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }
}
