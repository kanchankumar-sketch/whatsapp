package com.whatsapp.simple.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Data
@Document
public class Chats {
    @Id
    private String _id;
    private String senderId;
    private String receiverId;
    private String message;
    private Date dateCreated=new Date();
    private String messageSenderId;
    /*
select * from
(
select * from TestMessage WHERE SenderId = 10 AND ReceiverId = 11
UNION ALL
select * from TestMessage WHERE SenderId = 11 AND ReceiverId = 10
) As Z
order by Id DESC
*/
}
