# 스택 수열

> 자바를 사용하여 임의의 수열을 스택에 넣었다가 출력하는 방식으로 입력한 수열을 출력할 수 있는지 확인하고, 
>
> 출력할 수 있다면 pus와 pop 연산을 어떤 순서로 수행해야 하는지를 알아내는 프로그램을 작성한다.

---

    수열의 크기를 사용자로부터 입력 받고, 크기가 N인 배열 A를 선언한다.

    배열에 사용자로부터 입력을 받고 N개의 수열 값을 저장한다.

> 코드

![image](https://github.com/ijijijijiji/JAVA/assets/129851513/c4219e3f-6baa-4db0-8911-40b45c3be0cc)

    스택 생성 후 +, -가  저장되는 버퍼를 생성한다.

    스택에 push or pop 되는 오름차순 숫자와 화면에 결과값 출력을 위한 논리값을 생성한다.

    true -> +,-의 조합 출력(수열생성), false -> NO 출력(수열생성불가)

> 코드

![image](https://github.com/ijijijijiji/JAVA/assets/129851513/1d6c0878-2100-4a65-8755-0acd89d1533f)

    i번째 수열이 num보다 큰지 작은지 비교한다. (수열의 개수만큼)

    만약 크거나 같다면 num이 i번 수열과 같을 때까지 push하고 push 후 num을 1 증가, 출력변수에 +를 추가한다.

    num과 i번 수열이 같아진다면 pop 후 출력변수에 -를 추가하고 다시 i번째 수열이 num보다 큰지 작은지 비교한다.

    만약 작다면 pop의 결과가 i번째 수열과 같은지 비교하고 같으면 pop 후 출력변수에 -를 추가한다.

    다르면 출력불가, 모든 과정을 종료, 출력변수 = NO

> 코드

![image](https://github.com/ijijijijiji/JAVA/assets/129851513/e6685c81-b67e-4dc4-afeb-4ea73623be19)
