package com.myapp.mavenbook.weather;

import org.apache.log4j.Logger;
import org.dom4j.Document;
import org.dom4j.DocumentFactory;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class YahooParser
{
    private static Logger log = Logger.getLogger(YahooParser.class);

    public Weather parse(InputStream inputStream) throws Exception
    {
        Weather weather = new Weather();//实例一个Weather
        log.info("Creating XML Reader");
        SAXReader xmlReader = createXmlReader();
        Document document = xmlReader.read(inputStream);
        log.info("Parsing xml response");
        weather.setCity(document.valueOf("rss/channel/y:location/@city"));
        weather.setRegion(document.valueOf("rss/channel/y:location/@region"));
        weather.setCountry(document.valueOf("rss/channel/y:location@country"));
        weather.setCondition(document.valueOf("rss/channel/item/y:condition@text"));
        weather.setTemp(document.valueOf("rss/channel/item/y:condition@temp"));
        weather.setChill(document.valueOf("rss/channel/y:wind/@chill"));
        weather.setHumidity(document.valueOf("rss/channel/y:atmosphere/@humidity"));
        return weather;
    }

    private SAXReader createXmlReader()
    {
        Map<String, String> uris = new HashMap<String, String>();
        uris.put("y", "http://xml.weather.yahoo.com/ns/rss/1.0");
        DocumentFactory factory = new DocumentFactory();
        factory.setXPathNamespaceURIs(uris);
        SAXReader xmlReader = new SAXReader();
        xmlReader.setDocumentFactory(factory);
        return xmlReader;
    }
}
