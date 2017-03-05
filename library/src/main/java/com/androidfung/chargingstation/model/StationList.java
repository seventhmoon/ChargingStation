package com.androidfung.chargingstation.model;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by fung on 3/5/2017.
 */
@Root (name="stationList")
public class StationList {
    @Override
    public String toString() {
        return "StationList{" +
                "stations=" + stations +
                '}';
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    @ElementList(inline = true, name = "station", required = false)
    List<Station> stations;


}
