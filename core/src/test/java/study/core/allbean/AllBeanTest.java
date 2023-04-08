package study.core.allbean;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import study.core.AutoAppConfig;
import study.core.discount.DiscountPolicy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllBeanTest {

    @Test
    void findAllBean(){
        ApplicationContext ac=new AnnotationConfigApplicationContext(AutoAppConfig.class, DiscountService.class);
        DiscountService discountService=ac.getBean(DiscountService.class);
    }


}

class DiscountService{
    private final Map<String,DiscountPolicy> policyMap;
    private final List<DiscountPolicy> policies;

    public DiscountService(Map<String, DiscountPolicy> policyMap, List<DiscountPolicy> policies) {
        this.policyMap = policyMap;
        this.policies = policies;
        System.out.println("policyMap = " + policyMap);
        System.out.println("policies = " + policies);
    }
}
