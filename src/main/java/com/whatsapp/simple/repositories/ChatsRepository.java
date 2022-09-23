package com.whatsapp.simple.repositories;

import com.whatsapp.simple.model.Chats;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatsRepository extends MongoRepository<Chats,String> {
   @Query(value = "select * from\n" +
           "(\n" +
           "select * from TestMessage WHERE SenderId =:senderId AND ReceiverId =:receiverId\n" +
           "UNION ALL\n" +
           "select * from TestMessage WHERE SenderId =:receiverId AND ReceiverId =:senderId\n" +
           ") As Z\n" +
           "order by dateCreated DESC")
    List findChatsBy_id(String senderId,String receiverId);
}
