package com.predantsev.converter.logic.tag.wrapper.api;

import java.util.Map;

/**
 * Created by predantsev on 05.01.2017
 */
public interface FragmentWrapper<V, K> {

    V getFragmentValue();

    Map<K, V> getExtraValues();
}