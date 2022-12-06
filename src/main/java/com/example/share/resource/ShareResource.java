package com.example.share.resource;


import com.example.share.entity.Share;
import com.example.share.service.ShareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShareResource {

    @Autowired
    private ShareService shareService;


    @GetMapping(path = "shares/{sid}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Share searchShareById(@PathVariable("sid") Integer id) {
        return shareService.searchShareById(id);
    }
}
