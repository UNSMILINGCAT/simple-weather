package com.myapp.mavenbook.weather;

import org.apache.log4j.PropertyConfigurator;

import java.io.InputStream;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        //configure log4j
        PropertyConfigurator.configure(Main.class.getClassLoader().getResource("log4j.properties"));
        //Read the zip code from the command-line(if none supplied,use 60202)
        int zipcode = 60202;
        try
        {
            zipcode = Integer.parseInt(args[0]);
        } catch (Exception e)
        {
        }
        new Main(zipcode).start();
    }

    private int zip;

    public Main(int zip)
    {
        this.zip = zip;
    }

    public void start() throws Exception
    {
        //retrieve data
        InputStream dataIn = new YahooRetriever().retrieve(zip);
        //parse data
        Weather weather = new YahooParser().parse(dataIn);
        //format(Print) Data
        System.out.print(new WeatherFormatter().format(weather));
    }
}
