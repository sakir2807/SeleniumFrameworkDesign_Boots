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


  Scenario: Verify Back to top CTA on Our story page # not needed much
    And Back to top CTA displayed
    When user Scroll down
    Then Back to top CTA displayed
    When user click on Back to top CTA
    Then User is redirected to top of the page


  Scenario: Verify Social media link after click on stories
    And Select one story
    And Social media icons displayed on story page
    When user click on LinkedIn Icon
    Then assert URL open in different tabs contains text 'LinkedInUrl.key'
    When user click on Facebook icon
    Then assert URL open in different tabs contains text 'FacebookUrl.key'
    When user click on Twitter icon
    Then assert URL open in different tabs contains text 'TwitterUrl.key'
    When user click on Email Icon
    #Then assert URL open in different tabs contains text 'TwitterUrl.key'


  Scenario: Search job on click on stories  .// no idea need clarity
    And Search CTA displayed
    When user enters keyword, Town
    And Click on Search CTA
    And User redirected to search page
    And Search results should get displayed
    And Selected criteria must be prepopulated on search filters
