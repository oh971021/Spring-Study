package com.example.SpringDataJDBCSample;

import com.example.SpringDataJDBCSample.entity.Member;
import com.example.SpringDataJDBCSample.repository.MemberCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJdbcSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJdbcSampleApplication.class, args)
				.getBean(SpringDataJdbcSampleApplication.class).execute();
	}

	@Autowired
	MemberCrudRepository repository;

	/**
	 * 등록과 전체 취득 처리
	 */
	public void execute() {
		// 등록
		executeInsert();
		// 전체 취득
		executeSelect();
	}

	/**
	 * 등록
	 */
	public void executeInsert() {
		// 엔티티 생성
		Member member = new Member(null, "칠준석");

		// 리포지토리를 이용해 등록을 수행하고 결과를 취득
		member = repository.save(member);

		// 결과 표시
		System.out.println("등록 데이터 : " + member);
	}

	/**
	 * 전체 취득
	 */
	private void executeSelect() {
		System.out.println("데이터 취득합니다.");
		Iterable<Member> members = repository.findAll();
		for (Member m : members) {
			System.out.println(m);
		}
	}
}
