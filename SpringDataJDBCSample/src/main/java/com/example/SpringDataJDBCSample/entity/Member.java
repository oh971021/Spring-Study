package com.example.SpringDataJDBCSample.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/**
 * Member 테이블 엔티티
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    /** Member 번호 */
    @Id
    private Integer idx;

    /** Member 이름 */
    private String name;
}
