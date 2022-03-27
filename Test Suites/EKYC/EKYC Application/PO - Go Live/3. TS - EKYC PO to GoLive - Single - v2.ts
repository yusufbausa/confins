<?xml version="1.0" encoding="UTF-8"?>
<TestSuiteEntity>
   <description></description>
   <name>3. TS - EKYC PO to GoLive - Single - v2</name>
   <tag></tag>
   <isRerun>false</isRerun>
   <mailRecipient></mailRecipient>
   <numberOfRerun>0</numberOfRerun>
   <pageLoadTimeout>120</pageLoadTimeout>
   <pageLoadTimeoutDefault>true</pageLoadTimeoutDefault>
   <rerunFailedTestCasesOnly>false</rerunFailedTestCasesOnly>
   <rerunImmediately>false</rerunImmediately>
   <testSuiteGuid>c18d1f63-fda0-47ad-8146-8cf631ba3603</testSuiteGuid>
   <testCaseLink>
      <guid>b9fb2f9e-de7e-4dea-bdb5-90ec503f3ff4</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/App - Go Live/3. Purchase Order/Purchase Order - Driven - v2</testCaseId>
      <testDataLink>
         <combinationType>MANY</combinationType>
         <id>78672948-0c4a-4c7f-adc8-d6ae5121b568</id>
         <iterationEntity>
            <iterationType>SPECIFIC</iterationType>
            <value>1</value>
         </iterationEntity>
         <testDataId>Data Files/EKYC/EKYC PO - Go Live/EKYC PO - Go Live Personal</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>78672948-0c4a-4c7f-adc8-d6ae5121b568</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>url</value>
         <variableId>7062d6d7-a240-4bc3-9f1b-830bf519fc7c</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>78672948-0c4a-4c7f-adc8-d6ae5121b568</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>usernamePO</value>
         <variableId>43019048-e89b-4027-9f3a-1300d0f7df23</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>78672948-0c4a-4c7f-adc8-d6ae5121b568</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>62940283-02b5-4e1b-8128-337e277c9fb2</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>78672948-0c4a-4c7f-adc8-d6ae5121b568</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>appNumber</value>
         <variableId>9123664f-ff00-45e4-8f7b-1490138778f6</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>61cf8691-4900-4152-8e97-53e831483c32</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/App - Go Live/4. Document Signer/Document Signer - Driven - v2</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>d7098111-1d4b-47cd-84cf-015e50e7958a</id>
         <iterationEntity>
            <iterationType>SPECIFIC</iterationType>
            <value>1</value>
         </iterationEntity>
         <testDataId>Data Files/EKYC/EKYC PO - Go Live/EKYC PO - Go Live Personal</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>d7098111-1d4b-47cd-84cf-015e50e7958a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>url</value>
         <variableId>14d519f4-3ffe-4e20-b838-5ec32fc6dc7d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>d7098111-1d4b-47cd-84cf-015e50e7958a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>appNumber</value>
         <variableId>3fd2c263-9202-4dbb-8b08-5a3b97886e23</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>d7098111-1d4b-47cd-84cf-015e50e7958a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>usernameDS</value>
         <variableId>27133ce5-8b53-4d79-a4e3-ae3c5348c14d</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>d7098111-1d4b-47cd-84cf-015e50e7958a</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>c1b666a0-48d7-48ea-beca-e5ea27a36f62</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>4b2957d8-2997-421b-bb9f-92e3b8109666</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/App - Go Live/5. Delivery Order/Delivery Order Single - Driven - v2</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>249d8020-6581-44b2-a4b8-7cf1be31eb12</id>
         <iterationEntity>
            <iterationType>SPECIFIC</iterationType>
            <value>1</value>
         </iterationEntity>
         <testDataId>Data Files/EKYC/EKYC PO - Go Live/EKYC PO - Go Live Personal</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>249d8020-6581-44b2-a4b8-7cf1be31eb12</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>usernameDO</value>
         <variableId>c17555d8-12ce-4ea3-9ad7-46fa80db1c9b</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>249d8020-6581-44b2-a4b8-7cf1be31eb12</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>8af1597a-8406-4f31-86d2-2e4708dfe3a3</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>249d8020-6581-44b2-a4b8-7cf1be31eb12</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>appNumber</value>
         <variableId>9a1a3134-7ba6-47dd-b946-6e87d02e9fde</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>249d8020-6581-44b2-a4b8-7cf1be31eb12</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>url</value>
         <variableId>856f03b5-7bf2-4c13-a9ac-4237b9ae939d</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>07f529ba-3472-4d74-a126-29072e6aa185</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/App - Go Live/6. Customer Confirmation/Customer Confirmation - Driven - v2</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>9e40b470-98df-4acd-9484-f52e548fc210</id>
         <iterationEntity>
            <iterationType>SPECIFIC</iterationType>
            <value>1</value>
         </iterationEntity>
         <testDataId>Data Files/EKYC/EKYC PO - Go Live/EKYC PO - Go Live Personal</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>9e40b470-98df-4acd-9484-f52e548fc210</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>url</value>
         <variableId>a24db5c4-842c-45ed-9e88-4aae2e76e134</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9e40b470-98df-4acd-9484-f52e548fc210</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>usernameCC</value>
         <variableId>1317101e-3831-4b69-9cd1-b328596045f9</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9e40b470-98df-4acd-9484-f52e548fc210</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>a19f04de-0601-414c-a67e-fd158f338a13</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>9e40b470-98df-4acd-9484-f52e548fc210</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>appNumber</value>
         <variableId>857da7ec-159a-44d2-a0ff-32e71eee717d</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>ffd15274-25dc-4069-b967-666660325a2a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/App - Go Live/7. Document Checklist/Document Checklist - Driven - v2</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>3a7adc77-6917-48b9-916b-489fe50f373d</id>
         <iterationEntity>
            <iterationType>SPECIFIC</iterationType>
            <value>1</value>
         </iterationEntity>
         <testDataId>Data Files/EKYC/EKYC PO - Go Live/EKYC PO - Go Live Personal</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>3a7adc77-6917-48b9-916b-489fe50f373d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>usernameDC</value>
         <variableId>b88894eb-4813-46ee-83f7-63f5d5f4a60a</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>3a7adc77-6917-48b9-916b-489fe50f373d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>86f52d4b-755e-4b1c-9a1b-f2e995ee04f4</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>3a7adc77-6917-48b9-916b-489fe50f373d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>appNumber</value>
         <variableId>ed82a4ec-6667-408d-872e-ebf9d7da6781</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>3a7adc77-6917-48b9-916b-489fe50f373d</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>url</value>
         <variableId>c6e86444-69a8-48e1-b89e-7e24dba6d6f5</variableId>
      </variableLink>
   </testCaseLink>
   <testCaseLink>
      <guid>93ebe662-2beb-4039-aecc-d434460dee7a</guid>
      <isReuseDriver>false</isReuseDriver>
      <isRun>true</isRun>
      <testCaseId>Test Cases/App - Go Live/8. Go Live/Go Live - Driven - v2</testCaseId>
      <testDataLink>
         <combinationType>ONE</combinationType>
         <id>c61228c0-c928-45df-bd37-40def3ee34f8</id>
         <iterationEntity>
            <iterationType>SPECIFIC</iterationType>
            <value>1</value>
         </iterationEntity>
         <testDataId>Data Files/EKYC/EKYC PO - Go Live/EKYC PO - Go Live Personal</testDataId>
      </testDataLink>
      <variableLink>
         <testDataLinkId>c61228c0-c928-45df-bd37-40def3ee34f8</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>usernameGL</value>
         <variableId>4a3759f9-6933-45ff-918c-586dd105cabc</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c61228c0-c928-45df-bd37-40def3ee34f8</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>password</value>
         <variableId>b918687a-13b1-465b-9b93-7c7149d4bf31</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c61228c0-c928-45df-bd37-40def3ee34f8</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>appNumber</value>
         <variableId>2ccce854-0137-42f1-a7d1-6cc962c74818</variableId>
      </variableLink>
      <variableLink>
         <testDataLinkId>c61228c0-c928-45df-bd37-40def3ee34f8</testDataLinkId>
         <type>DATA_COLUMN</type>
         <value>url</value>
         <variableId>9b0802b2-936d-4a0d-9e91-3fba6c3c8540</variableId>
      </variableLink>
   </testCaseLink>
</TestSuiteEntity>
