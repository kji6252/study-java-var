package io.github.kji6252.study;

import org.junit.jupiter.api.Test;

import java.util.Map;

class UseVarShotName {
    @Test
    void listToSet() {
        var items = Map.of("aKey","aValue");

        for (Map.Entry<String, String> stringStringEntry : items.entrySet()) {
            System.out.println(stringStringEntry);
        }

        for (var stringStringEntry : items.entrySet()) {
            System.out.println(stringStringEntry);
        }
    }
}