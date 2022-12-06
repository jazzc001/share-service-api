package com.example.share.service;


import com.example.share.entity.Share;
import com.example.share.persistence.ShareDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShareServiceImpl implements ShareService{

    @Autowired
    private ShareDao shareDao;


    @Override
    public Share searchShareById(Integer id) {
        return shareDao.findById(id).orElse(null);
    }
}
