package com.sandeep.exampl.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("sdara1","sandeepdara","This is sandeep Dara"),
				new Topic("sdara2","sandeep","This is sandeep Junior"),
				new Topic("Tdara","Tejudara","This is Teju Dara")));
	
	public List<Topic> getAllTopics() {
		return topics;
	}
	public Topic getTopic(String id) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
public void addTopic(Topic topic) {
	topics.add(topic);
	
}
public void updateTopic(String id,Topic topic) {
	for(int i=0;i<topics.size();i++) {
		
		Topic t=topics.get(i);
		if(t.getId().equals(id)) {
			topics.set(i, topic);
			return;
			
		}
	}
}
public void deleteTopic(String id) {
	// TODO Auto-generated method stub
	
for(int i=0;i<topics.size();i++) {
		
		Topic t=topics.get(i);
		if(t.getId().equals(id)) {
			topics.remove(i);
			return;
			
		}
	}
}


}
