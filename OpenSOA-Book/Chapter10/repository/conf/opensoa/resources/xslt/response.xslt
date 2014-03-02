<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xmlns:xs="http://www.w3.org/2001/XMLSchema" 
    xmlns:n1="opensoa.order.response.simple" 
    xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2" 
    xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2" 
    xmlns="urn:oasis:names:specification:ubl:schema:xsd:OrderResponseSimple-2" exclude-result-prefixes="n1 xs">
    <xsl:output method="xml" encoding="UTF-8" indent="yes"/>
    <xsl:template match="/n1:OrderResponse">
        <OrderResponseSimple>
            <xsl:attribute name="xsi:schemaLocation">
                <xsl:value-of select="'urn:oasis:names:specification:ubl:schema:xsd:OrderResponseSimple-2 //192.168.0.113/opt/synapse-1.2/repository/conf/opensoa/resources/schemas/ublsimpleresponse.xsd'"/>
            </xsl:attribute>
            <cbc:UBLVersionID>
                <xsl:value-of select="'2.0'"/>
            </cbc:UBLVersionID>
            <xsl:for-each select="n1:Order">
                <xsl:for-each select="n1:TransactionID">
                    <cbc:ID>
                        <xsl:value-of select="."/>
                    </cbc:ID>
                </xsl:for-each>
            </xsl:for-each>
            <xsl:for-each select="n1:Order">
                <xsl:for-each select="n1:Status">
                    <xsl:for-each select="n1:CommittedDeliveryDt">
                        <cbc:IssueDate>
                            <xsl:value-of select="."/>
                        </cbc:IssueDate>
                    </xsl:for-each>
                </xsl:for-each>
            </xsl:for-each>
            <xsl:for-each select="n1:Order">
                <xsl:for-each select="n1:Status">
                    <xsl:for-each select="n1:Note">
                        <cbc:Note>
                            <xsl:value-of select="."/>
                        </cbc:Note>
                    </xsl:for-each>
                </xsl:for-each>
            </xsl:for-each>
            <xsl:for-each select="n1:Order">
                <xsl:for-each select="n1:Status">
                    <xsl:for-each select="n1:Approved">
                        <cbc:AcceptedIndicator>
                            <xsl:value-of select="."/>
                        </cbc:AcceptedIndicator>
                    </xsl:for-each>
                </xsl:for-each>
            </xsl:for-each>
            <cac:OrderReference>
                <xsl:for-each select="n1:Order">
                    <xsl:for-each select="n1:TransactionID">
                        <cbc:ID>
                            <xsl:value-of select="."/>
                        </cbc:ID>
                    </xsl:for-each>
                </xsl:for-each>
                <xsl:for-each select="n1:Order">
                    <xsl:for-each select="n1:PO">
                        <cbc:SalesOrderID>
                            <xsl:value-of select="."/>
                        </cbc:SalesOrderID>
                    </xsl:for-each>
                </xsl:for-each>
                <xsl:for-each select="n1:Order">
                    <xsl:for-each select="n1:Status">
                        <xsl:for-each select="n1:CommittedDeliveryDt">
                            <cbc:IssueDate>
                                <xsl:value-of select="."/>
                            </cbc:IssueDate>
                        </xsl:for-each>
                    </xsl:for-each>
                </xsl:for-each>
            </cac:OrderReference>
            <cac:SellerSupplierParty>
                <xsl:for-each select="n1:Order">
                    <xsl:for-each select="n1:CustomerReferenceID">
                        <cbc:CustomerAssignedAccountID>
                            <xsl:value-of select="."/>
                        </cbc:CustomerAssignedAccountID>
                    </xsl:for-each>
                </xsl:for-each>
            </cac:SellerSupplierParty>
            <cac:BuyerCustomerParty>
                <xsl:for-each select="n1:Order">
                    <xsl:for-each select="n1:CustomerReferenceID">
                        <cbc:CustomerAssignedAccountID>
                            <xsl:value-of select="."/>
                        </cbc:CustomerAssignedAccountID>
                    </xsl:for-each>
                </xsl:for-each>
                <xsl:for-each select="n1:Order">
                    <xsl:for-each select="n1:CustomerID">
                        <cbc:SupplierAssignedAccountID>
                            <xsl:value-of select="."/>
                        </cbc:SupplierAssignedAccountID>
                    </xsl:for-each>
                </xsl:for-each>
            </cac:BuyerCustomerParty>
        </OrderResponseSimple>
    </xsl:template>
</xsl:stylesheet>
