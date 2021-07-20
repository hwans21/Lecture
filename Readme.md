국비지원으로 배운 내용 정리하기
1. Java
2. DataBase
3. JSP
4. 팀프로젝트
5. Front_End
6. Spring

git방식
1. master - 완성된거 올리는 브랜치
2. develop - 작업할 브랜치
3. error - 에러를 해결하는 브랜치


문제점 발생
- 기존 develop브랜치에서 작업을 진행하다보니 
java이랑 spring이랑 같이 작업을 하다보니 
log가 섞여버려서 본래 정리하기 위한 목적을 잃어버림

develop브랜치에서 -java, DataBase, Jsp, Front_end, Spring 브랜치를 생성
		각 수업마다 브랜치를 변경해가며 작성하기
또한 기존에 작성한 브랜치들을 옮겨주기


※ gitflow
master : 제품으로 출시될 수 있는 브랜치
develop : 다음 출시 버전을 개발하는 브랜치
feature : 기능을 개발하는 브랜치
release : 이번 출시 버전을 준비하는 브랜치
hotfix : 출시 버전에서 발생한 버그를 수정 하는 브랜치
