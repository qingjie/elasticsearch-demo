package com.qingjie.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.qingjie.domain.Hashtag;

public interface HashtagRepository extends ElasticsearchRepository<Hashtag, Long> {

}
