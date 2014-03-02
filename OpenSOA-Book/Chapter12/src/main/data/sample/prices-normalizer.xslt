<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/">
        <ProductPrices>
           <xsl:apply-templates/>
       </ProductPrices>
    </xsl:template>
    
    <xsl:template match="ProductPrice">
        <ProductPrice>
            <productId><xsl:value-of select="@productId"/></productId>
            <priceType><xsl:value-of select="@productPriceTypeId"/></priceType>
            <fromDate><xsl:value-of select="@fromDate"/></fromDate>
            <price><xsl:value-of select="@price"/></price>
        </ProductPrice>
    </xsl:template>
</xsl:stylesheet>
