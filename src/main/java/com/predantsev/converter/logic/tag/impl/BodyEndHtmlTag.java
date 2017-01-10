package com.predantsev.converter.logic.tag.impl;

import com.predantsev.converter.util.dict.HtmlTagDict;

/**
 * Created by predantsev on 03.01.2017
 */
public class BodyEndHtmlTag extends HtmlFragmentDefinedBy<String> {

    public BodyEndHtmlTag(){
        htmlFragmentValue = HtmlTagDict.BODY_END_TAG;
    }
}
