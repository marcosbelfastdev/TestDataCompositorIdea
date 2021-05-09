package testData.coreClasses;

import testData.TestDataCompositor;

import java.util.*;

public class Institutions {

    private List<Institution> $banks;
    private Boolean $frozen;

    public Institutions fetch() {
        /*
        This could be a connection to a database to fetch all possible banks.
        In this example, it will create an array of predefined banks before returning it
         */
        this.$banks = Arrays.asList(
                new Institution()
                        .setShortName("BANCO AMARELINHO DO BRASIL")
                        .setCode("501"),
                new Institution()
                        .setShortName("BANCO VERDINHO DOS MIMOS")
                        .setCode("502"),
                new Institution()
                        .setShortName("BANCO VERMELHO LOGO DO COCO")
                        .setCode("503")
        );
        return this;
    }

    public List<Institution> getBanks() {
        return this.$banks;
    }

    public Institution getRandomBank() {
        Random random = new Random();
        int index = random.nextInt($banks.size());
        return $banks.get(index);
    }

    public Institution getBankByShortName(String shortName) {
        for (Institution bank : this.$banks)
            if (bank.getShortName().equals(shortName))
                return bank;
        return null;
    }

    public Institution getBankByCode(Integer code) {
        for (Institution bank : this.$banks)
            if (bank.getCode().equals(code))
                return bank;
        return null;
    }

}
