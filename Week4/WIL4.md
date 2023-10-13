# DI
- Dependency Injection, 의존성 주입
- 외부에서 두 객체 간의 관계를 결정해주는 디자인 패턴
- 인터페이스를 사이에 둬서 클래스 레벨에서는 의존관계가 고정되지 않음
- 런타임 시 관계를 동적으로 주입
- 유연성 ↑, 결합도 ↓
## 주입 방법
- @Autowired
	- 스프링에서 사용되는 주입 어노테이션
	- Spring이 자동으로 필요한 의존성을 주입해준다.
1. 생성자 주입
	- 객체의 최초 생성 시점에 스프링이 의존성을 주입
    `
    @Component                                                             
    public class Pizza {                                                  
	    private Cheese cheese;
	    private Bread bread;
	    // @Autowired
	    public Pizza(Cheese cheese, Bread bread) {
	        this.cheese = cheese;
	        this.bread = bread;
	    }
	}
	`
	-> Lombok 어노테이션으로 수정
	`
	@Component
	@RequiredArgsConstructor
	public class Pizza {
	    private final Cheese cheese;
	    private final Bread bread;
	}
    `
2. 수정자 주입(setter 주입)
	- 선택, 변경 가능성이 있는 의존관계에서 사용
    `
    @Component
	public class Pizza {
	    private Cheese cheese;
	    private Bread bread;

        public void setCheese(Cheese cheese) {
            this.cheese = cheese;
        }

        public void setBread(Bread bread) {
            this.bread = bread;
        }
    }
    `
3. 필드 주입
    `
    @Component
    public class Pizza {
        @Autowired
        private Cheese cheese;
        @Autowired
        private Bread bread;
    }
    `
4. 일반 메서드 주입 
    `
    @Component
    public class Pizza {
        private Cheese cheese;
        private Bread bread;

        @Autowired
        public void init(Cheese cheese, Bread bread) {
            this.cheese = cheese;
            this.bread = bread;
        }
    }
    `

# Spring Boot
- 스프링 기반의 어플리케이션을 빠르게 개발하고 실행하기 위한 프레임워크
## 특징
1. WAS
- 내장 웹 서버(Tomcat)를 사용하여 별도의 웹 서버를 설치하지 않아도 됨
2. 라이브러리 관리
- 손쉬운 빌드 구성을 위한 스타터 종속성 제공 및 라이브러리 버전 관리
3. 자동 구성
- 프로젝트 시작에 필요한 스프링과 외부 라이브러리의 빈을 자동 등록
- 스프링 애플리케이션에 공통으로 필요한 애플리케이션 기능을 자동으로 구성
4. 외부 설정
- 환경에 따라 달라져야 하는 외부 설정 공통화
5. 프로덕션 준비
- 모니터링을 위한 메트릭, 상태 확인 기능 제공
- 스프링 애플리케이션 컨텍스트에 구성된 빈
- 스프링 부트의 자동 구성으로 구성된 것
- 애플리케이션에서 사용할 수 있는 환경 변수, 시스템 프로퍼티, 구성 프로퍼티, 명령줄 인자
- 최근에 처리된 HTTP 요청 정보
- 메모리 사용량, 가비지 컬렉션, 웹 요청, 데이터 소스 사용량 등 다양한 메트릭

# 4주차 숙제
![Alt text](<스크린샷 2023-10-13 224758.png>)