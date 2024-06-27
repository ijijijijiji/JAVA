## 자바로 만든 숫자 야구 게임

컴퓨터가 난수 3개를 발생시키는 메소드이다. 

x ,y ,z에 1~9 사이의 난수를 발생시킨다.

만약 y가 x와 같은 수일 때 다시 난수를 발생시키고 z도 만약 x, y와 같은 수일 때 다시 난수를 발생시킨다.

메소드 코드


![메소드코드](https://github.com/ijijijijiji/JAVA/assets/129851513/aa510022-869f-4063-ad59-d03c6f6d4ce7)

콘솔 화면에서 사용자가 입력하는 데이터를 받아들이는 메소드의 객체변수 in을 선언하고, in에 들어있는 데이터를 문자형으로 저장할 변수를 선언한다.

사용자가 입력한 데이터를 user에 저장하고, user에 저장된 데이터를 정수형으로 변환시켜 배열에 저장한다.

모든 숫자가 1~9 사이이고 같은 숫자가 없는 경우에만 반복문을 빠져나온다.

코드

![image](https://github.com/ijijijijiji/JAVA/assets/129851513/9ac75f07-45a5-4a17-bd39-d71a14700b64)

게임 결과값을 위한 변수를 선언하고, 게임실행 주어진 3개인 경우에는 각각 정수형으로 형변형 통해 x, y, z에 저장한다.

result에 저장된 값에 따라 결과값을 출력한다.

코드

![image](https://github.com/ijijijijiji/JAVA/assets/129851513/738aec0a-828e-468d-b352-969b22e73868)

## 스택 수열

수열의 크기를 사용자로부터 입력 받고, 크기가 N인 배열 A를 선언한다.

배열에 사용자로부터 입력을 받고 N개의 수열 값을 저장한다.

![image](https://github.com/ijijijijiji/JAVA/assets/129851513/c4219e3f-6baa-4db0-8911-40b45c3be0cc)

스택 생성 후 +, -가  저장되는 버퍼를 생성한다.

스택에 push or pop 되는 오름차순 숫자와 화면에 결과값 출력을 위한 논리값을 생성한다.

true -> +,-의 조합 출력(수열생성), false -> NO 출력(수열생성불가)

![image](https://github.com/ijijijijiji/JAVA/assets/129851513/1d6c0878-2100-4a65-8755-0acd89d1533f)

i번째 수열이 num보다 큰지 작은지 비교한다. (수열의 개수만큼)

만약 크거나 같다면 num이 i번 수열과 같을 때까지 push하고 push 후 num을 1 증가, 출력변수에 +를 추가한다.

num과 i번 수열이 같아진다면 pop 후 출력변수에 -를 추가하고 다시 i번째 수열이 num보다 큰지 작은지 비교한다.

만약 작다면 pop의 결과가 i번째 수열과 같은지 비교하고 같으면 pop 후 출력변수에 -를 추가한다.

다르면 출력불가, 모든 과정을 종료, 출력변수 = NO

![image](https://github.com/ijijijijiji/JAVA/assets/129851513/e6685c81-b67e-4dc4-afeb-4ea73623be19)
