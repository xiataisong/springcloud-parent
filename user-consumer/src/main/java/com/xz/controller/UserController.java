package com.xz.controller;

import com.xz.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/consumer")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    /****
     * 在user-consumer服务中通过RestTemplate调用user-provider服务
     * @param id
     * @return
     */
    @GetMapping(value = "/{id}")
    public User queryById(@PathVariable(value = "id")Integer id){
        String url = "http://localhost:18081/user/find/"+id;
        return restTemplate.getForObject(url,User.class);
    }

}