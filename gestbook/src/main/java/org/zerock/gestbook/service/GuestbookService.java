package org.zerock.gestbook.service;

import org.zerock.gestbook.dto.GuestbookDTO;
import org.zerock.gestbook.dto.PageRequestDTO;
import org.zerock.gestbook.dto.PageResultDTO;
import org.zerock.gestbook.entity.Guestbook;

public interface GuestbookService {
    Long register(GuestbookDTO dto);

    PageResultDTO<GuestbookDTO, Guestbook> getList(PageRequestDTO requestDTO);

    default Guestbook dtoToEntity(GuestbookDTO dto) {
        return Guestbook.builder()
                .gno(dto.getGno())
                .title(dto.getTitle())
                .content(dto.getContent())
                .writer(dto.getWriter())
                .build();
    }

    default GuestbookDTO entityToDto(Guestbook entity) {
        return GuestbookDTO.builder()
                .gno(entity.getGno())
                .title(entity.getTitle())
                .content(entity.getContent())
                .writer(entity.getWriter())
                .regDate(entity.getRegDate())
                .modDate(entity.getModDate())
                .build();
    }

    GuestbookDTO read(long gno);

    void modify(GuestbookDTO dto);

    void remove(Long gno);
}
