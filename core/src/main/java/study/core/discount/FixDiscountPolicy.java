package study.core.discount;

import org.springframework.stereotype.Component;
import study.core.member.Grade;
import study.core.member.Member;

@Component
public class FixDiscountPolicy implements DiscountPolicy{

    int discountFixAccount=1000;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP){
            return discountFixAccount;
        }
        else{
            return 0;
        }
    }
}
