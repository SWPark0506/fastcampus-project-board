package org.example.projectboard.service;

import org.example.projectboard.domain.type.SearchType;
import org.example.projectboard.dto.ArticleDto;
import org.example.projectboard.repository.ArticleRepository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.data.domain.Page;

import java.time.LocalDateTime;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

@DisplayName("비즈니스 로직 - 게시글")
@ExtendWith(MockitoExtension.class)
class ArticleServiceTest {
    @InjectMocks
    private ArticleService sut;
    @Mock
    private ArticleRepository articleRepository;

//    검색
//    각 게시글 페이지로 이동
//    페이지네이션
//    홈 버튼 -> 게시판 페이지로 리다이렉션
    @DisplayName("게시글 검색하면 , 게시글 목록을 반환한다.")
    @Test
    void givenSearchParameters_whenSearchArticles_thenReturnsArticleList() {
        // given
        // when
        Page<ArticleDto> articles = sut.searchArticles(SearchType.TITLE,"search keyword");

        // then
        assertThat(articles).isNotNull();
    }

    @DisplayName("게시글을 조회하면 , 게시글을 반환한다.")
    @Test
    void givenArticleId_whenSearchingArticle_thenReturnsArticle() {
        // given
        // when
        ArticleDto articles = sut.searchArticle(1L);

        // then
        assertThat(articles).isNotNull();
    }

    @Test
    @DisplayName("게시글 정보를 입력하면 , 게시글을 생성한다.")
    void givenArticleInfo_WhenSavingArticle_ThenSavesArticle(){
        // given
        ArticleDto dto = ArticleDto.of(LocalDateTime.now(),"uno","title","content","hashtag");

        // when
        sut.saveArticle(dto);

        // then
        assertThat(savedArticle).isNotNull();

    }
}