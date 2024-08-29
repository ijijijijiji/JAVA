## 타입 변환

> 데이터 타입을 다른 데이터 타입으로 변환하는 것, 자동 타입 변환, 강제 타입 변환이 있다.

-----

#### 자동 타입 변환(묵시적)

    값의 허용 범위가 작은 타입이 혀용 범위가 큰 타입으로 저장될 때 발생된다.

    byte < short < int < long < float < double

    ex)
    byte byteVal = 10;
    int intVal = byteVal;
    
    자동 타입 변환으로 byteVal은 int형으로 변환된다.
    가지고 있는 값 10은 변하지 않는다.

    정수 연산에서의 자동 타입 변환 - 두 피연산자 중 혀용 범위가 큰 타입 변환되어 연산

    실수 연산에서의 자동 타입 변환 - 피연산자 중 하나가 double 타입이라면 다른 피연산자 double 타입으로 자동 변환되어 연산

#### 강제 타입 변환

    큰 적용 범위 타입은 작은 허용 범위 타입 변환될 수 없으므로 강제로 나눠서 저장하는 것을 말한다

    작은 허용 타입 = (작은 허용범위 타입) 큰 허용 범위 타입

    ex)
    int intValue = 10;
    byte byteValue = (byte) intValue;

    int intValue = 65;
    char charValue = (char) intValue;
    
