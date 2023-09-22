# 1. HTTP
- HyperText Transfer Protocol
- 서로 다른 시스템들 사이에서 통신을 주고 받게 해주는 application 계층의 protocol
## 특징
1. Transfer layer에서 동작
2. 비연결성
3. stateless
## HTTP Method
- POST
- GET
- DELETE
- PUT
- PATCH 
등등 
## HTTP 상태코드
### 1xx (Informational): 요청이 수신되어 처리중
### 2xx (Successful): 요청 정상 처리
- 200 : 클라이언트의 요청을 정상적으로 수행함
- 201 : 클라이언트가 어떠한 리소스 생성을 요청, 해당 리소스가 성공적으로 생성됨(POST를 통한 리소스 생성 작업 시)
- 204 : 클라이언트가 어떠한 리소스 삭제를 요청, 해당 리소스가 성공적으로 삭제됨
### 3xx (Redirection): 요청을 완료하려면 추가 행동이 필요
### 4xx (Client Error): 클라이언트 오류, 잘못된 문법등으로 서버가 요청을 수행할 수 없음
- 400 : 클라이언트의 요청이 부적절 할 경우 사용하는 응답 코드
- 401 : 클라이언트가 인증되지 않은 상태에서 보호된 리소스를 요청했을 때 사용하는 응답 코드
- 403 : 유저 인증상태와 관계 없이 응답하고 싶지 않은 리소스를 클라이언트가 요청했을 때 사용하는 응답 코드
- 404 : 클라이언트가 요청한 리소스에서는 사용 불가능한 Method를 이용했을 경우 사용하는 응답 코드
### 5xx (Server Error): 서버 오류, 서버가 정상 요청을 처리하지 못함
- 500 : 서버에 문제가 있을 경우 사용하는 응답 코드
- 502 : 게이트웨이 오류

# 2. HTTPS와 HTTP
## HTTPS
- **H**yper**T**ext  **T**ransfer  **P**rotocol over  **S**ecure Socket Layer
- **HTTP over  TLS**
- **HTTP over SSL**
- **HTTP Secure**
- HTTP의 보안 버전
# 3. 아래 API에 대한 RESTful한 URI를 설계하라.

	- 이벤트 목록 조회
	GET /events
	
	- 이벤트 조회
	GET /events/{eventId}
	
	- 이벤트 등록
	POST /events
	
	- 이벤트 수정
	PUT /events/{eventId}
	
	- 이벤트 삭제
	DELETE /events/{eventId}
	
	- 이벤트 상태 변경
	PATCH /events/{eventId}
	
	- 특정 이벤트의 주문 목록 조회
	GET /evetns/{eventId}/orders
	
	- 멤버 목록 조회
	GET /members
	
	- 특정 멤버 권한 변경
	PATCH /members/{memberId}
	
	- 특정 멤버 정보 조회
	GET /members/{memberId}
	
	- 특정 멤버 정보 변경
	PUT /members/{memberId}
	
	- 멤버 등록
	POST /members