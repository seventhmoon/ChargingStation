package com.androidfung.chargingstation.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by fung on 3/5/2017.
 */
@Root(name="station")
public class Station {
    @Element(name="no")
    private int stationNumber;

    @Element (name="location")
    private String location;

    @Element(name="lat")
    private double latitude;

    @Element(name="lng")
    private double longitude;

    @Element (name="type")
    private String type;

    @Element(name="districtL")
    private String region;

    @Element(name="districtS")
    private String district;

    @Element (name="provider")
    private String provider;

    @Element(name="parkingNo", required = false)
    private String parkingNumber;

    @Element(name="img", required = false)
    private String image;

    @Element(name="address")
    private String address;

    @Override
    public String toString() {
        return "Station{" +
                "stationNumber=" + stationNumber +
                ", location='" + location + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", type='" + type + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", provider='" + provider + '\'' +
                ", parkingNumber='" + parkingNumber + '\'' +
                ", image='" + image + '\'' +
                '}';
    }

    public int getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        this.stationNumber = stationNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getParkingNumber() {
        return parkingNumber;
    }

    public void setParkingNumber(String parkingNumber) {
        this.parkingNumber = parkingNumber;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    //<station>
//<no>1</no>
//    <location>Temple Mall North</location>
//<lat>22.3425903320313</lat>
//<lng>114.190719604492</lng>
//<type>SemiQuick</type>
//<districtL>Kowloon</districtL>
//    <districtS>Wong Tai Sin</districtS>
//<address>
//    Temple Mall North Carpark, Level 3, 136 Lung Cheung Rd, Wong Tai Sin, Kln
//            </address>
//<provider>CLP</provider>
//<parkingNo>320-322</parkingNo>
//<img>
///EV/PublishingImages/common/map/map_thumb/Entrance_Lung%20Cheung.jpg
//            </img>
//</station>

}
