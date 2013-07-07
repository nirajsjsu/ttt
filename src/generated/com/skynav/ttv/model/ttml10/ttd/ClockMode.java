//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.07.07 at 11:36:48 AM MDT 
//


package com.skynav.ttv.model.ttml10.ttd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for clockMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="clockMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="local"/>
 *     &lt;enumeration value="gps"/>
 *     &lt;enumeration value="utc"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "clockMode", namespace = "http://www.w3.org/ns/ttml#datatype")
@XmlEnum
public enum ClockMode {

    @XmlEnumValue("local")
    LOCAL("local"),
    @XmlEnumValue("gps")
    GPS("gps"),
    @XmlEnumValue("utc")
    UTC("utc");
    private final String value;

    ClockMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClockMode fromValue(String v) {
        for (ClockMode c: ClockMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
