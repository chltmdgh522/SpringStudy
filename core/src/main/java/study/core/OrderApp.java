package study.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.core.member.Grade;
import study.core.member.Member;
import study.core.member.MemberService;
import study.core.member.MemberServiceImpl;
import study.core.order.Order;
import study.core.order.OrderService;
import study.core.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        Member member =new Member(1L,"최승호", Grade.VIP);
        ApplicationContext ac =new AnnotationConfigApplicationContext(AppConfig.class);

        MemberService memberService = ac.getBean("memberService", MemberService.class);
        memberService.join(member);
        OrderService orderService=  ac.getBean("orderService", OrderService.class);
        Order order =orderService.createOrder(1L,"포켓몬빵",3500);
        System.out.println(order);
        System.out.println(order.calculatePrice());

    }
}
