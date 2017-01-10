package com.predantsev.converter.service.impl;

import com.predantsev.converter.logic.tag.wrapper.api.FragmentWrapper;
import com.predantsev.converter.logic.tag.api.HtmlFragment;
import com.predantsev.converter.logic.factory.api.HtmlFragmentFactory;
import com.predantsev.converter.logic.factory.api.FragmentWrapperFiller;
import com.predantsev.converter.service.api.HtmlService;
import com.predantsev.converter.service.api.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by predantsev on 10.01.2017
 */
@Service("htmlProducer")
public class HtmlServiceImpl implements HtmlService {

    private final RequestService requestService;

    private final HtmlFragmentFactory<String, String> htmlFragmentFactory;

    private final FragmentWrapperFiller<String, String, String> fragmentWrapperFiller;

    @Autowired
    public HtmlServiceImpl(RequestService requestService,
                           HtmlFragmentFactory<String, String> htmlFragmentFactory,
                           FragmentWrapperFiller<String, String, String> fragmentWrapperFiller) {
        this.requestService = requestService;
        this.htmlFragmentFactory = htmlFragmentFactory;
        this.fragmentWrapperFiller = fragmentWrapperFiller;
    }

    @Override
    public String produceHtmlFrom(HttpServletRequest request) {
        Collection<String> tokens = requestService.getTokensFrom(request);
        List<FragmentWrapper<String, String>> fragmentWrappers = fillFragmentWrappers(tokens);
        List<HtmlFragment<String>> htmlFragments = transformHtmlFragmentsFromWrappers(fragmentWrappers);
        return htmlFragments.stream().map(HtmlFragment::getHtmlFragmentValue).collect(Collectors.joining());
    }

    private List<FragmentWrapper<String, String>> fillFragmentWrappers(Collection<String> tokens) {
        List<FragmentWrapper<String, String>> fragmentWrappers = new ArrayList<>();
        fragmentWrapperFiller.fillWithFragmentWrappers(tokens, fragmentWrappers);
        return fragmentWrappers;
    }

    private List<HtmlFragment<String>> transformHtmlFragmentsFromWrappers(List<FragmentWrapper<String, String>> fragmentWrappers) {
        List<HtmlFragment<String>> htmlFragments = new ArrayList<>();
        fragmentWrappers.forEach(fragmentWrapper -> htmlFragments.add(htmlFragmentFactory.createHtmlFragment(fragmentWrapper)));
        return htmlFragments;
    }
}
