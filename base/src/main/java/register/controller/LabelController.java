package register.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/label")
@CrossOrigin
public class LabelController {

    @RequestMapping(value = "/{labelId}", method = RequestMethod.GET)
    public String findById(@PathVariable("labelId") String id) {
        System.out.println("调用成功");
        return "success";
    }

}
