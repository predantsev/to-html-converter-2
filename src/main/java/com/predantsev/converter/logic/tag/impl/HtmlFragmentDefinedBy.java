package com.predantsev.converter.logic.tag.impl;

import com.predantsev.converter.logic.tag.api.HtmlFragment;
import lombok.Getter;

/**
 * Created by predantsev on 03.01.2017
 */
public abstract class HtmlFragmentDefinedBy<V> implements HtmlFragment<V> {

    @Getter
    protected V htmlFragmentValue;

}
