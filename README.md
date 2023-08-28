## Inflearn

<img src="https://github.com/JHyun0302/server/assets/60764632/24cec8a1-ddb4-42c4-8e5b-2ff8d8fe6f49"  width="600" height="300"/>

### 강의명 : [스프링 부트 - 핵심 원리와 활용](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8-%ED%95%B5%EC%8B%AC%EC%9B%90%EB%A6%AC-%ED%99%9C%EC%9A%A9)

- 지식공유자 : 김영한

### 강의 내용

- 스프링 부트가 제공하는 5가지 핵심 기능
    1. 내장 서버
    2. 자동 라이브러리 관리
    3. 자동 구성
    4. 외부 설정
    5. 모니터링 & 관리 기능

- 정리 : `spring boot` 시작
    - 빌드와 배포
        - 일반 Jar : Jar 파일 생성 시 Jar 파일 중복 불가
            - 외부 라이브러리 추가 불가능
        - Fat Jar : Jar 파일 생성 시 외부 라이브러리 `.class` 형태로 추가
            - 단점 1 : 어떤 라이브러리가 포함되어 있는지 확인 어렵
            - 단점 2 : 파일명 중복 해결 불가
        - Executable Jar : `스프링 부트`에서 새롭게 정의한 Jar
            - Fat Jar 단점 모두 보완
            - 실행 과정
                1. `java -jar xxx.jar `
                2. `MANIFEST.MF ` 인식 (메인 메서드 실행하는 파일)
                3. `JarLauncher.main() ` 실행
                    - `BOOT-INF/classes/ ` 안에 있는 jar 파일 읽음 (외부 라이브러리)
                    - `BOOT-INF/lib/ `  안에 있는 jar 파일 읽음 (외부 라이브러리)
                4. `BootApplication.main() ` 메인 메서드 실행