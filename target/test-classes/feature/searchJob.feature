#Feature: Boots Search Job
#
#  Background: Navigate to Boots homePage
#    Given User is on Boots Home page
#    When user accept cookie
#
#  Scenario: Verify Search Job with Parameters
#    Given User is on Search Job page
#    And I want to work for boots selected
#    And  Search jobs filters are displayed
#    When check for parameters displayed
#    Then Enter Keyword, Enter location, Select distance, Enter job reference, select business area, Select function area select full or part time , Select contact type parameters displayed.
#    When click on select distance
#    Then it should not allow to select distance until Enter town, city or postcode option is selected
#
#
#  Scenario: Verify Search Job with All parameters added
#    Given User is on Search Job page
#    And I want to work for boots selected
#    And  Search jobs filters are displayed
#    When user enters Keyword
#    And user enters Town
#    And user selects distance
#    And user enters Enter Job preference
#    And user selects 'Select business area'
#    And user selects 'Select function area'
#    And user selects 'Select parttime or full time'
#    And user selects 'Select contract type'
#    And User clicks on Search CTA
#    Then User navigated to Search jobs page
#
#
#
#  Scenario: Verify Search Job with No parameters added
#    Given User is on Search Job page
#    And I want to work for boots selected
#    And  Search jobs filters are displayed
#    When Didn't enters Keyword
#    And Didn't enters Town
#    And Didn't selects distance
#    And User clicks on Search  CTA
#    Then Search results displayed
#
#
#  Scenario: Verify Search Job with only keyword  parameter added
#    Given User is on Search Job page
#    And I want to work for boots selected
#    And  Search jobs filters are displayed
#    When User enters Keyword Pharmacy
#    And Didn't enters Town
#    And Didn't selects distance
#    And User clicks on Search  CTA
#    Then Search results displayed
#
#
#  Scenario: Verify Hide advance filter on Search Job
#    Given User is on Search Job page
#    And I want to work for boots selected
#    And  Search jobs filters are displayed
#    And Hide Advance filters displayed
#    When User click on Hide advance filters
#    And User enters Town
#    And user selects distance
#    And User clicks on Search  CTA
#    And user click on clear search
#    Then Search results displayed
#    And All the selected value should be removed
#
#
#  Scenario: Verify Clear filter on Search Job
#    Given User is on Search Job page
#    And I want to work for boots selected
#    And  Search jobs filters are displayed
#    And Clear Filter is displayed
#    When User enters Keyword Pharmacy
#    And User enters Town
#    And user selects distance
#    And User clicks on Search  CTA
#    And user click on clear search
#    Then Search results displayed
#    And All the selected value should be removed
#
#
#  Scenario: Verify additional parameters When selected I already worked for boots
#    Given User is on Search Job page
#    And I already to work for boots selected
#    And  Search jobs filters are displayed
#    When Verify 'Select Job levels' with drop down Displayed
#    Then 'Select Job levels' with drop down Displayed
#
#
#  Scenario: Verify Search Job with selected parameters added
#    Given User is on Search Job page
#    And I already to work for boots selected
#    And  Search jobs filters are displayed
#    When user enters Keyword
#    And user enters Town
#    And user selects distance
#    And user enters Enter Job preference
#    And Didn't selects 'Select business area'
#    And Didn't selects 'Select function area'
#    And user selects 'Select parttime or full time'
#    And user selects 'Select contract type'
#    And user selects 'Select Job Level'
#    And User clicks on Search  CTA
#    Then User navigated to Search jobs page
#
#
#  Scenario: Verify Jobs listed after search
#    Given User is on Search Job page
#    And I want to work for boots selected
#    And Search results are displayed
#    When check for search results displayed
#    Then Search results should displayed with name, Role, Location, Contract type, Full time or part time, Apply now button with View Job description link
#
#
#  Scenario: Verify Page count at Search result page
#    Given User is on Search Job page
#    And I want to work for boots selected
#    And Search results are displayed
#    And Page number displayed
#    When check for page numbers
#    Then results with page number should displayed
#    When click on the page number
#    Then user redirected to search results page
#
#
#
#  Scenario: Verify redirection on Boots logo
#    Given User is on Search Job page
#    And I want to work for boots selected
#    When Click on Boots Logo
#    Then redirected to Boots Home page
