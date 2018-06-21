package com.myapp.mavenbook.weather;

public class Weather
{
    private String city;//城市
    private String region;//地区
    private String country;//国家
    private String condition;
    private String temp;
    private String chill;
    private String humidity;

    public Weather() {}//无参构造

    public String getCity() {return city;}//获取城市
    public String getRegion(){return region;}//获取地区
    public String getCountry(){return country;}//获取国家
    public String getCondition(){return condition;}
    public String getTemp(){return temp;}
    public String getChill(){return chill;}
    public String getHumidity(){return humidity;}
    public void setHumidity(String humidity){this.humidity=humidity;}//设置humidity的值
}
