Feature: Boots Search Job

  Background: Navigate to Boots homePage
    Given User is on Boots Home page
    When user accept cookie
    When user click on Search Jobs CTA
    Then assert URL contains text 'SearchJobsUrl.key'

  Scenario: Verify Search Job with Parameters
    And Search jobs filters are displayed
    When check for parameters displayed
    Then select distance is not clickable
    Then enter town, city or postcode option now select distance is clickable


    Scenario: Verify Search Job with All parameters added //1
    And Search jobs filters are displayed
    When user enters Job Keyword
    And user enters Job Town
    And user selects Job distance
    And user enters Enter Job preference
    And user selects Job Select business area
    And user selects Job Select function area
    And user selects Job Select parttime or full time
    And user selects Job Select contract type
    And User clicks on Search CTA
    Then Result are display accordingly


  Scenario: Verify Search Job with No parameters added
    And Search jobs filters are displayed
    And User did not enter any filters and clicks on Search  CTA
    Then default Search results are displayed


  Scenario: Verify Search Job with only keyword parameter added
    And  Search jobs filters are displayed
    When user enters Job Keyword
    And User clicks on Search CTA
    Then Result are display accordingly


  Scenario: Verify Hide advance filter on Search Job
    And  Search jobs filters are displayed
    And Hide Advance filters displayed
    When User click on Hide advance filters
    And user enters Job Town
    And user selects Job distance
    And User clicks on Search CTA
    And user click on clear search
    Then Result with no filter display


  Scenario: Verify Clear filter on Search Job
    And  Search jobs filters are displayed
    And Clear Filter is displayed
    When user enters Job Keyword
    And user enters Job Town
    And user selects Job distance
    And User clicks on Search CTA
    Then Result are display accordingly
    And user click on clear search
    Then Result with no filter display


  Scenario: Verify additional parameters When selected I already worked for boots //2
    And  Search jobs filters are displayed
    Then click on I already work for Boots
    When Verify Select Job levels with drop down Displayed
    Then user selects Job Select Job Level


  Scenario: Verify Search Job with selected parameters added //3
    And Search jobs filters are displayed
    Then click on I already work for Boots
    When user enters Job Keyword
    And user enters Job Town
    And user selects Job distance
    And user enters Enter Job preference
    And user selects Job Select business area
    And user selects Job Select function area
    And user selects Job Select parttime or full time
    And user selects Job Select contract type
    And user selects Job Select Job Level
    And User clicks on Search CTA
    Then Result are display accordingly


  Scenario: Verify Jobs listed after search
    Then Result with no filter display
    Then Search results should displayed with name, Role, Location, Contract type, Full time or part time, Apply now button with View Job description link


  Scenario: Verify Page count at Search result page
    Then Result with no filter display
    And Page number displayed
    When click on the page number


  Scenario: Verify redirection on Boots logo
    When Click on Boots Logo
    Then redirected to Boots Home page
