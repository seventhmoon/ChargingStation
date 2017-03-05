package com.androidfung.chargingstation.model;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by fung on 3/5/2017.
 */
@Root (name="areaList")
public class AreaList {

    @ElementList(inline = true, name="area")
    private List<Area> areas;

    public List<Area> getAreas() {
        return areas;
    }

    public void setAreas(List<Area> areas) {
        this.areas = areas;
    }
}
