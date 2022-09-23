package com.whatsapp.simple.model;

import lombok.Data;

import java.util.List;

@Data
public class SenderChatModel {
    private String  senderId;
    private List receiverIds;

}
