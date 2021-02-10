package week14d04;

import java.util.List;

public class ContractCreator {

    private Contract template;

    public ContractCreator(String name, List<Integer> monthlyPrices){
         template = new Contract(name, monthlyPrices);
    }

    public Contract create(String client) {
        return new Contract(template, client);

    }


}
