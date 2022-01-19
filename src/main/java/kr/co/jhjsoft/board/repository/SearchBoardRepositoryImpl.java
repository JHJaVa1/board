package kr.co.jhjsoft.board.repository;

import kr.co.jhjsoft.board.entity.Board;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

public class SearchBoardRepositoryImpl extends QuerydslRepositorySupport implements SearchBoardRepository {


    public SearchBoardRepositoryImpl() {
        super(Board.class);
    }
}
