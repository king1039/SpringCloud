package com.example.register2.controller;

import com.example.register2.client.BaseClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/problem")
public class ProblemController {
    @Autowired
    private BaseClient baseClient;

    @RequestMapping(value = "/label/{labelId}", method = RequestMethod.GET)
    public String findByLabelId(@PathVariable String labelId) {
        baseClient.findById(labelId);
        return "success";
    }
}
