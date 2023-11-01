# DB
## SQL
- RDB: Relational Database
- 정해진 스키마에 따라 테이블에 데이터가 저장된다.
- 중복 데이터가 없다.
- MySQL, MsSQL, 오라클 등
## NoSQL
- SQL과 달리, 스키마와 관계가 없다.
- 한 컬렉션에 모든 데이터들이 저장된다.
- MongoDB, Redis 등
# ORM
- Object-Relational Mapping
- 객체와 DB의 테이블을 매핑해주는 기술
- Hibernate, EclipseLink, DataNucleus 등
# JPA
- Java Persistence Api
- 자바 애플리케이션에서 관계형 데이터베이스를 사용하는 방법을 정의한 자바 API
## 특징
- 객체-테이블 매핑
- 쿼리 언어 사용(JPQL)
- 엔티티 생명 주기 관리
- 캐싱
- 자동 스키마 생성
## Mapping
### 1:1
- @OneToOne
### 1:N
- @ManyToOne
### M:N
- 중간 객체/테이블을 사용하여 각각 @ManyToOne으로 연결해준다.
# Spring Data JPA
- JPA를 기반하여 데이터 접근 계층을 쉽게 구현할 수 있도록 해주는 Spring Framework
## 특징
- Repository 인터페이스
- 이름을 규칙에 따라 지으면 자동으로 SQL 쿼리를 생성하는 쿼리 메소드
- @Query
- 페이징, 정렬
- 트랜잭션 관리