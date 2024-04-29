package com.ohracleLand.view;

import com.ohracleLand.model.dto.LostAndFoundDTO;

import static com.ohracleLand.controller.LostAndFoundManager.lostList;

public class PrintLostAndFound {

    InputLostAndFound input = new InputLostAndFound();
    private int check;

    public void allLost(){ // 모든 분실물 게시글 출력
        for (LostAndFoundDTO lostDTO : lostList) {
            System.out.println(lostDTO);
        }
    }

    public void itemSearch(){ // 분실물로 검색해 출력
        check = 0;
        String searchItem = input.searchItem();
        for (int i = 0; i < lostList.size(); i++) {
            if (lostList.get(i).getLostItem().contains(searchItem)) {
                System.out.println(lostList.get(i));
                check++;
            }
        }
        if (check == 0) {
            System.out.println("일치하는 품목이 없습니다.");
        }
    }

    public void locationSearch(){ // 분실 장소로 검색해 출력
        check = 0;
        String searchLocation = input.searchLocation();
        for (int i = 0; i < lostList.size(); i++) {
            if (lostList.get(i).getLostLocation().contains(searchLocation)) {
                System.out.println(lostList.get(i));
                check++;
            }
        }
        if (check == 0) {
            System.out.println("일치하는 장소가 없습니다.");
        }
    }


    public void featureSearch(){
        check = 0;
        String searchFeature = input.inputFeature();
        for (int i = 0; i < lostList.size(); i++){
            if (lostList.get(i).getLostFeature().contains(searchFeature)){
                System.out.println(lostList.get(i));
                check++;
            }
        }
        if (check == 0){
            System.out.println("일치하는 특징이 없습니다.");
        }
    }
}
