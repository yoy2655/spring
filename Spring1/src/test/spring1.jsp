<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<script>
//스프링 프레임워크
//오늘날 가장 많이 사용하는 자바 기반 응용 프로그램 개발 프레임워크(전자정부표준프레임워크)
//
//스프링을 왜 사용하는가?
//1.스프링 컨테이너(경량)에 객체를 스프링 빈으로 등록하면 스프링 빈으로 찾아서 사용(DI,AOP,IoC,myBatis라이브러리 지원)지원
//2. 스프링 빈 의존관계 설정
//3. 객체지향 언어의 특징을 살린 프레임워크
//ex)추상화,상속,다형성,캡슐화
//4. 자바 플랫폼을 위한 오픈 소스 애플리케이션 프레임워크
//5. 소프트웨어 개발의 뼈대 역할
//6. 자바코드를 줄일수 있다(빤복되는 작업을 줄일 수 있다)
//7. 프로젝트 관리 용이(개발자들과 동시에 프로젝트 하기가 용이)

//IoC컨테이너란?
//A. 객체를 생성해서 담을 수 있는 그릇
//B. 객체를 생성하고 의존관계를 연결해주는 것

//자바에서 객체는 부모클래스형 참조변수,또는 구현한 인터페이스 변수에 담을 수 있다.
//=>참조변수를 통해 메소드를 호출하면 오버라이딩된 메소드가 호출된다!!
//=>다형성 개념을 사용하면 참조변수 선언부분은 수정하지 않아도 되지만 객체 생성부분은 코드가 변경되어야 한다.

//2. 다형성은 왜 필요한가?
//다형성이 없으면 비슷한 기능의 코드들이 중복된다.
//하나의 타입에 여러 객체를 대입해서 다양한 기능을 이용할 수 있도록 해준다.
//객체를 실행 시점에 유연한 변경이 가능하다.
//같은 타입이지만 실행결과가 다양한 객체를 이용할 수 있다.

//IoC(Inversion of Control):제어역전
//객체를 생성하고 연결, 실행하는 것은 결합도가 높아지고 유지 보수가 힘들어진다.
//=>따라서, 제어흐름을 외부에서 관리하고 각각의 객체들은 본인의 로직에서만 실행하도록 하는것이 IoC

//프로그램을 개발할 때, 프로그램 흐름, 객체에 대한 제어권을 원래는 개발자가 갖고 있음.
//하지만, 스프링에서는 제어권을 프레임워크가 갖는다.

//IoC컨테이너 종류
//A.BeanFactory : 스프링컨테이너의 최상위 인터페이스
//				: 스프링 빈을 관리, 조회
//(ClassPathResource, XmlBeanFactory)
//B.ApplicationContext : BeanFactory상속받아 제공
//					   : 스프링 빈을 관리, 조회외 부가기능 제공
//=>스프링 프레임워크는 IoC컨테이너를 이용해 Bean객체들을 관리한다.

//스프링 컨테이너 만드는 방법:xml와 annotation이 있다

//getBean()이란
//A.메소드를 호출할 때 객체 생성된다.
//B.같은 id인 객체를 가지고 오면 이미 생성된 객체 주소값을 받아와 사용할 수 있다.(싱글톤)
//========================================================
//A. 싱글톤인 경우 xml파일 로딩할 때 객체 생성됨
//B. 싱글톤이고 lazy-init속성이 true인 경우 getBean()호출 시 객체 생성됨
//C. prototype인 경우 getBean()호출시 객체 생성됨
//D. IoC컨테이너 종료할 때 객체 소멸

//DI(의존성 주입) : Dependency Injection :외부에서 강제로 주입한다
//Bean객체를 생성할 때 Bean 객체가 관리할 값이나 객체를 주입하는 것을 의미함
//구성요소 간의 의존관계가 소스코드 내부가 아닌 외부에서 설정을 통해 정의되는 방식으로 모듈간의 결합도를 낮출 수 있다.
//의존대상 B(레시피-기본적으로 싱글톤임)가 변하면 그것이 A(요리사)에 영향을 미친다.
//ex)식당에 가면 요리사가 있고 레시피가 있어서 요리사는 레시피에 따라 조리하고
//레시피가 변화되면 요리사는 레시피에 따라 행동이 변하게 되고 이때 요리사는 레시피에 의존한다고 말할 수 있다..(결합도가 높다)
//
//의존성주입 방법:xml, 어노테이션 사용하는 방법
//생성자를 통한 주입, 자동주입, setter통한 주입, 컬렉션 주입..
	
//<constructor-arg value="spring" index="2"/>	//객체의 변수 설정
//<constructor-arg ref="dd"/>					//참조변수 설정

//자동주입(이름을 통한 주입, 타입을 통한 주입, 생성자를 통해 자동주입)

//Java코드로 빈등록하기
//@Configuration : 현재 자바파일이 빈 등록을 위한 자바파일임을 명시(빈 설정 담당하는 클래스) -> ex)beans.xml파일 역할
//이 클래스 안에 @Bean이 붙은 메소드가 있다면 그 메소드를 통해 빈을 정의하게 된다.

//@Bean : 빈객체 정의, 등록
//스프링컨테이너가 @Configuration이 붙어있는 클래스를 자동으로 빈으로 등록
//->해당 클래스를 파싱해서 @Bean이 있는 메소드를 찾아 빈을 생성한다.
//메소드가 반환하는 객체의 주소값을 컨테이너가 빈 객체로 가지고 있게 되고 메소드명으로 등록하게 됨
//(메소드 명이 빈의 id가 된다.)

//프로토타입이면 싱글톤이 아니다
//property는 setter주입이다.
//오토와이어면 자동주입이다 (기준으로 본다)
//autowire가 by_type이면 싱글톤이다.


//Annotation
//<context:annotation-config/>
//=>이미 등록된 bean에 대해 annotation 활성화
//=>Bean을 등록해놓으면 @Autowired와 @Qualifier를 가져다 쓰겠다는 의미!
            
//@Autowired(필드, 생성자, setter에 붙일 수 있다)
//객체 타입을 통해 bean객체를 자동주입
//반드시 객체에 대한 bean에 대한 정의가 필요하다
//스프링 프레임워크가 클래스를 보고 타입에 맞게 Bean을 주입한다=>같은 타입이 없으면 이름(Name)을 확인한다
//@Autowired로 주입할 떄 같은 타입의 Bean이 여러 개 정의되어 있다면 구별못하기 때문에 이름이 있어야 한다.

//@Qualifier("이름")
//=>@Autowired로 주입할 때 같은 타입의 Bean이 여러 개 정의되어있다면 구별못하기 때문에 이름이 있어야한다

//@Value
//설정한 값을 주입할 수 있다
//생성자에 주입할 때, 타입변수들은 자동으로 주입되지만
//기본 자료형/문자열등은 설정해줘야 한다(@Value)

//@JSR-250 Annotation
//JSR-250: 자바 플랫폼 공통 어노테이션

//@PostConstruct : 생성자 호출 이후에 호출됨(자동)
//@PreDestroy : 객체 소멸되기 전에 호출(자동)
//@Resource : 이름을 기준으로 찾는다. 이름이 없으면 타입으로 찾는다
//@Resource(name="빈이름") : (@Autowired+@Qualifier와 같은 효과)
//@Component : 개발자가 직접 정의한 객체 클래스 자체를 빈 등록할 때 (이름을 부여 안하면 타입을 가져와서 등록 - 타입 같으면 주입)

//객체는 Beans.java에 모두 써준다

//@Bean: 같은 클래스 타입의 Bean을 여러개 등록할 경우
//		개발자가 클래스코드를 수정할 수 없는 경우
//@Component : 개발자가 클래스코드를 수정할 수 있는 경우

//@Resource : JSR에 있는 자바 기존의 어노테이션
//이름을 기준으로 찾는다. 이름이 없으면 타입으로 찾는다. 
//프레임워크에 종속적이지 않아 많이 사용한다.
//Bean을 생성해주며 싱글톤 패턴이 자동으로 적용된다.
//Jdk1.8까지만 지원 (아직까지 실무에서는 많이 쓰임)
//@Resource(name=”빈이름”) : @Autowired + @Qualifier와 같은 효과

//@Autowired : 스프링에서 등장한 어노테이션(스프링 이외의 프레임워크에서는 사용불가)
//Type이 일치하는지 찾고 객체를 자동으로 주입한다. 타입이 존재하지 않으면 이름이 일치하는 bean을 컨테이너에서 찾는다. 
//프레임워크에 종속적이다. 다른 프레임워크로 수정할 경우 다 바꿔줘야함
//Bean을 생성하며 싱글톤 패턴이 자동으로 적용된다.
//@Qualifier(“빈이름”)

//@Qualifier : 타입이 동일한 bean객체가 여러 개 있으면 Exception이 일어남
//(스프링이 어떤 bean을 주입해야 될지 모르기 때문)
//이럴 때, @Qualifier 사용 


//@Bean : 메소드 단위에서 개발자가 외부 라이브러리/ 정의하지 않은 객체를 유연하게 넘기기 위해 사용하는 어노테이션
//개발자가 직접 제어가 불가능한 외부 라이브러리 사용할 때
//메소드를 통해 반환되는 객체를 Bean으로 만든다
//@Configuration을 선언한 클래스 내부에서 사용한다

//@Component : 개발자가 직접 정의한 객체 클래스(인터페이스) 자체를 빈 등록할 때
//개발자가 직접 정의한 class를 빈으로 등록할 수 있게 만든다
//개발자가 작성한 class를 빈으로 만든다
//이름을 부여안하면 타입을 가져와서 등록
//타입을 통한 빈등록 (타입 같으면 주입)
//Component-scan: 
//빈으로 등록 될 준비를 마친 클래스들을 스캔하여, 빈으로 등록해주는 것이다.
//@Controller, @Service, @Component, @Repository 어노테이션을 붙인 클래스들이 빈으로 등록 될 준비를 한 것이다.

//=============================================================
//@AOP(Aspect Oriented Programming)
//관점 지향 프로그래밍(재사용성에 유리_유지보수측면에서 유리) //di는 결합도를 낮추고
//하나의 프로그램을 관심사라는 단위로 분리하여 관리하는 개념
//보안, 트랜젝션 등 사용됨
//스프링 프레임워크가 어떤 메소드가 호출되는지 관심있게 지켜보다가 특정메소드가 호출되면 자동으로 
//메소드 전/후에 다른 메소드가 호출될 수 있도록 한다.

//Aspect : 흩어진 관심사를 모듈화 한 것. 
//Target : Aspect를 적용하는 곳. 클래스, 메서드
//Advice : 실질적으로 어떤 일을 해야 할 지에 대한 것, 실질적인 부가기능을 담은 구현체 (=>advisor)
//Join Point : Advice가 적용될 위치 혹은 끼어들 수 있는 시점. 메서드 진입 시점, 생성자 호줄 시점, 필드에서 꺼내올 시점 등 끼어들 시점을 의미. 참고로 스프링에서 Join Point는 언제나 메서드 실행 시점을 의미
//before : 비지니스 메소드 실행 전에 Advice 메소드 실행
//after-returning : 비지니스 메소드가 성공적으로 리턴되면 Advice 메소드 동작. 즉 비지니스 메소드가 성공적으로 실행되었을 경우에만 Advice 메소드 동작 
//after-throwing: 비지니스 메소드 실행중 예외가 발생할 경우 Advice 메소드 실행. 즉 비지니스 메소드가 실행에 실패했을 경우에만 Advice 메소드 실행 
//after : 비지니스 메소드의 성공 실패와 상관없이 비지니스 메소드 실행 후 무조건 Advice 메소드 동작 
//around : 비지니스 메소드 실행 전과 실행 후 Advice 메소드 동작하는 형태


//==============================================================
//스프링 레거시
//@Controller – 해당 클래스의 인스턴스를 스프링의 빈으로 등록하고 컨트롤러로 사용
//:<component-scan>과 같이 활용 
//:해당클래스가 controller임을 나타내기 위한 작업
//@RequestMapping – 특정한 URI에 대한 처리를 해당 컨트롤러나 메서드에서 처리
//:URL을 컨트롤러의 메소드와 매핑할 때 사용하는 어노테이션
//:요청에 대해 어떤 controller, 어떤 메소드가 처리될지를 매핑하는 어노테이션
//@RequestParam
//:변수명과 파라미터명이 같을 경우 주입 받음
//:파라미터 데이터를 직접 주입받을 수 있다.
//(value:파라미터명과 변수명이 다를경우 이름을 지정할 수 있다.)
//(required=false)지정된 이름의 파라미터가 없을 경우 null이 주입됨
//@PathVariable
//:데이터가 요청 주소에 있을 경우 값을 주입 받음
//요청주소/값1/값2..

</script>
</body>
</html>