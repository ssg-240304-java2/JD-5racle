# JD-5racle

# 🎡 놀이공원 이용 프로그램

<br>

## 📉프로젝트 소개
* 개발기간 : 2024.04.25 - 2024.04.30 (6일)
* 사용자가 놀이공원의 서비스를 예약 및 게시판을 이용할 수 있는 프로그램입니다.

<br>

## 🧑‍💻팀원 구성

0. 이름 (깃허브닉네임)
1. 김진우 (wlsdn)
2. 장윤지 ()
3. 이창민 (l2chmnl)
4. 석현균 ()
5. 고경호 ()
6. 최승인 (Lucas-Choi-17)

<br>

## ⚙️ 개발 환경
* Develop : JAVA
* Version Constrol : Git
* Communicate : Slack, Notion

<br>

## 프로젝트 구조
```
JD-5racle
├── README.md
└── src/main/java/com/ohracleLand
      ├── controller
      |    ├── AttractionManager.java
      |    ├── LostAndFoundManager.java
      |    ├── NoticeManager.java
      |    ├── RestaurantManager.java
      |    └── SignManager.java
      ├── model
      |    ├── dto
      |    |    ├── AttractionDTO.java
      |    |    ├── AttractionReservationDTO.java
      |    |    ├── LostAndFoundDTO.java
      |    |    ├── NoticeDTO.java
      |    |    ├── RestaurantDTO.java
      |    |    ├── RestaurantReservationDTO.java
      |    |    └── UserDTO.java
      ├── run
      |    └── Application.java
      └──view
           ├── AttractionReservation.java
           ├── AttractionReservationMenu.java
           ├── InputLostAndFound.java
           ├── InputNotice.java
           ├── LostAndFoundMenu.java
           ├── MainMenu.java
           ├── PrintLostAndFound.java
           ├── RestaurantReservation.java
           └── RestaurantReservationSelect.java
```

<br>

## 📋역할 분담

#### 김진우
* 회원가입 및 로그인
  1. 회원가입 기능
     1-1. 중복ID 확인
  2. 로그인 기능
  3. 비회원 로그인 기능
     3-1. 비회원으로 로그인시 임시 ID 및 임시로 NAME 설정

#### 장윤지
* 기능
  1. 내용
  2. 

#### 이창민
* 분실물 게시판
  1. 분실물 게시판 전체 조회 기능
  2. 분실물 게시판 검색 조회 기능
     - 분실물로 검색
     - 분실 위치로 검색
     - 분실물 특징으로 검색
  4. 분실물 등록 기능

#### 석현균
* 기능
  1. 내용
  2. 

#### 고경호
* 기능
  1. 내용
  2. 

#### 최승인
* 놀이기구 예약 기능 개발
  1. 놀이기구 DTO 생성
  2. 놀이기구 예약 기능
  3. 놀이기구 예약 목록 조회 및 예약 취소

<br>
 
## 📕 프로젝트 후기

#### 김진우
* 자바를 공부해왔지만 실제 프로젝트 단계에서 이론으로 공부했던 대부분의 원칙들이 떠오르지 않았습니다.
  책으로 읽히는 이론적인 면도 중요하지만, 무엇보다도 직접 경험 해보는게 가장 중요하다고 생각합니다.
  함수를 만들고, 객체를 만들면서 어렵고 실수도 많았지만 그 경험들을 통해 더 성장했다는 것이 느껴졌습니다.
  실수를 두려워하지 말고 계속 부딪혀 나가면 더 많을 것을 얻을 수 있다고 생각합니다.
  프로젝트를 통해 개인의 성장도 좋지만 팀원들과 대화하면서 같이 협업하여 모르는 것이 있으면 물어보고
  아는게 있으면 공유하면서 같이 공부해 나가는 모습으로 서로 발전해 다음 프로젝트에서 조금 더 성장한
  모습을 보여드리겠습니다.

#### 장윤지
* 후기

#### 이창민
```
* 처음으로 합을 맞춰 보았는데 팀원분들의 기대에 미치지 못한 것 같아서 죄송한 마음입니다. 점차 발전하는 모습 보여드리겠습니다.
아직 많이 남았으니까 다같이 화이팅 하고 싶습니다!
```

#### 석현균
* 후기

#### 고경호
* 후기

#### 최승인
* 인원수가 많다는 것이 분업을 효율적으로 할 수 있고, 이로 따라 개인이 부담해야 하는 부분이 적다는 장점으로 다가왔습니다.
* 하지만 많은 인원이 한 프로젝트를 진행하기 때문에 코드 충돌이 빈번하게 발생할 수 있다는 단점 또한 명확했습니다. 이를 통해 지속적인 버전 최신화의 중요성을 깨닫고, 수시로 생성되는 pull request를 빠르게 처리해 주어야 다른 사람들이 최신화된 코드로 작업할 수 있어, 꾸준히 Github를 확인하는 것도 중요하다는 것을 깨닫게 되었습니다.
* 앞으로는 코드 충돌을 두려워하지 않도록 이후 프로젝트에서는 꾸준히 최신화하며 작업하는 것을 습관화하고, 충돌 코드를 더욱 원활하게 처리하는 법을 익힐 수 있도록 추가적인 공부가 필요하다고 생각했습니다.
* 이번 프로젝트에서는 이전에 비해 시간을 많이 할애할 수 없었는데, 추후 있을 프로젝트에서는 더욱더 적극적으로 참여할 수 있도록 하겠습니다.


