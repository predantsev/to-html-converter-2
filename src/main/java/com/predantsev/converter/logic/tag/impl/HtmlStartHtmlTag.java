package com.predantsev.converter.logic.tag.impl;

import com.predantsev.converter.util.dict.HtmlTagDict;

/**
 * Created by predantsev on 03.01.2017
 */
public class HtmlStartHtmlTag extends HtmlFragmentDefinedBy<String> {

    public HtmlStartHtmlTag() {
        htmlFragmentValue = HtmlTagDict.HTML_START_TAG;
    }
}
