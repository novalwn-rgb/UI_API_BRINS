<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>1320</name>
   <tag></tag>
   <elementGuidId>026a3bcb-396e-4ce0-9f2a-69a2ebe7f2c1</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>true</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;FIDProgram\&quot;: 1320,\n    \&quot;NomorRekeningPinjaman\&quot;: \&quot;null\&quot;,\n    \&quot;NomorRekeningSimpanan\&quot;: \&quot;195125072026\&quot;,\n    \&quot;FIDAgunan\&quot;: 0,\n    \&quot;FIDCashVault\&quot;: 0,\n    \&quot;FIDCashPickup\&quot;: 0,\n    \&quot;NomorIdentitas\&quot;: \&quot;${NomorIdentitas}\&quot;,\n    \&quot;UrutanPengajuan\&quot;: 4,\n    \&quot;ChannelUniqueKeyId\&quot;: \&quot;\&quot;,\n    \&quot;ChannelUniqueKey\&quot;: \&quot;\&quot;,\n    \&quot;TellerID\&quot;: \&quot;4773891\&quot;,\n    \&quot;OriginalTellerPremiumDate\&quot;: \&quot;09\\/07\\/2026 09:16:22\&quot;,\n    \&quot;TellerPremiumDate\&quot;: \&quot;09\\/07\\/2026 09:16:22\&quot;,\n    \&quot;OriginalTellerFeeDate\&quot;: \&quot;09\\/07\\/2026 09:16:22\&quot;,\n    \&quot;TellerFeeDate\&quot;: \&quot;09\\/07\\/2026 09:16:22\&quot;,\n    \&quot;RequestId\&quot;: \&quot;035101622731\&quot;,\n    \&quot;NamaPartner\&quot;: \&quot;BRI INSURANCE\&quot;,\n    \&quot;OrderId\&quot;: null\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>0312b271-d3d8-4219-b723-89a02479e566</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>10.4.2</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://dev-brisurf.brins.co.id/BRISURF/CoveringFlag</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
