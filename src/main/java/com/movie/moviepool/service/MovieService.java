package com.movie.moviepool.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.movie.moviepool.mapper.MovieDataMapper;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class MovieService {

    private final MovieDataMapper movieMapper;

    public List<String> getTest() throws Exception {
        System.out.println("서비스 테스트");

        List<String> list = new ArrayList<String>(movieMapper.selectMovie());
        System.out.println("list : " + list);

        return list;
    }
}
