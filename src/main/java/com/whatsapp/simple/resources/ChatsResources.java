package com.whatsapp.simple.resources;

import com.whatsapp.simple.model.Chats;
import com.whatsapp.simple.model.SenderChatModel;
import com.whatsapp.simple.services.ChatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/whatsapp/api/v1/user/chat")
public class ChatsResources {
    @Autowired
    public ChatsService chatsService;

    @GetMapping("/{user_id}/{receiver_id}")
    public List getChat(@PathVariable("user_id") String userId, @PathVariable("receiver_id") String receiverId){
        return chatsService.getChatsByUserId(userId, receiverId);
    }

    @GetMapping("/chats")
    public List getChats(@RequestBody SenderChatModel model){
        List xx1=new ArrayList();
        List xx=model.getReceiverIds();
        for(int i=0; i<xx.size(); i++){
            xx1.addAll(chatsService.getChatsByUserId(model.getSenderId(), xx.get(i).toString()));
        }
        return xx1;
    }


    @PostMapping
    public Chats saveChat(@RequestBody Chats chat) {
        return chatsService.saveChats(chat);
    }
}
