package com.fc.controller;

import com.fc.model.Post;
import com.fc.model.Topic;
import com.fc.service.PostService;
import com.fc.service.TopicService;
import com.fc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class TopicController {

    @Autowired
    private TopicService topicService;

    /**
     * 列出所有话题
     * @param model
     * @return
     */
    @RequestMapping("/listTopic.do")
    public String listTopic(Model model){
        List<Topic> topicList = topicService.listTopic();
        model.addAttribute("topicList",topicList);
        return "topic";
    }
    /*
    * 文章
    *
    * */
    @RequestMapping("/listImage.do")
    public String listImage(Model model){
        List<String> imageList = topicService.listImage();
        model.addAttribute("imageList",imageList);
        //用视图解析器进行解析，视图解析器已设置前缀后缀，只需返回中间部分
        return "image";
    }
}





