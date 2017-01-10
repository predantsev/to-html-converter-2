package com.predantsev.converter.logic.tag.impl;

import com.predantsev.converter.util.dict.HtmlTagDict;

import java.util.Map;

/**
 * Created by predantsev on 03.01.2017
 */
public class EmHtmlTag extends HtmlFragmentDefinedBy<String> {

    public EmHtmlTag(Map<String, String> tagArgs) {
        htmlFragmentValue = HtmlTagDict.EM_START_TAG + tagArgs.get(HtmlTagDict.TEXT) + HtmlTagDict.EM_END_TAG;
    }
}
