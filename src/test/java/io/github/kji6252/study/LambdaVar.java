package io.github.kji6252.study;

import io.github.kji6252.study.annotations.TestAnnotation;
import org.junit.jupiter.api.Nested;

import java.beans.Transient;
import java.util.function.Function;

public class LambdaVar {
    //람다 식의 파라미터일 경우 어노테이션 삽입을 할때 필연적으로 Type을 넣어줘야 했지만 JDK11부터는 람다파라미터var를 지원 하므로 var를 더 활용 가능
    Function<Integer, String> integerToString = (@TestAnnotation var integer) -> Integer.toString(integer);
    Function<Integer, String> typeIntegerToString = (@TestAnnotation Integer integer) -> Integer.toString(integer);
}
