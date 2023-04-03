package study.core;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter //롬복을 통해 기본적으로 생성할 수 있다.
@ToString
@RequiredArgsConstructor //final 붙인 생성자를 만들어줌
// OrderServiceImpl 참고 많이 사용한다고 함
public class HelloLombok {


    private String name;
    private  int age;

    public static void main(String[] args) {
        HelloLombok helloLombok=new HelloLombok();
        helloLombok.setName("chltmdgh");

        System.out.println("helloLombok = " + helloLombok);


    }
}
