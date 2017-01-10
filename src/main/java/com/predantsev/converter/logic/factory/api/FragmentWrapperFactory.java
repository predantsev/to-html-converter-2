package com.predantsev.converter.logic.factory.api;

import com.predantsev.converter.logic.tag.wrapper.api.FragmentWrapper;

import java.util.Map;

/**
 * Created by predantsev on 09.01.2017
 */
public interface FragmentWrapperFactory<V, K> {

    FragmentWrapper createFragmentWrapper(V fragment, Map<K, V> extraValues);
}
