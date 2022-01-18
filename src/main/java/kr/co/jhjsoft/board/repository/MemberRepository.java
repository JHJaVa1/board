package kr.co.jhjsoft.board.repository;

import kr.co.jhjsoft.board.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
}
