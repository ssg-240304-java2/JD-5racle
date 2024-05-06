package com.ohracleLand.view;

public class VoicePrinter {

    public void Page(String msg) {
        switch (msg) {

            case "delet" : System.out.println("삭제되었습니다.");
                break;
            case "update" :
                System.out.println("수정되었습니다.");
                break;
        }

    }
}
