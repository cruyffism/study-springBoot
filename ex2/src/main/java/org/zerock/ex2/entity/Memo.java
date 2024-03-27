package org.zerock.ex2.entity;

import jakarta.persistence.*;
import lombok.*;

//테이블 생성 클래스
@Entity
@Table(name= "tbl_memo")
@ToString
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Memo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long mno; //pk 설정

    @Column(length = 200, nullable = false) //null 불가
    private String memoText; // 컬럼 추가

}
