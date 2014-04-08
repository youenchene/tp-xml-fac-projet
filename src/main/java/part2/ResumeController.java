package part2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
@RequestMapping("/resume")
public class ResumeController {


    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    ResumeList GetResumes() {
        ResumeList list =  new ResumeList();
        list.resume = new ArrayList<>();
        Resume cv1=new Resume();
        cv1.firstName="AAA";
        cv1.lastName="BBB";
        list.resume.add(cv1);
        Resume cv2=new Resume();
        cv2.firstName="ZZZ";
        cv2.lastName="YYY";
        list.resume.add(cv2);
       return list;
    }

    @RequestMapping(value="{id}",method = RequestMethod.GET)
    public @ResponseBody Resume GetResumes(@PathVariable String id) {
        Resume cv1=new Resume();
        cv1.firstName="AAA";
        cv1.lastName="BBB";
        return cv1;
    }
}
