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
    private static final By OPEN_VIDEO_SCREEN = By.cssSelector("div.mfp-wrap.mfp-close-btn-in.mfp-auto-cursor.mfp-fade.mfp-ready > div > div.mfp-content");
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
    private static final By LEARNING_AND_DEVELOPMENT_AREA = By.cssSelector("div.wp-block-group.bg-logo-light > div > section.programmes-container");
    private static final By PHARMACY_LD = By.cssSelector("div.programmes-navigation-wrapper > div.programme.active");
    private static final By PHARMACY_LD_DESCRIPTION = By.cssSelector("div.programmes-navigation-wrapper > div.programme.active > div.introduction");
    private static final By RETAILS_LD = By.cssSelector("div.programmes-navigation-wrapper > div:nth-child(2)");
    private static final By RETAILS_LD_DESCRIPTION = By.cssSelector("div.programmes-navigation-wrapper > div.programme.active > div.introduction");
    private static final By SUPPORT_SUPPLIER_LD = By.cssSelector("div.programmes-navigation-wrapper > div:nth-child(3)");
    private static final By SUPPORT_SUPPLIER_LD_DESCRIPTION = By.cssSelector("div.programmes-navigation-wrapper > div.programme.active > div.introduction");
    private static final By OPTICIAN_LD = By.cssSelector("div.programmes-navigation-wrapper > div:nth-child(4)");
    private static final By OPTICIAN_LD_DESCRIPTION = By.cssSelector("div.programmes-navigation-wrapper > div.programme.active > div.introduction");
    private static final By LEADERSHIP_LD = By.cssSelector("div.programmes-navigation-wrapper > div:nth-child(5)");
    private static final By LEADERSHIP_LD_DESCRIPTION = By.cssSelector("div.programmes-navigation-wrapper > div.programme.active > div.introduction");
    private static final By BEAUTY_LD = By.cssSelector("div.programmes-navigation-wrapper > div:nth-child(6)");
    private static final By BEAUTY_LD_DESCRIPTION = By.cssSelector("div.programmes-navigation-wrapper > div.programme.active > div.introduction");
    private static final By WHY_BOOTS_BANNER = By.cssSelector(".swiper-wrapper > section >div >div.content-wrapper");
    private static final By WHY_BOOTS_SCROLL_DOWN_CTA = By.cssSelector("div.wp-block-columns.swiper-container.vertical-slides > button");
    private static final By WHY_BOOTS_BULLET_NAVIGATOR = By.cssSelector("div.wp-block-columns.swiper-container.vertical-slides > div.swiper-pagination.vertical-pagination.swiper-pagination-clickable.swiper-pagination-bullets");
    private static final By WHY_BOOTS_BULLET_NAVIGATOR_SECOND_OPTION = By.cssSelector("div.wp-block-columns.swiper-container > div.swiper-pagination.vertical-pagination > span:nth-child(2)");
    private static final By WHY_BOOTS_BULLET_NAVIGATOR_SECOND_OPTION_IMAGE = By.cssSelector("section:nth-child(2) div.image-wrapper > div.image-block.floating-img-right-bottom.mouse-move-animate");
    private static final By WHY_BOOTS_THIRD_BANNER_FIND_MORE_CTA = By.cssSelector("section:nth-child(3)> div > div.content-wrapper > div > a");




//Our_Stories selector

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
    private static final By BACK_TOP_CTA_OUR_STORIES = By.cssSelector("#content > section > div.scroll-to-top)");
    private static final By OUR_STORIES_TOP_POINT = By.cssSelector("div.blog-feed.rel > div.container > h1)");
    private static final By SEARCH_CTA_STORY = By.cssSelector("#search-wrapper > div > form > button");
    private static final By SEARCH_JOB_LOCATION_STORY = By.cssSelector("#search-text");

    //Selector for CareerAreas
    private static final By CURRENT_VACANCIES_RETAIL = By.cssSelector("section.navigation-header.row > div.career-head-wrapper > div > div > a");
    private static final By SHARE_PAGE_RETAIL = By.cssSelector("section.navigation-header.row > div.career-head-wrapper > div  button");
    private static final By SHARE_PAGE_DROPDOWN_RETAIL = By.cssSelector("sharethis-inline-share-buttons st-center st-has-labels");
    private static final By No7_BEAUTY_COMPANY_CAREERAREAS = By.cssSelector("div.my-header > nav > ul > li.rolestab.show-latest-story > ul > li:nth-child(11) > a");
    private static final By WALGREENS_BOOTS_ALLIANCE_CAREERAREAS = By.cssSelector("div.my-header > nav > ul > li.rolestab.show-latest-story > ul > li:nth-child(10) > a");
    private static final By HEARING_CARE_CAREERAREAS = By.cssSelector("div.my-header > nav > ul > li.rolestab.show-latest-story > ul > li:nth-child(9) > a");
    private static final By EARLY_CAREERS_CAREERAREAS = By.cssSelector("div.my-header > nav > ul > li.rolestab.show-latest-story > ul > li:nth-child(7) > a");
    private static final By WORK_EXPERIENCE_CAREERAREAS = By.cssSelector("div.btn-block-wrapper > ul > li:nth-child(3) > a");
    private static final By SPEAKER_FOR_SCHOOL = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li > a");
    private static final By VIDEO_SCREEN_POPUP = By.cssSelector("popup-youtube");
    private static final By OPTICIAN_CAREERAREAS = By.cssSelector("div.my-header > nav > ul > li.rolestab.show-latest-story > ul > li:nth-child(4) > a");
    private static final By SUPPORT_OFFICE_CAREERAREAS = By.cssSelector("div.my-header > nav > ul > li.rolestab.show-latest-story > ul > li:nth-child(3) > a");
    private static final By PHARMACY_CAREERAREAS = By.cssSelector("div.my-header > nav > ul > li.rolestab.show-latest-story > ul > li:nth-child(2) > a");
    private static final By RETAILS_CAREERAREAS = By.cssSelector("div.my-header > nav > ul > li.rolestab.show-latest-story > ul > li:nth-child(1) > a");
    private static final By No7_RETAIL = By.cssSelector("div.btn-block-wrapper > ul > li:nth-child(4) > a");
    private static final By PHARMACIST_PHARMACY = By.cssSelector("div.btn-block-wrapper > ul > li:nth-child(1) > a");
    private static final By PHARMACIST_NEWLY_PHARMACY = By.cssSelector("div.btn-block-wrapper > ul > li:nth-child(2) > a");
    private static final By PHARMACY_SUPPORT_PHARMACY = By.cssSelector("div.btn-block-wrapper > ul > li:nth-child(3) > a");
    private static final By TRAINEE_PHARMACIST_PHARMACY = By.cssSelector("div.btn-block-wrapper > ul > li:nth-child(4) > a");
    private static final By PHARMACY_STORE_PHARMACY = By.cssSelector("div.btn-block-wrapper > ul > li:nth-child(5) > a");
    private static final By LOCUM_PHARMACIST_PHARMACY = By.cssSelector("div.btn-block-wrapper > ul > li:nth-child(6) > a");
    private static final By DISCOVER_PATH_BANNER = By.cssSelector("section.career-block-image div.content-wrapper > p");
    private static final By DISCOVER_PATH_CTA = By.cssSelector("section.career-block-image div.content-wrapper > button");
    private static final By BOOTS_CAREERS_TAKE_YOU = By.cssSelector("#career-mapper > div.start-overlay");
    private static final By CULTURE_TRAINEE_PHARMACIST = By.cssSelector("#our-culture >div");
    private static final By STORIES_TRAINEE_PHARMACIST = By.cssSelector("#trainee-pharmacist-stories");
    private static final By VIEW_STORIES_TRAINEE_PHARMACIST = By.cssSelector("#trainee-pharmacist-stories div > div.pill-controlled-slider >div div:nth-child(2) div.common-slider-para > a.hub-button");
    private static final By HOW_TO_APPLY_SLIDER = By.cssSelector("div.our-application-slider > div.application-nav.test.slick-initialized.slick-slider");
    private static final By HOW_TO_APPLY_SLIDER_OPTION = By.cssSelector("div.application-nav.test.slick-initialized.slick-slider > div > div > div:nth-child(2) > div > button");
    private static final By HOW_TO_APPLY_DETAILS = By.cssSelector("div.slick-slide.slick-current.slick-active div.slide-left > div");
    private static final By PHARMACY_PROGRAMMES = By.cssSelector("#our-pharmacy-programmes");
    private static final By BEAUTY_SPECIALIST_RETAIL = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(2) > a");
    private static final By CUSTOMER_ADVISOR_RETAIL = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(1) > a");
    private static final By LIZ_EARLE_RETAIL = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(5) > a");
    private static final By AIRPORT_RETAIL = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(6) > a");
    private static final By MEET_DAVID_TITLE = By.cssSelector("section.career-block-image div.content-wrapper > h3");
    private static final By MEET_DAVID_READ_MORE = By.cssSelector("section.career-block-image div.content-wrapper > a");
    private static final By RETAIL_MANAGEMENT_RETAIL = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(3) > a");
    private static final By REGISTER_INTEREST_TRAINEE = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(6) > a");
    private static final By BENEFITS_TRAINEE = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(6) > a");
    private static final By CAREER_MAPPER_LETS_START = By.cssSelector("#career-mapper > div.start-overlay > a");
    private static final By GRAPH_ROUTE = By.cssSelector("#career-mapper > div.cm-start.go > div.cm-s-route");
    private static final By GRAPH_FIRST_ICON = By.cssSelector("#career-mapper > div.cm-start.go > div.cm-s-route > a:nth-child(1) > div");
    private static final By ROLE_CONTENT_GRAPH = By.cssSelector("#career-mapper > div.cm-wrapper.visible > div.step.cm-detail-level-1.active.opened");
    private static final By ROLE_CONTINUE_MY_STORY_CTA = By.cssSelector("div.rel > a.button.navy-blue.white-t.cont");
    private static final By CONTENT_SECOND_ROLE_GRAPH = By.cssSelector("div.abs-pos.box-1.next > div > p");
    private static final By SECOND_PAGE_NEXT_CTA = By.cssSelector("div.abs-pos.box-1.next > div > a");
    private static final By GRAPH_SECOND_STORY_OPEN = By.cssSelector("#career-mapper > div.cm-wrapper.visible > div.step.cm-detail-level-2.active");
    private static final By RELOCATE_WITH_US_CTA_PHARMACIST = By.cssSelector("#content > section:nth-child(4) div:nth-child(2) > div.content-wrapper > a");
    private static final By TRAINEE_PHARMACIST_HEADER = By.cssSelector("#hub-top-nav");
    private static final By OUR_CULTURE_SCROLL_CTA = By.cssSelector("#changinglivesinyourcommunity > div > button.slick-next.slick-arrow");
    private static final By OUR_CULTURE_SECOND_IMAGE = By.cssSelector("#changinglivesinyourcommunity div.slick-slide.slick-current.slick-active div.slide-image-wrapper > img");
    private static final By OUR_CULTURE_SECOND_TEXT = By.cssSelector("#changinglivesinyourcommunity div.slick-slide.slick-current.slick-active div.para");
    private static final By TRAINEE_STORIES_SCROLL_CTA = By.cssSelector("#trainee-pharmacist-stories div.pill-controlled-slider-box > div.pill-controlled-slider.slick-initialized.slick-slider > button.slick-next.slick-arrow");
    private static final By TRAINEE_STORIES_SECOND_IMAGE = By.cssSelector("div.pill-controlled-slider.slick-initialized.slick-slider div.slick-slide.slick-current.slick-active div.image");
    private static final By TRAINEE_STORIES_SECOND_TEXT = By.cssSelector("div.pill-controlled-slider.slick-initialized.slick-slider div.slick-slide.slick-current.slick-active > div > div >div.common-slider-para > p:nth-child(1)");
    private static final By TRAINEE_STORIES_VIEW_ALL_CTA = By.cssSelector("div.pill-controlled-slider.slick-initialized.slick-slider div.slick-slide.slick-current.slick-active div.common-slider-para > a.hub-button");
    private static final By OPTOMETRIST_OPTICIAN_PAGE = By.cssSelector("section.why-join-us div.btn-block-wrapper > ul > li:nth-child(1) > a");
    private static final By PRE_REG_OPTOMETRIST_OPTICIAN_PAGE = By.cssSelector("section.why-join-us div.btn-block-wrapper > ul > li:nth-child(2) > a");
    private static final By HINT_TIPS_CTA = By.cssSelector("#hub-popups > a");
    private static final By HINT_TIPS_POPUP = By.cssSelector("div.mfp-content > div");
    private static final By HINT_TIPS_DESCRIPTION = By.cssSelector("#hints-tips > div > div.stage-thumb.full-width > ul > li:nth-child(2)");
    private static final By APPLICATION_PROCESS_OPTICIAN = By.cssSelector("#application-process > div > div");
    private static final By APPLICATION_PROCESS_OPTION = By.cssSelector("div.our-application-slider > div.application-nav.test div:nth-child(2) > div > button");
    private static final By APPLICATION_PROCESS_OPTION_DESCRIPTION = By.cssSelector("#application-process div.our-application-slider > div.application-for.slick-initialized.slick-slider div.slick-slide.slick-current.slick-active div.slide-left > h3");
    private static final By FRANCHISE_OPTICIAN = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(5) > a");
    private static final By ENQUIRE_NOW_CTA = By.cssSelector("#introduction a");
    private static final By ENQUIRE_FORM = By.cssSelector("#franchise-apply-form > div.container.init.form-wrapper > div");
    private static final By SUPPLY_CHAIN = By.cssSelector("li.menu-item.menu-item-type-post_type.menu-item-object-page.current-menu-item > a");
    private static final By SUPPLY_CHAIN_SUB_OPTIONS = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper");
    private static final By PHARMACY_DISTRIBUTION = By.cssSelector("section.why-join-us div.btn-block-wrapper > ul > li:nth-child(1) > a");
    private static final By WAREHOUSING = By.cssSelector("section.why-join-us div.btn-block-wrapper > ul > li:nth-child(2) > a");
    private static final By SUPPLY_DEMAND_PLANNING = By.cssSelector("section.why-join-us div.btn-block-wrapper > ul > li:nth-child(3) > a");
    private static final By PERTEMPS = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(1) > a");
    private static final By AMPM = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(2) > a");
    private static final By APPRENTICESHIP = By.cssSelector("section.why-join-us div.btn-block-wrapper > ul > li:nth-child(1) > a");
    private static final By GRADUATE = By.cssSelector("section.why-join-us div.btn-block-wrapper > ul > li:nth-child(2) > a");
    private static final By WORK_EXPERIENCE = By.cssSelector("section.why-join-us div.btn-block-wrapper > ul > li:nth-child(3) > a");
    private static final By IRELAND = By.cssSelector("li.menu-item.menu-item-type-post_type.menu-item-object-page.current-menu-item > a");
    private static final By IRELAND_SUBSECTION = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper");
    private static final By PHARMACIST_IRELAND = By.cssSelector("section.why-join-us div.btn-block-wrapper > ul > li:nth-child(1) > a");
    private static final By PHARMACY_SUPPORT_IRELAND = By.cssSelector("section.why-join-us div.btn-block-wrapper > ul > li:nth-child(2) > a");
    private static final By RETAIL_IRELAND = By.cssSelector("section.why-join-us div.btn-block-wrapper > ul > li:nth-child(3) > a");
    private static final By SUPPORT_OFFICE_IRELAND = By.cssSelector("section.why-join-us div.btn-block-wrapper > ul > li:nth-child(4) > a");
    private static final By LEARNING_DEVELOPMENT_IRELAND = By.cssSelector("#content > section:nth-child(3) div.img-wrapper-block.dark-bg > div.content-wrapper");
    private static final By LD_IRELAND_FIND_MORE_CTA = By.cssSelector("section:nth-child(3) div.img-wrapper-block.dark-bg > div.content-wrapper > button");
    private static final By VIEW_BENEFIT_IRELAND = By.cssSelector("#content > section:nth-child(4) div.content-wrapper > button");
    private static final By APPLICATION_PROCESS_GRADUATE = By.cssSelector("#application-process > div > div");
    private static final By OUR_CULTURE_GRADUATE = By.cssSelector("#our-culture > div > div");
    private static final By STORIES_GRADUATE = By.cssSelector("#graduates-stories > div");
    private static final By OUR_CULTURE_SCROLL_GRADUATE = By.cssSelector("#oursupportoffice > div > button.slick-next.slick-arrow");
    private static final By RESOURCE_APPRENTICESHIP = By.cssSelector("#hub-top-nav > ul div:nth-child(5) > div > li > a");
    private static final By PARENT_TEACHER_APPRENTICESHIP = By.cssSelector("#parents--teachers > div");
    private static final By PARENT_TEACHER_VIDEO = By.cssSelector("#parents--teachers div.common-single-slider-wrapper > div.common-single-slider.slick-initialized.slick-slider div.slick-slide.slick-current.slick-active div.image > a");
    private static final By OPTOMETRIST_OPTICIAN = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(1) > a");
    private static final By PRE_REG_OPTOMETRIST_OPTICIAN = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(2) > a");
    private static final By OPTICAL_SUPPORT_OPTICIAN = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(3) > a");
    private static final By OPTICIAN_STORE_OPTICIAN = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(4) > a");
    private static final By OPTICIAN_SUBSECTION = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper");
    private static final By BUSINESS_SUPPORT = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(1) > a");
    private static final By BUYING_MERCHANDISING = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(2) > a");
    private static final By ECOMMERCEDIGITAL = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(3) > a");
    private static final By DIGITAL_TRANSFORMATION = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(4) > a");
    private static final By DATA_INSIGHTS = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(5) > a");
    private static final By FINANCE = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(6) > a");
    private static final By HR = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(7) > a");
    private static final By MARKETING_BRAND = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(8) > a");
    private static final By PROPERTY_ESTATES = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(9) > a");
    private static final By RESEARCH_DEVELOPMENT = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(10) > a");
    private static final By SUPPLY_DEMAND = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(11) > a");
    private static final By TECHNOLOGY = By.cssSelector("section.why-join-us > div > div.btn-block-wrapper > ul > li:nth-child(12) > a");
    private static final By NEXT_STORY_DISPLAY = By.cssSelector("section.section-slider-container div.section-slider-widget.slick-initialized.slick-slider div.slick-slide:nth-child(3)");
    private static final By PREVIOUS_STORY_DISPLAY = By.cssSelector("section.section-slider-container div.section-slider-widget.slick-initialized.slick-slider div.slick-slide:nth-child(2)");
    private static final By OUR_CULTURE_CONTENT = By.cssSelector("#whybootsopticians div.slick-slide.slick-current.slick-active div.para");
    private static final By OUR_CULTURE_IMAGE = By.cssSelector("#whybootsopticians div.slick-slide.slick-current.slick-active div.image");
    private static final By OUR_CULTURE_SCROLL = By.cssSelector("#whybootsopticians > div > button.slick-next.slick-arrow");
    private static final By OPTICIAN_STORIES_CONTENT = By.cssSelector("#opticians-stories div.pill-controlled-slider-box > div.pill-controlled-slider div:nth-child(2) > div > div >div.common-slider-para > p:nth-child(1)");
    private static final By OPTICIAN_STORIES_IMAGE = By.cssSelector("#opticians-stories div.pill-controlled-slider-box > div.pill-controlled-slider > div > div > div:nth-child(2)  div.image > div.slide-image-wrapper > img");
    private static final By OPTICIAN_STORIES_SCROLL = By.cssSelector("#opticians-stories div.pill-controlled-slider-box > div.pill-controlled-slider > button.slick-next.slick-arrow");
    private static final By APPLY_NOW_OPTOMETRIST_PROGRAMME = By.cssSelector("#our-optometrist-programme div.schemes-details-wrapper > div > a");
    private static final By BENEFIT_OPTOMETRIST_PROGRAMME = By.cssSelector("#our-optometrist-programme div.schemes-details-wrapper > div > div.hub-popups > a");
    private static final By BENEFIT_POPUP = By.cssSelector("#benefits > div > div.stage-thumb");
    private static final By POPUP_CLOSE = By.cssSelector("#benefits > button");
    private static final By WHY_JOIN_US_CONTENT = By.cssSelector("#content > section.why-join-us");
    private static final By CHAT_WINDOW = By.cssSelector("body div.start-group.chrome.no-clip-path.moveFromRight-enter-done > div.chat-header");
    private static final By SOCIAL_MEDIA_LINK_OPTIONS = By.cssSelector("#content > section.navigation-header.row > div.career-head-wrapper button");
    private static final By DOT_NAVIGATOR = By.cssSelector("#content > div.why-boots-content-wrapper > div.wp-block-columns.swiper-container.vertical-slides > div.swiper-pagination");



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
        assertTrue(isElementDisplayedBySeconds(JOB_FILTER_KEYWORD,5));
        assertTrue(isElementDisplayedBySeconds(JOB_FILTER_TOWN,5));
        assertTrue(isElementDisplayedBySeconds(JOB_FILTER_DISTANCE,5));
        assertTrue(isElementDisplayedBySeconds(JOB_FILTER_REFERENCE,5));
        assertTrue(isElementDisplayedBySeconds(JOB_FILTER_BUSINESS_AREA,5));
        assertTrue(isElementDisplayedBySeconds(JOB_FILTER_FUNCTIONAL_AREA,5));
        assertTrue(isElementDisplayedBySeconds(JOB_FILTER_FULL_PART_TIME,5));
        assertTrue(isElementDisplayedBySeconds(JOB_FILTER_CONTRACT,5));


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
        waitForExpectedElement(OPEN_VIDEO_SCREEN);
        assertTrue(isElementDisplayedBySeconds(OPEN_VIDEO_SCREEN,5));

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

    @And("Learning & development displayed")
    public void learningDevelopmentDisplayed() {
        scrollToElement(LEARNING_AND_DEVELOPMENT_AREA);
        assertTrue(isElementDisplayedBySeconds(LEARNING_AND_DEVELOPMENT_AREA,5));
    }


    @When("user click on Pharmacy CTA")
    public void userClickOnPharmacyCTA() {
        clickByElementByQueryJSExecutor(PHARMACY_LD);
    }

    @Then("Pharmacy details displayed")
    public void pharmacyDetailsDisplayed() {
        assertTrue(isElementDisplayedBySeconds(PHARMACY_LD_DESCRIPTION,5));
    }

    @When("user click on Retails CTA")
    public void userClickOnRetailsCTA() {
        clickByElementByQueryJSExecutor(RETAILS_LD);
    }

    @Then("Retails details displayed")
    public void retailsDetailsDisplayed() {
        assertTrue(isElementDisplayedBySeconds(RETAILS_LD_DESCRIPTION,5));
    }

    @When("User click on Support office and supplier chain CTA")
    public void userClickOnSupportOfficeAndSupplierChainCTA() {
        clickByElementByQueryJSExecutor(SUPPORT_SUPPLIER_LD);
    }

    @Then("Support office and supplier chain details displayed")
    public void supportOfficeAndSupplierChainDetailsDisplayed() {
        assertTrue(isElementDisplayedBySeconds(SUPPORT_SUPPLIER_LD_DESCRIPTION,5));
    }

    @When("user click on Opticians CTA")
    public void userClickOnOpticiansCTA() {
        clickByElementByQueryJSExecutor(OPTICIAN_LD);
    }

    @Then("Opticians details displayed")
    public void opticiansDetailsDisplayed() {
        assertTrue(isElementDisplayedBySeconds(OPTICIAN_LD_DESCRIPTION,5));
    }

    @When("user click on Leadership CTA")
    public void userClickOnLeadershipCTA() {
        clickByElementByQueryJSExecutor(LEADERSHIP_LD);
    }

    @Then("Leadership details displayed")
    public void leadershipDetailsDisplayed() {
        assertTrue(isElementDisplayedBySeconds(LEADERSHIP_LD_DESCRIPTION,5));
    }

    @When("user click on Beauty CTA")
    public void userClickOnBeautyCTA() {
        clickByElementByQueryJSExecutor(BEAUTY_LD);
    }

    @Then("Beauty details displayed")
    public void beautyDetailsDisplayed() {
        assertTrue(isElementDisplayedBySeconds(BEAUTY_LD_DESCRIPTION,5));
    }

    @And("banner image is getting displayed")
    public void bannerImageIsGettingDisplayed() {
        assertTrue(isElementDisplayedBySeconds(WHY_BOOTS_BANNER,5));
    }

    @And("Scroll down CTA displayed")
    public void scrollDownCTADisplayed() {
        assertTrue(isElementDisplayedBySeconds(WHY_BOOTS_SCROLL_DOWN_CTA,5));
    }

    @And("bullet navigation on side displayed")
    public void bulletNavigationOnSideDisplayed() {
        assertTrue(isElementDisplayedBySeconds(WHY_BOOTS_BULLET_NAVIGATOR,5));
    }

    @When("user click on bullet navigation button")
    public void userClickOnBulletNavigationButton() {
        clickByElementByQueryJSExecutor(WHY_BOOTS_BULLET_NAVIGATOR_SECOND_OPTION);
    }

    @Then("Banner image changed")
    public void bannerImageChanged() {
        assertTrue(isElementDisplayedBySeconds(WHY_BOOTS_BULLET_NAVIGATOR_SECOND_OPTION_IMAGE,5));
    }

    @When("user click scroll down")
    public void userClickScrollDown() {
        clickByElementByQueryJSExecutor(WHY_BOOTS_SCROLL_DOWN_CTA);
    }

    @When("user click on Find out more")
    public void userClickOnFindOutMore() {
        clickByElementByQueryJSExecutor(WHY_BOOTS_THIRD_BANNER_FIND_MORE_CTA);
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

    @When("user Scroll down")
    public void userScrollDown() {
        scrollToPageBottom();
    }

    @Then("Back to top CTA displayed")
    public void backToTopCTADisplayed() {
        assertTrue(isElementDisplayedBySeconds(BACK_TOP_CTA_OUR_STORIES,5));
    }

    @When("user click on Back to top CTA")
    public void userClickOnBackToTopCTA() {
        clickByElementByQueryJSExecutor(BACK_TOP_CTA_OUR_STORIES);
    }

    @Then("User is redirected to top of the page")
    public void userIsRedirectedToTopOfThePage() {
        assertTrue(isElementDisplayedBySeconds(OUR_STORIES_TOP_POINT,5));
    }

    @And("Search CTA displayed on story")
    public void searchCTADisplayedOnStory() {
        scrollToElement(SEARCH_CTA_STORY);
        assertTrue(isElementDisplayedBySeconds(SEARCH_CTA_STORY,5));
    }

    @When("user enters keyword or Town")
    public void userEntersKeywordOrTown() {
        enterDataAndWait(SEARCH_JOB_LOCATION_STORY,"London");
        waitForAjaxElementNotToBePresent(driver,4);
    }

    @And("Click on Search CTA")
    public void clickOnSearchCTA() {
        clickByElementByQueryJSExecutor(SEARCH_CTA_STORY);
    }

    @And("User redirected to search page")
    public void userRedirectedToSearchPage() {

    }

/* --------------------------------------------------------------------------------------------
 CareerAreaStepDefination
 --------------------------------------------------------------------------------------------*/


    @And("User is on Retail page")
    public void userIsOnRetailPage() {
        userHoverOnCareerAreas();
        clickByElementByQueryJSExecutor(RETAILS_CAREERAREAS);
    }

    @And("Current Vacancies displayed")
    public void currentVacanciesDisplayed() {
        assertTrue(isElementDisplayedBySeconds(CURRENT_VACANCIES_RETAIL,5));
    }

    @And("Share page dropdown displayed")
    public void sharePageDropdownDisplayed() {
        hoverOnElement(SHARE_PAGE_RETAIL);
        assertTrue(isElementDisplayedBySeconds(SHARE_PAGE_DROPDOWN_RETAIL,5));
    }

    @When("user click on Current Vacancies CTA")
    public void userClickOnCurrentVacanciesCTA() {
        clickByElementByQueryJSExecutor(CURRENT_VACANCIES_RETAIL);
    }



    @When("user click on NoSeven beauty company link")
    public void userClickOnNoBeautyCompanyLink() {
        userHoverOnCareerAreas();
        clickByElementByQueryJSExecutor(No7_BEAUTY_COMPANY_CAREERAREAS);
    }

    @When("user click on Walgreens Boots Alliance link")
    public void userClickOnWalgreensBootsAllianceLink() {
        userHoverOnCareerAreas();
        clickByElementByQueryJSExecutor(WALGREENS_BOOTS_ALLIANCE_CAREERAREAS);
    }

    @When("user click on Hearing care link")
    public void userClickOnHearingCareLink() {
        userHoverOnCareerAreas();
        clickByElementByQueryJSExecutor(HEARING_CARE_CAREERAREAS);
    }

    @And("User is on Early Careers page")
    public void userIsOnEarlyCareersPage() {
        userHoverOnCareerAreas();
        clickByElementByQueryJSExecutor(EARLY_CAREERS_CAREERAREAS);
    }

    @And("User is on Work Experience page")
    public void userIsOnWorkExperiencePage() {
        clickByElementByQueryJSExecutor(WORK_EXPERIENCE_CAREERAREAS);
    }

    @And("Speakers for Schools CTA displayed")
    public void speakersForSchoolsCTADisplayed() {
        waitForAjaxElementNotToBePresent(driver,5);
        assertTrue(isElementDisplayedBySeconds(SPEAKER_FOR_SCHOOL,5));
    }

    @When("user click on Speakers for Schools CTA")
    public void userClickOnSpeakersForSchoolsCTA() {
        clickByElementByQueryJSExecutor(SPEAKER_FOR_SCHOOL);
    }

    @And("Video is displayed")
    public void videoIsDisplayed() {
        assertTrue(isElementDisplayedBySeconds(VIDEO_SCREEN_POPUP,5));
    }

    @When("user click on play button")
    public void userClickOnPlayButton() {
        clickByElementByQueryJSExecutor(VIDEO_SCREEN_POPUP);
    }

    @Then("Video should get played")
    public void videoShouldGetPlayed() {
        assertTrue(isElementDisplayedBySeconds(OPEN_VIDEO_SCREEN,5));
    }

    @And("User is on Opticians page")
    public void userIsOnOpticiansPage() {
        userHoverOnCareerAreas();
        clickByElementByQueryJSExecutor(OPTICIAN_CAREERAREAS);
    }

    @And("user is on Support Office Jobs Page")
    public void userIsOnSupportOfficeJobsPage() {
        userHoverOnCareerAreas();
        clickByElementByQueryJSExecutor(SUPPORT_OFFICE_CAREERAREAS);
    }

    @And("User is on Pharmacy page")
    public void userIsOnPharmacyPage() {
        userHoverOnCareerAreas();
        clickByElementByQueryJSExecutor(PHARMACY_CAREERAREAS);
    }

    @And("User is on NoSeven page")
    public void userIsOnNoSevenPage() {
        waitForAjaxElementNotToBePresent(driver,4);
        clickByElementByQueryJSExecutor(No7_RETAIL);
    }

    /*@When("user click on Pharmacist")
    public void userClickOnPharmacist() {
        for(int i=1 ; i<=6 ; i++)
        {
            clickByElementByQueryJSExecutor(By.cssSelector("div.btn-block-wrapper > ul > li:nth-child("+i+") > a"));

        }
    }*/

    @And("User click on Locum-pharmacist")
    public void userClickOnLocumPharmacist() {
        scrollToElement(LOCUM_PHARMACIST_PHARMACY);
        clickByElementByQueryJSExecutor(LOCUM_PHARMACIST_PHARMACY);
    }


    @And("Discover your path today displayed with CTA Let's start displayed")
    public void discoverYourPathTodayDisplayedWithCTALetSStartDisplayed() {
        assertTrue(isElementDisplayedBySeconds(DISCOVER_PATH_BANNER,5));
        assertTrue(isElementDisplayedBySeconds(DISCOVER_PATH_CTA,5));
    }


    @When("user click Let's start CTA")
    public void userClickLetSStartCTA() {
        clickByElementByQueryJSExecutor(DISCOVER_PATH_CTA);
    }

    @Then("User getting moved to different modal at footer")
    public void userGettingMovedToDifferentModalAtFooter() {
        assertTrue(isElementDisplayedBySeconds(BOOTS_CAREERS_TAKE_YOU,5));
    }

    @And("User is on Pharmacy-store-management")
    public void userIsOnPharmacyStoreManagement() {
        scrollToElement(PHARMACY_STORE_PHARMACY);
        clickByElementByQueryJSExecutor(PHARMACY_STORE_PHARMACY);
    }


    @And("user is on Pharmacy-support")
    public void userIsOnPharmacySupport() {
        scrollToElement(PHARMACY_SUPPORT_PHARMACY);
        clickByElementByQueryJSExecutor(PHARMACY_SUPPORT_PHARMACY);
    }

    @And("User is on Trainee-pharmacist Page")
    public void userIsOnTraineePharmacistPage() {
        scrollToElement(TRAINEE_PHARMACIST_PHARMACY);
        clickByElementByQueryJSExecutor(TRAINEE_PHARMACIST_PHARMACY);
    }

    @And("Our Culture displayed")
    public void ourCultureDisplayed() {
        scrollToElement(CULTURE_TRAINEE_PHARMACIST);
        assertTrue(isElementDisplayedBySeconds(CULTURE_TRAINEE_PHARMACIST,5));
    }

    @And("Trainee pharmacist stories displayed")
    public void traineePharmacistStoriesDisplayed() {
        assertTrue(isElementDisplayedBySeconds(STORIES_TRAINEE_PHARMACIST,5));
    }

    @And("View story CTA displayed")
    public void viewStoryCTADisplayed() {
        clickByElementByQueryJSExecutor(VIEW_STORIES_TRAINEE_PHARMACIST);
    }

    @And("How to apply slider is displayed")
    public void howToApplySliderIsDisplayed() {
        scrollToElement(HOW_TO_APPLY_SLIDER);
        assertTrue(isElementDisplayedBySeconds(HOW_TO_APPLY_SLIDER,5));
    }


    @When("user click on How to apply slider CTA")
    public void userClickOnHowToApplySliderCTA() {
        clickByElementByQueryJSExecutor(HOW_TO_APPLY_SLIDER_OPTION);
    }

    @Then("Information related to the selected criteria is displayed")
    public void informationRelatedToTheSelectedCriteriaIsDisplayed() {
        assertTrue(isElementDisplayedBySeconds(HOW_TO_APPLY_DETAILS,5));
    }

    @And("Our Pharmacy Programmes displayed")
    public void ourPharmacyProgrammesDisplayed() {
        assertTrue(isElementDisplayedBySeconds(PHARMACY_PROGRAMMES,5));
    }

    @When("user click on Each programmes available verify information displayed")
    public void userClickOnEachProgrammesAvailableVerifyInformationDisplayed() {
        for(int i=1; i<=3; i++)
        {
            clickByElementByQueryJSExecutor(By.cssSelector("div.details-section > ul > li:nth-child("+i+") > div.arrow_box > div > button"));
            waitForAjaxElementNotToBePresent(driver,4);
            assertTrue(isElementDisplayedBySeconds(By.cssSelector("div.details-section > ul > li:nth-child("+i+") > div.arrow_box > p"),5));
        }
    }


    @And("User is on beauty-specialist page")
    public void userIsOnBeautySpecialistPage() {
        clickByElementByQueryJSExecutor(BEAUTY_SPECIALIST_RETAIL);
        waitForAjaxElementNotToBePresent(driver,4);
    }


    @And("User is on customer-advisor")
    public void userIsOnCustomerAdvisor() {
        clickByElementByQueryJSExecutor(CUSTOMER_ADVISOR_RETAIL);
        waitForAjaxElementNotToBePresent(driver,4);
    }

    @And("User is on Liz-earle")
    public void userIsOnLizEarle() {
        clickByElementByQueryJSExecutor(LIZ_EARLE_RETAIL);
        waitForAjaxElementNotToBePresent(driver,4);
    }


    @And("Meet David – Service & Education Trainer for Liz Earle Displayed with image and Read more button")
    public void meetDavidServiceEducationTrainerForLizEarleDisplayedWithImageAndReadMoreButton() {
        assertTrue(isElementDisplayedBySeconds(MEET_DAVID_TITLE,5));
        assertTrue(isElementDisplayedBySeconds(MEET_DAVID_READ_MORE,5));

    }

    @When("user click on Read more under  Meet David – Service & Education Trainer for Liz Earle")
    public void userClickOnReadMoreUnderMeetDavidServiceEducationTrainerForLizEarle() {
        clickByElementByQueryJSExecutor(MEET_DAVID_READ_MORE);
    }

    @And("User is on Retail management")
    public void userIsOnRetailManagement() {
        clickByElementByQueryJSExecutor(RETAIL_MANAGEMENT_RETAIL);
        waitForAjaxElementNotToBePresent(driver,4);
    }

    @And("user is on pharmacist-newly-qualified")
    public void userIsOnPharmacistNewlyQualified() {
        clickByElementByQueryJSExecutor(PHARMACIST_NEWLY_PHARMACY);
        waitForAjaxElementNotToBePresent(driver,4);

    }

    @And("Register your interest and Benefit CTA displayed")
    public void registerYourInterestAndBenefitCTADisplayed() {
        scrollToElement(REGISTER_INTEREST_TRAINEE);
        assertTrue(isElementDisplayedBySeconds(REGISTER_INTEREST_TRAINEE,5));
        assertTrue(isElementDisplayedBySeconds(BENEFITS_TRAINEE,5));
    }

    @And("user click on Benefit")
    public void userClickOnBenefit() {
        clickByElementByQueryJSExecutor(BENEFITS_TRAINEE);
    }

    @And("Popup with Salary, Pension Scheme,  Lifeworks, Bonus scheme, The Benefits Box and GPHC PSNI  is displayed with icons")
    public void popupWithSalaryPensionSchemeLifeworksBonusSchemeTheBenefitsBoxAndGPHCPSNIIsDisplayedWithIcons() {
        for(int i=1; i<=6; i++)
        {
            assertTrue(isElementDisplayedBySeconds(By.cssSelector("#benefits > div > div.stage-thumb > ul > li:nth-child("+i+")"),5));
        }
    }


    @When("user again click on Let's start")
    public void userAgainClickOnLetSStart() {
        clickByElementByQueryJSExecutor(CAREER_MAPPER_LETS_START);
    }

    @Then("Graph with different CTA displayed")
    public void graphWithDifferentCTADisplayed() {
        assertTrue(isElementDisplayedBySeconds(GRAPH_ROUTE,5));
    }

    @When("user click on any one icon")
    public void userClickOnAnyOneIcon() {
        clickByElementByQueryJSExecutor(GRAPH_FIRST_ICON);
    }

    @Then("User is getting redirected to the role selected content")
    public void userIsGettingRedirectedToTheRoleSelectedContent() {
        waitForAjaxElementNotToBePresent(driver,4);
        assertTrue(isElementDisplayedBySeconds(ROLE_CONTENT_GRAPH,5));
    }

    @When("user click on continue my story")
    public void userClickOnContinueMyStory() {
        clickByElementByQueryJSExecutor(ROLE_CONTINUE_MY_STORY_CTA);
    }

    @Then("Next button with content displayed")
    public void nextButtonWithContentDisplayed() {
        waitForAjaxElementNotToBePresent(driver,4);
        assertTrue(isElementDisplayedBySeconds(CONTENT_SECOND_ROLE_GRAPH,5));
        assertTrue(isElementDisplayedBySeconds(SECOND_PAGE_NEXT_CTA,5));
    }

    @When("user click on next")
    public void userClickOnNext() {
        clickByElementByQueryJSExecutor(SECOND_PAGE_NEXT_CTA);
    }

    @Then("user redirected to next role in graph")
    public void userRedirectedToNextRoleInGraph() {
        assertTrue(isElementDisplayedBySeconds(GRAPH_SECOND_STORY_OPEN,5));
    }

    @And("User is on Pharmacist page")
    public void userIsOnPharmacistPage() {
        clickByElementByQueryJSExecutor(PHARMACIST_PHARMACY);

    }

    @And("Relocate with us CTA displayed")
    public void relocateWithUsCTADisplayed() {
        assertTrue(isElementDisplayedBySeconds(RELOCATE_WITH_US_CTA_PHARMACIST,5));
    }

    @When("user click on relocate with us")
    public void userClickOnRelocateWithUs() {
        scrollToElement(RELOCATE_WITH_US_CTA_PHARMACIST);
        clickByElementByQueryJSExecutor(RELOCATE_WITH_US_CTA_PHARMACIST);
    }

    @And("Headers displayed")
    public void headersDisplayed() {
        waitForExpectedElement(TRAINEE_PHARMACIST_HEADER);
        assertTrue(isElementDisplayedBySeconds(TRAINEE_PHARMACIST_HEADER,5));
    }

    @When("click and verify each header")
    public void clickAndVerifyEachHeader() {
        for(int i=1; i<=6; i++)
        {
            assertTrue(isElementDisplayedBySeconds(By.cssSelector("#hub-top-nav > ul > li:nth-child("+i+") > a"),5));
            clickByElementByQueryJSExecutor(By.cssSelector("#hub-top-nav > ul > li:nth-child("+i+") > a"));
        }

    }

    @When("user click on Our Culture scroll CTA")
    public void userClickOnOurCultureScrollCTA() {
        scrollToElement(OUR_CULTURE_SCROLL_CTA);
        clickByElementByQueryJSExecutor(OUR_CULTURE_SCROLL_CTA);
    }

    @Then("Our culture images with information displayed")
    public void ourCultureImagesWithInformationDisplayed() {
        waitForAjaxElementNotToBePresent(driver,4);
        assertTrue(isElementDisplayedBySeconds(OUR_CULTURE_SECOND_IMAGE,5));
        assertTrue(isElementDisplayedBySeconds(OUR_CULTURE_SECOND_TEXT,5));
    }

    @When("user click on Trainee pharmacist stories scroll CTA")
    public void userClickOnTraineePharmacistStoriesScrollCTA() {
        scrollToElement(TRAINEE_STORIES_SCROLL_CTA);
        clickByElementByQueryJSExecutor(TRAINEE_STORIES_SCROLL_CTA);
    }

    @Then("Trainee pharmacist stories images with information displayed")
    public void traineePharmacistStoriesImagesWithInformationDisplayed() {
        waitForAjaxElementNotToBePresent(driver,4);
        assertTrue(isElementDisplayedBySeconds(TRAINEE_STORIES_SECOND_IMAGE,5));
        assertTrue(isElementDisplayedBySeconds(TRAINEE_STORIES_SECOND_TEXT,5));
    }


    @When("user click on View all stories of trainee")
    public void userClickOnViewAllStoriesOfTrainee() {
        clickByElementByQueryJSExecutor(TRAINEE_STORIES_VIEW_ALL_CTA);
    }

    @And("User is on Optometrist page")
    public void userIsOnOptometristPage() {
        clickByElementByQueryJSExecutor(OPTOMETRIST_OPTICIAN_PAGE);
    }

    @And("User is on Pre-reg-optometrist Page")
    public void userIsOnPreRegOptometristPage() {
        clickByElementByQueryJSExecutor(PRE_REG_OPTOMETRIST_OPTICIAN_PAGE);
    }

    @And("Hint & tips CTA displayed")
    public void hintTipsCTADisplayed() {
        scrollToElement(HINT_TIPS_CTA);
        assertTrue(isElementDisplayedBySeconds(HINT_TIPS_CTA,5));
    }

    @When("user click on Hint & tips CTA")
    public void userClickOnHintTipsCTA() {
        clickByElementByQueryJSExecutor(HINT_TIPS_CTA);
    }


    @Then("Popup with Interviews and application information displayed")
    public void popupWithInterviewsAndApplicationInformationDisplayed() {
        assertTrue(isElementDisplayedBySeconds(HINT_TIPS_POPUP,5));
        assertTrue(isElementDisplayedBySeconds(HINT_TIPS_DESCRIPTION,5));
    }

    @And("Application Process displayed")
    public void applicationProcessDisplayed() {
        clickByElementByQueryJSExecutor(APPLICATION_PROCESS_OPTICIAN);
    }

    @When("user click on Application Process stage CTA")
    public void userClickOnApplicationProcessStageCTA() {
        clickByElementByQueryJSExecutor(APPLICATION_PROCESS_OPTION);
    }

    @Then("Stage should get selected and information displayed")
    public void stageShouldGetSelectedAndInformationDisplayed() {
        assertTrue(isElementDisplayedBySeconds(APPLICATION_PROCESS_OPTION_DESCRIPTION,5));

    }

    @And("User is on Franchise Page")
    public void userIsOnFranchisePage() {
        scrollToElement(FRANCHISE_OPTICIAN);
        clickByElementByQueryJSExecutor(FRANCHISE_OPTICIAN);
    }

    @And("Enquire now CTA displayed")
    public void enquireNowCTADisplayed() {
        waitForExpectedElement(ENQUIRE_NOW_CTA);
        assertTrue(isElementDisplayedBySeconds(ENQUIRE_NOW_CTA,4));
    }

    @When("user click on Enquire now")
    public void userClickOnEnquireNow() {
        clickByElementByQueryJSExecutor(ENQUIRE_NOW_CTA);
    }

    @Then("enquire form is open now")
    public void enquireFormIsOpenNow() {
        assertTrue(isElementDisplayedBySeconds(ENQUIRE_FORM,5));
    }

    @And("User is on Supply-chain page")
    public void userIsOnSupplyChainPage() {
        userHoverOnCareerAreas();
        clickByElementByQueryJSExecutor(SUPPLY_CHAIN);

    }

    @And("Pharmacy Distribution, Warehousing, Supply & Demand Planning CTA displayed")
    public void pharmacyDistributionWarehousingSupplyDemandPlanningCTADisplayed() {
        scrollToElement(SUPPLY_CHAIN_SUB_OPTIONS);
        assertTrue(isElementDisplayedBySeconds(SUPPLY_CHAIN_SUB_OPTIONS,5));
    }

    @When("user click on Pharmacy Distribution")
    public void userClickOnPharmacyDistribution() {
        clickByElementByQueryJSExecutor(PHARMACY_DISTRIBUTION);
    }

    @When("user click on Warehousing")
    public void userClickOnWarehousing() {
        driver.navigate().back();
        waitForExpectedElement(SUPPLY_CHAIN_SUB_OPTIONS);
        scrollToElement(WAREHOUSING);
        clickByElementByQueryJSExecutor(WAREHOUSING);
    }

    @When("user click on Supply & Demand Planning")
    public void userClickOnSupplyDemandPlanning() {
        driver.navigate().back();
        waitForExpectedElement(SUPPLY_CHAIN_SUB_OPTIONS);
        scrollToElement(SUPPLY_DEMAND_PLANNING);
        clickByElementByQueryJSExecutor(SUPPLY_DEMAND_PLANNING);
    }


    @And("Pertemps, AMPM CTA displayed")
    public void pertempsAMPMCTADisplayed() {
        scrollToElement(PERTEMPS);
        assertTrue(isElementDisplayedBySeconds(PERTEMPS,4));
        assertTrue(isElementDisplayedBySeconds(AMPM,4));

    }

    @When("user click on Pertemps")
    public void userClickOnPertemps() {
        clickByElementByQueryJSExecutor(PERTEMPS);
    }

    @When("user click on AMPM")
    public void userClickOnAMPM() {
        scrollToElement(AMPM);
        clickByElementByQueryJSExecutor(AMPM);
    }


    @And("Apprenticeships, Graduate and Work Experience CTA displayed")
    public void apprenticeshipsGraduatesAndWorkExperienceCTADisplayed() {
        scrollToElement(APPRENTICESHIP);
        assertTrue(isElementDisplayedBySeconds(APPRENTICESHIP,5));
        assertTrue(isElementDisplayedBySeconds(GRADUATE,5));
        assertTrue(isElementDisplayedBySeconds(WORK_EXPERIENCE,5));

    }

    @When("user click on Apprenticeships")
    public void userClickOnApprenticeships() {
        clickByElementByQueryJSExecutor(APPRENTICESHIP);
    }

    @When("user click on Graduates")
    public void userClickOnGraduates() {
        driver.navigate().back();
        waitForExpectedElement(GRADUATE);
        clickByElementByQueryJSExecutor(GRADUATE);
    }

    @When("user click on Work Experience")
    public void userClickOnWorkExperience() {
        driver.navigate().back();
        waitForExpectedElement(WORK_EXPERIENCE);
        clickByElementByQueryJSExecutor(WORK_EXPERIENCE);
    }

    @And("User is on Ireland Jobs page")
    public void userIsOnIrelandJobsPage() {
        userHoverOnCareerAreas();
        clickByElementByQueryJSExecutor(IRELAND);
    }

    @And("Pharmacist, Pharmacy Support, Retail, Support Office CTA displayed")
    public void pharmacistPharmacySupportRetailSupportOfficeCTADisplayed() {
        waitForExpectedElement(IRELAND_SUBSECTION);
        assertTrue(isElementDisplayedBySeconds(PHARMACIST_IRELAND,5));
        assertTrue(isElementDisplayedBySeconds(PHARMACY_SUPPORT_IRELAND,5));
        assertTrue(isElementDisplayedBySeconds(RETAIL_IRELAND,5));
        assertTrue(isElementDisplayedBySeconds(SUPPORT_OFFICE_IRELAND,5));

    }

    @When("user click on Pharmacist ireland")
    public void userClickOnPharmacistIreland() {
        clickByElementByQueryJSExecutor(PHARMACIST_IRELAND);
    }

    @When("user click on Pharmacy Support ireland")
    public void userClickOnPharmacySupportIreland() {
        driver.navigate().back();
        waitForExpectedElement(PHARMACY_SUPPORT_IRELAND);
        clickByElementByQueryJSExecutor(PHARMACY_SUPPORT_IRELAND);
    }

    @When("user click on Retail ireland")
    public void userClickOnRetailIreland() {
        driver.navigate().back();
        waitForExpectedElement(RETAIL_IRELAND);
        clickByElementByQueryJSExecutor(RETAIL_IRELAND);
    }

    @When("user click on Support Office ireland")
    public void userClickOnSupportOfficeIreland() {
        driver.navigate().back();
        waitForExpectedElement(SUPPORT_OFFICE_IRELAND);
        clickByElementByQueryJSExecutor(SUPPORT_OFFICE_IRELAND);
    }

    @And("Learning & Development with Find out more CTA")
    public void learningDevelopmentWithFindOutMoreCTA() {
        scrollToElement(LEARNING_DEVELOPMENT_IRELAND);
        assertTrue(isElementDisplayedBySeconds(LEARNING_DEVELOPMENT_IRELAND,5));
        assertTrue(isElementDisplayedBySeconds(LD_IRELAND_FIND_MORE_CTA,5));

    }

    @And("View Benefits CTA displayed")
    public void viewBenefitsCTADisplayed() {
        scrollToElement(VIEW_BENEFIT_IRELAND);
        assertTrue(isElementDisplayedBySeconds(VIEW_BENEFIT_IRELAND,5));
    }

    @And("Application Process stages displayed")
    public void applicationProcessStagesDisplayed() {
        assertTrue(isElementDisplayedBySeconds(APPLICATION_PROCESS_GRADUATE,5));
    }

    @And("Our Culture and Stories images and scroll CTA displayed")
    public void ourCultureAndStoriesImagesAndScrollCTADisplayed() {
        assertTrue(isElementDisplayedBySeconds(OUR_CULTURE_GRADUATE,5));
        assertTrue(isElementDisplayedBySeconds(OUR_CULTURE_SCROLL_GRADUATE,5));
        assertTrue(isElementDisplayedBySeconds(STORIES_GRADUATE,5));


    }

    @Then("click on each header link and verify it")
    public void clickOnEachHeaderLinkAndVerifyIt() {
        for(int i=1 ; i<=6 ; i++)
        {   waitForExpectedElement(By.id("#hub-top-nav > ul > li:nth-child("+i+") > a"));
            clickByElementByQueryJSExecutor(By.cssSelector("#hub-top-nav > ul > li:nth-child("+i+") > a"));
        }
    }

    @And("Resources Section is displayed")
    public void resourcesSectionIsDisplayed() {
        clickByElementByQueryJSExecutor(RESOURCE_APPRENTICESHIP);
    }

    @And("Parents & teachers Scroll and Video displayed")
    public void parentsTeachersScrollAndVideoDisplayed() {
        scrollToElement(PARENT_TEACHER_APPRENTICESHIP);
        assertTrue(isElementDisplayedBySeconds(PARENT_TEACHER_APPRENTICESHIP,5));
        assertTrue(isElementDisplayedBySeconds(PARENT_TEACHER_VIDEO,5));
    }

    @Then("click on each Apprenticeships header link and verify it")
    public void clickOnEachApprenticeshipsHeaderLinkAndVerifyIt() {
        for(int i=1 ; i<=8 ; i++)
        {   waitForExpectedElement(By.id("#hub-top-nav > ul > div > div > div:nth-child(\"+i+\") > div > li > a"));
            clickByElementByQueryJSExecutor(By.cssSelector("#hub-top-nav > ul > div > div > div:nth-child("+i+") > div > li > a"));
        }
    }

    @Then("click on each pre-reg-optometrist header link and verify it")
    public void clickOnEachPreRegOptometristHeaderLinkAndVerifyIt() {
        for(int i=1 ; i<=5 ; i++)
        {   waitForExpectedElement(By.id("#hub-top-nav > ul > li:nth-child("+i+") > a"));
            clickByElementByQueryJSExecutor(By.cssSelector("#hub-top-nav > ul > li:nth-child(\"+i+\") > a"));
        }
    }

    @And("Optometrist, Pre-registration Optometrist, Optical Support Colleague, Opticians Store Management ,Franchise CTA displayed")
    public void optometristPreRegistrationOptometristOpticalSupportColleagueOpticiansStoreManagementFranchiseCTADisplayed() {
        waitForExpectedElement(OPTICIAN_SUBSECTION);
        assertTrue(isElementDisplayedBySeconds(OPTOMETRIST_OPTICIAN,5));
        assertTrue(isElementDisplayedBySeconds(PRE_REG_OPTOMETRIST_OPTICIAN,5));
        assertTrue(isElementDisplayedBySeconds(OPTICAL_SUPPORT_OPTICIAN,5));
        assertTrue(isElementDisplayedBySeconds(OPTICIAN_STORE_OPTICIAN,5));
        assertTrue(isElementDisplayedBySeconds(FRANCHISE_OPTICIAN,5));

    }

    @When("user click on Optometrist")
    public void userClickOnOptometrist() {
        clickByElementByQueryJSExecutor(OPTOMETRIST_OPTICIAN);
    }

    @When("user click on Pre-Reg-Optometrist")
    public void userClickOnPreRegOptometrist() {
        driver.navigate().back();
        waitForExpectedElement(PRE_REG_OPTOMETRIST_OPTICIAN);
        clickByElementByQueryJSExecutor(PRE_REG_OPTOMETRIST_OPTICIAN);
    }

    @When("user click on Optical Support Colleague")
    public void userClickOnOpticalSupportColleague() {
        driver.navigate().back();
        waitForExpectedElement(OPTICAL_SUPPORT_OPTICIAN);
        clickByElementByQueryJSExecutor(OPTICAL_SUPPORT_OPTICIAN);
    }

    @When("user click on Opticians Store Management")
    public void userClickOnOpticiansStoreManagement() {
        driver.navigate().back();
        waitForExpectedElement(OPTICIAN_STORE_OPTICIAN);
        clickByElementByQueryJSExecutor(OPTICIAN_STORE_OPTICIAN);
    }

    @When("user click on Franchise")
    public void userClickOnFranchise() {
        driver.navigate().back();
        waitForExpectedElement(FRANCHISE_OPTICIAN);
        clickByElementByQueryJSExecutor(FRANCHISE_OPTICIAN);
    }


    @When("user click on Business Support")
    public void userClickOnBusinessSupport() {
        scrollToElement(BUSINESS_SUPPORT);
        clickByElementByQueryJSExecutor(BUSINESS_SUPPORT);
    }

    @When("user click on Buying & Merchandising")
    public void userClickOnBuyingMerchandising() {
        driver.navigate().back();
        waitForExpectedElement(BUYING_MERCHANDISING);
        clickByElementByQueryJSExecutor(BUYING_MERCHANDISING);
    }


    @When("user click on Ecommerce & Digital")
    public void userClickOnEcommerceDigital() {
        driver.navigate().back();
        waitForExpectedElement(ECOMMERCEDIGITAL);
        clickByElementByQueryJSExecutor(ECOMMERCEDIGITAL);
    }


    @When("user click on Digital Transformation")
    public void userClickOnDigitalTransformation() {
        driver.navigate().back();
        waitForExpectedElement(DIGITAL_TRANSFORMATION);
        clickByElementByQueryJSExecutor(DIGITAL_TRANSFORMATION);
    }


    @When("user click on Data & Insights")
    public void userClickOnDataInsights() {
        driver.navigate().back();
        waitForExpectedElement(DATA_INSIGHTS);
        clickByElementByQueryJSExecutor(DATA_INSIGHTS);
    }


    @When("user click on Finance")
    public void userClickOnFinance() {
        driver.navigate().back();
        waitForExpectedElement(FINANCE);
        clickByElementByQueryJSExecutor(FINANCE);
    }

    @When("user click on HR")
    public void userClickOnHR() {
        driver.navigate().back();
        waitForExpectedElement(HR);
        clickByElementByQueryJSExecutor(HR);
    }

    @When("user click on Marketing, Brand & Communications")
    public void userClickOnMarketingBrandCommunications() {
        driver.navigate().back();
        waitForExpectedElement(MARKETING_BRAND);
        clickByElementByQueryJSExecutor(MARKETING_BRAND);
    }


    @When("user click on Property & Estates")
    public void userClickOnPropertyEstates() {
        driver.navigate().back();
        waitForExpectedElement(PROPERTY_ESTATES);
        clickByElementByQueryJSExecutor(PROPERTY_ESTATES);
    }


    @When("user click on Research & Development")
    public void userClickOnResearchDevelopment() {
        driver.navigate().back();
        waitForExpectedElement(RESEARCH_DEVELOPMENT);
        clickByElementByQueryJSExecutor(RESEARCH_DEVELOPMENT);
    }

    @When("user click on Supply & Demand Planning Support")
    public void userClickOnSupplyDemandPlanningSupport() {
        driver.navigate().back();
        waitForExpectedElement(SUPPLY_DEMAND);
        clickByElementByQueryJSExecutor(SUPPLY_DEMAND);
    }

    @When("user click on Technology")
    public void userClickOnTechnology() {
        driver.navigate().back();
        waitForExpectedElement(TECHNOLOGY);
        clickByElementByQueryJSExecutor(TECHNOLOGY);
    }

    @Then("Next story image with details displayed")
    public void nextStoryImageWithDetailsDisplayed() {
        assertTrue(isElementDisplayedBySeconds(NEXT_STORY_DISPLAY,5));
    }

    @Then("Previous story with details displayed")
    public void previousStoryWithDetailsDisplayed() {
        assertTrue(isElementDisplayedBySeconds(PREVIOUS_STORY_DISPLAY,5));
    }

    @Then("user click on various job and verify its content")
    public void userClickOnVariousJobAndVerifyItsContent() {
       waitForExpectedElement(PHARMACY_LD);
        for(int i=1; i<=6; i++)
        {
            clickByElementByQueryJSExecutor(By.id("section.programmes-container div.programmes-navigation-wrapper > div:nth-child("+i+")"));
            assertTrue(isElementDisplayedBySeconds(PHARMACY_LD_DESCRIPTION,5));
        }
    }

    @When("user click on Our Culture and verify content")
    public void userClickOnOurCultureAndVerifyContent() {
        scrollToElement(OUR_CULTURE_CONTENT);
        assertTrue(isElementDisplayedBySeconds(OUR_CULTURE_CONTENT,5));
        assertTrue(isElementDisplayedBySeconds(OUR_CULTURE_IMAGE,5));
        assertTrue(isElementDisplayedBySeconds(OUR_CULTURE_SCROLL,5));

    }

    @Then("user click on Optician stories and verify content")
    public void userClickOnOpticianStoriesAndVerifyContent() {
        scrollToElement(OPTICIAN_STORIES_CONTENT);
        assertTrue(isElementDisplayedBySeconds(OPTICIAN_STORIES_CONTENT,5));
        assertTrue(isElementDisplayedBySeconds(OPTICIAN_STORIES_IMAGE,5));
        assertTrue(isElementDisplayedBySeconds(OPTICIAN_STORIES_SCROLL,5));
    }

    @And("Apply now CTA displayed")
    public void applyNowCTADisplayed() {
        assertTrue(isElementDisplayedBySeconds(APPLY_NOW_OPTOMETRIST_PROGRAMME,5));
    }

    @And("Benefit CTA displayed")
    public void benefitCTADisplayed() {
        assertTrue(isElementDisplayedBySeconds(BENEFIT_OPTOMETRIST_PROGRAMME,5));
    }

    @Then("user get informative popup")
    public void userGetInformativePopup() {
        waitForExpectedElement(BENEFIT_POPUP);
        assertTrue(isElementDisplayedBySeconds(BENEFIT_POPUP,5));
        clickByElementByQueryJSExecutor(POPUP_CLOSE);
    }

    @When("user click on Benefit CTA")
    public void userClickOnBenefitCTA() {
        clickByElementByQueryJSExecutor(BENEFIT_OPTOMETRIST_PROGRAMME);
    }

    @When("user click on Apply now")
    public void userClickOnApplyNow() {
        clickByElementByQueryJSExecutor(APPLY_NOW_OPTOMETRIST_PROGRAMME);
    }

    @And("Why join us content displayed")
    public void whyJoinUsContentDisplayed() {
        assertTrue(isElementDisplayedBySeconds(WHY_JOIN_US_CONTENT,5));
    }

    @And("Chat with us CTA displayed")
    public void chatWithUsCTADisplayed() {
        scrollToElement(RELOCATE_WITH_US_CTA_PHARMACIST);
        driver.switchTo().frame("tidio-chat-iframe");
        assertTrue(isElementDisplayedBySeconds(CHAT_WINDOW,5));
    }

    @When("user click on Pharmacist - newly qualified")
    public void userClickOnPharmacistNewlyQualified() {
        driver.navigate().back();
        waitForExpectedElement(PHARMACIST_NEWLY_PHARMACY);
        clickByElementByQueryJSExecutor(PHARMACIST_NEWLY_PHARMACY);
    }

    @When("user click on Pharmacy Support")
    public void userClickOnPharmacySupport() {
        driver.navigate().back();
        waitForExpectedElement(PHARMACY_SUPPORT_PHARMACY);
        clickByElementByQueryJSExecutor(PHARMACY_SUPPORT_PHARMACY);
    }

    @When("user click on Trainee Pharmacist")
    public void userClickOnTraineePharmacist() {
        driver.navigate().back();
        waitForExpectedElement(TRAINEE_PHARMACIST_PHARMACY);
        clickByElementByQueryJSExecutor(TRAINEE_PHARMACIST_PHARMACY);
    }

    @When("user click on Pharmacy Store Management")
    public void userClickOnPharmacyStoreManagement() {
        driver.navigate().back();
        waitForExpectedElement(PHARMACY_STORE_PHARMACY);
        clickByElementByQueryJSExecutor(PHARMACY_STORE_PHARMACY);
    }

    @When("user click on Locum Pharmacist option")
    public void userClickOnLocumPharmacistOption() {
        driver.navigate().back();
        waitForExpectedElement(LOCUM_PHARMACIST_PHARMACY);
        clickByElementByQueryJSExecutor(LOCUM_PHARMACIST_PHARMACY);
    }

    @When("user Click on Share page Dropdown with social media links displayed")
    public void userClickOnSharePageDropdownWithSocialMediaLinksDisplayed() {
        waitForExpectedElement(SOCIAL_MEDIA_LINK_OPTIONS);
        assertTrue(isElementDisplayedBySeconds(SOCIAL_MEDIA_LINK_OPTIONS,5));
        hoverOnElement(SOCIAL_MEDIA_LINK_OPTIONS);
        for(int i=1; i<=5; i++)
        {
            assertTrue(isElementDisplayedBySeconds(By.cssSelector("#st-1 > div:nth-child("+i+")"),5));
        }
    }

    @When("user enters keyword, Town")
    public void userEntersKeywordTown() {
        scrollToPageBottom();
        scrollToElement(SEARCH_JOB_LOCATION_STORY);
        enterDataAndWait(SEARCH_JOB_LOCATION_STORY,"London");
    }

    @When("user click on Customer advisor option")
    public void userClickOnCustomerAdvisorOption() {
        clickByElementByQueryJSExecutor(CUSTOMER_ADVISOR_RETAIL);
    }

    @When("user click on Beauty specialist")
    public void userClickOnBeautySpecialist() {
        driver.navigate().back();
        waitForExpectedElement(BEAUTY_SPECIALIST_RETAIL);
        clickByElementByQueryJSExecutor(BEAUTY_SPECIALIST_RETAIL);

    }


    @When("user click on Retail management")
    public void userClickOnRetailManagement() {
        driver.navigate().back();
        waitForExpectedElement(RETAIL_MANAGEMENT_RETAIL);
        clickByElementByQueryJSExecutor(RETAIL_MANAGEMENT_RETAIL);
    }


    @When("user click on NoSeven")
    public void userClickOnNoSeven() {
        driver.navigate().back();
        waitForExpectedElement(No7_RETAIL);
        clickByElementByQueryJSExecutor(No7_RETAIL);
    }

    @When("user click on Liz Earle")
    public void userClickOnLizEarle() {
        driver.navigate().back();
        waitForExpectedElement(LIZ_EARLE_RETAIL);
        clickByElementByQueryJSExecutor(LIZ_EARLE_RETAIL);
    }

    @When("user click on Airport")
    public void userClickOnAirport() {
        driver.navigate().back();
        waitForExpectedElement(AIRPORT_RETAIL);
        clickByElementByQueryJSExecutor(AIRPORT_RETAIL);
    }

    @And("download options are display")
    public void downloadOptionsAreDisplay() {
        for(int i=1; i<=7 ; i++)
        {
            assertTrue(isElementDisplayedBySeconds(By.cssSelector("#resources ul > li:nth-child("+i+") > a.prepare-downloads"),5));
        }
    }

    @And("Dot navigation on side displayed")
    public void dotNavigationOnSideDisplayed() {
        assertTrue(isElementDisplayedBySeconds(DOT_NAVIGATOR,5));
    }

    @Then("click on dot naviagtor and Find More CTA and verify redirection")
    public void clickOnDotNaviagtorAndFindMoreCTAANdVerifyRedirection() {
        for(int i=2; i<=5;i++)
        {
            clickByElementByQueryJSExecutor(By.cssSelector("#content > div.why-boots-content-wrapper div.swiper-pagination.vertical-pagination> span:nth-child("+i+")"));
            waitForAjaxElementNotToBePresent(driver,4);
            clickByElementByQueryJSExecutor(By.cssSelector("a.btn.btn-outline.white"));
            driver.navigate().back();
        }
    }

    @Then("refresh the page and perform scroll down on banner to verify redirection")
    public void refreshThePageAndPerformScrollDownOnBannerToVerifyRedirection() {
        for(int i=1; i<=4;i++)
        {
            clickByElementByQueryJSExecutor(By.cssSelector("#content > div.why-boots-content-wrapper > div.wp-block-columns.swiper-container> button"));
            waitForAjaxElementNotToBePresent(driver,4);
            clickByElementByQueryJSExecutor(By.cssSelector("a.btn.btn-outline.white"));
            driver.navigate().back();
        }
    }
}

