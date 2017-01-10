package com.predantsev.converter.logic.tag.impl;

import com.predantsev.converter.util.dict.HtmlTagDict;

/**
 * Created by predantsev on 03.01.2017
 */
public class BodyStartHtmlTag extends HtmlFragmentDefinedBy<String> {

    public BodyStartHtmlTag() {
        htmlFragmentValue = HtmlTagDict.BODY_START_TAG;
    }
}
