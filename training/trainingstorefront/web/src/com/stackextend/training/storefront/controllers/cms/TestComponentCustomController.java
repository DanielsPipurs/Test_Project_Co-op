package com.stackextend.training.storefront.controllers.cms;

import com.stackextend.training.core.model.TestComponentModel;
import com.stackextend.training.storefront.controllers.ControllerConstants;
import de.hybris.platform.acceleratorstorefrontcommons.controllers.cms.AbstractCMSComponentController;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;


@Controller("CustomOffersComponentController")
@Scope("tenant")
@RequestMapping(value = ControllerConstants.Actions.Cms.TestComponent)
public class TestComponentCustomController extends AbstractCMSComponentController<TestComponentModel>
{
    @Override
    protected void fillModel(HttpServletRequest request, org.springframework.ui.Model model, TestComponentModel component) {
        model.addAttribute("compText", component.getCompText());

        model.addAttribute("buttonText", component.getButtonText());

        model.addAttribute("img", component.getImg());

        model.addAttribute("url", component.getUrl());
    }

    @Override
    protected String getView(TestComponentModel component) {
        return null;
    }
}