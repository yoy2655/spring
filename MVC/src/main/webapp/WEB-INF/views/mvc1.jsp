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
MVC�� Model, View, Controller
���� ���� ����ϴ� ���� �������� ���񽺸� ���� �� �κ��� �и��ظ����
�̸� ���� ���� �� (���� ������ ȿ������ ���̴� ���� ����
                    =>DI
Model : �����͸� �����ϴ� �κ�
View :  ���� ���̴� �κ��� �����ϴ� �κ�
Controller : ��û�� ���� �ڵ� �帧�� �����ϴ� �κ�


3tier : ���Ӱ���
���� - controller - service - dao - mapper


Bean ����
@bean : �޼��带 ���� ��ȯ�ϴ� ��ü�� Bean���� ���
@Component : �����ڰ� ���� Ŭ������ ��ü�� �����Ͽ� Bean���� ��� -> @ComponentScan���
@Comtroller : Component�� �������� ����ڿ�û�� ���� �ڵ����� ȣ��
�Ǵ� �޼��带 ������ �ִ� Bean�� ���-> @ComponentScan ���
@RestController : Component�� �������� ����� ��û�� ���� �ڵ�����
ȣ��Ǵ� �޼��带 ������ �ִ� Bean�� ���. Restfult API ���� ���� �� ���
(json.xml���� ������ �ѱ�µ� ���)

@ControlelrAdvice : ���ܰ� �߻����� �� ����� Global ExceptionHandler�� ����� Bean�� ���
@Seirvice : Controller���� ȣ���ϴ� �޼��带 ������ �մ� Bean�� ����. @Complonent�� ������ Bean�� ���̴� ����
(�׳� ����ϴ� �۾�) -> @ComponentScan���
@Repository: @Service�� ������ Bean���� ȣ���ϴ� �޼��带 ������ �ִ� Bean�� ����. 
�� Bean�� �����ͺ��̽��� ���õ� �۾��� ����. @Component�� ������ Bean�� ���̰� ����. -> @ComponentScan���

(�������Ʈ: https://blog.naver.com/noda21/222981049200)
������ mvc 3tier->�������� ������ (���������� ����Ǿ� �ֱ� ������)
Presentation - Business - Persistence
(ȭ��)	   (����Ͻ�����) (����or������ ����)           
Presentation : ȭ�鿡 �����ִ� ����� ����ϴ� ����
Business: ���� �䱸�ϴ� ������ ��Ȯ�� ����ϴ� ���� (��Ʈ�ѷ� ����, ���� ����)
Persistence: �����͸� ��� ������� ����ϴ°� ������ ����(DAO ����)

1)Controller: Ŭ���̾�Ʈ ��û�� ���� ��, �ش� ��û�� ������ ����Ͻ� ������ (����)�Ѵ�.
����Ͻ� ����: ����ڿ��� �������� �ʴ� �κп��� (�����͸� ó��)�ϴ� �ڵ�

2)Service: ����Ͻ� ������ (ó��)�ϴ� �ڵ�
request->controller->service

3)DAO(Data Access Object): DB���� ��ü, CRUD�۾��� ó���� =>ȿ������ Ŀ�ؼ� ������ ���Ͽ� �����(����ϴ� ����
:�Ź� �����ؼ� ���������� ���� Ŀ�ؼ��� �߻��ϰ� ��)-> DBCP���� -> 3tier ����
4)DTO(Data Transfer Object) = JavaBeans���ϰ� ����, �����͸� �����ϰ� �����ٰ� ���� ���� �۾�(�ʵ�,����,����)
5)VO(Value Object)



</body>
</html>