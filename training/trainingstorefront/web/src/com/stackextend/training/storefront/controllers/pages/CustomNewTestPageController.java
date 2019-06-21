package com.stackextend.training.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;
import de.hybris.platform.cms2.model.pages.ContentPageModel;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Scope("tenant")
@RequestMapping("/testPage2")
public class CustomNewTestPageController extends AbstractPageController
{
    private static final String TEST_CMS_PAGE = "testNewPage";

    @RequestMapping(method = RequestMethod.GET)
    public String getOffers(final Model model) throws CMSItemNotFoundException
    {
        final ContentPageModel testCMSPage = getContentPageForLabelOrId(TEST_CMS_PAGE);
        storeCmsPageInModel(model, testCMSPage);
        setUpMetaDataForContentPage(model, testCMSPage);
        return getViewForPage(model);
    }
}