package com.predantsev.converter.logic.tag.impl;

import com.predantsev.converter.util.dict.HtmlTagDict;

import java.util.Map;

/**
 * Created by predantsev on 03.01.2017
 */
public class PHtmlTag extends HtmlFragmentDefinedBy<String> {

    public PHtmlTag(Map<String, String> tagArgs) {
        htmlFragmentValue = HtmlTagDict.P_START_TAG + tagArgs.get(HtmlTagDict.TEXT) + HtmlTagDict.P_END_TAG;
    }
}
