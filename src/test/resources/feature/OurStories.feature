Feature: Our stories feature

  Background: Navigate to Boots homePage
    Given User is on Boots Home page
    When user accept cookie
    When user click on Our stories
    Then assert URL contains text 'OurStoriesUrl.key'
    And Stories are displayed


  Scenario: Verify Headers on Our Stories page
    And story page subHeaders are displayed
    When user click on Beauty
    Then assert URL contains text 'BeautyUrl.key'
    When user click on community
    Then assert URL contains text 'CommunityUrl.key'
    When user click on Early career
    Then assert URL contains text 'EarlyUrl.key'
    When user click on Ireland
    Then assert URL contains text 'IrelandUrl.key'
    When user click on Opticians
    Then assert URL contains text 'OpticianUrl.key'
    When user click on Pharmacy
    Then assert URL contains text 'PharmacyUrl.key'
    When user click on Retail
    Then assert URL contains text 'RetailUrl.key'
    When user click on Supply chain
    Then assert URL contains text 'SupplyChainUrl.key'
    When user click on support office
    Then assert URL contains text 'SupportOfficeUrl.key'


  Scenario: Verify Stories on Our story Page
    Then Header with text and image displayed
    When Select one story
    Then Story with details displayed



  Scenario: Verify Social media link after click on stories
    Then Header with text and image displayed
    When Select one story
    And Social media icons displayed on story page
    When user click on LinkedIn Icon Stories
    Then assert URL open in different tabs contains text 'LinkedInUrl.key'
    When user click on Facebook icon Stories
    Then assert URL open in different tabs contains text 'FacebookStoriesUrl.key'
    When user click on Twitter icon Stories
    Then assert URL open in different tabs contains text 'TwitterStoriesUrl.key'



  Scenario: Search job on click on stories
    And Select one story
    When user enters keyword, Town
    And Click on Search CTA
    Then assert URL contains text 'SearchJobsUrl.key'
    Then Result are display accordingly
