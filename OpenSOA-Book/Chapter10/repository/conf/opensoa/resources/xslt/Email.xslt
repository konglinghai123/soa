<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="2.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fn="http://www.w3.org/2005/xpath-functions" xmlns:n1="http://ws.apache.org/synapse/ns/csv" 
	xmlns:xdt="http://www.w3.org/2005/xpath-datatypes" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:altova="http://www.altova.com">
	<xsl:output method="xhtml" indent="no" encoding="UTF-8"/>
	<xsl:param name="SV_OutputFormat" select="'HTML'"/>
	<xsl:param name="filename"/>
	<xsl:variable name="XML" select="/"/>
	<xsl:template match="/">
		<html>
			<head>
				<title/>
			</head>
			<body>
				<xsl:for-each select="$XML">
					<xsl:for-each select="n1:csv">
						<xsl:for-each select="n1:data">
							<xsl:for-each select="n1:row">
								<xsl:for-each select="n1:col">
									<xsl:if test="@name  = &quot;SalesOrderId&quot;">
										<div>A error occurred when processing an inbound FTP/CSV order (file: <xsl:value-of select="$filename"/>)</div>
										<span>
											<xsl:text>Order PO: </xsl:text>
										</span>
										<xsl:apply-templates/>
										<br/>
									</xsl:if>
									
									<xsl:if test="@name  = &quot;TransactionID&quot;">
										<span>
											<xsl:text>Transaction ID: </xsl:text>
										</span>
										<xsl:apply-templates/>
										<br/>
									</xsl:if>
									
									<xsl:if test="@name  = &quot;CustomerName&quot;">
										<span>
											<xsl:text>Customer Name: </xsl:text>
										</span>
										<xsl:apply-templates/>
										<br/>
									</xsl:if>
									
								</xsl:for-each>
							</xsl:for-each>
						</xsl:for-each>
					</xsl:for-each>
				</xsl:for-each>
			</body>
		</html>
	</xsl:template>
</xsl:stylesheet>
