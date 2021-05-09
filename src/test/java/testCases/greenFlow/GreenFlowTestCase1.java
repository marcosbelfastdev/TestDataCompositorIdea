package testCases.greenFlow;

import testData.TestDataCompositor;
import testData.coreClasses.AccountData;
import testData.coreClasses.Institution;
import testData.coreClasses.Institutions;
import testData.coreClasses.TaxIdType;

public class GreenFlowTestCase1 {

    TestDataCompositor testCaseData = new TestDataCompositor();

    public void setUpTestCaseData() {

        Institution institution = new Institutions()
                .fetch()
                .getBankByShortName("BANCO VERDINHO DOS MIMOS").setThirdParty(false);

        AccountData accountData = new AccountData.Builder()
                .setInstitution(institution)
                .setAccount("364644")
                .setBranch("6444")
                .setTaxId("74633847722")
                .setTaxIdType(TaxIdType.CPF)
                .build();

        testCaseData.setData("@account", accountData);

    }

}
