//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.21 at 10:41:24 PM MST 
//


package com.skynav.ttv.model.ttml2.ttd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for showBackground.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="showBackground">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="always"/>
 *     &lt;enumeration value="whenActive"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "showBackground", namespace = "http://www.w3.org/ns/ttml#datatype")
@XmlEnum
public enum ShowBackground {

    @XmlEnumValue("always")
    ALWAYS("always"),
    @XmlEnumValue("whenActive")
    WHEN_ACTIVE("whenActive");
    private final String value;

    ShowBackground(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ShowBackground fromValue(String v) {
        for (ShowBackground c: ShowBackground.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
