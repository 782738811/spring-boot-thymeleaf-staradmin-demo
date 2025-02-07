package com.farhan.staradmin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "pages")
public class TableElements {

    @GetMapping(value = "table-elements")
    public ModelMap mmTableElements() {
        return new ModelMap();
    }

    @GetMapping(value = "form-elements")
    public ModelMap mmFormElements() {
        return new ModelMap();
    }

    @GetMapping(value = "dashboard")
    public ModelMap mmDashboard() {
        return new ModelMap();
    }

}
