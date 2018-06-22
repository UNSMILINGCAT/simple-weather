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

    /**
     * 获取城市信息
     *
     * @return
     */
    public String getCity() {return city;}

    /**
     * 获取地区
     *
     * @return
     */
    public String getRegion() {return region;}

    /**
     * 获取国家
     *
     * @return
     */
    public String getCountry() {return country;}

    public String getCondition() {return condition;}

    public String getTemp() {return temp;}

    public String getChill() {return chill;}

    public String getHumidity() {return humidity;}

    public void setHumidity(String humidity) {this.humidity = humidity;}//设置humidity的值

    public void setCity(String city)
    {
        this.city = city;
    }

    public void setRegion(String region)
    {
        this.region = region;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public void setCondition(String condition)
    {
        this.condition = condition;
    }

    public void setTemp(String temp)
    {
        this.temp = temp;
    }

    public void setChill(String chill)
    {
        this.chill = chill;
    }
}
