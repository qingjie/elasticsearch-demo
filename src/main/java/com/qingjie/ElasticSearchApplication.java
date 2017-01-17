package com.qingjie;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.qingjie.domain.Hashtag;
import com.qingjie.service.HashtagService;

@SpringBootApplication
public class ElasticSearchApplication implements CommandLineRunner {

	@Autowired
	HashtagService hashtagService;

	private static final Logger logger = LoggerFactory.getLogger(ElasticSearchApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(ElasticSearchApplication.class, args);
		logger.info("Main Spring Boot Apllication Elasticsearch");
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Hashtag Main Class ========1=============:");
		
		logger.info("Total of Hastag ======2======: " + hashtagService.countHashtag());
		Iterable<Hashtag> x = hashtagService.findAll();

		for (Hashtag s : x) {
			logger.info("Hashtag kuba ======3======: " + s.getHashtagId());
			logger.info("Hashtag ======4======: " + s.getDateCreated());
			logger.info("Hashtag ======5======: " + s.getHashtagname());
			logger.info("Hashtag ======6======: " + s.getPostCount());
		}

		logger.info("Hashtag Main Class=====7====");
	}
}
