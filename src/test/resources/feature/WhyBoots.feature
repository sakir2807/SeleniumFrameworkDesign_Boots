Feature: Why Boots feature

  Background: Navigate to Boots homePage
    Given User is on Boots Home page
    When user accept cookie
    When user click on Why boots
    Then assert URL contains text 'WhyBootsUrl.key'


  Scenario: Verify Sub Header links on Why boots page
    And Sub headers are displayed
    When user click on Care
    Then assert URL contains text 'CareUrl.key'
    When user click on Your development
    Then assert URL contains text 'YourDevelopmentUrl.key'
    When user click on Diversity & inclusion
    Then assert URL contains text 'DiversityInclusionUrl.key'
    When user click on Rewards & Benefit
    Then assert URL contains text 'RewardsBenefitUrl.key'
    

  Scenario: Verify Scroll down button on why boots page //dot operator and scroll button verification
    And banner image is getting displayed
    And Scroll down CTA displayed
    And Dot navigation on side displayed
    Then click on dot naviagtor and Find More CTA and verify redirection
    Then refresh the page and perform scroll down on banner to verify redirection


#  Scenario: Verify Hear from our team members about working in .. On why boots page# Need confirmation from pranali
#    And Hear from our team members about working in … displayed
#    And members images with description displayed
#    When user moves curser over the images
#    Then information should get displayed // need to learn about it
#    When user click on any of the story
#    Then user redirected to the new story page


  Scenario: Verify Videos on care page
    When user click on Care
    Then assert URL contains text 'CareUrl.key'
    And with title So how do we do it Videos displayed
    When clicked Our Journey Video Play button
    Then video is getting played
    When clicked Going beyond business Video Play button
    Then video is getting played


  Scenario: Verify Explore our career stories on Your development page
    When user click on Your development
    Then assert URL contains text 'YourDevelopmentUrl.key'
    And Explore our career stories displayed
    When clicked Right Side arrow CTA
    Then Next story image with details displayed
    When clicked on Left side arrow CTA
    Then Previous story with details displayed


  Scenario: Verify Learning & development CTAs on your development page
    When user click on Your development
    Then assert URL contains text 'YourDevelopmentUrl.key'
    And Learning & development displayed
    Then user click on various job and verify its content


  Scenario: Verify Videos on diversity-inclusion page
    When user click on Diversity & inclusion
    Then assert URL contains text 'DiversityInclusionUrl.key'
    And Diversity Matters Video displayed
    When click on diversity Video Play button
    Then video is getting played


  Scenario: Verify Our Business Resource Groups on Diversity & inclusion page
    When user click on Diversity & inclusion
    Then assert URL contains text 'DiversityInclusionUrl.key'
    And Verify our Business Resource Groups displayed


  Scenario: Verify View Benefit CTA on Rewards & benefits Page
    And user is on Rewards & benefits page
    And View Benefit CTA displayed
    When user click on View Benefit CTA
    Then Icons, Titles with details displayed


  Scenario: Verify Videos on Rewards & benefits Page
    And user is on Rewards & benefits page
    And Our support office video displayed
    When user click on Our support office video play button
    Then video should be played