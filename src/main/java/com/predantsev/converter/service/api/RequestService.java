package com.predantsev.converter.service.api;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

/**
 * Created by predantsev on 10.01.2017
 */
public interface RequestService {

    Collection<String> getTokensFrom(HttpServletRequest request);
}
