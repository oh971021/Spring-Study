package com.example.demo;

import com.example.demo.chapter03.used.Greet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 	스프링 부트 시작 클래스
 */
@SpringBootApplication
public class DemoApplication {

	/**
	 * 주입 (인터페이스)
	 *   : 스프링 프레임워크에서 클래스를 읽을 때,
	 *     @Component 선언 되어 있는 클래스를
	 *     @Autowired 주입하는 인터페이스와 매칭 시켜 인스턴스를 생성한다.
	 */
	@Autowired
	Greet greet;

	/**
	 * 실행 메소드
	 */
	private void execute() {
		greet.greeting();
	}

	/**
	 * Main 메소드
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args)
				.getBean(DemoApplication.class).execute();
	}
}
