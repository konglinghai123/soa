<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"
    xmlns:p40="http://drools.org/drools-4.0/process"
    xmlns:p50="http://drools.org/drools-5.0/process"
    exclude-result-prefixes="p40">
 
    <xsl:template match="/">
        <p50:process xmlns="http://drools.org/drools-5.0/process"
            xmlns:xs="http://www.w3.org/2001/XMLSchema-instance"
            xs:schemaLocation="http://drools.org/drools-5.0/process drools-processes-5.0.xsd"
            type="{p40:process/@type}"
            name="{p40:process/@name}"
            id="{p40:process/@id}"
            package-name="{p40:process/@package-name}"
            version="{p40:process/@version}">
            <xsl:apply-templates select="//p40:process"/>
        </p50:process>
    </xsl:template>
    
    <xsl:template match="*">
        <xsl:element name="{local-name()}" >
            <!-- process attributes -->
            <xsl:for-each select="@*">
                <!-- remove attribute prefix (if any) -->
                <xsl:attribute name="{local-name()}">
                    <xsl:value-of select="."/>
                </xsl:attribute>
                
            </xsl:for-each>
            <xsl:apply-templates/>
        </xsl:element>
    </xsl:template>
    
    <xsl:template match="p40:process">
        <xsl:apply-templates/>
    </xsl:template>
</xsl:stylesheet>
