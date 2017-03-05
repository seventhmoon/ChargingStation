package com.androidfung.chargingstation.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by fung on 3/5/2017.
 */
@Root (name="district")
public class District {

    @Element (name="name")
    private String name;
}
