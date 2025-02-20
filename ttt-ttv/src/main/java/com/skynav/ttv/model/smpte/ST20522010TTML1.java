/*
 * Copyright 2013-2019 Skynav, Inc. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY SKYNAV, INC. AND ITS CONTRIBUTORS “AS IS” AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL SKYNAV, INC. OR ITS CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.skynav.ttv.model.smpte;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.xml.namespace.QName;

import com.skynav.ttv.model.Profile;
import com.skynav.ttv.model.smpte.tt.rel2010.Information;
import com.skynav.ttv.model.ttml.TTML1.TTML1Model;
import com.skynav.ttv.verifier.ParameterVerifier;
import com.skynav.ttv.verifier.SemanticsVerifier;
import com.skynav.ttv.verifier.StyleVerifier;
import com.skynav.ttv.verifier.TimingVerifier;
import com.skynav.ttv.verifier.smpte.ST20522010TTML1ParameterVerifier;
import com.skynav.ttv.verifier.smpte.ST20522010TTML1SemanticsVerifier;
import com.skynav.ttv.verifier.smpte.ST20522010TTML1StyleVerifier;
import com.skynav.ttv.verifier.smpte.ST20522010TTML1TimingVerifier;

public class ST20522010TTML1 {

    public static class Constants {

        public static final String NAMESPACE_PREFIX = "http://www.smpte-ra.org/schemas/2052-1/";

        public static final String NAMESPACE_2010 = "http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt";
        public static final String NAMESPACE_2010_PROFILE = "http://www.smpte-ra.org/schemas/2052-1/2010/profiles/";
        public static final String NAMESPACE_2010_EXTENSION = "http://www.smpte-ra.org/23b/smpte-tt/extension/";
        public static final String XSD_2010 = "com/skynav/ttv/xsd/smpte/2010/smpte-tt.xsd";

        public static final String NAMESPACE_2010_CEA608 = "http://www.smpte-ra.org/schemas/2052-1/2010/smpte-tt#cea608";
        public static final String XSD_2010_CEA608 = "com/skynav/ttv/xsd/smpte/2010/smpte-tt-608.xsd";

        public static final String PROFILE_2010_FULL = "smpte-tt-full";
        public static final String PROFILE_2010_FULL_ABSOLUTE = NAMESPACE_2010_PROFILE + PROFILE_2010_FULL;

        public static final String DATA_TYPE_608 = NAMESPACE_2010_CEA608;

        public static final String ELT_DATA = "data";
        public static final String ELT_IMAGE = "image";
        public static final String ELT_INFORMATION = "information";

        public static final String ATTR_BACKGROUND_IMAGE = "backgroundImage";
        public static final String ATTR_BACKGROUND_IMAGE_HORIZONTAL = "backgroundImageHorizontal";
        public static final String ATTR_BACKGROUND_IMAGE_VERTICAL = "backgroundImageVertical";
        public static final String ATTR_CAPTION_SERVICE = "captionService";
        public static final String ATTR_CHANNEL = "channel";
        public static final String ATTR_CONTENT_ADVISORY = "contentAdvisory";
        public static final String ATTR_COPY_AND_REDISTRIBUTION_CONTROL = "copyAndRedistributionControl";
        public static final String ATTR_FIELD_START = "fieldStart";
        public static final String ATTR_PROGRAM_NAME = "programName";
        public static final String ATTR_PROGRAM_TYPE = "programType";

    }

    public static final String MODEL_NAME = "st2052-2010-ttml1";
    public static final String MODEL_NAME_ALIAS_1 = "st2052-2010";

    public static boolean inSMPTEPrimaryNamespace(QName name) {
        String nsUri = name.getNamespaceURI();
        return nsUri.equals(Constants.NAMESPACE_2010);
    }

    public static boolean inSMPTESecondaryNamespace(QName name) {
        String nsUri = name.getNamespaceURI();
        return nsUri.equals(Constants.NAMESPACE_2010_CEA608);
    }

    public static boolean inSMPTENamespace(QName name) {
        return inSMPTEPrimaryNamespace(name) || inSMPTESecondaryNamespace(name);
    }

    public static class ST20522010TTML1Model extends TTML1Model {

        private static final QName informationElementName = new com.skynav.ttv.model.smpte.tt.rel2010.ObjectFactory().createInformation(new Information()).getName();
        private static final String[] contextPaths = new String[] { "com.skynav.ttv.model.smpte.tt.rel2010" };

        private String[] nameAliases;
        private String[] schemaResourceNames;
        private URI[] namespaceURIs;
        private URI profileNamespaceUri;
        private URI extensionNamespaceUri;
        private Map<URI,Class<?>> profileSpecificationClasses;
        private Profile.StandardDesignations standardDesignations;
        private ParameterVerifier parameterVerifier;
        private SemanticsVerifier semanticsVerifier;
        private StyleVerifier styleVerifier;
        private TimingVerifier timingVerifier;

        public ST20522010TTML1Model() {
            populate();
        }

        private void populate() {
            populateNameAliases();
            populateSchemaResourceNames();
            populateNamespaceURIs();
        }

        private void populateNameAliases() {
            List<String> nameAliases = new java.util.ArrayList<String>();
            nameAliases.add(MODEL_NAME_ALIAS_1);
            this.nameAliases = nameAliases.toArray(new String[nameAliases.size()]);
        }

        private void populateSchemaResourceNames() {
            List<String> resourceNames = new java.util.ArrayList<String>();
            resourceNames.addAll(Arrays.asList(super.getTTSchemaResourceNames()));
            resourceNames.add(Constants.XSD_2010);
            resourceNames.add(Constants.XSD_2010_CEA608);
            this.schemaResourceNames = resourceNames.toArray(new String[resourceNames.size()]);
        }

        private void populateNamespaceURIs() {
            List<URI> namespaceURIs = new java.util.ArrayList<URI>();
            namespaceURIs.addAll(Arrays.asList(super.getTTNamespaceURIs()));
            try {
                namespaceURIs.add(new URI(Constants.NAMESPACE_2010));
                namespaceURIs.add(new URI(Constants.NAMESPACE_2010_CEA608));
                this.namespaceURIs = namespaceURIs.toArray(new URI[namespaceURIs.size()]);
                this.profileNamespaceUri = new URI(Constants.NAMESPACE_2010_PROFILE);
                this.extensionNamespaceUri = new URI(Constants.NAMESPACE_2010_EXTENSION);
            } catch (URISyntaxException e) {
                throw new RuntimeException(e);
            }
        }

        public String getName() {
            return MODEL_NAME;
        }

        public String[] getNameAliases() {
            return this.nameAliases;
        }

        public String[] getST20522010SchemaResourceNames() {
            return this.schemaResourceNames;
        }

        public String[] getSchemaResourceNames() {
            return getST20522010SchemaResourceNames();
        }

        public URI[] getST20522010NamespaceURIs() {
            return this.namespaceURIs;
        }

        public URI[] getNamespaceURIs() {
            return getST20522010NamespaceURIs();
        }

        public URI getProfileNamespaceUri() {
            return this.profileNamespaceUri;
        }

        public URI getExtensionNamespaceUri() {
            return this.extensionNamespaceUri;
        }

        public Map<String,String> getNormalizedPrefixes() {
            Map<String,String> normalizedPrefixes = super.getNormalizedPrefixes();
            normalizedPrefixes.put(Constants.NAMESPACE_2010, "smpte");
            return normalizedPrefixes;
        }

        protected Map<URI,Class<?>> getProfileSpecificationClasses() {
            if (profileSpecificationClasses == null) {
                profileSpecificationClasses = new java.util.HashMap<URI,Class<?>>(super.getProfileSpecificationClasses());
                profileSpecificationClasses.put(profileNamespaceUri.resolve(Constants.PROFILE_2010_FULL), ST20522010TTML1FullProfileSpecification.class);
            }
            return profileSpecificationClasses;
        }

        public Profile.StandardDesignations getStandardDesignations() {
            if (standardDesignations == null) {
                standardDesignations = ST20522010TTML1StandardDesignations.getInstance();
            }
            return standardDesignations;
        }

        public boolean isGlobalAttribute(QName name) {
            if (super.isGlobalAttribute(name))
                return true;
            else
                return isGlobalAttributeHelper(name);
        }

        static public boolean isGlobalAttributeHelper(QName name) {
            String ln = name.getLocalPart();
            if (inSMPTEPrimaryNamespace(name)) {
                if (ln.equals(Constants.ATTR_BACKGROUND_IMAGE))
                    return true;
                else if (ln.equals(Constants.ATTR_BACKGROUND_IMAGE_HORIZONTAL))
                    return true;
                else if (ln.equals(Constants.ATTR_BACKGROUND_IMAGE_VERTICAL))
                    return true;
            } else if (inSMPTESecondaryNamespace(name)) {
                String nsUri = name.getNamespaceURI();
                if (nsUri.equals(Constants.NAMESPACE_2010_CEA608)) {
                    if (ln.equals(Constants.ATTR_CHANNEL))
                        return true;
                    else if (ln.equals(Constants.ATTR_FIELD_START))
                        return true;
                    else if (ln.equals(Constants.ATTR_PROGRAM_NAME))
                        return true;
                    else if (ln.equals(Constants.ATTR_PROGRAM_TYPE))
                        return true;
                    else if (ln.equals(Constants.ATTR_CONTENT_ADVISORY))
                        return true;
                    else if (ln.equals(Constants.ATTR_CAPTION_SERVICE))
                        return true;
                    else if (ln.equals(Constants.ATTR_COPY_AND_REDISTRIBUTION_CONTROL))
                        return true;
                }
            }
            return false;
        }

        static public boolean isSMPTEInformationElement(QName name) {
            return name.equals(informationElementName);
        }

        public boolean isGlobalAttributePermitted(QName attributeName, QName elementName) {
            if (super.isGlobalAttributePermitted(attributeName, elementName))
                return true;
            else
                return isGlobalAttributePermittedHelper(attributeName, elementName);
        }

        static public boolean isGlobalAttributePermittedHelper(QName attributeName, QName elementName) {
            String ln = attributeName.getLocalPart();
            if (inSMPTEPrimaryNamespace(attributeName)) {
                if (isTTDivElement(elementName)) {
                    if (ln.equals(Constants.ATTR_BACKGROUND_IMAGE))
                        return true;
                    else if (ln.equals(Constants.ATTR_BACKGROUND_IMAGE_HORIZONTAL))
                        return true;
                    else if (ln.equals(Constants.ATTR_BACKGROUND_IMAGE_VERTICAL))
                        return true;
                }
            } else if (inSMPTESecondaryNamespace(attributeName)) {
                String nsUri = attributeName.getNamespaceURI();
                if (nsUri.equals(Constants.NAMESPACE_2010_CEA608)) {
                    if (isSMPTEInformationElement(elementName)) {
                        if (ln.equals(Constants.ATTR_CHANNEL))
                            return true;
                        else if (ln.equals(Constants.ATTR_FIELD_START))
                            return true;
                        else if (ln.equals(Constants.ATTR_PROGRAM_NAME))
                            return true;
                        else if (ln.equals(Constants.ATTR_PROGRAM_TYPE))
                            return true;
                        else if (ln.equals(Constants.ATTR_CONTENT_ADVISORY))
                            return true;
                        else if (ln.equals(Constants.ATTR_CAPTION_SERVICE))
                            return true;
                        else if (ln.equals(Constants.ATTR_COPY_AND_REDISTRIBUTION_CONTROL))
                            return true;
                    }
                }
            }
            return false;
        }
        
        public boolean isElement(QName name) {
            if (super.isElement(name))
                return true;
            else
                return isElementHelper(name);
        }

        static public boolean isElementHelper(QName name) {
            String ln = name.getLocalPart();
            if (inSMPTEPrimaryNamespace(name)) {
                if (ln.equals(Constants.ELT_DATA))
                    return true;
                else if (ln.equals(Constants.ELT_IMAGE))
                    return true;
                else if (ln.equals(Constants.ELT_INFORMATION))
                    return true;
            }
            return false;
        }

        public String getJAXBContextPath() {
            StringBuffer sb = new StringBuffer(super.getJAXBContextPath());
            for (String path: contextPaths) {
                sb.append(':');
                sb.append(path);
            }
            return sb.toString();
        }

        public List<List<QName>> getElementPermissibleAncestors(QName elementName) {
            List<List<QName>> permissibleAncestors = super.getElementPermissibleAncestors(elementName);
            if (permissibleAncestors == null)
                permissibleAncestors = getElementPermissibleAncestorsHelper(new java.util.ArrayList<List<QName>>(), elementName);
            return (permissibleAncestors.size() > 0) ? permissibleAncestors : null;
        }

        static public List<List<QName>> getElementPermissibleAncestorsHelper(List<List<QName>> permissibleAncestors, QName elementName) {
            String localName = elementName.getLocalPart();
            if ((localName.equals(Constants.ELT_DATA) || localName.equals(Constants.ELT_IMAGE)) && inSMPTEPrimaryNamespace(elementName)) {
                List<QName> ancestors = new java.util.ArrayList<QName>();
                ancestors.add(metadataElementName);
                permissibleAncestors.add(ancestors);
            } else if (localName.equals(Constants.ELT_INFORMATION) && inSMPTEPrimaryNamespace(elementName)) {
                List<QName> ancestors = new java.util.ArrayList<QName>();
                ancestors.add(metadataElementName);
                ancestors.add(headElementName);
                permissibleAncestors.add(ancestors);
            }
            return permissibleAncestors;
        }
        
        public ParameterVerifier getParameterVerifier() {
            if (parameterVerifier == null) {
                parameterVerifier = new ST20522010TTML1ParameterVerifier(this);
            }
            return parameterVerifier;
        }

        public SemanticsVerifier getSemanticsVerifier() {
            if (semanticsVerifier == null) {
                semanticsVerifier = new ST20522010TTML1SemanticsVerifier(this);
            }
            return semanticsVerifier;
        }

        public StyleVerifier getStyleVerifier() {
            if (styleVerifier == null) {
                styleVerifier = new ST20522010TTML1StyleVerifier(this);
            }
            return styleVerifier;
        }

        public TimingVerifier getTimingVerifier() {
            if (timingVerifier == null) {
                timingVerifier = new ST20522010TTML1TimingVerifier(this);
            }
            return timingVerifier;
        }

    }

}
