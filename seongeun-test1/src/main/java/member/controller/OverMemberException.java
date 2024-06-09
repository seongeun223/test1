package member.controller;

public class OverMemberException extends Exception{

    public OverMemberException() {
        super("Member List is full");
    }
}
