<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>CovFlag_Bandung</name>
   <tag></tag>
   <elementGuidId>a8a5e516-18a2-4b88-9334-d2d080448308</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>true</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;FIDProgram\&quot;: 26687,\n    \&quot;NomorRekeningPinjaman\&quot;: \&quot;\&quot;,\n    \&quot;NomorRekeningSimpanan\&quot;: \&quot;\&quot;,\n    \&quot;FIDAgunan\&quot;: 0,\n    \&quot;FIDCashVault\&quot;: 0,\n    \&quot;FIDCashPickup\&quot;: 0,\n    \&quot;NomorIdentitas\&quot;: \&quot;1000000000000488\&quot;,\n    \&quot;UrutanPengajuan\&quot;: 1,\n    \&quot;ChannelUniqueKeyId\&quot;: \&quot;${ChannelUniqueKeyId}\&quot;,\n    \&quot;ChannelUniqueKey\&quot;: \&quot;FIDCashPickup\&quot;,\n    \&quot;TellerID\&quot;: \&quot;0206891\&quot;,\n    \&quot;OriginalTellerPremiumDate\&quot;: \&quot;27\\/05\\/2025 15:31:52\&quot;,\n    \&quot;TellerPremiumDate\&quot;: \&quot;27\\/05\\/2025 15:31:52\&quot;,\n    \&quot;OriginalTellerFeeDate\&quot;: \&quot;27\\/05\\/2025 15:31:52\&quot;,\n    \&quot;TellerFeeDate\&quot;: \&quot;27\\/05\\/2025 15:31:52\&quot;,\n    \&quot;RequestId\&quot;: \&quot;015315222340\&quot;\n}&quot;,
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
      <webElementGuid>f774c59c-ed9a-4fac-9639-068bf606dd66</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>User-Agent</name>
      <type>Main</type>
      <value>PostmanRuntime/7.32.2</value>
      <webElementGuid>8e99f1b3-3b46-4913-8bc6-1383ac8cdcd1</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>*/*</value>
      <webElementGuid>0ca52a9b-bfe6-4c64-be99-d991a7f56ac0</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept-Encoding</name>
      <type>Main</type>
      <value>gzip, deflate, br</value>
      <webElementGuid>70b4e187-ed86-4791-9d27-1f531a4abba4</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Connection</name>
      <type>Main</type>
      <value>keep-alive</value>
      <webElementGuid>7c710bec-6bcd-4dc0-b788-502e203a47ab</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>10.3.0</katalonVersion>
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
