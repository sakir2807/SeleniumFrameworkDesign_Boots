Feature: Boots homepage

  Background: Navigate to Boots homePage
    Given User is on Boots Home page
    When user accept cookie


  Scenario: Verify Header links on home page
    And headers are displayed
    When Click on Boots Logo
    Then Page get refreshed and home page displayed
    When user click on Home option on header
    Then Page get refreshed and home page displayed
    When user click on Why boots
    Then assert URL contains text 'WhyBootsUrl.key'
    When user hover on Career areas
    Then career areas drop down is displayed
    When user click on Our stories
    Then assert URL contains text 'OurStoriesUrl.key'
    When user click on Search Jobs CTA
    Then assert URL contains text 'SearchJobsUrl.key'
    When user click on FAQs
    Then assert URL contains text 'FAQSPageUrl.key'
    When user click on Log In
    And clicked on I want to work for boot
    Then Sign in option displayed
    And user redirected to different page


  Scenario: Verify Search Now filters on Home page
    Then Search jobs field is displayed
    When user enters Keyword
    And user enters location
    And user selects distance
    And user clicks on Search Now CTA
    And user selects I want to work for Boots CTA
    Then assert URL contains text 'SearchJobsUrl.key'
    And basic filter are displayed
    And advanced filter are displayed


  Scenario: Verify career area filter present on homepage
    Then Career area filters are displayed
    Then View Stories CTA displayed
    When user selects category
    Then stories as per category displayed
    And each story with Image and description displayed
    When user selects another category from list
    Then stories as per category displayed
    When user click on View stories CTA
    Then assert URL contains text 'StoryPageUrl.key'



  Scenario: Verify Stories displayed on home page
    And user selected category from Career area dropdown
    When click on one story
    Then Redirected to Story page then Image and Description displayed


  Scenario: Verify Jobs that might interest you on home page
    Then Jobs that might interest you displayed
    Then Find out more CTA displayed
    Then Category name and Job role and Location displayed
    When user click on Find out more CTA
    Then redirected to Story page and story description displayed



  Scenario: Verify Why boots with explore more CTA
    Then why boots section displayed
    Then Banner image with text displayed
    Then Explore more CTA displayed
    When user click on Explore more CTA
    Then assert URL contains text 'WhyBootsUrl.key'



  Scenario: Verify FAQs on Home page
    And FAQs are displayed
    When user click on first FAQ accordion
    Then accordion should expand
    When User click on Expanded accordion
    Then Accordion get collapsed



  Scenario: Verify View All FAQs CTA on Home page
    Then View all FAQs CTA displayed
    When click on View all FAQs CTA
    Then assert URL contains text 'FAQSPageUrl.key'



  Scenario: Verify Social media icons on Boots home page
    Then Social media icons displayed
    When user click on Instagram Icon
    Then assert URL open in different tabs contains text 'InstagramUrl.key'
    When user click on Facebook icon
    Then assert URL open in different tabs contains text 'FacebookUrl.key'
    When user click on Twitter icon
    Then assert URL open in different tabs contains text 'TwitterUrl.key'
    When user click on LinkedIn Icon
    Then assert URL open in different tabs contains text 'LinkedInUrl.key'


  Scenario: Verify Instagram stories on Home page
    Then Instagram stories are displayed
    When user mouse hover on story image
    When Click on story
    Then assert URL open in different tabs contains text 'InstagramStoryUrl.key'


  Scenario: Verify Footer on home page
    Then Footer is displayed
    Then Badge displayed
    When User click on About boots footer
    Then assert URL open in different tabs contains text 'AboutBootsUrl.key'
    Then Footer is displayed
    When user click on Boots.com footer
    Then assert URL open in different tabs contains text 'BootsComUrl.key'
    Then Footer is displayed
    When user click on FAQs footer
    Then assert URL contains text 'FAQSPageUrl.key'



 Scenario: Verify Sub footer at home page
    Then Sub footer is displayed along with social media logos
    When user click on Accessibility
    Then assert URL contains text 'AccessibilityPageUrl.key'
    Then Sub footer is displayed along with social media logos
    When user click on Sitemap
    Then assert URL contains text 'SitemapPageUrl.key'
    Then Sub footer is displayed along with social media logos
    When user click on Privacy statement
    Then assert URL contains text 'PrivacyStatementPageUrl.key'
    Then Sub footer is displayed along with social media logos
    When user click on Cookies policy
    Then assert URL contains text 'CookiesPolicyPageUrl.key'
    Then Sub footer is displayed along with social media logos
    When user click on  Careers at boots footer
    Then Drop down displayed
    When user click on Facebook icon footer
    Then assert URL open in different tabs contains text 'FacebookUrl.key'
    When user click on Twitter icon footer
    Then assert URL open in different tabs contains text 'TwitterUrl.key'
    When user click on Instagram Icon footer
    Then assert URL open in different tabs contains text 'InstagramUrl.key'
    When user click on LinkedIn Icon footer
    Then assert URL open in different tabs contains text 'LinkedInUrl.key'



  Scenario: Verify Sub footer at careers at boots
    Then click and verify career at boots from footer
    Then dropdown should displayed
    When user click on Pharmacy Jobs
    Then assert URL contains text 'PharmacyJobsPageUrl.key'
    When click and verify career at boots from footer
    When user click on Opticians Jobs
    Then assert URL contains text 'OpticiansJobsPageUrl.key'
    When click and verify career at boots from footer
    When user click on Retail Jobs
    Then assert URL contains text 'RetailJobsPageUrl.key'
    When click and verify career at boots from footer
    When user click on Supply Chain Jobs
    Then assert URL contains text 'SupplyChainJobsPageUrl.key'
    When click and verify career at boots from footer
    When user click on Support Office Jobs
    Then assert URL contains text 'SupportOfficeJobPageUrl.key'
    When click and verify career at boots from footer
    When user click on Early Careers
    Then assert URL contains text 'EarlyCareersPageUrl.key'
    When click and verify career at boots from footer
    When user click on Ireland Jobs
    Then assert URL contains text 'IrelandJobsPageUrl.key'
    When click and verify career at boots from footer
    When user click on Airports Jobs
    Then assert URL contains text 'AirportsJobPageUrl.key'
