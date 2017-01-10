package com.predantsev.converter.web.controller;

import com.predantsev.converter.service.api.HtmlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by predantsev on 03.01.2017
 */
@RestController
public class Controller {

    private final HtmlService htmlService;

    @Autowired
    public Controller(HtmlService htmlService) {
        this.htmlService = htmlService;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
    public String textToHtml(HttpServletRequest request) {
        return htmlService.produceHtmlFrom(request);
    }
}
