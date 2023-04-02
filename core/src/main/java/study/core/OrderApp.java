package study.core;

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
        AppConfig appConfig=new AppConfig();
        MemberService memberService = appConfig.memberService();
        memberService.join(member);
        OrderService orderService= appConfig.orderService();
        Order order =orderService.createOrder(1L,"포켓몬빵",3500);
        System.out.println(order);
        System.out.println(order.calculatePrice());

    }
}
