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
 * <p>Java class for fontWeight.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="fontWeight">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="normal"/>
 *     &lt;enumeration value="bold"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "fontWeight", namespace = "http://www.w3.org/ns/ttml#datatype")
@XmlEnum
public enum FontWeight {

    @XmlEnumValue("normal")
    NORMAL("normal"),
    @XmlEnumValue("bold")
    BOLD("bold");
    private final String value;

    FontWeight(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FontWeight fromValue(String v) {
        for (FontWeight c: FontWeight.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
