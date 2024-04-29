package com.ohracleLand.controller;

import com.ohracleLand.model.dto.UserDTO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SignManager {

    public long nonMemberIdx = 0;
    public UserDTO loginUser;

    public List<UserDTO> userList;
    public BufferedReader br;

    public UserDTO test() throws IOException {

        userList = new ArrayList<>();

        br = new BufferedReader(new InputStreamReader(System.in));

        int menuIdx = 0;

        while (true) {
            String userId = null;
            String userPwd = null;
            String userName = null;

            System.out.println("\n\n 안녕하세요. 어트랙션 애플리케이션입니다");
            System.out.println("사용할 메뉴를 선택해주세요");
            System.out.println("1. 로그인, 2: 비회원 로그인, 3: 회원가입");

            menuIdx = Integer.parseInt(br.readLine());

            if (menuIdx == 1) {
                if(!signIn()) continue;
                break;
            } else if ( menuIdx == 2 ) {
                bsignIn();
                break;
            } else if ( menuIdx == 3 ) {
                if(!signUp()) continue;
            }

        }

        System.out.println("\n[" + loginUser.getName() + "] 님 환영합니다. 로그인이 완료되었습니다.");

//        br.close();
        return loginUser;
    }

    public boolean signIn () throws IOException{
        String userId = null;
        String userPwd = null;

        System.out.println("\n1. 로그인을 선택했습니다.");
        System.out.println("아이디와 비밀번호를 입력하세요");

        System.out.print("[아이디] : ");
        userId = br.readLine();
        System.out.print("[비밀번호] : ");
        userPwd = br.readLine();

        UserDTO user = userValidCheck(userId, userPwd);
        if (user == null) {
            System.out.println("아이디와 패스워드가 틀렸습니다.");
            return false;
        }

//        loginUser = user;
        loginUser = new UserDTO(user.getId(), user.getPwd(), user.getName());

        return true;
    }

    public void bsignIn() {
        System.out.println("\n2. 비회원 로그인을 선택했습니다.");
        nonMemberIdx++;
        loginUser = new UserDTO ("tmpuser" + nonMemberIdx, "", "임시회원");
    }

    public boolean signUp() throws IOException {
        String userId = null;
        String userPwd = null;
        String userName = null;

        System.out.println("\n3. 회원가입을 선택했습니다.");
        System.out.println("회원가입을 위해 아래의 정보를 입려해 주세요.");
        System.out.print("[아이디] : ");
        userId = br.readLine();
        System.out.print("[비밀번호] : ");
        userPwd = br.readLine();
        System.out.print("[이름] : ");
        userName = br.readLine();

        if (isDupleId(userId)) {
            System.out.println("\n아이디가 이미 존재합니다. (중복)");
            return false;
        }

        UserDTO user = new UserDTO(userId, userPwd, userName);
        userList.add(user);

        System.out.println("\n회원가입이 완료되었습니다");
        return true;
    }



    public UserDTO userValidCheck (String userId, String userPwd) {

        if (userList.isEmpty()) return null;

        for (UserDTO tmp : userList) {
            String tmpId = tmp.getId();
            String tmpPwd = tmp.getPwd();

            if (tmpId.equals(userId) && tmpPwd.equals(userPwd)) {
                return tmp;
            }
        }

        return null;
    }

    public boolean isDupleId(String inputId) {

        for ( UserDTO user : userList) {
            String userId = user.getId();

            if ( userId.equals(inputId) ) return true;
        }

        return false;
    }

}
