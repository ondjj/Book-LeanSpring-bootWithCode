package org.zerock.gestbook.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import org.zerock.gestbook.dto.GuestbookDTO;
import org.zerock.gestbook.entity.Guestbook;
import org.zerock.gestbook.repository.GuestbookRepository;

@Service
@Log4j2
@RequiredArgsConstructor
public class GuestbookServiceImpl implements GuestbookService {
    private final GuestbookRepository repository;

    @Override
    public Long register(final GuestbookDTO dto) {
        log.info("DTO --------------------------------");
        log.info(dto);
        Guestbook entity = dtoToEntity(dto);
        log.info(entity);
        repository.save(entity);
        return entity.getGno();
    }
}
