package com.predantsev.converter.logic.factory.impl;

import com.predantsev.converter.logic.factory.api.HtmlFragmentFactory;
import com.predantsev.converter.logic.tag.api.HtmlFragment;
import com.predantsev.converter.logic.tag.wrapper.api.FragmentWrapper;
import org.springframework.stereotype.Component;

/**
 * Created by predantsev on 03.01.2017
 */
@Component("htmlFragmentFactory")
public class HtmlFragmentFactoryImpl implements HtmlFragmentFactory<String, String> {

    @Override
    public HtmlFragment<String> createHtmlFragment(FragmentWrapper<String, String> fragmentWrapper) {
        HtmlFragment<String> htmlFragment = null;
//        switch (fragmentWrapper.getFragmentValue()) {
//            case SymbolDict.CLOSE_SQUARE_BRACKETS :
//                htmlFragment = new AHtmlTag();
//                break;
//            default:
//                htmlFragment = null;
//                break;
//        }
        return htmlFragment;
    }
}
