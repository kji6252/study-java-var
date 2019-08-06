package io.github.kji6252.study;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class ChainSplite {

    @Test
    void chained() {
        var strings = List.of("a","bb","ccc");
        strings.stream()
                .collect(Collectors.toMap(s -> s, s -> s.length()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }

    @Test
    void noVar() {
        List<String> strings = List.of("a", "bb", "ccc");
        Map<String, Integer> stringLengthMap = strings.stream()
                .collect(Collectors.toMap(s -> s, s -> s.length()));

        Optional<Map.Entry<String, Integer>> stringLengthMaxOptional = stringLengthMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        Optional<String> maxKeyOptional = stringLengthMaxOptional.map(Map.Entry::getKey);
    }

    @Test
    void useVar() {
        var strings = List.of("a","bb","ccc");
        var stringLengthMap = strings.stream()
                .collect(Collectors.toMap(s -> s, s -> s.length()));

        var stringLengthMaxOptional = stringLengthMap.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());

        Optional<String> maxKeyOptional = stringLengthMaxOptional.map(Map.Entry::getKey);
    }

}
