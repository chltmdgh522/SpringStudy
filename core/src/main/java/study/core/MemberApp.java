package study.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.core.member.Grade;
import study.core.member.Member;
import study.core.member.MemberService;
import study.core.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        Member member = new Member(1L, "최승호", Grade.VIP);
        ApplicationContext ac =new AnnotationConfigApplicationContext(AppConfig.class);
        MemberService memberService = ac.getBean("memberService", MemberService.class);
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        System.out.println("new Member = " + member.getName());
        System.out.println("findMember.getGrade() = " + findMember.getName());

    }
}
