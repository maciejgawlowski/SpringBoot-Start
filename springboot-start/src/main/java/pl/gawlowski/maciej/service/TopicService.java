package pl.gawlowski.maciej.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import pl.gawlowski.maciej.model.Topic;

@Service
public class TopicService {

	private List<Topic> topics = Arrays.asList(
			new Topic("spring", "Spring Framework", "Spring Framework Description"),
			new Topic("java", "Core Java", "Core Java Description"),
			new Topic("javascript", "JavaScript", "JavaScript Description"));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
}
