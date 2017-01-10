package com.predantsev.converter.logic.factory.impl;

import com.predantsev.converter.logic.factory.api.FragmentWrapperFiller;
import com.predantsev.converter.logic.tag.wrapper.api.FragmentWrapper;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * Created by predantsev on 10.01.2017
 */
@Component("fragmentWrapperFiller")
public class FragmentWrapperFillerImpl implements FragmentWrapperFiller<String, String, String> {

    @Override
    public void fillWithFragmentWrappers(Collection<String> tokens, Collection<FragmentWrapper<String, String>> fragmentWrappers) {

    }
}
