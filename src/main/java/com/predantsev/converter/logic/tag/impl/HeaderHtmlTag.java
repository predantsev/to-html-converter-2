package com.predantsev.converter.logic.tag.impl;

import com.predantsev.converter.util.dict.HtmlTagDict;

import java.util.Map;

/**
 * Created by predantsev on 03.01.2017
 */
public class HeaderHtmlTag extends HtmlFragmentDefinedBy<String> {

    public HeaderHtmlTag(Map<String, String> tagArgs) {
        htmlFragmentValue = HtmlTagDict.HEADER_START_OPEN_TAG +
                tagArgs.get(HtmlTagDict.HEADER_SIZE) +
                HtmlTagDict.END_CLOSE_TAG +
                tagArgs.get(HtmlTagDict.TEXT) +
                HtmlTagDict.HEADER_END_OPEN_TAG +
                tagArgs.get(HtmlTagDict.HEADER_SIZE) +
                HtmlTagDict.END_CLOSE_TAG;
    }
}
