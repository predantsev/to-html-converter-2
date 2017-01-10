package com.predantsev.converter.service.api;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by predantsev on 10.01.2017
 */
public interface HtmlService {

    String produceHtmlFrom(HttpServletRequest request);
}
