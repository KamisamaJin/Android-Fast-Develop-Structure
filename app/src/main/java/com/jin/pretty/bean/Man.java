package com.jin.pretty.bean;

import io.realm.RealmObject;

/**
 * Created by Jin on 12/17/15.
 */
public class Man extends RealmObject {
    private String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
