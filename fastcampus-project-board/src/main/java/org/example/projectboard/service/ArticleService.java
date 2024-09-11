package org.example.projectboard.service;

import lombok.RequiredArgsConstructor;
import org.example.projectboard.domain.type.SearchType;
import org.example.projectboard.dto.ArticleDto;
import org.example.projectboard.repository.ArticleRepository;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@RequiredArgsConstructor
@Transactional
@Service
public class ArticleService {
    private final ArticleRepository articleRepository;

    @Transactional(readOnly = true)
    public org.springframework.data.domain.Page<ArticleDto> searchArticles(SearchType searchType, String searchKeyword) {
        return Page.empty();

    }
    @Transactional(readOnly = true)
    public ArticleDto searchArticle(long l) {
        return null;
    }
}
