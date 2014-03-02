<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
	<xsl:param name="filename"/>
	<xsl:param name="errorType"/>
	<xsl:template match="*">
		<EsperManager>
			<Object xsi:type="csvProcessingError">
				<ErrorType><xsl:value-of select="$errorType"/></ErrorType>
				<FileName><xsl:value-of select="$filename"/></FileName>
				<xsl:copy-of select="*"/>
			</Object>
		</EsperManager>
	</xsl:template>
</xsl:stylesheet>
