package com.ohracleLand.view;

import com.ohracleLand.controller.SignManager;
import com.ohracleLand.model.dto.LostAndFoundDTO;

import java.util.Date;
import java.util.Scanner;

public class InputLostAndFound { // Scanner 쓰는 애들? 모음집
    Scanner scanner = new Scanner(System.in);
    LostAndFoundDTO lostDTO;
    SignManager user = new SignManager();




    public LostAndFoundDTO addLost(){ // 게시글 등록
        System.out.println("등록할 분실물 내용을 입력하세요.");
        System.out.print("분실물 : ");
        String item = scanner.nextLine();
        System.out.print("분실 위치 : ");
        String location = scanner.nextLine();
        System.out.print("분실물 특징 : ");
        String feature = inputFeature();
        lostDTO = new LostAndFoundDTO();
        lostDTO.setLostNo(LostAndFoundDTO.lostListNo++);
        lostDTO.setLostTitle(item + "을(를) 찾습니다.");
        lostDTO.setLostWriter("***님");
        lostDTO.setLostLocation(location);
        lostDTO.setLostItem(item);
        lostDTO.setLostFeature(feature);

        return lostDTO;
    }

    public String searchItem(){ // 검색을 위한 분실품 입력
        System.out.print("분실물의 종류를 입력하세요 : ");
        String result = scanner.nextLine();
        return result;
    }

    public String searchLocation(){ // 검색을 위한 분실 장소 입력
        System.out.print("분실하신 위치를 입력하세요(ex. 회전목마) : ");
        return scanner.nextLine();
    }

    public String inputFeature(){ // 등록 or 검색을 위한 특징 입력
        String feature = "";
        System.out.println("분실물의 특징을 입력해주세요(완료 = '.' + enter)");
        while (true) {
            String temp = scanner.nextLine();
            if (!temp.contains(".")) {
                feature += temp + " ";
            } else {
                if(feature.contains(",  ")){
                    feature = feature.replace(",  ", ", ");
                }
                if (feature.contains("  ")){
                    feature = feature.replace("  ", " ");
                }
                feature += temp.substring(0,temp.length()-1); // 마지막에 .은 빼고
                return feature;
            }
        }
    }
}
