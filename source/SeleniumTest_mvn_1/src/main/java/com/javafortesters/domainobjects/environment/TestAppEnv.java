package com.javafortesters.domainobjects.environment;

/**
 * Created by alexandru.brad on 4/27/2016.
 */
public class TestAppEnv {

    public static final String DOMAIN = "192.123.0.3";
    public static final String PORT = "67";

    public static String getUrl() {
        // "http://192.123.0.3:67"
        // TestAppEnv.getUrl()
        return "http://" + DOMAIN + ":" + PORT;
    }
}
