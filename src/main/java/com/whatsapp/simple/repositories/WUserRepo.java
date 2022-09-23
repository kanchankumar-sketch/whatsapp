package com.whatsapp.simple.repositories;

import com.whatsapp.simple.model.WUser;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WUserRepo extends MongoRepository<WUser,String> {
}
