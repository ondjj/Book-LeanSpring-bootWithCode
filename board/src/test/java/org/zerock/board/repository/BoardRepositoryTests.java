package org.zerock.board.repository;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.board.entity.Board;
import org.zerock.board.entity.Member;

@SpringBootTest
class BoardRepositoryTests {
    @Autowired
    private BoardRepository boardRepository;
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void insertBoard() {

        IntStream.rangeClosed(1, 100).forEach(i -> {
            Member member = Member.builder().email("user" + i + "@aaa.com").build();
            memberRepository.save(member);
            Board board = Board.builder()
                    .title("Title..." + i)
                    .content("Content...." + i)
                    .writer(member)
                    .build();
            boardRepository.save(board);

        });
    }
}