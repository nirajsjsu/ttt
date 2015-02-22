//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.21 at 10:41:24 PM MST 
//


package com.skynav.ttv.model.ttml2.tt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;
import com.skynav.ttv.model.ttml2.ttd.BackgroundRepeat;
import com.skynav.ttv.model.ttml2.ttd.Direction;
import com.skynav.ttv.model.ttml2.ttd.Display;
import com.skynav.ttv.model.ttml2.ttd.DisplayAlign;
import com.skynav.ttv.model.ttml2.ttd.Fill;
import com.skynav.ttv.model.ttml2.ttd.FontKerning;
import com.skynav.ttv.model.ttml2.ttd.FontStyle;
import com.skynav.ttv.model.ttml2.ttd.FontVariantPosition;
import com.skynav.ttv.model.ttml2.ttd.FontWeight;
import com.skynav.ttv.model.ttml2.ttd.Overflow;
import com.skynav.ttv.model.ttml2.ttd.Ruby;
import com.skynav.ttv.model.ttml2.ttd.RubyAlign;
import com.skynav.ttv.model.ttml2.ttd.RubyPosition;
import com.skynav.ttv.model.ttml2.ttd.ShowBackground;
import com.skynav.ttv.model.ttml2.ttd.TextAlign;
import com.skynav.ttv.model.ttml2.ttd.TextDecoration;
import com.skynav.ttv.model.ttml2.ttd.TextOrientation;
import com.skynav.ttv.model.ttml2.ttd.UnicodeBidi;
import com.skynav.ttv.model.ttml2.ttd.Visibility;
import com.skynav.ttv.model.ttml2.ttd.WrapOption;
import com.skynav.ttv.model.ttml2.ttd.WritingMode;
import com.skynav.ttv.model.ttml2.ttm.Agent;
import com.skynav.ttv.model.ttml2.ttm.Copyright;
import com.skynav.ttv.model.ttml2.ttm.Description;
import com.skynav.ttv.model.ttml2.ttm.Item;
import com.skynav.ttv.model.ttml2.ttm.Title;


/**
 * <p>Java class for set.eltype complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="set.eltype">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.w3.org/ns/ttml}Metadata.class" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.w3.org/ns/ttml}set.attlist"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "set.eltype", propOrder = {
    "metadataClass"
})
public class Set {

    @XmlElements({
        @XmlElement(name = "metadata", type = Metadata.class),
        @XmlElement(name = "copyright", namespace = "http://www.w3.org/ns/ttml#metadata", type = Copyright.class),
        @XmlElement(name = "title", namespace = "http://www.w3.org/ns/ttml#metadata", type = Title.class),
        @XmlElement(name = "item", namespace = "http://www.w3.org/ns/ttml#metadata", type = Item.class),
        @XmlElement(name = "agent", namespace = "http://www.w3.org/ns/ttml#metadata", type = Agent.class),
        @XmlElement(name = "desc", namespace = "http://www.w3.org/ns/ttml#metadata", type = Description.class)
    })
    protected List<Object> metadataClass;
    @XmlAttribute
    protected Fill fill;
    @XmlAttribute
    protected String repeatCount;
    @XmlAttribute(name = "style")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> styleAttribute;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String backgroundColor;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String backgroundImage;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String backgroundPosition;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected BackgroundRepeat backgroundRepeat;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String border;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String bpd;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String color;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected Direction direction;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String disparity;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected Display display;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected DisplayAlign displayAlign;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String extent;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String fontFamily;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected FontKerning fontKerning;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String fontShear;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String fontSize;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected FontStyle fontStyle;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected FontVariantPosition fontVariantPosition;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected FontWeight fontWeight;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String ipd;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String letterSpacing;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String lineHeight;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected Float opacity;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String origin;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected Overflow overflow;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String padding;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String position;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected ShowBackground showBackground;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected Ruby ruby;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected RubyAlign rubyAlign;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String rubyOffset;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected RubyPosition rubyPosition;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected TextAlign textAlign;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String textCombine;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected TextDecoration textDecoration;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String textEmphasis;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected TextOrientation textOrientation;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String textOutline;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String textShadow;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected UnicodeBidi unicodeBidi;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected Visibility visibility;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected WrapOption wrapOption;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected WritingMode writingMode;
    @XmlAttribute(namespace = "http://www.w3.org/ns/ttml#styling")
    protected String zIndex;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    protected String lang;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String space;
    @XmlAttribute(namespace = "http://www.w3.org/XML/1998/namespace")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute
    protected String condition;
    @XmlAttribute
    protected String begin;
    @XmlAttribute
    protected String dur;
    @XmlAttribute
    protected String end;
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the metadataClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadataClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadataClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Metadata }
     * {@link Copyright }
     * {@link Title }
     * {@link Item }
     * {@link Agent }
     * {@link Description }
     * 
     * 
     */
    public List<Object> getMetadataClass() {
        if (metadataClass == null) {
            metadataClass = new ArrayList<Object>();
        }
        return this.metadataClass;
    }

    /**
     * Gets the value of the fill property.
     * 
     * @return
     *     possible object is
     *     {@link Fill }
     *     
     */
    public Fill getFill() {
        return fill;
    }

    /**
     * Sets the value of the fill property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fill }
     *     
     */
    public void setFill(Fill value) {
        this.fill = value;
    }

    /**
     * Gets the value of the repeatCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepeatCount() {
        return repeatCount;
    }

    /**
     * Sets the value of the repeatCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepeatCount(String value) {
        this.repeatCount = value;
    }

    /**
     * Gets the value of the styleAttribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the styleAttribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStyleAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getStyleAttribute() {
        if (styleAttribute == null) {
            styleAttribute = new ArrayList<Object>();
        }
        return this.styleAttribute;
    }

    /**
     * Gets the value of the backgroundColor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundColor() {
        return backgroundColor;
    }

    /**
     * Sets the value of the backgroundColor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundColor(String value) {
        this.backgroundColor = value;
    }

    /**
     * Gets the value of the backgroundImage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundImage() {
        return backgroundImage;
    }

    /**
     * Sets the value of the backgroundImage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundImage(String value) {
        this.backgroundImage = value;
    }

    /**
     * Gets the value of the backgroundPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackgroundPosition() {
        return backgroundPosition;
    }

    /**
     * Sets the value of the backgroundPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackgroundPosition(String value) {
        this.backgroundPosition = value;
    }

    /**
     * Gets the value of the backgroundRepeat property.
     * 
     * @return
     *     possible object is
     *     {@link BackgroundRepeat }
     *     
     */
    public BackgroundRepeat getBackgroundRepeat() {
        return backgroundRepeat;
    }

    /**
     * Sets the value of the backgroundRepeat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BackgroundRepeat }
     *     
     */
    public void setBackgroundRepeat(BackgroundRepeat value) {
        this.backgroundRepeat = value;
    }

    /**
     * Gets the value of the border property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBorder() {
        return border;
    }

    /**
     * Sets the value of the border property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBorder(String value) {
        this.border = value;
    }

    /**
     * Gets the value of the bpd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBpd() {
        return bpd;
    }

    /**
     * Sets the value of the bpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBpd(String value) {
        this.bpd = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link Direction }
     *     
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Direction }
     *     
     */
    public void setDirection(Direction value) {
        this.direction = value;
    }

    /**
     * Gets the value of the disparity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisparity() {
        return disparity;
    }

    /**
     * Sets the value of the disparity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisparity(String value) {
        this.disparity = value;
    }

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link Display }
     *     
     */
    public Display getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link Display }
     *     
     */
    public void setDisplay(Display value) {
        this.display = value;
    }

    /**
     * Gets the value of the displayAlign property.
     * 
     * @return
     *     possible object is
     *     {@link DisplayAlign }
     *     
     */
    public DisplayAlign getDisplayAlign() {
        return displayAlign;
    }

    /**
     * Sets the value of the displayAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisplayAlign }
     *     
     */
    public void setDisplayAlign(DisplayAlign value) {
        this.displayAlign = value;
    }

    /**
     * Gets the value of the extent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtent() {
        return extent;
    }

    /**
     * Sets the value of the extent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtent(String value) {
        this.extent = value;
    }

    /**
     * Gets the value of the fontFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontFamily() {
        return fontFamily;
    }

    /**
     * Sets the value of the fontFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontFamily(String value) {
        this.fontFamily = value;
    }

    /**
     * Gets the value of the fontKerning property.
     * 
     * @return
     *     possible object is
     *     {@link FontKerning }
     *     
     */
    public FontKerning getFontKerning() {
        return fontKerning;
    }

    /**
     * Sets the value of the fontKerning property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontKerning }
     *     
     */
    public void setFontKerning(FontKerning value) {
        this.fontKerning = value;
    }

    /**
     * Gets the value of the fontShear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontShear() {
        return fontShear;
    }

    /**
     * Sets the value of the fontShear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontShear(String value) {
        this.fontShear = value;
    }

    /**
     * Gets the value of the fontSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFontSize() {
        return fontSize;
    }

    /**
     * Sets the value of the fontSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFontSize(String value) {
        this.fontSize = value;
    }

    /**
     * Gets the value of the fontStyle property.
     * 
     * @return
     *     possible object is
     *     {@link FontStyle }
     *     
     */
    public FontStyle getFontStyle() {
        return fontStyle;
    }

    /**
     * Sets the value of the fontStyle property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontStyle }
     *     
     */
    public void setFontStyle(FontStyle value) {
        this.fontStyle = value;
    }

    /**
     * Gets the value of the fontVariantPosition property.
     * 
     * @return
     *     possible object is
     *     {@link FontVariantPosition }
     *     
     */
    public FontVariantPosition getFontVariantPosition() {
        return fontVariantPosition;
    }

    /**
     * Sets the value of the fontVariantPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontVariantPosition }
     *     
     */
    public void setFontVariantPosition(FontVariantPosition value) {
        this.fontVariantPosition = value;
    }

    /**
     * Gets the value of the fontWeight property.
     * 
     * @return
     *     possible object is
     *     {@link FontWeight }
     *     
     */
    public FontWeight getFontWeight() {
        return fontWeight;
    }

    /**
     * Sets the value of the fontWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link FontWeight }
     *     
     */
    public void setFontWeight(FontWeight value) {
        this.fontWeight = value;
    }

    /**
     * Gets the value of the ipd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpd() {
        return ipd;
    }

    /**
     * Sets the value of the ipd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpd(String value) {
        this.ipd = value;
    }

    /**
     * Gets the value of the letterSpacing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLetterSpacing() {
        return letterSpacing;
    }

    /**
     * Sets the value of the letterSpacing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLetterSpacing(String value) {
        this.letterSpacing = value;
    }

    /**
     * Gets the value of the lineHeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineHeight() {
        return lineHeight;
    }

    /**
     * Sets the value of the lineHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineHeight(String value) {
        this.lineHeight = value;
    }

    /**
     * Gets the value of the opacity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOpacity() {
        return opacity;
    }

    /**
     * Sets the value of the opacity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOpacity(Float value) {
        this.opacity = value;
    }

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }

    /**
     * Gets the value of the overflow property.
     * 
     * @return
     *     possible object is
     *     {@link Overflow }
     *     
     */
    public Overflow getOverflow() {
        return overflow;
    }

    /**
     * Sets the value of the overflow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Overflow }
     *     
     */
    public void setOverflow(Overflow value) {
        this.overflow = value;
    }

    /**
     * Gets the value of the padding property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPadding() {
        return padding;
    }

    /**
     * Sets the value of the padding property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPadding(String value) {
        this.padding = value;
    }

    /**
     * Gets the value of the position property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPosition(String value) {
        this.position = value;
    }

    /**
     * Gets the value of the showBackground property.
     * 
     * @return
     *     possible object is
     *     {@link ShowBackground }
     *     
     */
    public ShowBackground getShowBackground() {
        return showBackground;
    }

    /**
     * Sets the value of the showBackground property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShowBackground }
     *     
     */
    public void setShowBackground(ShowBackground value) {
        this.showBackground = value;
    }

    /**
     * Gets the value of the ruby property.
     * 
     * @return
     *     possible object is
     *     {@link Ruby }
     *     
     */
    public Ruby getRuby() {
        return ruby;
    }

    /**
     * Sets the value of the ruby property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ruby }
     *     
     */
    public void setRuby(Ruby value) {
        this.ruby = value;
    }

    /**
     * Gets the value of the rubyAlign property.
     * 
     * @return
     *     possible object is
     *     {@link RubyAlign }
     *     
     */
    public RubyAlign getRubyAlign() {
        return rubyAlign;
    }

    /**
     * Sets the value of the rubyAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link RubyAlign }
     *     
     */
    public void setRubyAlign(RubyAlign value) {
        this.rubyAlign = value;
    }

    /**
     * Gets the value of the rubyOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRubyOffset() {
        return rubyOffset;
    }

    /**
     * Sets the value of the rubyOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRubyOffset(String value) {
        this.rubyOffset = value;
    }

    /**
     * Gets the value of the rubyPosition property.
     * 
     * @return
     *     possible object is
     *     {@link RubyPosition }
     *     
     */
    public RubyPosition getRubyPosition() {
        return rubyPosition;
    }

    /**
     * Sets the value of the rubyPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RubyPosition }
     *     
     */
    public void setRubyPosition(RubyPosition value) {
        this.rubyPosition = value;
    }

    /**
     * Gets the value of the textAlign property.
     * 
     * @return
     *     possible object is
     *     {@link TextAlign }
     *     
     */
    public TextAlign getTextAlign() {
        return textAlign;
    }

    /**
     * Sets the value of the textAlign property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextAlign }
     *     
     */
    public void setTextAlign(TextAlign value) {
        this.textAlign = value;
    }

    /**
     * Gets the value of the textCombine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextCombine() {
        return textCombine;
    }

    /**
     * Sets the value of the textCombine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextCombine(String value) {
        this.textCombine = value;
    }

    /**
     * Gets the value of the textDecoration property.
     * 
     * @return
     *     possible object is
     *     {@link TextDecoration }
     *     
     */
    public TextDecoration getTextDecoration() {
        return textDecoration;
    }

    /**
     * Sets the value of the textDecoration property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextDecoration }
     *     
     */
    public void setTextDecoration(TextDecoration value) {
        this.textDecoration = value;
    }

    /**
     * Gets the value of the textEmphasis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextEmphasis() {
        return textEmphasis;
    }

    /**
     * Sets the value of the textEmphasis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextEmphasis(String value) {
        this.textEmphasis = value;
    }

    /**
     * Gets the value of the textOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link TextOrientation }
     *     
     */
    public TextOrientation getTextOrientation() {
        return textOrientation;
    }

    /**
     * Sets the value of the textOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextOrientation }
     *     
     */
    public void setTextOrientation(TextOrientation value) {
        this.textOrientation = value;
    }

    /**
     * Gets the value of the textOutline property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextOutline() {
        return textOutline;
    }

    /**
     * Sets the value of the textOutline property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextOutline(String value) {
        this.textOutline = value;
    }

    /**
     * Gets the value of the textShadow property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTextShadow() {
        return textShadow;
    }

    /**
     * Sets the value of the textShadow property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTextShadow(String value) {
        this.textShadow = value;
    }

    /**
     * Gets the value of the unicodeBidi property.
     * 
     * @return
     *     possible object is
     *     {@link UnicodeBidi }
     *     
     */
    public UnicodeBidi getUnicodeBidi() {
        return unicodeBidi;
    }

    /**
     * Sets the value of the unicodeBidi property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnicodeBidi }
     *     
     */
    public void setUnicodeBidi(UnicodeBidi value) {
        this.unicodeBidi = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link Visibility }
     *     
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Visibility }
     *     
     */
    public void setVisibility(Visibility value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the wrapOption property.
     * 
     * @return
     *     possible object is
     *     {@link WrapOption }
     *     
     */
    public WrapOption getWrapOption() {
        return wrapOption;
    }

    /**
     * Sets the value of the wrapOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link WrapOption }
     *     
     */
    public void setWrapOption(WrapOption value) {
        this.wrapOption = value;
    }

    /**
     * Gets the value of the writingMode property.
     * 
     * @return
     *     possible object is
     *     {@link WritingMode }
     *     
     */
    public WritingMode getWritingMode() {
        return writingMode;
    }

    /**
     * Sets the value of the writingMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link WritingMode }
     *     
     */
    public void setWritingMode(WritingMode value) {
        this.writingMode = value;
    }

    /**
     * Gets the value of the zIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZIndex() {
        return zIndex;
    }

    /**
     * Sets the value of the zIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZIndex(String value) {
        this.zIndex = value;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the space property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpace() {
        return space;
    }

    /**
     * Sets the value of the space property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpace(String value) {
        this.space = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the begin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBegin() {
        return begin;
    }

    /**
     * Sets the value of the begin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBegin(String value) {
        this.begin = value;
    }

    /**
     * Gets the value of the dur property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDur() {
        return dur;
    }

    /**
     * Sets the value of the dur property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDur(String value) {
        this.dur = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
