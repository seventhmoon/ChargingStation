package com.androidfung.chargingstation.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by fung on 3/5/2017.
 */
@Root (name="ChargingStationData")
public class ChargingStationData {

    @Element(name="script", required = false)
    private String script;

    @Element(name="Language")
    private String language;

    @Element(name="stationList")
    private StationList stationList;

    @Element(name="areaList")
    private AreaList areaList;

    @Override
    public String toString() {
        return "ChargingStationData{" +
                "script='" + script + '\'' +
                ", language='" + language + '\'' +
                ", stationList=" + stationList +
                '}';
    }

    public String getScript() {
        return script;
    }

    public void setScript(String script) {
        this.script = script;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public StationList getStationList() {
        return stationList;
    }

    public void setStationList(StationList stationList) {
        this.stationList = stationList;
    }
}
