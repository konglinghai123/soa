<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/">
        <CarrierShipmentMethods>
           <xsl:apply-templates/>
       </CarrierShipmentMethods>
    </xsl:template>
    
    <xsl:template match="CarrierShipmentMethod">
        <CarrierShipmentMethod>
            <carrier><xsl:value-of select="@partyId"/></carrier>
            <shippingMethod><xsl:value-of select="@shipmentMethodTypeId"/></shippingMethod>
            <multiplier><xsl:value-of select="@multiplier"/></multiplier>
        </CarrierShipmentMethod>
    </xsl:template>
</xsl:stylesheet>
