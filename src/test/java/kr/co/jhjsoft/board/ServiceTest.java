package kr.co.jhjsoft.board;

import kr.co.jhjsoft.board.dto.BoardDTO;
import kr.co.jhjsoft.board.dto.PageRequestDTO;
import kr.co.jhjsoft.board.dto.PageResultDTO;
import kr.co.jhjsoft.board.dto.ReplyDTO;
import kr.co.jhjsoft.board.service.BoardService;
import kr.co.jhjsoft.board.service.ReplyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ServiceTest {
    @Autowired
    private BoardService boardService;

    //@Test
    public void testInsert(){
        BoardDTO dto = BoardDTO.builder().title("삽입 테스트").content("삽입을 테스트 합니다.").writerEmail("user10@gmail.com").build();

        Long bno = boardService.register(dto);
        System.out.println("삽입한 글 번호 : " + bno);
    }
    //@Test
    public void testList(){
        PageRequestDTO dto = new PageRequestDTO();
        PageResultDTO<BoardDTO, Object[]> result = boardService.getList(dto);
        for(BoardDTO boardDTO : result.getDtoList()){
            System.out.println(boardDTO);
        }
        System.out.println(result.getPageList());
    }
   // @Test
    public  void  testGet(){
        BoardDTO dto = boardService.get(100L);
        System.out.println(dto);

    }
   // @Test
    public void testDelete(){
        boardService.removeWithReplies(89L);
    }

    //@Test
    public void testModify(){
        BoardDTO dto = BoardDTO.builder().bno(100L).title("수정한 제목").content("수정한 내용").build();
        boardService.modify(dto);
    }

    @Autowired
    private ReplyService replyService;

    @Test
    public void testGetReplies(){
        List<ReplyDTO> list = replyService.getList(99L);
        System.out.println(list);
    }

}
