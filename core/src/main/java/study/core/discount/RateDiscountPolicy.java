package study.core.discount;

import study.core.member.Grade;
import study.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {
    int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}

