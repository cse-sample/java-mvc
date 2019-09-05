package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-09-05T06:29:02.698Z")

@RestSchema(schemaId = "projectjava1")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Projectjava1Impl {

    @Autowired
    private Projectjava1Delegate userProjectjava1Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProjectjava1Delegate.helloworld(name);
    }

}
