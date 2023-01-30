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

  Scenario: Verify Scroll down button on why boots page
    And banner image is getting displayed
    And Scroll down CTA displayed
    And Dot navigation on side displayed
    When user click on Dot navigation button
    Then Banner image changed
    When user click on scroll down button
    Then Banner image changed
    When user scroll down
    Then banner image getting displayed as 'Hello curious'
    When Again user click on scroll down button
    Then We care about communities banner displayed
    When user click on Find out more
    Then assert URL contains text 'CareUrl.key'
    When again user click on scroll down button
    Then We care about our team banner displayed
    When user click on Find out more
    Then assert URL contains text 'YourDevelopmentUrl.key'
    When again user click on scroll down button
    Then We care about diversity banner displayed
    When user click on Find out more
    Then assert URL contains text 'DiversityInclusionUrl.key'
    When again user click on scroll down button
    Then We care about you banner displayed
    When user click on Find out more
    Then assert URL contains text 'DiversityInclusionUrl.key'
    When user click on the Dots on right
    Then page should get scrolled


  Scenario: Verify Hear from our team members about working in .. On why boots page
    And Hear from our team members about working in … displayed
    And members images with description displayed
    When user moves curser over the images
    Then information should get displayed // need to learn about it
    When user click on any of the story
    Then user redirected to the new story page


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
    When user click on Pharmacy CTA
    Then Pharmacy details displayed
    When user click on Retails CTA
    Then Retails details displayed and other option get collapsed
    When User click on  Support office and supplier chain CTA
    Then Support office and supplier chain details displayed and other option get collapsed
    When user click on Opticians CTA
    Then Opticians details displayed and lastly selected option get collapsed
    When user click on Leadership CTA
    Then Leadership details displayed and lastly selected option get collapsed
    When user click on Beauty CTA
    Then Beauty details displayed and lastly selected option get collapsed



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
    When Open the page // what is this
    Then Titles with logo should get displayed


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