package com.whatsapp.simple.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class WUser {
    @Id
    private String _id;
    private String phone;
    private String name;
    private Long otp;
    private String description;
    private String profile;
}
