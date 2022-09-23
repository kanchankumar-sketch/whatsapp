package com.whatsapp.simple.services;

import com.whatsapp.simple.model.WUser;
import com.whatsapp.simple.repositories.WUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WUserService {
    @Autowired
    private WUserRepo userRepo;

    public WUser save(WUser user) {
        return userRepo.save(user);
    }

    public List getUsers() {
        return userRepo.findAll();
    }

    public void deleteAll() {
        userRepo.deleteAll();
    }
}
