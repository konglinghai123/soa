<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/">
       <Products>
           <xsl:apply-templates/>
       </Products>
    </xsl:template>
    
    <xsl:template match="Product">
        <Product>
            <productId><xsl:value-of select="@productId"/></productId>
            <productTypeId><xsl:value-of select="@productTypeId"/></productTypeId>
            <productName><xsl:value-of select="@productName"/></productName>
            <description><xsl:value-of select="@description"/></description>
            <chargeShipping><xsl:value-of select="@chargeShipping"/></chargeShipping>
        </Product>
    </xsl:template>
</xsl:stylesheet>
