# Java 21 Study

Java 21 기초부터 DB 연동까지 단계별로 학습한 스터디 레포지토리입니다.

## 프로젝트 구성

| 프로젝트 | 내용 |
|---|---|
| [HelloTest](#hellotest) | Java 21 기초 문법 |
| [JdbcTest](#jdbctest) | JDBC를 이용한 Oracle DB 연동 |
| [MyBatisTest](#mybatistest) | MyBatis 기초 – 단건/다중행 CRUD, XML 매퍼 |
| [MyBatisTest2](#mybatistest2) | MyBatis 심화 – foreach, 동적 SQL, RowBounds 페이징 |
| [MyBatisTest3](#mybatistest3) | MyBatis – resultMap 활용 |
| [MyBatisTest4](#mybatistest4) | MyBatis – JOIN (1:1 / 1:N 매핑) |
| [MyBatisTest5](#mybatistest5) | MyBatis – DAO / Service 패턴 통합 프로젝트 |

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
| exam2_insert | DAO / Service 패턴으로 Insert 구현 (중복 예외 처리 포함) |
| exam2_update | DAO / Service 패턴으로 Update 구현 |
| exam2_delete | DAO / Service 패턴으로 Delete 구현 (RecordNotFoundException 처리) |
| exam2_finalproject | CRUD 통합 프로젝트 (커스텀 예외 2종 포함) |
| workshop1 | Student CRUD 실습 |

---

## MyBatisTest

MyBatis 프레임워크를 이용한 기본 DB 연동을 학습합니다.

| 클래스 / 설정 | 주제 |
|---|---|
| com/config | SqlSessionFactory 설정, DeptMapper XML (다중 매퍼 파일 포함) |
| com/dto/DeptDTO | Dept 테이블 DTO |
| DeptMain | 단건 조회(DTO / Map 파라미터), 다중행 조회, Insert / Update / Delete, 동적 WHERE (`&lt;` 비교) |

---

## MyBatisTest2

MyBatis 동적 SQL과 페이징 처리를 학습합니다.

| 주제 | 내용 |
|---|---|
| `<foreach>` | 다중 Insert / 다중 Delete / 다중 Select (IN 절) |
| `<if>` / `<where>` | 조건부 SELECT, 조건부 UPDATE |
| `<choose>` | Java switch 분기에 해당하는 조건 분기 |
| RowBounds 페이징 | offset / limit 기반 페이징 처리 |

---

## MyBatisTest3

MyBatis ResultMap을 활용하여 컬럼명과 필드명이 다를 때 매핑하는 방법을 학습합니다.

| 주제 | 내용 |
|---|---|
| `resultType` vs `resultMap` | 컬럼명-필드명 자동 매핑 vs 명시적 매핑 |
| EmpMapper | findAll (resultType), findByResultMap (resultMap) |

---

## MyBatisTest4

MyBatis를 이용한 테이블 JOIN 결과 매핑을 학습합니다.

| 패키지 | 주제 |
|---|---|
| p1 | 1:1 JOIN – `EmpDTO` 내부에 `DeptDTO` 필드를 포함하는 association 매핑 |
| p2 | 1:N JOIN – `DeptDTO` 내부에 `List<EmpDTO>` 를 포함하는 collection 매핑 |

---

## MyBatisTest5

MyBatis + DAO / Service 패턴을 결합한 통합 프로젝트입니다.

| 클래스 | 역할 |
|---|---|
| DeptDAO | SqlSession을 이용한 DB 접근 |
| DeptService / DeptServiceImpl | 비즈니스 로직 분리 |
| DeptMain | Scanner 기반 콘솔 메뉴 (목록/추가/삭제/수정) |

---

## 개발 환경

- Java 21
- Eclipse IDE
- Oracle DB
- MyBatis 3.x
