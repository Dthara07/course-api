package com.springboot.quickstart.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;

//	private List<Topic> topics = new ArrayList<>(
//			Arrays.asList(
//					new Topic("spring", "Spring Framework", "Spring Framework Description"),
//					new Topic("java", "Core Java", "Core Java Description"),
//					new Topic("javascript", "Javascript", "Javascript Description"))
//			);

	public List<Topic> getAllTopics() {
		// System.out.println("in getAllTopics:::::::::::::::::::::");
//		return topics;
//		List<Topic> topics = new ArrayList<>();
		return topicRepository.findAll();
	}

	public Topic getTopic(String id) {
//		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepository.findOne("id");
	}

	public void addTopic(Topic topic) {
//		topics.add(topic);
		topicRepository.save(topic);
	}


	public void updateTopic(Topic topic, String id) {
//		topicRepository.delete(id);
		topicRepository.save(topic);
//		System.out.println("Topics before :::::::::::::" + getAllTopics());
//		courses.remove(courses.stream().filter(t -> t.getId().equals(id)).findFirst().get());
//		courses.add(course);
//		System.out.println("Topics After :::::::::::::" + getAllTopics());
	}

	public void deleteTopic(String id) {
//		courses.removeIf(t -> t.getId().equals(id));
		topicRepository.delete(id);
	}
}
