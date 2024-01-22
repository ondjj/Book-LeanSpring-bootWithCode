package org.zerock.board.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.board.entity.Board;
import org.zerock.board.entity.Reply;

@SpringBootTest
class ReplyRepositoryTests {
    @Autowired
    private ReplyRepository replyRepository;

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void insertReply() {
        IntStream.rangeClosed(1,100).forEach(i-> {
            long bno = (long)(Math.random() * 100) + 1;
            Optional<Board> board = boardRepository.findById(bno);
            if (board.isPresent()) {
                Reply reply = Reply.builder()
                        .text("Reply....." + i)
                        .board(board.get())
                        .replyer("guest")
                        .build();
                replyRepository.save(reply);
            }
        });
    }
}