package study.core.scan;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import study.core.AutoAppConfig;
import study.core.member.MemberService;

import static org.assertj.core.api.Assertions.*;

public class AutoAppConfigTest {

    @Test
    public void basicScan(){
        ApplicationContext ac =new AnnotationConfigApplicationContext(AutoAppConfig.class);
        MemberService memberService=ac.getBean(MemberService.class);
        System.out.println("==============");

        assertThat(memberService).isInstanceOf(MemberService.class);

    }
}
