package com.example.springbootlearn.service;

import com.example.springbootlearn.domain.Article;
import com.example.springbootlearn.dto.AddArticleRequest;
import com.example.springbootlearn.repository.BlogRepository;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BlogService {
    private final BlogRepository blogRepository;

    public Article save(AddArticleRequest request) {
        return blogRepository.save(request.toEntity());
    }
}
