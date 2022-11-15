package edu.uchicago.gerber._07streams.E19_6;

import java.util.Currency;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCurrency {
    public static void transformCurrency(){
        Set<Currency> cset = Currency.getAvailableCurrencies();
        //Turn it into a stream and transform it into a
        //stream of the currency display names. Print them in
        //sorted order.
        Stream<String> streams = cset.stream().map(current->current.getDisplayName());
        List<String> sorted = streams.sorted().collect(Collectors.toList());
        sorted.forEach(s-> System.out.println(s));
    }

    public static void main(String[] args) {
        transformCurrency();
    }
}
