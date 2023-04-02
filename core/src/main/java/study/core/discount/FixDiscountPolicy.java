package study.core.discount;

import study.core.member.Grade;
import study.core.member.Member;

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
