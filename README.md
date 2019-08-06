# 환경
* JDK10

# 예제 확인
study-java-var/src/test/java/io/github/kji6252/study

# 소개
* c++, scala, kotlin, c#과 같은 많은 언어에서는 다양한 유형 추론 기법 도입
* JDK10 이전에는 RHS(right-hand side)만 존재
* 람다 인수, 다이아몬드 연산자, 일반 메소드 인수등에서만 유형 추론함
* LHS(left-hand side) 유형 추론이 부족하여 local-variable(var) 유형 추론 도입
* [Java Enhancement Proposal(JEP)286](http://openjdk.java.net/jeps/286) 의논 후 JDK10에 포함
* RHS : <>, 람다인수, 메서드
```java
void rightHandSide() {
    List<Integer> ints = new ArrayList<>();
    ints.removeIf(integer -> integer == 1);
}
public <T> String str(List<T> list) { return ""; }
```
* LHS : var
```java
void leftHandSide() {
    var i = 0;
    var strings = new ArrayList<String>();
    var iter = strings.listIterator();
}
```

* JEP286팀이 설문 조사를 실시
  * 투표 결과 var만 도입하기로 결정
![Reserved Type Name Preference](https://dzone.com/storage/temp/9364849-screen-shot-2018-06-06-at-112545-am.png)

# 원칙(Principles)
  P1. 코드 작성보다 코드 읽기가 더 중요합니다.
  P2. 코드는 그 부분만으로 명확하게 추론 가능해야 합니다.
  P3. 코드 가독성은 IDE에 의존하지 않아야 합니다.
  P4. 명시적 타입 선언은 트레이드오프가 있습니다.



# 가이드라인(Guidelines)
  G1. 유용한 정보를 제공하는 변수 이름을 선택하세요.
  G2. 로컬 변수의 범위를 최소화 합니다.(이펙티브자바 Item.57 344P)
    * 초기화 코드가 코드를 읽는 사람에게 충분한 정보를 제공하는 경우에 var를 고려하세요.
    * `List<?>` 에서 `Set<?>`으로 변경 시 다른코드를 조사 해야 할 수도 있으니 최소화 하라
  G3. 초기화 코드가 코드를 읽는 사람에게 충분한 정보를 제공하는 경우에 var를 고려하세요.
  G4. Chained 표현식이나 중첩 표현식을 분리하는 경우 var를 사용합니다.
  G5. 로컬 변수를 갖고 “인터페이스로 개발하라”는 것에 대해서 너무 걱정하지 마세요.
  G6. 다이아몬드 혹은 제네릭 메소드를 var와 함꼐 사용할때는 주의하세요.
  G7. var를 리터럴과 함께 사용할 때는 주의가 필요합니다.



# 참조사이트
* [Style Guidelines for Local Variable Type Inference in Java](https://openjdk.java.net/projects/amber/LVTIstyle.html)
* [Local Variable Type Inference in Java](https://dzone.com/articles/local-variable-type-inference-in-java)