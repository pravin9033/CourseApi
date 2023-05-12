package com.example.courseapi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class TopicService {
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
                    new Topic("spring", "Spring FrameWork", "Spring FrameWork Description"),
                    new Topic("java", "core java", "java  Description"),
                    new Topic("javascript", "javascript ", "javascript  Description")
            ));
    public List<Topic> getAllTopics(){
        return topics;
    }
    public Topic getTopic(String name){
        return topics.stream().filter(t ->  t.getName().equals(name)).findFirst().get();
    }
    public void addTopic(Topic topic){
        topics.add(topic);
    }


    public void updateTopic(Topic topic, String name) {
        for (int i = 0; i < topics.size(); i++){
            Topic topic1 = topics.get(i);
            if (topic1.getName().equals(name)) {
                topics.set(i,topic);
                return;
            }
        }
    }

    public void deleteTopic(String name) {
        topics.removeIf(t -> t.getName().equals(name));
    }
}
