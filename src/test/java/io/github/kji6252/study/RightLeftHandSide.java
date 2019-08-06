package io.github.kji6252.study;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class RightLeftHandSide {
    @Test
    void rightHandSide() {
        List<Integer> ints = new ArrayList<>();
        ints.removeIf(integer -> integer == 1);
    }
    public <T> String str(List<T> list) { return ""; }

    @Test
    void leftHandSide() {
        var i = 0;
        var strings = new ArrayList<String>();
        var iter = strings.listIterator();
    }
}
