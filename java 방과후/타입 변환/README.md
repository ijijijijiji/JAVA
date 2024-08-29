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
