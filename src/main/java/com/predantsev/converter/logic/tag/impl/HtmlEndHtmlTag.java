package com.predantsev.converter.logic.tag.impl;

import com.predantsev.converter.util.dict.HtmlTagDict;

/**
 * Created by predantsev on 03.01.2017
 */
public class HtmlEndHtmlTag extends HtmlFragmentDefinedBy<String> {

    public HtmlEndHtmlTag() {
        htmlFragmentValue = HtmlTagDict.HTML_END_TAG;
    }
}
