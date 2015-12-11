package com.jin.pretty.net.model;

import java.io.Serializable;

/**
 * Created by Jin on 12/3/15.
 */
public class DemoBean implements Serializable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
