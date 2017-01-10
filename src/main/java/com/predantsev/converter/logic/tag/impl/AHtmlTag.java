package com.predantsev.converter.logic.tag.impl;

import com.predantsev.converter.util.dict.HtmlTagDict;

import java.util.Map;

/**
 * Created by predantsev on 03.01.2017
 */
public class AHtmlTag extends HtmlFragmentDefinedBy<String> {

    public AHtmlTag(Map<String, String> linkArgs) {
        htmlFragmentValue = HtmlTagDict.A_START_OPEN_TAG +
                linkArgs.get(HtmlTagDict.A_LINK) +
                HtmlTagDict.A_START_CLOSE_TAG +
                linkArgs.get(HtmlTagDict.TEXT) +
                HtmlTagDict.A_END_TAG;
    }
}
