package kr.co.jhjsoft.board.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = "writer")
public class Board extends BaseEntity{
    @Id
    //글 번호를 직접 만들지 못 할때 만들어 달라는 요청
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long bno;
    private  String title;
    private  String content;

    @ManyToOne(fetch = FetchType.LAZY)
    private Member writer;
}
