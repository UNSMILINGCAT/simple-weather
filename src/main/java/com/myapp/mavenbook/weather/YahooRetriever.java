package com.myapp.mavenbook.weather;

import org.apache.log4j.Logger;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class YahooRetriever
{
    private static Logger log = Logger.getLogger(YahooRetriever.class);

    public InputStream retrieve(int zipcode) throws Exception
    {
        log.info("Retrieving Weather Data");
        String url = "http://weather.yahooapis.com/forecastrss?p=" + zipcode;
        URLConnection connection = new URL(url).openConnection();
        return connection.getInputStream();
    }
}
