package com.springapp.rest;

import com.springapp.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

/**
 * Created by Chris on 2016-02-23.
 */
@Controller
@RequestMapping("/rest")
public class RestController {

    @RequestMapping(value="/getPersons/{id}",method= RequestMethod.GET)
    public @ResponseBody
    ArrayList<Person> getPersons(@PathVariable String id) throws Exception {
        String idV = id;
        ArrayList<Person> personList = new ArrayList<Person>() ;
        personList.add(new Person("Lily",20));
        personList.add(new Person("Lucy",21));
        return  personList;
    }
}
