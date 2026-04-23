# Java 21 Study

Java 21 기초부터 DB 연동까지 단계별로 학습한 스터디 레포지토리입니다.

## 프로젝트 구성

| 프로젝트 | 내용 |
|---|---|
| [HelloTest](./HelloTest) | Java 21 기초 문법 |
| [JdbcTest](./JdbcTest) | JDBC를 이용한 DB 연동 |
| [MyBatisTest](./MyBatisTest) | MyBatis를 이용한 DB 연동 |

---

## HelloTest

Java 21 기초 문법 전반을 학습합니다.

| 패키지 | 주제 |
|---|---|
| exam01_기본형 | int, float, char, boolean |
| exam02_변수 | 변수 선언, 상수, 인스턴스 변수 |
| exam03_데이터형변환 | 묵시적 / 명시적 형변환 |
| exam04_연산자 | 산술, 대입, 비교, 논리, 증감, 3항 연산자 |
| exam05_scanner | Scanner 입력 |
| exam06_제어문 | if, switch, for, while, do-while, break, continue |
| exam07_배열 | 1차원/2차원 배열, Arrays 유틸리티 |
| exam08_Random | Random 클래스 |
| exam09_class | 클래스, 생성자, this |
| exam10_method | 메서드, call by value, 가변인자 |
| exam11_static | static 변수/메서드, 스택/블록 |
| exam12_상속 | 상속, super, 오버라이딩, 다형성, 동적 타이핑 |
| exam13_추상클래스 | 추상 클래스 |
| exam14_인터페이스 | 인터페이스, tight/loose coupling |
| exam15_익명클래스 | 익명 클래스 |
| exam16_람다표현식 | 람다 표현식 |
| exam17_유틸리티 | String, StringBuilder, Date, Calendar, LocalDate, Enum, Singleton |
| exam18_예외처리 | try-catch, 사용자 정의 예외 |
| exam19_제네릭스 | 제네릭스, extends/super |
| exam20_컬렉션API | ArrayList, HashMap, HashSet |
| exam21_함수적인터페이스 | Consumer, Supplier, Function, Predicate, Operator, 메서드 참조 |
| exam22_StreamAPI | Stream 생성, 중간처리, 최종처리, Optional |

---

## JdbcTest

JDBC를 직접 사용하여 Oracle DB와 연동하는 방법을 학습합니다.

| 패키지 | 주제 |
|---|---|
| exam1 | JDBC 기본 CRUD (Insert, Select, Update, Delete, Transaction) |
| exam2_select | DAO / Service 패턴으로 Select 구현 |
| exam2_insert | DAO / Service 패턴으로 Insert 구현 |
| exam2_update | DAO / Service 패턴으로 Update 구현 |
| exam2_delete | DAO / Service 패턴으로 Delete 구현 |
| exam2_finalproject | CRUD 통합 프로젝트 |
| workshop1 | Student CRUD 실습 |

---

## MyBatisTest

MyBatis 프레임워크를 사용하여 DB 연동을 학습합니다.

| 패키지 | 주제 |
|---|---|
| com/config | SqlSessionFactory 설정 |
| com/dto | DeptDTO |
| DeptMain | MyBatis CRUD 실행 |

---

## 개발 환경

- Java 21
- Eclipse IDE
- Oracle DB
- MyBatis
