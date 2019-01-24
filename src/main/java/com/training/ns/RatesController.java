package com.training.ns;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RatesController {

    @Value("${rate}")
    private String rate;
    @Value("${lanecount}")
    private String lanecount;
    @Value("${tollstart}")
    private String tollstart;


    @GetMapping("/rates")
    public String getRates(Model model) {
        model.addAttribute("rateamount", rate);
        model.addAttribute("lanes", lanecount);
        model.addAttribute("tollstart", tollstart);

        return "rateview";
    }
}
