package com.predantsev.converter.logic.factory.impl;

import com.predantsev.converter.logic.factory.api.FragmentWrapperFactory;
import com.predantsev.converter.logic.tag.wrapper.api.FragmentWrapper;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by predantsev on 10.01.2017
 */
@Component("fragmentWrapperFactory")
public class FragmentWrapperFactoryImpl implements FragmentWrapperFactory<String, String> {

    @Override
    public FragmentWrapper createFragmentWrapper(String fragment, Map<String, String> extraValues) {
        return null;
    }
}
