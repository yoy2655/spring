<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
MVC
MVC는 Model, View, Controller
가장 많이 사용하는 개발 패턴으로 서비스를 위한 각 부분을 분리해만들고
이를 통해 개발 및 (유지 보수의 효율성을 높이는 것이 목적
                    =>DI
Model : 데이터를 관리하는 부분
View :  눈에 보이는 부분을 구성하는 부분
Controller : 요청에 따른 코드 흐름을 제어하는 부분


3tier : 영속계층
서버 - controller - service - dao - mapper


Bean 정의
@bean : 메서드를 통해 반환하는 객체를 Bean으로 등록
@Component : 개발자가 만든 클래스의 객체를 생성하여 Bean으로 등록 -> @ComponentScan사용
@Comtroller : Component의 일종으로 사용자요청에 따라 자동으로 호출
되는 메서드를 가지고 있는 Bean을 등록-> @ComponentScan 사용
@RestController : Component의 일종으로 사용자 요청에 따라 자동으로
호출되는 메서드를 가지고 있는 Bean을 등록. Restfult API 서버 구성 시 사용
(json.xml등의 파일을 넘기는데 사용)

@ControlelrAdvice : 예외가 발생했을 때 사용할 Global ExceptionHandler로 사용할 Bean을 등록
@Seirvice : Controller에서 호출하는 메서드를 가지고 잇는 Bean을 정의. @Complonent로 정의한 Bean과 차이는 없다
(그냥 명시하는 작업) -> @ComponentScan사용
@Repository: @Service로 정의한 Bean에서 호출하는 메서드를 가지고 있는 Bean을 정의. 
이 Bean은 데이터베이스와 관련된 작업을 구현. @Component로 정의한 Bean과 차이가 없다. -> @ComponentScan사용

(참고사이트: https://blog.naver.com/noda21/222981049200)
스프링 mvc 3tier->유지보수 때문에 (독립적으로 설계되어 있기 때문에)
Presentation - Business - Persistence
(화면)	   (비즈니스계층) (영속or데이터 계층)           
Presentation : 화면에 보여주는 기술을 사용하는 영역
Business: 고객이 요구하는 사항을 정확히 명시하는 계층 (컨트롤러 역할, 서비스 역할)
Persistence: 데이터를 어떠한 방식으로 사용하는가 일종의 설계(DAO 역할)

1)Controller: 클라이언트 요청이 들어올 때, 해당 요청을 수행할 비즈니스 로직을 (제어)한다.
비즈니스 로직: 사용자에게 보여지지 않는 부분에서 (데이터를 처리)하는 코드

2)Service: 비즈니스 로직을 (처리)하는 코드
request->controller->service

3)DAO(Data Access Object): DB접근 객체, CRUD작업을 처리함 =>효율적인 커넥션 관리를 위하여 사용함(사용하는 이유
:매번 접근해서 무제한으로 많은 커넥션이 발생하게 됨)-> DBCP등장 -> 3tier 등장
4)DTO(Data Transfer Object) = JavaBeans파일과 같음, 데이터를 세팅하고 가져다가 쓰기 위한 작업(필드,게터,세터)
5)VO(Value Object)



</body>
</html>