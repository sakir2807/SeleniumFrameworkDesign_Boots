package com.boots.stepDefinitions;

import com.boots.AbstractComponents.AbstractComponent;
import com.boots.TestComponents.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertFalse;
import static org.testng.AssertJUnit.assertTrue;
import org.openqa.selenium.interactions.MoveTargetOutOfBoundsException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;


public class HomePageSteps extends BaseTest {

    private static final By ACCEPT_COOKIE = By.cssSelector("button#onetrust-accept-btn-handler");
    private static final By BOOTS_ICON_HEADER = By.cssSelector("div.logo-img > a > img");
    private static final By HEADER_SECTION = By.cssSelector("div.my-header > nav > ul");
    private static final By SEARCH_BUTTON_HEADER = By.cssSelector("ul > li.search.desktop-search.menu-item.menu-item-type-custom.menu-item-object-custom > a");
    private static final By BOOTS_LOGO = By.cssSelector("div.my-header > nav > div.logo-img > a");
    private static final By HOME_PAGE_BANNER = By.cssSelector("#content > div.home-page-content-wrapper");
    private static final By HOME_HEADER = By.cssSelector("div.my-header > nav > ul > li:nth-child(1)");
    private static final By WHY_BOOTS_HEADER = By.cssSelector("li.relative-pos-menu.menu-item.menu-item-type-post_type.menu-item-object-page.menu-item-has-children > a");
    private static final By CAREER_AREAS_HEADER = By.cssSelector("div.my-header > nav > ul > li.rolestab > a");
    private static final By CAREER_AREAS_SUB_MENU = By.cssSelector("div.my-header > nav > ul > li.rolestab > ul");
    private static final By OUR_STORIES_HEADER = By.cssSelector("div.my-header > nav > ul > li:nth-child(5) > a");
    private static final By SEARCH_JOBS_HEADER = By.cssSelector("div.my-header > nav > ul > li.search.desktop-search > a");
    private static final By FAQS_FOOTER = By.cssSelector("div.footer > div.Row1 > ul > li.menu-item.menu-item-type-post_type.menu-item-object-page > a");
    private static final By LOG_IN_TOP_MENU = By.cssSelector(".desktop_top_menu > div > div > ul >li:nth-child(2) a");
    private static final By LOG_IN_POPUP = By.cssSelector("div.mfp-wrap.mfp-close-btn-in.mfp-auto-cursor.mfp-ready > div > div.mfp-content div div");
    private static final By I_WANT_TO_WORK_FOR_BOOTS_CTA = By.cssSelector("#login-popup-box > div > div > p:nth-child(2) > a");
    private static final By SEARCH_JOB_FIELD_HOME_PAGE = By.cssSelector("div.home-page-content-wrapper > div.search-job-form-container");
    private static final By SEARCH_NOW_CTA = By.cssSelector("div.search-job-form-container > div > form > div.action-wrapper > a");
    private static final By SEARCH_JOB_KEYWORD = By.cssSelector("#search_keyword");
    private static final By SEARCH_JOB_LOCATION = By.cssSelector("#location-form");
    private static final By SEARCH_JOB_DISTANCE = By.cssSelector("#radius");
    private static final By SEARCH_JOB_SELECT_DISTANCE = By.cssSelector(".select2-results__options > li:nth-child(3)");
    private static final By I_WANT_TO_WORK_FOR_BOOTS_CTA_SEARCH = By.cssSelector("#search-popup-box > div > div > p:nth-child(2) > a");
    private static final By VIEW_ALL_FAQS_HOME = By.cssSelector("section.faqs-container > div > div.centered > a");
    private static final By SOCIAL_MEDIA_LINKS_HOME = By.cssSelector("section.social-section > div > div.social-link-list");
    private static final By INSTAGRAM_LINK_HOME = By.cssSelector("a.instagram");
    private static final By FACEBOOK_LINK_HOME = By.cssSelector("a.facebook");
    private static final By TWITTER_LINK_HOME = By.cssSelector("a.twitter");
    private static final By LINKEDIN_LINK_HOME = By.cssSelector("a.linkedin");
    private static final By FAQS_HOME = By.cssSelector("div.home-page-content-wrapper > section.faqs-container");
    private static final By FIRST_FAQS_HOME = By.cssSelector("#question1");
    private static final By FIRST_FAQS_CONTENT_HOME = By.cssSelector(".faq-accordian-content");
    private static final By CAREER_AT_BOOTS_FOOTER = By.cssSelector("ul > li.footer-toggle-btn.menu-item.menu-item-type-custom.menu-item-object-custom > a");
    private static final By CAREER_AT_BOOTS_SUBFOOTER = By.cssSelector("#toggle-footer > ul");
    private static final By PHARMACY_JOB_FOOTER = By.cssSelector("#toggle-footer > ul > li:nth-child(1) > a");
    private static final By OPTICIAN_JOB_FOOTER = By.cssSelector("#toggle-footer > ul > li:nth-child(2) > a");
    private static final By RETAIL_JOB_FOOTER = By.cssSelector("#toggle-footer > ul > li:nth-child(3) > a");
    private static final By SUPPLY_CHAIN_JOB_FOOTER = By.cssSelector("#toggle-footer > ul > li:nth-child(4) > a");
    private static final By SUPPORT_OFFICE_JOB_FOOTER = By.cssSelector("#toggle-footer > ul > li:nth-child(5) > a");
    private static final By EARLY_CAREERS_JOB_FOOTER = By.cssSelector("#toggle-footer > ul > li:nth-child(6) > a");
    private static final By IRELAND_JOB_FOOTER = By.cssSelector("#toggle-footer > ul > li:nth-child(7) > a");
    private static final By AIRPORTS_JOB_FOOTER = By.cssSelector("#toggle-footer > ul > li:nth-child(8) > a");
    private static final By CAREER_AREA_HOMEPAGE = By.cssSelector("div.business-select-section");
    private static final By VIEW_ALL_STORIES_CTA_HOMEPAGE = By.cssSelector("div.view-all.text-center > a");
    private static final By CAREER_AREA_DROPDOWN = By.cssSelector("#business-area-selector");
    //private static final By CAREER_AREA_FIRST_OPTION = By.cssSelector("#not getting");
    private static final By DROP_DOWN_TEXT = By.cssSelector("#select2-business-area-selector-container");
    private static final By SELECTED_CAREER_TEXT = By.cssSelector("div.container.container-wide > h2 > span");
    private static final By STORY_HEADING_TEXT = By.cssSelector("div.story-card.slick-slide.slick-current.slick-active > div > p > a:nth-child(1)");
    private static final By SELECTED_CAREER_IMAGE = By.cssSelector("div.story-card.slick-slide.slick-current.slick-active > a > img");
    private static final By SELECTED_CAREER_CONTENT = By.cssSelector("div.story-card.slick-slide.slick-current.slick-active > div > a");
    private static final By CAREER_AREA_SECOND_OPTION = By.cssSelector("#not getting");
    private static final By SELECTED_CAREER_IMAGE_STORY_PAGE = By.cssSelector("div.feature-image-wrapper > img");
    private static final By SELECTED_CAREER_CONTENT_STORY_PAGE = By.cssSelector("#story-info-wrapper");
    private static final By JOB_SUMMARY_CARD = By.cssSelector("div.is-desktop-b-block > div > div.summary-form > div.summary");
    private static final By JOB_INTEREST_HOMEPAGE = By.cssSelector("div.latest-jobs-container.bg-brand-blue.section-spacing-top-bottom");
    private static final By FIND_OUT_MORE_CTA = By.cssSelector("div.job-card.slick-slide.slick-current.slick-active > a");
    private static final By JOB_DETAILS_CARD = By.cssSelector("div.job-card.slick-slide.slick-current.slick-active > div.label-text");
    private static final By JOB_DESCRIPTION = By.cssSelector("#ab-boot > div > div > div");
    private static final By WHY_BOOTS_SECTION = By.cssSelector("div > section >div.container-wide > div.content-wrapper");
    private static final By WHY_BOOTS_TEXT = By.cssSelector("section .content-wrapper");
    private static final By WHY_BOOT_IMAGE = By.cssSelector("section .image-wrapper");
    private static final By EXPLORE_MORE_CTA = By.cssSelector("div.content-wrapper > div > a");
    private static final By INSTAGRAM_STORIES_HOMEPAGE = By.cssSelector("div.home-page-content-wrapper > section.social-section");
    private static final By FIRST_INSTAGRAM_STORY = By.cssSelector("#ff-uid-1 > div > div > div > div.ff-content");
    private static final By INSTAGRAM_STORY_TEXT = By.cssSelector("#ff-uid-1 > div > div > div > div.ff-content");
    private static final By INSTAGRAM_STORY_LIKE = By.cssSelector("#ff-uid-1 > div span.ff-item-bar > a.ff-likes");
    private static final By INSTAGRAM_STORY_COMMENT = By.cssSelector("#ff-uid-1 > div span.ff-item-bar > a.ff-comments");
    private static final By FOOTER_FIELD = By.cssSelector("footer > div.footer > div.Row1 > ul");
    private static final By FOOTER_BADGE = By.cssSelector("footer > div.footer > div:nth-child(3)");
    private static final By ABOUT_BOOTS_FOOTER = By.cssSelector("footer > div.footer > div.Row1 > ul > li:nth-child(1) > a");
    private static final By BOOTS_COM_FOOTER = By.cssSelector("footer > div.footer > div.Row1 > ul > li:nth-child(3) > a");
    private static final By FAQS_FOOTER_FOOTER = By.cssSelector("footer > div.footer > div.Row1 > ul > li:nth-child(4) > a");
    private static final By SUB_FOOTER_FIELD = By.cssSelector("footer > div.footer > div.Row2.custom-social-box");
    private static final By SUB_FOOTER_SOCIAL_LINK = By.cssSelector("div.Row2.custom-social-box > ul > li.facebook.social-icon.menu-item.menu-item-type-custom.menu-item-object-custom");
    private static final By ACCESSIBILITY_FOOTER = By.cssSelector("div.footer > div.Row2.custom-social-box > ul > li:nth-child(1) > a");
    private static final By SITEMAP_FOOTER = By.cssSelector("div.footer > div.Row2.custom-social-box > ul > li:nth-child(2) > a");
    private static final By PRIVACY_STATEMENT_FOOTER = By.cssSelector("div.footer > div.Row2.custom-social-box > ul > li:nth-child(3) > a");
    private static final By COOKIES_POLICY_FOOTER = By.cssSelector("div.footer > div.Row2.custom-social-box > ul > li:nth-child(4) > a");
    private static final By CAREERS_AT_BOOTS_FOOTER = By.cssSelector("div.footer > div.Row2.custom-social-box > ul > li:nth-child(5) > a");
    private static final By CAREER_BOOTS_DROPDOWN = By.cssSelector("footer > div.text-center");
    private static final By FACEBOOK_FOOTER = By.cssSelector("li.facebook.social-icon.menu-item.menu-item-type-custom.menu-item-object-custom > a");
    private static final By TWITTER_FOOTER = By.cssSelector("li.twitter.social-icon.menu-item.menu-item-type-custom.menu-item-object-custom > a");
    private static final By INSTAGRAM_FOOTER = By.cssSelector("li.instagram.social-icon.menu-item.menu-item-type-custom.menu-item-object-custom > a");
    private static final By LINKEDIN_FOOTER = By.cssSelector(" li.linkedin.social-icon.menu-item.menu-item-type-custom.menu-item-object-custom > a");
    private static final By LOGIN_POPUP_BOX = By.cssSelector("#login-popup-box > div");
    private static final By JOB_FILTER_KEYWORD = By.cssSelector("#search_text");
    private static final By JOB_FILTER_TOWN = By.cssSelector("#location");
    private static final By JOB_FILTER_DISTANCE = By.cssSelector("#select2-name2-container");
    private static final By JOB_FILTER_REFERENCE = By.cssSelector("#form-job-search > div.filter-inputs > div:nth-child(4) > input");
    private static final By JOB_FILTER_BUSINESS_AREA = By.cssSelector("div.form-filters.search_active > div > div:nth-child(1) > span > span.selection textarea");
    private static final By JOB_FILTER_FUNCTIONAL_AREA = By.cssSelector("div.form-filters.search_active > div > div:nth-child(2) > span > span.selection textarea");
    private static final By JOB_FILTER_FULL_PART_TIME = By.cssSelector("div.form-filters.search_active > div > div:nth-child(3) > span > span.selection textarea");
    private static final By JOB_FILTER_CONTRACT = By.cssSelector("div.form-filters.search_active > div > div:nth-child(4) > span > span.selection textarea");

    //Selector for search Job page

    private static final By JOB_SEARCH_FORM_PAGE = By.cssSelector("#form-job-search");
    private static final By SELECT_DISTANCE_JOB_PAGE = By.cssSelector("#name2");
    private static final By LOCATION_JOB_PAGE = By.cssSelector("#location");
    private static final By KEYWORD_JOB_PAGE = By.cssSelector("#search_text");
    private static final By PREFERENCE_JOB_PAGE = By.cssSelector("div.filter-inputs > div:nth-child(4) > input");
    private static final By SELECT_BUSINESS_AREA_JOB_PAGE = By.cssSelector("div.form-filters.search_active > div > div:nth-child(1) > select");
    private static final By SELECT_FUNCTION_AREA_JOB_PAGE = By.cssSelector("div.form-filters.search_active > div > div:nth-child(2) > select");
    private static final By SELECT_TIME_JOB_PAGE = By.cssSelector("div.form-filters.search_active > div > div:nth-child(3) > select");
    private static final By SELECT_CONTRACT_JOB_PAGE = By.cssSelector("div.form-filters.search_active > div > div:nth-child(4) > select");
    private static final By SEARCH_BTN_JOB_PAGE = By.cssSelector("button.btn.btn-blue");
    private static final By FILTER_LIST_JOB_PAGE = By.cssSelector("div.filtered-by-list.d-flex.flex-wrap.visible");
    private static final By RESULTS_JOBS_PAGE = By.cssSelector("div.job-card-list.d-flex.flex-wrap");
    private static final By HIDE_FILTER_JOBS_PAGE = By.cssSelector("div.form-actions.d-flex.justify-c-end > div > button");
    private static final By CLEAR_FILTER_JOBS_PAGE = By.cssSelector("button.btn.reset-form");
    private static final By ALREADY_WORK_JOBS_PAGE = By.cssSelector("section > div:nth-child(1) > div > label:nth-child(2) > input[type=radio]");
    private static final By JOB_LEVEL_JOB_PAGE = By.cssSelector("div.form-filters.search_active div.form-group.custom-select2.custom-select2-multi.thin-arrow.already-work-component > select");
    private static final By PAGE_NUMBERS_JOB_PAGE = By.cssSelector("div.job-result-section > div > div.pagination-bottom > div");
    private static final By SELECT_PAGE_NUMBER_JOB_PAGE = By.cssSelector("div.pagination-bottom > div > ul > li:nth-child(2) > a");
    private static final By JOB_TITLE_JOB_CARD = By.cssSelector("div.job-card-list.d-flex.flex-wrap > div:nth-child(1) >h3.title");
    private static final By JOB_ROLE_JOB_CARD = By.cssSelector("div.job-card-list.d-flex.flex-wrap > div:nth-child(1) > p.designation");
    private static final By JOB_LOCATION_JOB_CARD = By.cssSelector("div.job-card-list.d-flex.flex-wrap > div:nth-child(1) > p.location");
    private static final By JOB_CONTRACT_JOB_CARD = By.cssSelector("div.job-card-list.d-flex.flex-wrap > div:nth-child(1) > div > p.date");
    private static final By JOB_TIME_JOB_CARD = By.cssSelector("div.job-card-list.d-flex.flex-wrap > div:nth-child(1) > div > p.time");
    private static final By JOB_DESCRIPTION_JOB_CARD = By.cssSelector("div.job-card-list.d-flex.flex-wrap > div:nth-child(1) > div.btns-wrapper.d-flex > a.btn.transprent");
    private static final By APPLY_NOW_BTN_JOB_CARD = By.cssSelector("div.job-card-list.d-flex.flex-wrap > div:nth-child(1) > div > a.kenexa-apply-button.btn.btn-blue");


    //Selector for WhyBoots page

    private static final By WHY_BOOTS_SUB_HEADER = By.cssSelector("#why-boots-nav");
    private static final By WHY_BOOTS_CARE = By.cssSelector("#why-boots-nav > div > ul > li:nth-child(2) > a");
    private static final By WHY_BOOTS_YOUR_DEVELOPMENT = By.cssSelector("#why-boots-nav > div > ul > li:nth-child(3) > a");
    private static final By WHY_BOOTS_DIVERSITY_INCLUSION = By.cssSelector("#why-boots-nav > div > ul > li:nth-child(4) > a");
    private static final By WHY_BOOTS_REWARDS_BENEFIT = By.cssSelector("#why-boots-nav > div > ul > li:nth-child(5) > a");
    private static final By OUR_SUPPORT_OFFICE_AREA = By.cssSelector("div.wp-block-group.bg-logo-light > div > section:nth-child(4) > div");
    private static final By OUR_SUPPORT_OFFICE_VIDEO = By.cssSelector("div.slick-slide.slick-current.slick-active div > div.image-wrapper > a");
    private static final By OUR_SUPPORT_OFFICE_VIDEO_SCREEN = By.cssSelector("div.mfp-wrap.mfp-close-btn-in.mfp-auto-cursor.mfp-fade.mfp-ready > div > div.mfp-content");
    private static final By VIEW_BENEFIT_CTA = By.cssSelector("div > section:nth-child(3) div.section-slider-widget.slick-initialized.slick-slider div.content-wrapper > p:nth-child(3) > a");
    private static final By BENEFIT_ICON = By.cssSelector("#rewards-popup div:nth-child(1) > div:nth-child(1) > div > div >img");
    private static final By BENEFIT_TITLE = By.cssSelector("#rewards-popup div:nth-child(1) > div:nth-child(1) > div > h3");
    private static final By BENEFIT_DESCRIPTION = By.cssSelector("#rewards-popup div:nth-child(1) > div:nth-child(1) > ul");
    private static final By OUR_BUSINESS_RESOURCE = By.cssSelector("div.wp-block-group.section-spacing-top-bottom1.container.container-wide");
    private static final By DIVERSITY_VIDEO = By.cssSelector("div.section-slider-widget.slick-initialized.slick-slider div.image-wrapper > a");
    private static final By DIVERSITY_VIDEO_BUTTON = By.cssSelector("div.section-slider-widget.slick-initialized.slick-slider div.image-wrapper > a");
    private static final By VIDEO_SCREEN = By.cssSelector("#movie_player");
    private static final By CAREER_STORIES = By.cssSelector("div.wp-block-group.bg-logo-light > div > div.wp-block-group");
    private static final By CAREER_STORIES_RIGHT_BUTTON = By.cssSelector("button.slick-next.slick-arrow");
    private static final By CAREER_STORIES_LEFT_BUTTON = By.cssSelector("button.slick-prev.slick-arrow");
    private static final By SO_HOW_DO_WE_DO_IT = By.cssSelector("div.wp-block-group.bg-logo-light > div > div.wp-block-group");
    private static final By OUR_JOURNEY_CARE = By.cssSelector("section:nth-child(3) > div > div div.section-slider-widget.slick-initialized.slick-slider div.image-wrapper > a");
    private static final By GOING_BEYOND_JOURNEY_CARE = By.cssSelector("div.wp-block-group.bg-logo-light > div > section:nth-child(4) > div div.section-slider-widget.slick-initialized.slick-slider div.image-wrapper > a");
    //private static final By HEAR_FROM_TEAM_MEMBER = By.cssSelector("button.slick-next.slick-arrow");
    private static final By STORIES_BLOG = By.cssSelector("div.blog-feed.rel > div.container > div");
    private static final By SELECT_STORY = By.cssSelector("div.blog-feed.rel > div.container > div > div:nth-child(1) > a > div > img");
    private static final By SOCIAL_MEDIA_STORY_PAGE = By.cssSelector("div.blog-feed.rel > div.container > div");
    private static final By EMAIl_STORY_PAGE = By.cssSelector("div.blog-feed.rel > div.container > div");
    private static final By STORY_TITLE_STORIES = By.cssSelector("div.blog-feed.rel >div.container > div > div:nth-child(1) > div > p");
    private static final By STORY_TEXT_STORIES = By.cssSelector("div.blog-feed.rel > div.container > div > div:nth-child(1) > div > a");
    private static final By STORY_IMAGE_STORIES = By.cssSelector("div.blog-feed.rel > div.container > div > div:nth-child(1) > a > div > img");
    private static final By STORY_DETAILS = By.cssSelector("#story-info-wrapper > div > div.intro-wrapper");
    private static final By STORIES_FILTER_HEADER = By.cssSelector("section > div.blog-feed.rel > div.category-filter");
    private static final By BEAUTY_STORY = By.cssSelector("div.blog-feed.rel > div.category-filter > div > div.category-wrapper > a:nth-child(2)");
    private static final By COMMUNITY_STORY = By.cssSelector("div.blog-feed.rel > div.category-filter > div > div.category-wrapper > a:nth-child(3)");
    private static final By EARLY_CAREER_STORY = By.cssSelector("div.blog-feed.rel > div.category-filter > div > div.category-wrapper > a:nth-child(4)");
    private static final By IRELAND_STORY = By.cssSelector("div.blog-feed.rel > div.category-filter > div > div.category-wrapper > a:nth-child(5)");
    private static final By OPTICIAN_STORY = By.cssSelector("div.blog-feed.rel > div.category-filter > div > div.category-wrapper > a:nth-child(6)");
    private static final By PHARMACY_STORY = By.cssSelector("div.blog-feed.rel > div.category-filter > div > div.category-wrapper > a:nth-child(7)");
    private static final By RETAIL_STORY = By.cssSelector("div.blog-feed.rel > div.category-filter > div > div.category-wrapper > a:nth-child(8)");
    private static final By SUPPLY_CHAIN_STORY = By.cssSelector("div.blog-feed.rel > div.category-filter > div > div.category-wrapper > a:nth-child(9)");
    private static final By SUPPORT_OFFICE_STORY = By.cssSelector("div.blog-feed.rel > div.category-filter > div > div.category-wrapper > a:nth-child(10)");



    public HomePageSteps() throws IOException {
    }


    /*public HomePageSteps(WebDriver driver) {
        super(driver);
    }*/
   /* public BaseTest baseTest;*/
   /* public AbstractComponent abstractComponent;*/


  /*  @Before
    public void initDriver() throws IOException {
        System.out.println("I Enter here ");
        driver = initializeDriver();

    }*/

    @Given("^User is on Boots Home page$")
    public void userIsOnBootsHomePage() throws IOException {
        launchApplication();
        //assertTrue(getCurrentPageTitle().contains("Boots Jobs"));
    }



    @When("^user accept cookie$")
    public void userAcceptCookie() {
        waitForExpectedElement(ACCEPT_COOKIE,10);
        clickByElementByQueryJSExecutor(ACCEPT_COOKIE);
        Assert.assertTrue(invisibilityOfElementLocated(ACCEPT_COOKIE, Duration.ofSeconds(5)));
    }


    @And("^headers are displayed$")
    public void headersAreDisplayed() {
        Assert.assertTrue(isElementDisplayedBySeconds(BOOTS_ICON_HEADER,5));
        Assert.assertTrue(isElementDisplayedBySeconds(HEADER_SECTION,5));
        Assert.assertTrue(isElementDisplayedBySeconds(SEARCH_BUTTON_HEADER,5));

    }


    @When("Click on Boots Logo")
    public void clickOnBootsLogo() {
        clickByElementByQueryJSExecutor(BOOTS_LOGO);

    }

    @Then("Page get refreshed and home page displayed")
    public void pageGetRefreshedAndHomePageDisplayed() {
        waitForExpectedElement(HOME_PAGE_BANNER,5);
        assertTrue(isElementDisplayedBySeconds(HOME_PAGE_BANNER,5));
    }

    @When("user click on Home option on header")
    public void userClickOnHomeOptionOnHeader() {
         clickByElementByQueryJSExecutor(HOME_HEADER);
    }

    @When("user click on Why boots")
    public void userClickOnWhyBoots() {
         clickByElementByQueryJSExecutor(WHY_BOOTS_HEADER);
    }

    @Then("verify user navigates to Why boots page")
    public void verifyUserNavigatesToWhyBootsPage() {
        waitForAjaxElementNotToBePresent(driver,4);
        assertTrue(driver.getCurrentUrl().contains("/why-boots/"));
    }

    @When("user hover on Career areas")
    public void userHoverOnCareerAreas() {
         waitForAjaxElementNotToBePresent(driver,4);
         hoverOnElement(CAREER_AREAS_HEADER);
    }

    @Then("career areas drop down is displayed")
    public void careerAreasDropDownIsDisplayed() {
        assertTrue( isElementDisplayedBySeconds(CAREER_AREAS_SUB_MENU, 5));
    }

    @When("user click on Our stories")
    public void userClickOnOurStories() {
        clickByElementByQueryJSExecutor(OUR_STORIES_HEADER);
    }


    @Then("assert URL contains text '(.*)'$")
    public void assertURLContainsText(String expectedText) {
         urlContainsText(expectedText);
    }


    @When("user click on Search Jobs CTA")
    public void userClickOnSearchJobsCTA() {
         clickByElementByQueryJSExecutor(SEARCH_JOBS_HEADER);
    }


    @When("user click on FAQs")
    public void userClickOnFAQs() {
         scrollToElement(FAQS_FOOTER);
         clickByElementByQueryJSExecutor(FAQS_FOOTER);
    }

    @When("user click on Log In")
    public void userClickOnLogIn() {
         clickByElementByQueryJSExecutor(LOG_IN_TOP_MENU);
         waitForExpectedElement(LOGIN_POPUP_BOX,5);
    }


    @And("clicked on I want to work for boot")
    public void clickedOnIWantToWorkForBoot() {
         if (isElementDisplayedBySeconds(LOGIN_POPUP_BOX,5)){
             clickByElementByQueryJSExecutor(I_WANT_TO_WORK_FOR_BOOTS_CTA);
         }
         else
         {
             clickByElementByQueryJSExecutor(LOG_IN_TOP_MENU);
             waitForExpectedElement(LOGIN_POPUP_BOX,5);
             clickByElementByQueryJSExecutor(I_WANT_TO_WORK_FOR_BOOTS_CTA);
         }
    }

    @Then("Search jobs field is displayed")
    public void searchJobsFieldIsDisplayed() {
         waitForExpectedElement(SEARCH_JOB_FIELD_HOME_PAGE,5);
        assertTrue( isElementDisplayedBySeconds(SEARCH_NOW_CTA,5));
    }

    @When("user enters Keyword")
    public void userEntersKeyword() {
         enterDataAndWait(SEARCH_JOB_KEYWORD,"Tester");
         waitForAjaxElementNotToBePresent(driver,4);
    }

    @And("user enters location")
    public void userEntersLocation() {
         enterDataAndWait(SEARCH_JOB_LOCATION,"India");
         waitForAjaxElementNotToBePresent(driver,4);

    }

    @And("user selects distance")
    public void userSelectsDistance() {
        selectValueFromDropDownByIndex(1,SEARCH_JOB_DISTANCE);
         /*clickByElementByQueryJSExecutor(SEARCH_JOB_DISTANCE);
         waitForExpectedElement(SEARCH_JOB_SELECT_DISTANCE);
         clickByElementByQueryJSExecutor(SEARCH_JOB_SELECT_DISTANCE);
         waitForAjaxElementNotToBePresent(driver,4);*/
    }

    @And("user clicks on Search Now CTA")
    public void userClicksOnSearchNowCTA() {
         clickByElementByQueryJSExecutor(SEARCH_NOW_CTA);
         waitForAjaxElementNotToBePresent(driver,4);
    }

    @And("user selects I want to work for Boots CTA")
    public void userSelectsIWantToWorkForBootsCTA() {
         waitForExpectedElement(LOG_IN_POPUP,5);
         clickByElementByQueryJSExecutor(I_WANT_TO_WORK_FOR_BOOTS_CTA_SEARCH);
    }

    @Then("View all FAQs CTA displayed")
    public void viewAllFAQsCTADisplayed() {
         waitForPage();
         scrollToElement(VIEW_ALL_FAQS_HOME);
        assertTrue( isElementDisplayedBySeconds(VIEW_ALL_FAQS_HOME,5));
    }

    @When("click on View all FAQs CTA")
    public void clickOnViewAllFAQsCTA() {
         clickByElementByQueryJSExecutor(VIEW_ALL_FAQS_HOME);
    }

    @Then("Social media icons displayed")
    public void socialMediaIconsDisplayed() {
         scrollToElement(SOCIAL_MEDIA_LINKS_HOME);
        assertTrue( isElementDisplayedBySeconds(SOCIAL_MEDIA_LINKS_HOME,5));
    }


    @When("user click on Instagram Icon")
    public void userClickOnInstagramIcon() {
         clickByElementByQueryJSExecutor(INSTAGRAM_LINK_HOME);
    }

    @And("return to boots home page")
    public void returnToBootsHomePage() {
        driver.switchTo().defaultContent();
    }

    @When("user click on Facebook icon")
    public void userClickOnFacebookIcon() {
         scrollToElement(SOCIAL_MEDIA_LINKS_HOME);
         clickByElementByQueryJSExecutor(FACEBOOK_LINK_HOME);
    }

    @When("user click on Twitter icon")
    public void userClickOnTwitterIcon() {
         scrollToElement(SOCIAL_MEDIA_LINKS_HOME);
         clickByElementByQueryJSExecutor(TWITTER_LINK_HOME);
    }

    @When("user click on LinkedIn Icon")
    public void userClickOnLinkedInIcon() {
         scrollToElement(SOCIAL_MEDIA_LINKS_HOME);
         clickByElementByQueryJSExecutor(LINKEDIN_LINK_HOME);
    }

    @And("FAQs are displayed")
    public void faqsAreDisplayed() {
         scrollToElement(FAQS_HOME);
        assertTrue( isElementDisplayedBySeconds(FAQS_HOME,5));

    }

    @When("user click on first FAQ accordion")
    public void userClickOnFirstFAQAccordion() {
         clickByElementByQueryJSExecutor(FIRST_FAQS_HOME);
    }

    @Then("accordion should expand")
    public void accordionShouldExpand() {
        assertTrue( isElementDisplayedBySeconds(FIRST_FAQS_CONTENT_HOME,5));
    }

    @When("User click on Expanded accordion")
    public void userClickOnExpandedAccordion() {
         clickByElementByQueryJSExecutor(FIRST_FAQS_HOME);
         waitForAjaxElementNotToBePresent(driver,5);
    }

    @Then("Accordion get collapsed")
    public void accordionGetCollapsed() {
        waitForAjaxElementNotToBePresent(driver,5);
        assertFalse(isElementDisplayedBySeconds(FIRST_FAQS_CONTENT_HOME,5));
    }

    @Then("click and verify career at boots from footer")
    public void clickAndVerifyCareerAtBootsFromFooter() {
        scrollToPageBottom();
        assertTrue(isElementDisplayedBySeconds(CAREER_AT_BOOTS_FOOTER,5));
        clickByElementByQueryJSExecutor(CAREER_AT_BOOTS_FOOTER);
        waitForExpectedElement(CAREER_AT_BOOTS_SUBFOOTER,5);
    }

    @Then("dropdown should displayed")
    public void dropdownShouldDisplayed() {
        waitForExpectedElement(CAREER_AT_BOOTS_SUBFOOTER,5);
        assertTrue( isElementDisplayedBySeconds(CAREER_AT_BOOTS_SUBFOOTER,5));
    }


    @When("user click on Pharmacy Jobs")
    public void userClickOnPharmacyJobs() {
         waitForExpectedElement(PHARMACY_JOB_FOOTER,10);
         clickByElementByQueryJSExecutor(PHARMACY_JOB_FOOTER);
    }

    @When("user click on Opticians Jobs")
    public void userClickOnOpticiansJobs() {
         waitForExpectedElement(OPTICIAN_JOB_FOOTER);
         clickByElementByQueryJSExecutor(OPTICIAN_JOB_FOOTER);
    }

    @When("user click on Retail Jobs")
    public void userClickOnRetailJobs() {
         waitForExpectedElement(RETAIL_JOB_FOOTER);
         clickByElementByQueryJSExecutor(RETAIL_JOB_FOOTER);
    }

    @When("user click on Supply Chain Jobs")
    public void userClickOnSupplyChainJobs() {
         waitForExpectedElement(SUPPLY_CHAIN_JOB_FOOTER);
         clickByElementByQueryJSExecutor(SUPPLY_CHAIN_JOB_FOOTER);
    }

    @When("user click on Support Office Jobs")
    public void userClickOnSupportOfficeJobs() {
         waitForExpectedElement(SUPPORT_OFFICE_JOB_FOOTER);
         clickByElementByQueryJSExecutor(SUPPORT_OFFICE_JOB_FOOTER);
    }


    @When("user click on Early Careers")
    public void userClickOnEarlyCareers() {
         waitForExpectedElement(EARLY_CAREERS_JOB_FOOTER);
         clickByElementByQueryJSExecutor(EARLY_CAREERS_JOB_FOOTER);
    }

    @When("user click on Ireland Jobs")
    public void userClickOnIrelandJobs() {
         waitForExpectedElement(IRELAND_JOB_FOOTER);
         clickByElementByQueryJSExecutor(IRELAND_JOB_FOOTER);
    }

    @When("user click on Airports Jobs")
    public void userClickOnAirportsJobs() {
         waitForExpectedElement(AIRPORTS_JOB_FOOTER);
         clickByElementByQueryJSExecutor(AIRPORTS_JOB_FOOTER);
    }

    @Then("Career area filters are displayed")
    public void careerAreaFiltersAreDisplayed() {
         scrollToElement(CAREER_AREA_HOMEPAGE);
        assertTrue( isElementDisplayedBySeconds(CAREER_AREA_HOMEPAGE,5));
    }


    @Then("View Stories CTA displayed")
    public void viewStoriesCTADisplayed() {
         scrollToElement(VIEW_ALL_STORIES_CTA_HOMEPAGE);
        assertTrue( isElementDisplayedBySeconds(VIEW_ALL_STORIES_CTA_HOMEPAGE,5));
    }

    @When("user selects category")
    public void userSelectsCategory() {
        /* clickByElementByQueryJSExecutor(CAREER_AREA_DROPDOWN);
         clickByElementByQueryJSExecutor(CAREER_AREA_FIRST_OPTION);*/
         selectValueFromDropDownByIndex(1,CAREER_AREA_DROPDOWN);
    }


    @Then("stories as per category displayed")
    public void storiesAsPerCategoryDisplayed() {
         waitForExpectedElement(DROP_DOWN_TEXT).getText();
         waitForExpectedElement(SELECTED_CAREER_TEXT).getText();
         waitForExpectedElement(STORY_HEADING_TEXT).getText();
        //assertEqual similar text contains

    }


    @And("each story with Image and description displayed")
    public void eachStoryWithImageAndDescriptionDisplayed() {
        assertTrue( isElementDisplayedBySeconds(SELECTED_CAREER_IMAGE,4));
        assertTrue( isElementDisplayedBySeconds(SELECTED_CAREER_CONTENT,5));
    }

    @When("user selects another category from list")
    public void userSelectsAnotherCategoryFromList() {
        selectValueFromDropDownByIndex(2,CAREER_AREA_DROPDOWN);
       /* waitForExpectedElement(CAREER_AREA_DROPDOWN,5);
         clickByElementByQueryJSExecutor(CAREER_AREA_DROPDOWN);
         clickByElementByQueryJSExecutor(CAREER_AREA_SECOND_OPTION);*/
    }


    @When("user click on View stories CTA")
    public void userClickOnViewStoriesCTA() {
         clickByElementByQueryJSExecutor(VIEW_ALL_STORIES_CTA_HOMEPAGE);
    }

    @And("user selected category from Career area dropdown")
    public void userSelectedCategoryFromCareerAreaDropdown() {
         scrollToElement(CAREER_AREA_HOMEPAGE);
         selectValueFromDropDownByIndex(1,CAREER_AREA_DROPDOWN);
         /*clickByElementByQueryJSExecutor(CAREER_AREA_DROPDOWN);
         clickByElementByQueryJSExecutor(CAREER_AREA_FIRST_OPTION);*/
    }

    @When("click on one story")
    public void clickOnOneStory() {
         clickByElementByQueryJSExecutor(SELECTED_CAREER_IMAGE);
    }


    @Then("Redirected to Story page then Image and Description displayed")
    public void redirectedToStoryPageThenImageAndDescriptionDisplayed() {
        //code for page redirect to selected story
        assertTrue( getCurrentUrl().contains("stories"));
        assertTrue( isElementDisplayedBySeconds(SELECTED_CAREER_IMAGE_STORY_PAGE,5));
        assertTrue( isElementDisplayedBySeconds(SELECTED_CAREER_CONTENT_STORY_PAGE,5));
    }


    @Then("Jobs that might interest you displayed")
    public void jobsThatMightInterestYouDisplayed() {
         scrollToElement(JOB_INTEREST_HOMEPAGE);
        assertTrue( isElementDisplayedBySeconds(JOB_INTEREST_HOMEPAGE,5));
    }


    @Then("Find out more CTA displayed")
    public void findOutMoreCTADisplayed() {
        assertTrue(isElementDisplayedBySeconds(FIND_OUT_MORE_CTA,5));
    }


    @Then("Category name and Job role and Location displayed")
    public void categoryNameAndJobRoleAndLocationDisplayed() {
        assertTrue( isElementDisplayedBySeconds(JOB_DETAILS_CARD,5));
    }


    @When("user click on Find out more CTA")
    public void userClickOnFindOutMoreCTA() {
         clickByElementByQueryJSExecutor(FIND_OUT_MORE_CTA);
    }


    @Then("redirected to Story page and story description displayed")
    public void redirectedToStoryPageAndStoryDescriptionDisplayed() {
        assertTrue( isElementDisplayedBySeconds(JOB_SUMMARY_CARD,5));
        assertTrue( isElementDisplayedBySeconds(JOB_DESCRIPTION,5));
    }


    @Then("why boots section displayed")
    public void whyBootsSectionDisplayed() {
        scrollToElement(WHY_BOOTS_SECTION);
        assertTrue(isElementDisplayedBySeconds(WHY_BOOTS_SECTION,5));
    }


    @Then("Banner image with text displayed")
    public void bannerImageWithTextDisplayed() {
        assertTrue( isElementDisplayedBySeconds(WHY_BOOTS_TEXT,5));
        assertTrue( isElementDisplayedBySeconds(WHY_BOOT_IMAGE,5));
    }


    @Then("Explore more CTA displayed")
    public void exploreMoreCTADisplayed() {
        assertTrue( isElementDisplayedBySeconds(EXPLORE_MORE_CTA,5));
    }

    @When("user click on Explore more CTA")
    public void userClickOnExploreMoreCTA() {
         clickByElementByQueryJSExecutor(EXPLORE_MORE_CTA);
    }


    @Then("Instagram stories are displayed")
    public void instagramStoriesAreDisplayed() {
        //scrollToElement(INSTAGRAM_STORIES_HOMEPAGE);
        scrollToPageBottom();
        assertTrue(isElementDisplayedBySeconds(INSTAGRAM_STORIES_HOMEPAGE,5));
    }


    @When("user mouse hover on story image")
    public void userMouseHoverOnStoryImage() {
        hoverOnElement(FIRST_INSTAGRAM_STORY);
    }


    @Then("Text displayed with like and comment CTA")
    public void textDisplayedWithLikeAndCommentCTA() {
        assertTrue( isElementDisplayedBySeconds(INSTAGRAM_STORY_TEXT,4));
        assertTrue( isElementDisplayedBySeconds(INSTAGRAM_STORY_LIKE,4));
        assertTrue( isElementDisplayedBySeconds(INSTAGRAM_STORY_COMMENT,4));
    }


    @When("Click on story")
    public void clickOnStory() {
         clickByElementByQueryJSExecutor(FIRST_INSTAGRAM_STORY);
    }


    @Then("Footer is displayed")
    public void footerIsDisplayed() {
         scrollToPageBottom();
        assertTrue( isElementDisplayedBySeconds(FOOTER_FIELD,5));
    }


    @Then("Badge displayed")
    public void badgeDisplayed() {
        assertTrue( isElementDisplayedBySeconds(FOOTER_BADGE,5));
    }

    @When("User click on About boots footer")
    public void userClickOnAboutBootsFooter() {
         clickByElementByQueryJSExecutor(ABOUT_BOOTS_FOOTER);
    }

    @When("user click on Boots.com footer")
    public void userClickOnBootsComFooter() {
         clickByElementByQueryJSExecutor(BOOTS_COM_FOOTER);
    }

    @When("user click on FAQs footer")
    public void userClickOnFAQsFooter() {
         clickByElementByQueryJSExecutor(FAQS_FOOTER_FOOTER);

    }

    @Then("Sub footer is displayed along with social media logos")
    public void subFooterIsDisplayedAlongWithSocialMediaLogos() {
         scrollToPageBottom();
        assertTrue( isElementDisplayedBySeconds(SUB_FOOTER_FIELD,5));
        assertTrue( isElementDisplayedBySeconds(SUB_FOOTER_SOCIAL_LINK,5));
    }

    @When("user click on Accessibility")
    public void userClickOnAccessibility() {
         clickByElementByQueryJSExecutor(ACCESSIBILITY_FOOTER);
    }

    @When("user click on Sitemap")
    public void userClickOnSitemap() {
         clickByElementByQueryJSExecutor(SITEMAP_FOOTER);
    }

    @When("user click on Privacy statement")
    public void userClickOnPrivacyStatement() {
         clickByElementByQueryJSExecutor(PRIVACY_STATEMENT_FOOTER);
    }

    @When("user click on Cookies policy")
    public void userClickOnCookiesPolicy() {
         clickByElementByQueryJSExecutor(COOKIES_POLICY_FOOTER);
    }

    @When("user click on  Careers at boots footer")
    public void userClickOnCareersAtBootsFooter() {
         clickByElementByQueryJSExecutor(CAREERS_AT_BOOTS_FOOTER);
    }

    @Then("Drop down displayed")
    public void dropDownDisplayed() {
        assertTrue( isElementDisplayedBySeconds(CAREER_BOOTS_DROPDOWN,5));
    }

    @When("user click on Facebook icon footer")
    public void userClickOnFacebookIconFooter() {
         clickByElementByQueryJSExecutor(FACEBOOK_FOOTER);
    }

    @When("user click on Twitter icon footer")
    public void userClickOnTwitterIconFooter() {
         clickByElementByQueryJSExecutor(TWITTER_FOOTER);
    }

    @When("user click on Instagram Icon footer")
    public void userClickOnInstagramIconFooter() {
         clickByElementByQueryJSExecutor(INSTAGRAM_FOOTER);

    }

    @When("user click on LinkedIn Icon footer")
    public void userClickOnLinkedInIconFooter() {
         clickByElementByQueryJSExecutor(LINKEDIN_FOOTER);

    }

    @Then("Sign in option displayed")
    public void signInOptionDisplayed() {
        //get window handlers as list
        List<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
//switch to new tab
        driver.switchTo().window(browserTabs .get(1));
        assertTrue(driver.getTitle().contains("Job Search"));
        /*driver.close();*/
        //driver.switchTo().window(browserTabs.get(0));
    }

    @And("user redirected to different page")
    public void userRedirectedToDifferentPage() {
        assertTrue(driver.getCurrentUrl().contains("krb-sjobs.brassring.com"));
    }

    @And("close browser after execution")
    public void closeBrowserAfterExecution() {
       /* tearDown();*/
    }

    @Then("assert URL open in different tabs contains text {string}")
    public void assertURLOpenInDifferentTabsContainsText(String expectedTabText) {
        List<String> browserTabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(browserTabs .get(1));
        urlContainsText(expectedTabText);
        driver.close();
        driver.switchTo().window(browserTabs.get(0));
    }


    @And("basic filter are displayed")
    public void basicFilterAreDisplayed() {
        assertTrue(isElementDisplayedBySeconds(JOB_FILTER_KEYWORD,5));
        assertTrue(isElementDisplayedBySeconds(JOB_FILTER_TOWN,5));
        assertTrue(isElementDisplayedBySeconds(JOB_FILTER_DISTANCE,5));
        assertTrue(isElementDisplayedBySeconds(JOB_FILTER_REFERENCE,5));

    }

    @And("advanced filter are displayed")
    public void advancedFilterAreDisplayed() {
        assertTrue(isElementDisplayedBySeconds(JOB_FILTER_BUSINESS_AREA,5));
        assertTrue(isElementDisplayedBySeconds(JOB_FILTER_FUNCTIONAL_AREA,5));
        assertTrue(isElementDisplayedBySeconds(JOB_FILTER_FULL_PART_TIME,5));
        assertTrue(isElementDisplayedBySeconds(JOB_FILTER_CONTRACT,5));

    }

   /* -------------------------------------------------------------------------------------
    SearchJobStepDefination start from here
    -------------------------------------------------------------------------------------   */

    @Given("^Search jobs filters are displayed$")
    public void searchJobFiltersDisplayed(){
        waitForExpectedElement(JOB_SEARCH_FORM_PAGE);
        assertTrue(isElementDisplayedBySeconds(JOB_SEARCH_FORM_PAGE,5));
    }


    @When("check for parameters displayed")
    public void checkForParametersDisplayed() {
        //need to check for what data need to verify

    }

    @Then("select distance is not clickable")
    public void selectDistanceIsNotClickable() {
        assertFalse(isElementClickable(SELECT_DISTANCE_JOB_PAGE));
    }

    @Then("enter town, city or postcode option now select distance is clickable")
    public void enterTownCityOrPostcodeOptionNowSelectDistanceIsClickable() {
        waitClearAndEnterText(LOCATION_JOB_PAGE,"London");
        assertTrue(isElementClickable(SELECT_DISTANCE_JOB_PAGE));
    }



    @After
    public void teardown() {
        driver.quit();
    }

    @When("user enters Job Keyword")
    public void userEntersJobKeyword() {
        waitClearAndEnterText(KEYWORD_JOB_PAGE,"Beauty");
    }

    @And("user enters Job Town")
    public void userEntersJobTown() {
        waitClearAndEnterText(LOCATION_JOB_PAGE,"London");
    }


    @And("user selects Job distance")
    public void userSelectsJobDistance() {
        selectValueFromDropDownByIndex(1,SELECT_DISTANCE_JOB_PAGE);
    }


    @And("user enters Enter Job preference")
    public void userEntersEnterJobPreference() {
        waitClearAndEnterText(PREFERENCE_JOB_PAGE,"text");
    }


    @And("user selects Job Select business area")
    public void userSelectsJobSelectBusinessArea() {
        selectValueFromDropDownByIndex(1,SELECT_BUSINESS_AREA_JOB_PAGE);
    }

    @And("user selects Job Select function area")
    public void userSelectsJobSelectFunctionArea() {
        selectValueFromDropDownByIndex(1,SELECT_FUNCTION_AREA_JOB_PAGE);

    }

    @And("user selects Job Select parttime or full time")
    public void userSelectsJobSelectParttimeOrFullTime() {
        selectValueFromDropDownByIndex(1,SELECT_TIME_JOB_PAGE);

    }

    @And("user selects Job Select contract type")
    public void userSelectsJobSelectContractType() {
        selectValueFromDropDownByIndex(1,SELECT_CONTRACT_JOB_PAGE);
    }

    @And("User clicks on Search CTA")
    public void userClicksOnSearchCTA() {
        clickByElementByQueryJSExecutor(SEARCH_BTN_JOB_PAGE);
    }


    @Then("Result are display accordingly")
    public void resultAreDisplayAccordingly() {
        waitForExpectedElement(FILTER_LIST_JOB_PAGE,10);
        assertTrue(isElementDisplayedBySeconds(FILTER_LIST_JOB_PAGE,5));
        assertTrue(isElementDisplayedBySeconds(RESULTS_JOBS_PAGE,5));
    }

    @And("User did not enter any filters and clicks on Search  CTA")
    public void userDidNotEnterAnyFiltersAndClicksOnSearchCTA() {
        userClicksOnSearchCTA();
    }


    @Then("default Search results are displayed")
    public void defaultSearchResultsAreDisplayed() {
        waitForExpectedElement(RESULTS_JOBS_PAGE,10);
        assertTrue(isElementDisplayedBySeconds(RESULTS_JOBS_PAGE,5));
    }

    @Then("redirected to Boots Home page")
    public void redirectedToBootsHomePage() {
        pageGetRefreshedAndHomePageDisplayed();
    }

    @And("Hide Advance filters displayed")
    public void hideAdvanceFiltersDisplayed() {
        assertTrue(isElementDisplayedBySeconds(HIDE_FILTER_JOBS_PAGE,5));
    }

    @When("User click on Hide advance filters")
    public void userClickOnHideAdvanceFilters() {
        clickByElementByQueryJSExecutor(HIDE_FILTER_JOBS_PAGE);
    }


    @And("user click on clear search")
    public void userClickOnClearSearch() {
        clickByElementByQueryJSExecutor(CLEAR_FILTER_JOBS_PAGE);
    }

    @Then("Result with no filter display")
    public void resultWithNoFilterDisplay() {
        waitForExpectedElement(RESULTS_JOBS_PAGE,10);
        assertFalse(isElementDisplayedBySeconds(FILTER_LIST_JOB_PAGE,5));
        assertTrue(isElementDisplayedBySeconds(RESULTS_JOBS_PAGE,5));
    }

    @And("Clear Filter is displayed")
    public void clearFilterIsDisplayed() {
        assertTrue(isElementDisplayedBySeconds(CLEAR_FILTER_JOBS_PAGE,5));
    }


    @Then("click on I already work for Boots")
    public void clickOnIAlreadyWorkForBoots() {
        clickByElementByQueryJSExecutor(ALREADY_WORK_JOBS_PAGE);
    }

    @When("Verify Select Job levels with drop down Displayed")
    public void verifySelectJobLevelsWithDropDownDisplayed() {
        waitForExpectedElement(JOB_LEVEL_JOB_PAGE);
        assertTrue(isElementDisplayedBySeconds(JOB_LEVEL_JOB_PAGE,5));
    }

    @Then("user selects Job Select Job Level")
    public void userSelectJobSelectJobLevel() {
        selectValueFromDropDownByIndex(3,JOB_LEVEL_JOB_PAGE);
    }


    @And("Page number displayed")
    public void pageNumberDisplayed() {
        scrollToElement(PAGE_NUMBERS_JOB_PAGE);
        assertTrue(isElementDisplayedBySeconds(PAGE_NUMBERS_JOB_PAGE,5));
    }

    @When("click on the page number")
    public void clickOnThePageNumber() {
        clickByElementByQueryJSExecutor(SELECT_PAGE_NUMBER_JOB_PAGE);
    }

    @Then("Search results should displayed with name, Role, Location, Contract type, Full time or part time, Apply now button with View Job description link")
    public void searchResultsShouldDisplayedWithNameRoleLocationContractTypeFullTimeOrPartTimeApplyNowButtonWithViewJobDescriptionLink() {
        assertTrue(isElementDisplayedBySeconds(JOB_TITLE_JOB_CARD,5));
        assertTrue(isElementDisplayedBySeconds(JOB_ROLE_JOB_CARD,5));
        assertTrue(isElementDisplayedBySeconds(JOB_LOCATION_JOB_CARD,5));
        assertTrue(isElementDisplayedBySeconds(JOB_CONTRACT_JOB_CARD,5));
        assertTrue(isElementDisplayedBySeconds(JOB_TIME_JOB_CARD,5));
        assertTrue(isElementDisplayedBySeconds(APPLY_NOW_BTN_JOB_CARD,5));
        assertTrue(isElementDisplayedBySeconds(JOB_DESCRIPTION_JOB_CARD,5));

    }

     /* -------------------------------------------------------------------------------------
    WhyBootsStepDefination start from here
    -------------------------------------------------------------------------------------   */
     @And("Sub headers are displayed")
     public void subHeadersAreDisplayed() {
         assertTrue(isElementDisplayedBySeconds(WHY_BOOTS_SUB_HEADER,5));
     }


    @When("user click on Care")
    public void userClickOnCare() {
        clickByElementByQueryJSExecutor(WHY_BOOTS_CARE);
    }

    @When("user click on Your development")
    public void userClickOnYourDevelopment() {
         waitForExpectedElement(WHY_BOOTS_YOUR_DEVELOPMENT);
        clickByElementByQueryJSExecutor(WHY_BOOTS_YOUR_DEVELOPMENT);
    }

    @When("user click on Diversity & inclusion")
    public void userClickOnDiversityInclusion() {
        waitForExpectedElement(WHY_BOOTS_DIVERSITY_INCLUSION);
        clickByElementByQueryJSExecutor(WHY_BOOTS_DIVERSITY_INCLUSION);
    }

    @When("user click on Rewards & Benefit")
    public void userClickOnRewardsBenefit() {
        waitForExpectedElement(WHY_BOOTS_REWARDS_BENEFIT);
        clickByElementByQueryJSExecutor(WHY_BOOTS_REWARDS_BENEFIT);
    }

    @And("user is on Rewards & benefits page")
    public void userIsOnRewardsBenefitsPage() {
        waitForExpectedElement(WHY_BOOTS_REWARDS_BENEFIT);
        clickByElementByQueryJSExecutor(WHY_BOOTS_REWARDS_BENEFIT);
    }

    @And("Our support office video displayed")
    public void ourSupportOfficeVideoDisplayed() {
         waitForExpectedElement(OUR_SUPPORT_OFFICE_AREA);
         assertTrue(isElementDisplayedBySeconds(OUR_SUPPORT_OFFICE_VIDEO,5));
    }

    @When("user click on Our support office video play button")
    public void userClickOnOurSupportOfficeVideoPlayButton() {
         clickByElementByQueryJSExecutor(OUR_SUPPORT_OFFICE_VIDEO);
    }

    @Then("video should be played")
    public void videoShouldBePlayed() {
        waitForExpectedElement(OUR_SUPPORT_OFFICE_VIDEO_SCREEN);
        assertTrue(isElementDisplayedBySeconds(OUR_SUPPORT_OFFICE_VIDEO_SCREEN,5));

    }

    @And("View Benefit CTA displayed")
    public void viewBenefitCTADisplayed() {
         scrollToElement(VIEW_BENEFIT_CTA);
         assertTrue(isElementDisplayedBySeconds(VIEW_BENEFIT_CTA,5));
    }

    @When("user click on View Benefit CTA")
    public void userClickOnViewBenefitCTA() {
        clickByElementByQueryJSExecutor(VIEW_BENEFIT_CTA);
    }

    @Then("Icons, Titles with details displayed")
    public void iconsTitlesWithDetailsDisplayed() {
         //Icon
        waitForExpectedElement(BENEFIT_ICON);
        assertTrue(isElementDisplayedBySeconds(BENEFIT_ICON,5));
        //Title
        assertTrue(isElementDisplayedBySeconds(BENEFIT_TITLE,5));
        //description
        assertTrue(isElementDisplayedBySeconds(BENEFIT_DESCRIPTION,5));
    }

    @And("Verify our Business Resource Groups displayed")
    public void verifyOurBusinessResourceGroupsDisplayed() {
         scrollToElement(OUR_BUSINESS_RESOURCE);
         assertTrue(isElementDisplayedBySeconds(OUR_BUSINESS_RESOURCE,5));
    }

    @And("Diversity Matters Video displayed")
    public void diversityMattersVideoDisplayed() {
         scrollToElement(DIVERSITY_VIDEO);
         assertTrue(isElementDisplayedBySeconds(DIVERSITY_VIDEO,5));
    }

    @When("click on diversity Video Play button")
    public void clickOnDiversityVideoPlayButton() {
        clickByElementByQueryJSExecutor(DIVERSITY_VIDEO_BUTTON);
    }


    @Then("video is getting played")
    public void videoIsGettingPlayed() {
        waitForExpectedElement(VIDEO_SCREEN);
        assertTrue(isElementDisplayedBySeconds(VIDEO_SCREEN,5));
    }

    @And("Explore our career stories displayed")
    public void exploreOurCareerStoriesDisplayed() {
         assertTrue(isElementDisplayedBySeconds(CAREER_STORIES,5));
    }

    @When("clicked Right Side arrow CTA")
    public void clickedRightSideArrowCTA() {
         clickByElementByQueryJSExecutor(CAREER_STORIES_RIGHT_BUTTON);
    }

    @When("clicked on Left side arrow CTA")
    public void clickedOnLeftSideArrowCTA() {
        clickByElementByQueryJSExecutor(CAREER_STORIES_LEFT_BUTTON);
    }

    @And("with title So how do we do it Videos displayed")
    public void withTitleSoHowDoWeDoItVideosDisplayed() {
         assertTrue(isElementDisplayedBySeconds(SO_HOW_DO_WE_DO_IT,5));
    }


    @When("clicked Our Journey Video Play button")
    public void clickedOurJourneyVideoPlayButton() {
         clickByElementByQueryJSExecutor(OUR_JOURNEY_CARE);
    }


    @When("clicked Going beyond business Video Play button")
    public void clickedGoingBeyondBusinessVideoPlayButton() {
         //need to put code to click elsewhere
        clickOutside();
        waitForExpectedElement(GOING_BEYOND_JOURNEY_CARE);
        clickByElementByQueryJSExecutor(GOING_BEYOND_JOURNEY_CARE);
    }

    public void clickOutside() {
        Actions action = new Actions(driver);
        action.moveByOffset(0, 0).click().build().perform();
    }

/*

    @And("Hear from our team members about working in … displayed")
    public void hearFromOurTeamMembersAboutWorkingInDisplayed() {
         scrollToElement(HEAR_FROM_TEAM_MEMBER);
         assertTrue(isElementDisplayedBySeconds(HEAR_FROM_TEAM_MEMBER,5));
    }

    @And("members images with description displayed")
    public void membersImagesWithDescriptionDisplayed() {
         assertTrue(isElementDisplayedBySeconds(MEMBER_IMAGE,5));
        assertTrue(isElementDisplayedBySeconds(MEMBER_DESCRIPTION,5));

    }

    @When("user moves curser over the images")
    public void userMovesCurserOverTheImages() {
         hoverOnElement(MEMBER_IMAGE);
    }

    @Then("information should get displayed")
    public void informationShouldGetDisplayed() {

    }

    @When("user click on any of the story")
    public void userClickOnAnyOfTheStory() {
         clickByElementByQueryJSExecutor(MEMBER_STORY_BUTTON);
    }
*/


    @Then("user redirected to the new story page")
    public void userRedirectedToTheNewStoryPage() {
         urlContainsText("stories");
    }

     /* -------------------------------------------------------------------------------------
    OurStoriesStepDefination start from here
    -------------------------------------------------------------------------------------   */

    @And("Stories are displayed")
    public void storiesAreDisplayed() {
        waitForExpectedElement(STORIES_BLOG);
        assertTrue(isElementDisplayedBySeconds(STORIES_BLOG,5));
    }

    @And("Search CTA displayed")
    public void searchCTADisplayed() {

    }

    @And("Select one story")
    public void selectOneStory() {
        clickByElementByQueryJSExecutor(SELECT_STORY);
    }

    @And("Social media icons displayed on story page")
    public void socialMediaIconsDisplayedOnStoryPage() {
        scrollToPageBottom();
        assertTrue(isElementDisplayedBySeconds(SOCIAL_MEDIA_STORY_PAGE,5));
    }

    @When("user click on Email Icon")
    public void userClickOnEmailIcon() {
        scrollToPageBottom();
        clickByElementByQueryJSExecutor(EMAIl_STORY_PAGE);
    }

    @Then("Header with text and image displayed")
    public void headerWithTextAndImageDisplayed() {
        //story title
        assertTrue(isElementDisplayedBySeconds(STORY_TITLE_STORIES,4));
        //story text
        assertTrue(isElementDisplayedBySeconds(STORY_TEXT_STORIES,4));
        //story image
        assertTrue(isElementDisplayedBySeconds(STORY_IMAGE_STORIES,4));

    }

    @Then("Story with details displayed")
    public void storyWithDetailsDisplayed() {
        waitForPage();
        assertTrue(isElementDisplayedBySeconds(STORY_DETAILS,5));
    }

    @And("story page subHeaders are displayed")
    public void storyPageSubHeadersAreDisplayed() {
        waitForExpectedElement(STORIES_FILTER_HEADER,10);
        assertTrue(isElementDisplayedBySeconds(STORIES_FILTER_HEADER,5));

    }

    @When("user click on Beauty")
    public void userClickOnBeauty() {
        clickByElementByQueryJSExecutor(BEAUTY_STORY);
    }

    @When("user click on community")
    public void userClickOnCommunity() {
        clickByElementByQueryJSExecutor(COMMUNITY_STORY);
    }

    @When("user click on Early career")
    public void userClickOnEarlyCareer() {
        clickByElementByQueryJSExecutor(EARLY_CAREER_STORY);
    }

    @When("user click on Ireland")
    public void userClickOnIreland() {
        clickByElementByQueryJSExecutor(IRELAND_STORY);
    }

    @When("user click on Opticians")
    public void userClickOnOpticians() {
        clickByElementByQueryJSExecutor(OPTICIAN_STORY);
    }

    @When("user click on Pharmacy")
    public void userClickOnPharmacy() {
        clickByElementByQueryJSExecutor(PHARMACY_STORY);
    }

    @When("user click on Retail")
    public void userClickOnRetail() {
        clickByElementByQueryJSExecutor(RETAIL_STORY);
    }

    @When("user click on Supply chain")
    public void userClickOnSupplyChain() {
        clickByElementByQueryJSExecutor(SUPPLY_CHAIN_STORY);
    }

    @When("user click on support office")
    public void userClickOnSupportOffice() {
        clickByElementByQueryJSExecutor(SUPPORT_OFFICE_STORY);
    }
}

