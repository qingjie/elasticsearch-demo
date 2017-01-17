package com.qingjie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qingjie.domain.Hashtag;
import com.qingjie.repository.HashtagRepository;

@Service
public class HashtagService {

	@Autowired
	HashtagRepository hashtagRepository;

	public Long countHashtag() {
		return hashtagRepository.count();
	}

	public Iterable<Hashtag> findAll() {
		System.out.println("============================Service Layer==================");
		return hashtagRepository.findAll();
	}

}