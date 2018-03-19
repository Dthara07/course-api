package com.springboot.quickstart.course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.springboot.quickstart.topics.Topic;

//public interface TopicRepository extends CrudRepository<Topic, String> {
public interface CourseRepository extends JpaRepository<Course, String> {
	
	public List<Course> findByTopicId(String topicId);

}
