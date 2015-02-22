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
 * <p>Java class for dropMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="dropMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="dropNTSC"/>
 *     &lt;enumeration value="dropPAL"/>
 *     &lt;enumeration value="nonDrop"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "dropMode", namespace = "http://www.w3.org/ns/ttml#datatype")
@XmlEnum
public enum DropMode {

    @XmlEnumValue("dropNTSC")
    DROP_NTSC("dropNTSC"),
    @XmlEnumValue("dropPAL")
    DROP_PAL("dropPAL"),
    @XmlEnumValue("nonDrop")
    NON_DROP("nonDrop");
    private final String value;

    DropMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DropMode fromValue(String v) {
        for (DropMode c: DropMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
