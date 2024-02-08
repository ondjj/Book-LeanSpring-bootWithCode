package org.zerock.mreview.repository;

import java.util.Arrays;
import java.util.UUID;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.zerock.mreview.entity.Movie;
import java.util.stream.IntStream;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.mreview.entity.MovieImage;

@SpringBootTest
class MovieRepositoryTests {

    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private MovieImageRepository movieImageRepository;

    @Test
    @Commit
    @Transactional
    public void insertMovies() {
        IntStream.rangeClosed(1, 100).forEach(i -> {
            Movie movie = Movie.builder().title("Movie ....." + i).build();
            System.out.println("--------------------------------");
            movieRepository.save(movie);
            int count = (int)(Math.random() * 5) + 1;

            for (int j = 0; j < count; j++) {
                MovieImage movieImage = MovieImage.builder()
                        .uuid(UUID.randomUUID().toString())
                        .movie(movie)
                        .imgName("test" + j + ".jpg").build();

                movieImageRepository.save(movieImage);
            }
            System.out.println("================================");
        });
    }

    @Test
    public void testListPage() {
        PageRequest pageRequest = PageRequest.of(0, 10, Sort.by(Direction.DESC, "mno"));
        Page<Object[]> result = movieRepository.getListPage(pageRequest);
        for (Object[] objects : result.getContent()) {
            System.out.println(Arrays.toString(objects));
        }
    }
}