package study.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;
import study.core.member.MemberRepository;
import study.core.member.MemoryMemberRepository;

@Configuration
@ComponentScan(
       // basePackages = "study.core.member",
        basePackages = "study.core.member", //이렇게 하면 member만 돌아간다 패키지 지정
        basePackageClasses = AutoAppConfig.class,
        excludeFilters = @ComponentScan.Filter(type=FilterType.ANNOTATION,classes = Configuration.class)

)
public class AutoAppConfig {

    /*@Bean("memoryMemberRepository")
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }*/
}
