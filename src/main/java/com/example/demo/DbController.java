package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hhh")
public class DbController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/getUsers")
    public String getDbType(){

        return "123";
    }

//    @RequestMapping("/user/{id}")
//    public Map<String,Object> getUser(@PathVariable String id){
//        Map<String,Object> map = null;
//
//        List<Map<String, Object>> list = getDbType();
//
//        for (Map<String, Object> dbmap : list) {
//
//            Set<String> set = dbmap.keySet();
//
//            for (String key : set) {
//                if(key.equals("id")){
//                    if(dbmap.get(key).equals(id)){
//                        map = dbmap;
//                    }
//                }
//            }
//        }
//
//        if(map==null)
//            map = list.get(0);
//        return map;
//    }
}
