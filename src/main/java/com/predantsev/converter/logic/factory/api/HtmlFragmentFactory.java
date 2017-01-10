package com.predantsev.converter.logic.factory.api;

import com.predantsev.converter.logic.tag.api.HtmlFragment;
import com.predantsev.converter.logic.tag.wrapper.api.FragmentWrapper;

/**
 * Created by predantsev on 03.01.2017
 */
public interface HtmlFragmentFactory<V, K> {

    HtmlFragment<V> createHtmlFragment(FragmentWrapper<V, K> fragmentWrapper);
}