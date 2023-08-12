package com.hnsw.controller;

import org.springframework.web.bind.annotation.*;

//@Controller
//@ResponseBody
@RestController
@RequestMapping(value = "/users")
public class UserController {

//    @RequestMapping( method = RequestMethod.POST)
    @PostMapping
    public String save(){
        System.out.println("SpringBoot-User-Service-Save");
        return "{'module':'user save'}";
    }

    /**
     * delete
     * @return
     */
//    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id) {
        System.out.println("SpringBoot-User-Service-Delete" + id);
        return "{'module':'user delete'}";
    }

    /**
     * update
     * @return
     */
//    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    @PutMapping
    public String update(@RequestBody User user) {
        System.out.println("SpringBoot-User-Service-Update"+user);
        return "{'module':'user update'}";
    }

    /**
     * get
     * @return
     */
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("SpringBoot-getById method execute!"+id);
        return "{'module':'user get'}";
    }

}
