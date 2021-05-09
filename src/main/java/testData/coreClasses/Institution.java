package testData.coreClasses;

import testData.TestDataCompositor;

public class Institution {
    /*
    An institution can be a bank or a payment institution,
    therefore, we will implement derived classes for each.
     */

    private String $shortName;
    private String $searchGlassInstitutionName;
    private String $code;
    private Boolean $thirdParty;

    public Institution Institution() {
        return this;
    }

    public Institution setShortName(String shortName) {
        $shortName = shortName;
        return this;
    }

    public String getShortName() {
        return $shortName;
    }

    public Institution setFullName(String searchGlassInstitutionName) {
        $searchGlassInstitutionName = searchGlassInstitutionName;
        return this;
    }

    public Institution setCode(String code) {
        $code = code;
        return this;
    }

    public Integer getCode() {
        return Integer.valueOf(String.valueOf($code));
    }

    public String getFullName() {
        return $searchGlassInstitutionName;
    }

    public Institution setThirdParty(Boolean thirdParty) {
        $thirdParty = thirdParty;
        return this;
    }

    public Boolean isThirdParty() {
        return $thirdParty;
    }
}
