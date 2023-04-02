package study.core;

import org.junit.jupiter.api.Test;
import study.core.discount.FixDiscountPolicy;
import study.core.member.Grade;
import study.core.member.Member;
import study.core.member.MemberRepository;
import study.core.member.MemoryMemberRepository;
import study.core.order.Order;
import study.core.order.OrderService;
import study.core.order.OrderServiceImpl;

public class OrderServiceImplTest {


    @Test
    void createOrder(){
        MemberRepository memberRepository=new MemoryMemberRepository();
        memberRepository.save(new Member(1L, "최승호", Grade.VIP));
        OrderService orderService=new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
        Order order =orderService.createOrder(1L,"t",10000);


    }
}
