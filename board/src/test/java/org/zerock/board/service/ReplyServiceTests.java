package org.zerock.board.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.board.dto.ReplyDTO;

@SpringBootTest
class ReplyServiceTests {

    @Autowired
    private ReplyService replyService;

    @Test
    public void testGetList() {
        Long bno = 91L;
        List<ReplyDTO> replyDTOList = replyService.getList(bno);
        replyDTOList.forEach(System.out::println);
    }

}