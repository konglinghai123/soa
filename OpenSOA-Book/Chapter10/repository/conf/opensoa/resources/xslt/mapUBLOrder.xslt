<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xmlns:xs="http://www.w3.org/2001/XMLSchema"
	xmlns:cac="urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2"
	xmlns:cbc="urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2"
	xmlns:n1="urn:oasis:names:specification:ubl:schema:xsd:Order-2"
	xmlns:xsd="http://vo.sca.opensoa-ch10/xsd" xmlns="opensoa.order.simple"
	xmlns:uri="uri:opensoa.chapter10.order"
	exclude-result-prefixes="cac cbc n1 xs">
	<xsl:param name="salesrep-name" />
	<xsl:param name="salesrep-email" />
	
	<xsl:output method="xml" encoding="UTF-8" indent="yes"/>
	<xsl:template match="/uri:CreateOrder">
		<xsl:apply-templates/>
	</xsl:template>
	<xsl:template match="n1:Order">
		<xsd:createProcessInstance>
			<xsd:Process xsd:actorId="jdavis" xsd:processName="NewOrderProcess">
				<Order xmlns="opensoa.order.simple">
					<Header>
						<Customer>
							<xsl:for-each select="cac:BuyerCustomerParty">
								<xsl:for-each select="cac:Party">
									<xsl:for-each select="cac:PartyName">
										<xsl:for-each select="cbc:Name">
											<CustomerName>
												<xsl:value-of select="."/>
											</CustomerName>
										</xsl:for-each>
									</xsl:for-each>
								</xsl:for-each>
							</xsl:for-each>
							<xsl:for-each select="cac:BuyerCustomerParty">
								<xsl:for-each select="cbc:SupplierAssignedAccountID">
									<CustomerId>
										<xsl:value-of select="."/>
									</CustomerId>
								</xsl:for-each>
							</xsl:for-each>
							<DeliveryAddress>
								<xsl:for-each select="cac:BuyerCustomerParty">
									<xsl:for-each select="cac:Party">
										<xsl:for-each select="cac:PostalAddress">
											<xsl:variable name="VmarkerloopPostalAddress" select="."/>
											<xsl:for-each select="cbc:BuildingNumber">
												<xsl:variable name="VmarkerloopBuildingNumber"
													select="."/>
												<xsl:for-each
													select="$VmarkerloopPostalAddress/cbc:BuildingName">
													<xsl:variable name="VmarkerloopBuildingName"
														select="."/>
													<xsl:for-each
														select="$VmarkerloopPostalAddress/cbc:StreetName">
														<xsl:variable name="Vvar3_result"
															select="concat($VmarkerloopBuildingNumber, ' ')"/>
														<xsl:variable name="Vvar4_result"
															select="concat($Vvar3_result, $VmarkerloopBuildingName)"/>
														<xsl:variable name="Vvar5_result"
															select="concat($Vvar4_result, ', ')"/>
														<xsl:variable name="Vvar6_result"
															select="concat($Vvar5_result, .)"/>
														<AddressLine1>
															<xsl:value-of select="$Vvar6_result"/>
														</AddressLine1>
													</xsl:for-each>
												</xsl:for-each>
											</xsl:for-each>
										</xsl:for-each>
									</xsl:for-each>
								</xsl:for-each>
								<xsl:for-each select="cac:BuyerCustomerParty">
									<xsl:for-each select="cac:Party">
										<xsl:for-each select="cac:PostalAddress">
											<xsl:for-each select="cac:AddressLine">
												<xsl:for-each select="cbc:Line">
													<AddressLine2>
														<xsl:value-of select="."/>
													</AddressLine2>
												</xsl:for-each>
											</xsl:for-each>
										</xsl:for-each>
									</xsl:for-each>
								</xsl:for-each>
								<xsl:for-each select="cac:BuyerCustomerParty">
									<xsl:for-each select="cac:Party">
										<xsl:for-each select="cac:PostalAddress">
											<xsl:for-each select="cbc:CityName">
												<Municipality>
													<xsl:value-of select="."/>
												</Municipality>
											</xsl:for-each>
										</xsl:for-each>
									</xsl:for-each>
								</xsl:for-each>
								<xsl:for-each select="cac:BuyerCustomerParty">
									<xsl:for-each select="cac:Party">
										<xsl:for-each select="cac:PostalAddress">
											<xsl:for-each select="cbc:CountrySubentity">
												<Region>
													<xsl:value-of select="."/>
												</Region>
											</xsl:for-each>
										</xsl:for-each>
									</xsl:for-each>
								</xsl:for-each>
								<xsl:for-each select="cac:BuyerCustomerParty">
									<xsl:for-each select="cac:Party">
										<xsl:for-each select="cac:PostalAddress">
											<xsl:for-each select="cbc:PostalZone">
												<PostalCode>
													<xsl:value-of select="."/>
												</PostalCode>
											</xsl:for-each>
										</xsl:for-each>
									</xsl:for-each>
								</xsl:for-each>
							</DeliveryAddress>
							<xsl:for-each select="cac:BuyerCustomerParty">
								<xsl:for-each select="cac:Party">
									<xsl:for-each select="cac:Contact">
										<xsl:for-each select="cbc:Name">
											<ContactName>
												<xsl:value-of select="."/>
											</ContactName>
										</xsl:for-each>
									</xsl:for-each>
								</xsl:for-each>
							</xsl:for-each>
							<xsl:for-each select="cac:BuyerCustomerParty">
								<xsl:for-each select="cac:Party">
									<xsl:for-each select="cac:Contact">
										<xsl:for-each select="cbc:Telephone">
											<ContactPhone>
												<xsl:value-of select="."/>
											</ContactPhone>
										</xsl:for-each>
									</xsl:for-each>
								</xsl:for-each>
							</xsl:for-each>
							<xsl:for-each select="cac:BuyerCustomerParty">
								<xsl:for-each select="cac:Party">
									<xsl:for-each select="cac:Contact">
										<xsl:for-each select="cbc:ElectronicMail">
											<ContactEmail>
												<xsl:value-of select="."/>
											</ContactEmail>
										</xsl:for-each>
									</xsl:for-each>
								</xsl:for-each>
							</xsl:for-each>
						</Customer>
						<xsl:for-each select="cbc:SalesOrderID">
							<PO>
								<xsl:value-of select="."/>
							</PO>
						</xsl:for-each>
						<xsl:for-each select="cac:Delivery">
							<xsl:for-each select="cac:RequestedDeliveryPeriod">
								<xsl:for-each select="cbc:EndDate">
									<DueDate>
										<xsl:value-of select="."/>
									</DueDate>
								</xsl:for-each>
							</xsl:for-each>
						</xsl:for-each>
						<SalesRep><xsl:value-of select="$salesrep-name"/></SalesRep>
						<SalesRepEmail><xsl:value-of select="$salesrep-email"/></SalesRepEmail>
					</Header>
					<Lines>
						<xsl:for-each select="cac:OrderLine">
							<xsl:for-each select="cac:LineItem">
								<Line>
									<xsl:for-each select="cbc:ID">
										<No>
											<xsl:value-of select="."/>
										</No>
									</xsl:for-each>
									<xsl:for-each select="cac:Item">
										<xsl:for-each select="cbc:Name">
											<Item>
												<xsl:value-of select="."/>
											</Item>
										</xsl:for-each>
									</xsl:for-each>
									<xsl:for-each select="cac:Price">
										<xsl:for-each select="cbc:PriceAmount">
											<Price>
												<xsl:value-of select="."/>
											</Price>
										</xsl:for-each>
									</xsl:for-each>
									<xsl:for-each select="cbc:Quantity">
										<Qty>
											<xsl:value-of select="."/>
										</Qty>
									</xsl:for-each>
								</Line>
							</xsl:for-each>
						</xsl:for-each>
					</Lines>
				</Order>
			</xsd:Process>
		</xsd:createProcessInstance>
	</xsl:template>
</xsl:stylesheet>
