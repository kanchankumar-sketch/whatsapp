package com.whatsapp.simple.services;

import com.whatsapp.simple.model.Chats;
import com.whatsapp.simple.repositories.ChatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatsService {
    @Autowired
    private ChatsRepository repository;

    public List getChatsByUserId(String userId,String receiverId) {
        return repository.findChatsBy_id(userId,receiverId);
    }

    public Chats saveChats(Chats chats){
        return repository.save(chats);
    }
}
