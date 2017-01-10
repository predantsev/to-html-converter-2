package com.predantsev.converter.logic.factory.api;

import com.predantsev.converter.logic.tag.wrapper.api.FragmentWrapper;

import java.util.Collection;

/**
 * Created by predantsev on 10.01.2017
 */
public interface FragmentWrapperFiller<T, V, K> {

    void fillWithFragmentWrappers(Collection<T> tokens, Collection<FragmentWrapper<V, K>> fragmentWrappers);
}
