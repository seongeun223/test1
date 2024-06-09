package member.controller;

import member.model.vo.Buyable;
import member.model.vo.Gold;
import member.model.vo.Member;
import member.run.Run;

import java.util.ArrayList;

public class MemberRepository {
    private static final ArrayList<Member> memberList = new ArrayList<>(10);




    public static void insertMember(Member m) throws OverMemberException{
        if(memberList.size() < 10) {
            memberList.add(m);
        } else {
            throw new OverMemberException();
        }


    }


    public void printData() {
        for(Member member : memberList) {
            System.out.println(member.getGrade() + "등급 회원 " + member.getName() + "의 포인트는 " + member.getPoint() + "이고, 이자 포인트는 " + member.calculateInterest() +"입니다.");


        }

    }
    public void printBuyInfo(int price) {
        for(Member member : memberList) {
            System.out.println(member.getGrade() + "등급 회원 " + member.getName() + "는 " + price + "원 상품을 " + member.buy(price)+ "원에 구매합니다.");
        }

    }
}
