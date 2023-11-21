package com.movie.moviepool.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MovieDataMapper {
    public List<String> selectMovie() throws Exception ;
}
