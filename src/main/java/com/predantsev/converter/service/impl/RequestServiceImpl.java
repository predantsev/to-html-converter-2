package com.predantsev.converter.service.impl;

import com.predantsev.converter.service.api.RequestService;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

/**
 * Created by predantsev on 10.01.2017
 */
@Component("requestHandler")
public class RequestServiceImpl implements RequestService {

    @Override
    public Collection<String> getTokensFrom(HttpServletRequest request) {
        return null;
    }
}
