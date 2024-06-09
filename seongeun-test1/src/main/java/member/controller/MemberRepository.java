package member.controller;

import member.model.vo.Member;
import member.run.Run;

import java.util.ArrayList;

public class MemberRepository {
    private final ArrayList<Member> memberList = new ArrayList<>(10);



    public void insertMember(Member m) throws OverMemberException{
        if(memberList.size() < 10) {
            memberList.add(m);
        } else {
            throw new OverMemberException();
        }

    }


    public void printData() {
        for(Member member : memberList) {
            member.calculateInterest();
        }

    }
}
