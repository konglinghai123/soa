<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
  xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xmlns:n1="http://ws.apache.org/synapse/ns/csv" xmlns:xs="http://www.w3.org/2001/XMLSchema"
  xmlns="opensoa.order.simple" exclude-result-prefixes="n1 xs"
  xmlns:xsd="http://vo.sca.opensoa-ch10/xsd">
  <xsl:output method="xml" encoding="UTF-8" indent="yes"/>
  <xsl:template match="/n1:csv">
    <xsd:createProcessInstance>
      <xsd:Process xsd:actorId="jdavis" xsd:processName="NewOrderProcess">
        <Order xmlns="opensoa.order.simple">
          <Header>
            <Customer>
              <xsl:for-each select="n1:data">
                <xsl:for-each select="n1:row">
                  <xsl:for-each select="n1:col">
                    <xsl:variable name="ExistsResult">
                      <xsl:for-each select="@name">
                        <xsl:variable name="Vvar18_result">
                          <xsl:value-of select="(.) = ('CustomerName')"/>
                        </xsl:variable>
                        <xsl:if test="(string($Vvar18_result))='true'">
                          <xsl:value-of select="true()"/>
                        </xsl:if>
                      </xsl:for-each>
                    </xsl:variable>
                    <xsl:variable name="Vvar17_exists" select="string-length( $ExistsResult )>0"/>
                    <xsl:if test="(string($Vvar17_exists))='true'">
                      <CustomerName>
                        <xsl:value-of select="."/>
                      </CustomerName>
                    </xsl:if>
                  </xsl:for-each>
                </xsl:for-each>
              </xsl:for-each>
              <xsl:for-each select="n1:data">
                <xsl:for-each select="n1:row">
                  <xsl:for-each select="n1:col">
                    <xsl:variable name="ExistsResult1">
                      <xsl:for-each select="@name">
                        <xsl:variable name="Vvar20_result">
                          <xsl:value-of select="(.) = ('CustomerID')"/>
                        </xsl:variable>
                        <xsl:if test="(string($Vvar20_result))='true'">
                          <xsl:value-of select="true()"/>
                        </xsl:if>
                      </xsl:for-each>
                    </xsl:variable>
                    <xsl:variable name="Vvar19_exists" select="string-length( $ExistsResult1 )>0"/>
                    <xsl:if test="(string($Vvar19_exists))='true'">
                      <CustomerId>
                        <xsl:value-of select="."/>
                      </CustomerId>
                    </xsl:if>
                  </xsl:for-each>
                </xsl:for-each>
              </xsl:for-each>
              <DeliveryAddress>
                <xsl:for-each select="n1:data">
                  <xsl:for-each select="n1:row">
                    <xsl:for-each select="n1:col">
                      <xsl:variable name="ExistsResult2">
                        <xsl:for-each select="@name">
                          <xsl:variable name="Vvar22_result">
                            <xsl:value-of select="('AddressLine1') = (.)"/>
                          </xsl:variable>
                          <xsl:if test="(string($Vvar22_result))='true'">
                            <xsl:value-of select="true()"/>
                          </xsl:if>
                        </xsl:for-each>
                      </xsl:variable>
                      <xsl:variable name="Vvar21_exists" select="string-length( $ExistsResult2 )>0"/>
                      <xsl:if test="(string($Vvar21_exists))='true'">
                        <AddressLine1>
                          <xsl:value-of select="."/>
                        </AddressLine1>
                      </xsl:if>
                    </xsl:for-each>
                  </xsl:for-each>
                </xsl:for-each>
                <xsl:for-each select="n1:data">
                  <xsl:for-each select="n1:row">
                    <xsl:for-each select="n1:col">
                      <xsl:for-each select="@name">
                        <xsl:variable name="ExistsResult3">
                          <xsl:variable name="Vvar24_result">
                            <xsl:value-of select="(.) = ('AddressLine2')"/>
                          </xsl:variable>
                          <xsl:if test="(string($Vvar24_result))='true'">
                            <xsl:value-of select="true()"/>
                          </xsl:if>
                        </xsl:variable>
                        <xsl:variable name="Vvar23_exists"
                          select="string-length( $ExistsResult3 )>0"/>
                        <xsl:if test="(string($Vvar23_exists))='true'">
                          <AddressLine2>
                            <xsl:value-of select="."/>
                          </AddressLine2>
                        </xsl:if>
                      </xsl:for-each>
                    </xsl:for-each>
                  </xsl:for-each>
                </xsl:for-each>
                <xsl:for-each select="n1:data">
                  <xsl:for-each select="n1:row">
                    <xsl:for-each select="n1:col">
                      <xsl:variable name="ExistsResult4">
                        <xsl:for-each select="@name">
                          <xsl:variable name="Vvar26_result">
                            <xsl:value-of select="('City') = (.)"/>
                          </xsl:variable>
                          <xsl:if test="(string($Vvar26_result))='true'">
                            <xsl:value-of select="true()"/>
                          </xsl:if>
                        </xsl:for-each>
                      </xsl:variable>
                      <xsl:variable name="Vvar25_exists" select="string-length( $ExistsResult4 )>0"/>
                      <xsl:if test="(string($Vvar25_exists))='true'">
                        <Municipality>
                          <xsl:value-of select="."/>
                        </Municipality>
                      </xsl:if>
                    </xsl:for-each>
                  </xsl:for-each>
                </xsl:for-each>
                <xsl:for-each select="n1:data">
                  <xsl:for-each select="n1:row">
                    <xsl:for-each select="n1:col">
                      <xsl:variable name="ExistsResult5">
                        <xsl:for-each select="@name">
                          <xsl:variable name="Vvar28_result">
                            <xsl:value-of select="('State') = (.)"/>
                          </xsl:variable>
                          <xsl:if test="(string($Vvar28_result))='true'">
                            <xsl:value-of select="true()"/>
                          </xsl:if>
                        </xsl:for-each>
                      </xsl:variable>
                      <xsl:variable name="Vvar27_exists" select="string-length( $ExistsResult5 )>0"/>
                      <xsl:if test="(string($Vvar27_exists))='true'">
                        <Region>
                          <xsl:value-of select="."/>
                        </Region>
                      </xsl:if>
                    </xsl:for-each>
                  </xsl:for-each>
                </xsl:for-each>
                <xsl:for-each select="n1:data">
                  <xsl:for-each select="n1:row">
                    <xsl:for-each select="n1:col">
                      <xsl:variable name="ExistsResult6">
                        <xsl:for-each select="@name">
                          <xsl:variable name="Vvar30_result">
                            <xsl:value-of select="('Zip') = (.)"/>
                          </xsl:variable>
                          <xsl:if test="(string($Vvar30_result))='true'">
                            <xsl:value-of select="true()"/>
                          </xsl:if>
                        </xsl:for-each>
                      </xsl:variable>
                      <xsl:variable name="Vvar29_exists" select="string-length( $ExistsResult6 )>0"/>
                      <xsl:if test="(string($Vvar29_exists))='true'">
                        <PostalCode>
                          <xsl:value-of select="."/>
                        </PostalCode>
                      </xsl:if>
                    </xsl:for-each>
                  </xsl:for-each>
                </xsl:for-each>
              </DeliveryAddress>
              <xsl:for-each select="n1:data">
                <xsl:for-each select="n1:row">
                  <xsl:for-each select="n1:col">
                    <xsl:variable name="ExistsResult7">
                      <xsl:for-each select="@name">
                        <xsl:variable name="Vvar32_result">
                          <xsl:value-of select="('ContactName') = (.)"/>
                        </xsl:variable>
                        <xsl:if test="(string($Vvar32_result))='true'">
                          <xsl:value-of select="true()"/>
                        </xsl:if>
                      </xsl:for-each>
                    </xsl:variable>
                    <xsl:variable name="Vvar31_exists" select="string-length( $ExistsResult7 )>0"/>
                    <xsl:if test="(string($Vvar31_exists))='true'">
                      <ContactName>
                        <xsl:value-of select="."/>
                      </ContactName>
                    </xsl:if>
                  </xsl:for-each>
                </xsl:for-each>
              </xsl:for-each>
              <xsl:for-each select="n1:data">
                <xsl:for-each select="n1:row">
                  <xsl:for-each select="n1:col">
                    <xsl:variable name="ExistsResult8">
                      <xsl:for-each select="@name">
                        <xsl:variable name="Vvar34_result">
                          <xsl:value-of select="('ContactPhone') = (.)"/>
                        </xsl:variable>
                        <xsl:if test="(string($Vvar34_result))='true'">
                          <xsl:value-of select="true()"/>
                        </xsl:if>
                      </xsl:for-each>
                    </xsl:variable>
                    <xsl:variable name="Vvar33_exists" select="string-length( $ExistsResult8 )>0"/>
                    <xsl:if test="(string($Vvar33_exists))='true'">
                      <ContactPhone>
                        <xsl:value-of select="."/>
                      </ContactPhone>
                    </xsl:if>
                  </xsl:for-each>
                </xsl:for-each>
              </xsl:for-each>
              <xsl:for-each select="n1:data">
                <xsl:for-each select="n1:row">
                  <xsl:for-each select="n1:col">
                    <xsl:variable name="ExistsResult9">
                      <xsl:for-each select="@name">
                        <xsl:variable name="Vvar36_result">
                          <xsl:value-of select="('ContactEmail') = (.)"/>
                        </xsl:variable>
                        <xsl:if test="(string($Vvar36_result))='true'">
                          <xsl:value-of select="true()"/>
                        </xsl:if>
                      </xsl:for-each>
                    </xsl:variable>
                    <xsl:variable name="Vvar35_exists" select="string-length( $ExistsResult9 )>0"/>
                    <xsl:if test="(string($Vvar35_exists))='true'">
                      <ContactEmail>
                        <xsl:value-of select="."/>
                      </ContactEmail>
                    </xsl:if>
                  </xsl:for-each>
                </xsl:for-each>
              </xsl:for-each>
            </Customer>
            <xsl:for-each select="n1:data">
              <xsl:for-each select="n1:row">
                <xsl:for-each select="n1:col">
                  <xsl:variable name="ExistsResult10">
                    <xsl:for-each select="@name">
                      <xsl:variable name="Vvar38_result">
                        <xsl:value-of select="('SalesOrderId') = (.)"/>
                      </xsl:variable>
                      <xsl:if test="(string($Vvar38_result))='true'">
                        <xsl:value-of select="true()"/>
                      </xsl:if>
                    </xsl:for-each>
                  </xsl:variable>
                  <xsl:variable name="Vvar37_exists" select="string-length( $ExistsResult10 )>0"/>
                  <xsl:if test="(string($Vvar37_exists))='true'">
                    <PO>
                      <xsl:value-of select="."/>
                    </PO>
                  </xsl:if>
                </xsl:for-each>
              </xsl:for-each>
            </xsl:for-each>
            <xsl:for-each select="n1:data">
              <xsl:for-each select="n1:row">
                <xsl:for-each select="n1:col">
                  <xsl:if test="(string('Date'))='true'">
                    <DueDate>
                      <xsl:value-of select="."/>
                    </DueDate>
                  </xsl:if>
                </xsl:for-each>
              </xsl:for-each>
            </xsl:for-each>
          </Header>
          <Lines>
            <Line>
              <No>
                <xsl:value-of select="'1'"/>
              </No>
              <xsl:for-each select="n1:data">
                <xsl:for-each select="n1:row">
                  <xsl:for-each select="n1:col">
                    <xsl:variable name="ExistsResult11">
                      <xsl:for-each select="@name">
                        <xsl:variable name="Vvar40_result">
                          <xsl:value-of select="('Item') = (.)"/>
                        </xsl:variable>
                        <xsl:if test="(string($Vvar40_result))='true'">
                          <xsl:value-of select="true()"/>
                        </xsl:if>
                      </xsl:for-each>
                    </xsl:variable>
                    <xsl:variable name="Vvar39_exists" select="string-length( $ExistsResult11 )>0"/>
                    <xsl:if test="(string($Vvar39_exists))='true'">
                      <Item>
                        <xsl:value-of select="."/>
                      </Item>
                    </xsl:if>
                  </xsl:for-each>
                </xsl:for-each>
              </xsl:for-each>
              <xsl:for-each select="n1:data">
                <xsl:for-each select="n1:row">
                  <xsl:for-each select="n1:col">
                    <xsl:variable name="ExistsResult12">
                      <xsl:for-each select="@name">
                        <xsl:variable name="Vvar42_result">
                          <xsl:value-of select="('Price') = (.)"/>
                        </xsl:variable>
                        <xsl:if test="(string($Vvar42_result))='true'">
                          <xsl:value-of select="true()"/>
                        </xsl:if>
                      </xsl:for-each>
                    </xsl:variable>
                    <xsl:variable name="Vvar41_exists" select="string-length( $ExistsResult12 )>0"/>
                    <xsl:if test="(string($Vvar41_exists))='true'">
                      <Price>
                        <xsl:value-of select="."/>
                      </Price>
                    </xsl:if>
                  </xsl:for-each>
                </xsl:for-each>
              </xsl:for-each>
              <xsl:for-each select="n1:data">
                <xsl:for-each select="n1:row">
                  <xsl:for-each select="n1:col">
                    <xsl:variable name="ExistsResult13">
                      <xsl:for-each select="@name">
                        <xsl:variable name="Vvar44_result">
                          <xsl:value-of select="(.) = ('Qty')"/>
                        </xsl:variable>
                        <xsl:if test="(string($Vvar44_result))='true'">
                          <xsl:value-of select="true()"/>
                        </xsl:if>
                      </xsl:for-each>
                    </xsl:variable>
                    <xsl:variable name="Vvar43_exists" select="string-length( $ExistsResult13 )>0"/>
                    <xsl:if test="(string($Vvar43_exists))='true'">
                      <Qty>
                        <xsl:value-of select="."/>
                      </Qty>
                    </xsl:if>
                  </xsl:for-each>
                </xsl:for-each>
              </xsl:for-each>
            </Line>
          </Lines>
        </Order>
      </xsd:Process>
    </xsd:createProcessInstance>
  </xsl:template>
</xsl:stylesheet>
