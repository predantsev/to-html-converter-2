package com.predantsev.converter.logic.tag.impl;

import com.predantsev.converter.util.dict.HtmlTagDict;

import java.util.Map;

/**
 * Created by predantsev on 03.01.2017
 */
public class StrongHtmlTag extends HtmlFragmentDefinedBy<String> {

    public StrongHtmlTag(Map<String, String> tagArgs) {
        htmlFragmentValue = HtmlTagDict.STRONG_START_TAG + tagArgs.get(HtmlTagDict.TEXT) + HtmlTagDict.STRONG_END_TAG;
    }
}
