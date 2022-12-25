package com.example.demo.controller;

import com.example.demo.entity.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ThymeleaftController {

    @GetMapping("show")
    public String showView(Model model) {
        // Entity 생성
        Member member = new Member(1, "오준석");

        // 컬렉션 저장용 멤버 생성
        Member member1 = new Member(10, "홍길동");
        Member member2 = new Member(20, "김영희");

        // List 생성
        List<String> directionList = new ArrayList<String>();
        directionList.add("동");
        directionList.add("서");
        directionList.add("남");
        directionList.add("북");

        // Map 생성
        Map<String, Member> memberMap = new HashMap<>();
        memberMap.put("hong", member1);
        memberMap.put("kim", member2);

        // List Member
        List<Member> memberList = new ArrayList<>();
        memberList.add(member1);
        memberList.add(member2);

        // Model에 값 추가
        model.addAttribute("hello", "Hello World");
        model.addAttribute("mb", member);
        model.addAttribute("list", directionList);
        model.addAttribute("map", memberMap);
        model.addAttribute("members", memberList);

        //반환 값으로 뷰 이름을 설정
        return "useThymeleaf";
    }

    @GetMapping("a")
    public String showA() {
        return "pageA";
    }

}
