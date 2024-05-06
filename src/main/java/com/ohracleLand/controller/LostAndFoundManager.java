package com.ohracleLand.controller;

import com.ohracleLand.model.dto.LostAndFoundDTO;
import com.ohracleLand.view.InputLostAndFound;
import com.ohracleLand.view.LostAndFoundMenu;
import com.ohracleLand.view.PrintLostAndFound;

import java.util.ArrayList;


public class LostAndFoundManager {

    LostAndFoundDTO lostDTO = new LostAndFoundDTO();
    InputLostAndFound input = new InputLostAndFound();
    LostAndFoundMenu Menu = new LostAndFoundMenu();
    PrintLostAndFound print = new PrintLostAndFound();
    public static ArrayList<LostAndFoundDTO> lostList = new ArrayList<>();
    

    

    public void setTest(){
        lostDTO = new LostAndFoundDTO();
        lostDTO.setLostNo(LostAndFoundDTO.lostListNo++);
        lostDTO.setLostTitle("핸드폰" + "을(를) 찾습니다.");
        lostDTO.setLostWriter("분실물 센터");
        lostDTO.setLostLocation("회전목마");
        lostDTO.setLostItem("핸드폰");
        lostDTO.setLostFeature("갤럭시24" +
                "하얀색, 액정에 기스");
        lostList.add(lostDTO);

        lostDTO = new LostAndFoundDTO();
        lostDTO.setLostNo(LostAndFoundDTO.lostListNo++);
        lostDTO.setLostTitle("지갑" + "을(를) 찾습니다.");
        lostDTO.setLostWriter("분실물 센터");
        lostDTO.setLostLocation("바이킹");
        lostDTO.setLostItem("지갑");
        lostDTO.setLostFeature("구찌, 갈색, 현금100만원 들어있음");
        lostList.add(lostDTO);

        lostDTO = new LostAndFoundDTO();
        lostDTO.setLostNo(LostAndFoundDTO.lostListNo++);
        lostDTO.setLostTitle("신용카드" + "을(를) 찾습니다.");
        lostDTO.setLostWriter("분실물 센터");
        lostDTO.setLostLocation("화장실");
        lostDTO.setLostItem("신용카드");
        lostDTO.setLostFeature("농협카드 " +
                "초록색 " +
                "카드에 dancing queen 써있음");
        lostList.add(lostDTO);

        lostDTO = new LostAndFoundDTO();
        lostDTO.setLostNo(LostAndFoundDTO.lostListNo++);
        lostDTO.setLostTitle("노트북" + "을(를) 찾습니다.");
        lostDTO.setLostWriter("분실물 센터");
        lostDTO.setLostLocation("식당가");
        lostDTO.setLostItem("노트북");
        lostDTO.setLostFeature("M3 프로 " +
                "미드나잇 블루, 스티커 많음, 비쌈");
        lostList.add(lostDTO);

        lostDTO = new LostAndFoundDTO();
        lostDTO.setLostNo(LostAndFoundDTO.lostListNo++);
        lostDTO.setLostTitle("여자친구" + "을(를) 찾습니다.");
        lostDTO.setLostWriter("분실물 센터");
        lostDTO.setLostLocation("인생");
        lostDTO.setLostItem("여자친구");
        lostDTO.setLostFeature("한 번도 본적 없음, " +
                "단발이었음 좋겠다.");
        lostList.add(lostDTO);

        lostDTO = new LostAndFoundDTO();
        lostDTO.setLostNo(LostAndFoundDTO.lostListNo++);
        lostDTO.setLostTitle("오백원" + "을(를) 찾습니다.");
        lostDTO.setLostWriter("분실물 센터");
        lostDTO.setLostLocation("화장실");
        lostDTO.setLostItem("오백원");
        lostDTO.setLostFeature("1988년도 생산, 광이 반짝반짝함");
        lostList.add(lostDTO);

        lostDTO = new LostAndFoundDTO();
        lostDTO.setLostNo(LostAndFoundDTO.lostListNo++);
        lostDTO.setLostTitle("키보드" + "을(를) 찾습니다.");
        lostDTO.setLostWriter("분실물 센터");
        lostDTO.setLostLocation("회전목마");
        lostDTO.setLostItem("키보드");
        lostDTO.setLostFeature("로지텍꺼, 블랙, 비쌈, 쌔삥");
        lostList.add(lostDTO);

        lostDTO = new LostAndFoundDTO();
        lostDTO.setLostNo(LostAndFoundDTO.lostListNo++);
        lostDTO.setLostTitle("마우스" + "을(를) 찾습니다.");
        lostDTO.setLostWriter("분실물 센터");
        lostDTO.setLostLocation("바이킹");
        lostDTO.setLostItem("마우스");
        lostDTO.setLostFeature("게이밍 마우스, 무지개색, 무소음");
        lostList.add(lostDTO);

        lostDTO = new LostAndFoundDTO();
        lostDTO.setLostNo(LostAndFoundDTO.lostListNo++);
        lostDTO.setLostTitle("컴퓨터" + "을(를) 찾습니다.");
        lostDTO.setLostWriter("분실물 센터");
        lostDTO.setLostLocation("대관람차");
        lostDTO.setLostItem("컴퓨터");
        lostDTO.setLostFeature("하이엔드 스펙, 초고가, 사용감 다수 있음");
        lostList.add(lostDTO);
    } // 임시로 분실물들 넣어 둠

    public void startLost() {
        setTest();
        while(true) {
            switch (Menu.LostMenu()){
                case 1 : // 전체 조회
                    print.allLost();
                    break;





                case 2 : // 검색 조회
                    showSearchLost();
                    break;
                case 3 : // 분실물 등록 하기
                    lostList.add(input.addLost());
                    break;
                case 0 : // 메인 메뉴로 돌아감
                    System.out.println("분실물 게시판을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }
    

    public void showSearchLost() { // 분실물 게시글 검색
        while (true) {
            int searchNum = Menu.searchLostMenu();
            switch (searchNum) {
                case 1 : // 분실물 종류 검색
                    print.itemSearch();
                    break;
                case 2 : // 분실 위치 검색
                    print.locationSearch();
                    break;
                case 3 : // 분실물 특징 검색
                    print.featureSearch();
                case 0 : // 이전 메뉴(분실물게시판메뉴) 돌아가기
                    return;
                default:
                    System.out.println("다시 선택해 주세요");
            }
        }
    }

}
