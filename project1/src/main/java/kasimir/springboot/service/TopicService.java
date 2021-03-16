package kasimir.springboot.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import kasimir.springboot.been.Topic;

@Service
public class TopicService {
	
	private List<Topic> topics= Arrays.asList(
			new Topic(1,"flowers","about  flowers"),
			new Topic(2,"cars","about cars"),
			new Topic(3,"fish","about fish")
			);

	public List<Topic> getAllTopics(){
		return topics;
		
	}
}
