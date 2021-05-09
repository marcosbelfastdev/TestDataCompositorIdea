package testData.coreClasses;

import testData.TestDataCompositor;

public class AccountData<T>  {

    private Institution $institution;
    private T $account;
    private T $branch;
    private T $taxId;
    private T $taxIdType;

    public static class Builder {

        private Institution institution;
        private Object account;
        private Object branch;
        private Object taxId;
        private Object taxIdType;

        public Builder setInstitution(Institution institution) {
            this.institution = institution;
            return this;
        }

        public Builder setAccount(Object account) {
            this.account = account;
            return this;
        }

        public Builder setBranch(Object branch) {
            this.branch = branch;
            return this;
        }

        public Builder setTaxId(Object taxId) {
            this.taxId = taxId;
            return this;
        }

        public Builder setTaxIdType(Object taxIdType) {
            this.taxIdType = taxIdType;
            return this;
        }

        public AccountData build() {
            return new AccountData(this);
        }
    }

    private AccountData(Builder builder) {
        $institution = builder.institution;
    }

    public Institution getInstitution() {
        return $institution;
    }

    public T getAccount() {
        return $account;
    }

    public T getBranch() {
        return $branch;
    }

    public T getTaxId() {
        return $taxId;
    }

    public T getTaxIdType() {
        return $taxIdType;
    }

}
