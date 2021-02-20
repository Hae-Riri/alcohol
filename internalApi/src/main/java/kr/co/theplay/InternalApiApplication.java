package kr.co.theplay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/*
@SpringBootApplication은 내부적으로 @ComponentScan 어노테이션을 사용함
@ComponentScan은 어디서부터 컴포넌트를 찾아볼 건지 알려주는 역할을 하고,
이 어노테이션이 붙은 클래스가 있는 패키지부터 모든 하위 패키지의 클래스들을 훓으면서 @Component 가 붙은 클래스나
@Component어노테이션을 내부적으로 포함? 사용?하고 있는 다른 어노테이션이 붙은 클래스들을 찾는다.
Spring IoC 컨테이너를 만들 때 위의 과정을 거쳐서 빈으로 등록해줌.

Bean은 Spring IoC 컨테이너가 관리하는 자바 객체를 일컫는 용어임.
어떤 객체를 new로 생성하면 그건 bean이 아니고, ApplicaionContext.getBean()으로 얻어지는 객체가 Bean임.
Spring에서 Bean이란 ApplicationContext가 알고 있는 객체, ApplicationContext가 만들고 그 안에 담고 있는 객체를 말한다.

Spring IoC 컨테이너에 빈이 등록되는 방법은 두 가지다.
하나는 Component Scanning, 하나는 직접 빈 등록.
전자는 위에서 말한 것처럼 @SpringBootApplication에 있는 @ComponentScan이 어디서부터 Component를 찾을 지 알려주고 @Component가 붙은 클래스를 찾아서 등록해준다.

후자는 빈 설정 파일에 직접 등록하는 것인데, 빈 설정 파일은 xml과 java 설정파일로 작성할 수 있다.
요즘은 java로 많이 한다. SampleConfiguration을 만들고 그 클래스에 @Configuration을 붙인다.
그 안에 @Bean을 통해 직접 Bean을 정의한다.
*/

@SpringBootApplication
@EnableJpaAuditing
public class InternalApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(InternalApiApplication.class, args);
    }
}
