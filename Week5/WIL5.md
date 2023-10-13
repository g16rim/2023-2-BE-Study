# MVC
- 디자인 패턴 중 하나
- Model, View, Controller의 약자로 각각 책임이 명확하다.
## Model
- 데이터와 비즈니스 로직 담당
- 변경이 발생하면, View에 알려준다.
## View
- 보여주는 화면 담당(UI)
- 사용자와 상호작용
## Controller
- Model과 View 사이에 위치
- 클라이언트 요청 -> Model 컴포넌트 호출 -> 결과를 View에 전달