@echo off

AltovaXML /xslt1 "\\192.168.0.113\opt\synapse-1.2\repository\conf\opensoa\resources\xslt\MappingSimplifiedOrderSchema.xslt" /in "\\192.168.0.113\opt\synapse-1.2\repository\conf\opensoa\resources\xml\ExampleCSVXMLOrderNoneSOAP.xml" /out "\\192.168.0.113\opt\synapse-1.2\repository\conf\opensoa\resources\schemas\SimplifiedOrderSchema.xml" %*
IF ERRORLEVEL 1 EXIT/B %ERRORLEVEL%
