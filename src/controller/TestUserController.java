package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.text.html.FormSubmitEvent;
import java.util.HashMap;
import java.util.Map;

@Controller
public class TestUserController {

    @RequestMapping(value="a")
    public String toA()
    {

        return "a";
    }


    @RequestMapping(value={"testParam","showParams"},method = {RequestMethod.POST})
    public ModelAndView showParams(@RequestParam(value = "aaa") String str,int number)
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("showParams");

        Map<String,Object> params = new HashMap<String, Object>();
        params.put("str",str);
        params.put("number",number);

        modelAndView.addObject("params",params);
        return modelAndView;
    }

    @RequestMapping(value={"showParams1"},method = RequestMethod.POST)
    public String showParams(Model model,String aaa,int number)
    {
        Map<String,Object> params = new HashMap<String, Object>();
        params.put("str",aaa);
        params.put("number",number);
        model.addAttribute("params",params);
        return "showParams";
    }

    @RequestMapping(value="showIntParam",method = RequestMethod.POST)
    public ModelAndView showIntParam(int number)
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("showParams");
        modelAndView.addObject("number",number);
        return modelAndView;
    }

}
