package kr.co.jhjsoft.board.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ReplyDTO {
    private  Long rno;
    private String text;
    private String replyer;
    private Long bno;
    private LocalDateTime regDate;
    private LocalDateTime modDate;
}
