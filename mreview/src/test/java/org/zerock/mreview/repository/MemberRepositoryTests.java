package org.zerock.mreview.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.zerock.mreview.entity.Member;

@SpringBootTest
class MemberRepositoryTests {
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void insertMember() {
        IntStream.rangeClosed(1,100).forEach(i -> {
            Member member = Member.builder()
                    .email("r" + i + "@zerock.org")
                    .pw("1111")
                    .nickname("reviewer" + i).build();
            memberRepository.save(member);
        });
    }
}