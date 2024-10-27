# WebMidtermProject
- 데이터베이스 연결
- 기본 페이지, 공지사항 페이지, 로그인 모달, 회원가입 페이지 완성 
- 아이디/비밀번호 찾기 페이지 완성
- 기본 페이지로 돌아가는 방식 변경 -> home.html을 새 창으로 여는 것 대신 현재 창을 닫음
- 공지사항 등록 페이지 완성 / User, BaseEntity, Notice entity 작성 / PageRequestDTO, PageResultDTO 추가 및 NoticeDTO 작성
- 공지사항 페이지 수정
- 공지사항 조회 페이지 완성
- service 계층 작성 시작 및 공지사항 관련 페이지들 수정
- 공지사항 페이지 기능 구현 완료, 테스트 성공
- 공지사항 페이지 기능 연결 시작
1. list.html은 접속이 되지만 공지사항 등록 페이지로 넘어갈 수 있는 것 빼고는 어떤 기능도 실행 불가
2. 조회는 정상적으로 됨. RegDate가 나오지 않음 - 데이터베이스에도 null로 입력됨. 날짜를 함께 저장하는지 확인 필요
3. Search, Cancel btn 이벤트 추가 필요
4. 페이징 처리에 있어서 PREV, NEXT가 나오지 않고 있음

** 공지사항 등록에 있어서 username을 직접 입력해야 함 - 등록 되는지 확인 필요
** 공지사항 페이지 기능 연결하기
