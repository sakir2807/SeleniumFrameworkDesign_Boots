Feature: Career Areas feature

  Background: Navigate to Boots homePage
    Given User is on Boots Home page
    When user accept cookie


  Scenario: Verify Current vacancies and  Share jobs on Retail Jobs page
    And User is on Retail page
    And Current Vacancies displayed
    And Share page dropdown displayed
    When user click on Current Vacancies CTA
    Then assert URL contains text 'SearchJobsUrl.key'
    When user Click on Share page Dropdown with social media links displayed  #explanation needed


  Scenario: Verify Why Join us CTAs on Retail Jobs page
    And User is on Retail page
    When user click on Customer advisor option  # Need idea how to deal with multi list drop down
    Then assert URL contains text 'CustomerAdvisorUrl.key'
    When user click on Beauty specialist
    Then assert URL contains text 'BeautySpecialistUrl.key'
    When user click on Retail management
    Then assert URL contains text 'RetailManagementUrl.key'
    When user click on No7
    Then assert URL contains text 'No7Url.key'
    When user click on Liz Earle
    Then assert URL contains text 'LizEarleUrl.key'
    When user click on Airport
    Then assert URL contains text 'AirportUrl.key'


  Scenario: Verify Video on beauty-specialist  page
    And User is on Retail page
    And User is on beauty-specialist page
    And Video is displayed
    And Current Vacancies displayed
    And Share page dropdown displayed
#    When user click on Current Vacancies CTA
#    Then assert URL contains text 'SearchJobsUrl.key'
#    When user Click on Share page Dropdown with social media links displayed
    When user click on play button
    Then Video should get played


  Scenario: Verify Current vacancies and Share jobs on Customer-advisor page
    And User is on customer-advisor
    And Current Vacancies displayed
    And Share page dropdown displayed
    When user click on Current Vacancies CTA
    Then assert URL contains text 'SearchJobsUrl.key'
    When user Click on Share page Dropdown with social media links displayed


  Scenario: Verify Current vacancies and Share jobs on Liz-earle page
    And User is on Liz-earle
    And Current Vacancies displayed
    And Share page dropdown displayed
    And Meet David – Service & Education Trainer for Liz Earle Displayed with image and Read more button
    When user click on Current Vacancies CTA
    Then assert URL contains text 'SearchJobsUrl.key'
    When user Click on Share page Dropdown with social media links displayed
    When user click on Read more under  Meet David – Service & Education Trainer for Liz Earle
    Then User getting redirected to details page on Liz Earle


  Scenario: Verify Current vacancies and Share jobs on Liz-earle page
    And User is on Retail page
    And User is on NoSeven page
    And Video is displayed
    When user click on play button
    Then Video should get played


  Scenario: Verify Retail-management page
    And User is on Retail management
    And Current Vacancies displayed
    And Share page dropdown displayed
    When user click on Current Vacancies CTA
    Then assert URL contains text 'SearchJobsUrl.key'


  Scenario: Verify Why Join us CTAs on Pharmacy Jobs page
    And User is on Pharmacy page
    When user click on Pharmacist
    Then assert URL contains text 'PharmacistUrl.key'
    When user click on Pharmacist - newly qualified
    Then assert URL contains text 'PharmacistNewlyQualifiedUrl.key'
    When user click on Pharmacy Support
    Then assert URL contains text 'PharmacySupportUrl.key'
    When user click on Trainee Pharmacist
    Then assert URL contains text 'TraineePharmacistUrl.key'
    When user click on Pharmacy Store Management
    Then assert URL contains text 'PharmacyStoreManagementUrl.key'
    When user click on Locum Pharmacist
    Then assert URL contains text 'LocumPharmacistUrl.key'


  Scenario: Verify Video Pharmacy page
    And User is on Pharmacy page
    And Video is displayed
    When user click on play button
    Then Video should get played


  Scenario: Verify Discover your path today on Pharmacy page
    And User is on Pharmacy page
    And Discover your path today displayed with CTA Let's start displayed
    And View job CTA displayed
    When user click on View job CTA
    Then assert URL contains text 'SearchJobsUrl.key'
    When user click 'Let's start' CTA
    Then User redirected to footer
    When user again click on Let's start
    Then Graph with different CTA displayed
    When user click on any one icon
    Then User is getting redirected to the different page
    When user click on continue story
    Then Next button with content displayed
    When user click on next
    Then user redirected to next page



  Scenario: Verify Pharmacist page
    And User is on Pharmacy page
    And User is on Pharmacist page
    And Discover your path today displayed with CTA Let's start displayed
    And Relocate with us CTA displayed
    And Chat with us CTA displayed
    When user click Let's start CTA
    Then User getting moved to different modal at footer
    When user click on relocate with us
    Then user redirected to Pharmacist Relocation page
    When user click on Chat with us
    Then Popup should get displayed with chat window



  Scenario: Verify Pharmacist-newly-qualified page
    And User is on Pharmacy page
    And user is on pharmacist-newly-qualified
    And Discover your path today displayed with CTA Let's start displayed
    And  Video displayed
    When user click Let's start CTA
    Then User getting moved to different modal at footer
    When user click Video.
    Then Video is played


  Scenario: Verify Headers on Trainee-pharmacist Page
    And User is on Pharmacy page
    And User is on Trainee-pharmacist Page
    And  Headers displayed
    When user click on Introduction
    Then Introduction section displayed
    When user click on Our Pharmacy Programmes
    Then Our Pharmacy Programmes section displayed
    When user click on How to apply
    Then How to apply section displayed
    When user click on Our culture
    Then Our culture section displayed
    When user click on Our Team
    Then Our Team section displayed
    When User click on FAQs
    Then FAQs section displayed


  Scenario: Verify Register your interest and Benefit CTA on Trainee-pharmacist page
    And User is on Pharmacy page
    And User is on Trainee-pharmacist Page
    And Register your interest and Benefit CTA displayed
    When user click on Register your interest CTA
    And user click on Benefit
    Then User get redirected
    And Popup with Salary, Pension Scheme,  Lifeworks, Bonus scheme, The Benefits Box and GPHC / PSNI  is displayed with icons


  Scenario: Verify Our Pharmacy Programmes Trainee-pharmacist page
    And User is on Pharmacy page
    And User is on Trainee-pharmacist Page
    And  Our Pharmacy Programmes displayed
    When user click on Each programmes available verify information displayed

    
  Scenario: Verify How to apply clicks CTA on Trainee-pharmacist Page
    And User is on Pharmacy page
    And User is on Trainee-pharmacist Page
    And How to apply slider is displayed
    When user click on How to apply slider CTA
    Then Information related to the selected criteria is displayed


  Scenario: Verify Our Culture and Trainee pharmacist stories scroll CTA on Trainee-pharmacist Page
    And User is on Pharmacy page
    And User is on Trainee-pharmacist Page
    And  Our Culture displayed
    And Trainee pharmacist stories displayed
    And View story CTA displayed
    When user click on Our Culture scroll CTA
    Then images with information displayed
    When user click on Trainee pharmacist stories scroll CTA
    Then images with information displayed
    When user click on View all stories
    Then user getting redirected to Our story page


  Scenario: Verify Pharmacy-support page
    And User is on Pharmacy page
    And user is on Pharmacy-support
    And Discover your path today displayed with CTA Let's start displayed
    #And  Video is displayed # Not present
    When user click Let's start CTA
    Then User getting moved to different modal at footer
    #When user click on play button# Not present
    #Then Video should get played# Not present


  Scenario: Verify Discover your path today on pharmacy-store-management
    And User is on Pharmacy page
    And User is on Pharmacy-store-management
    And  Our Culture displayed #Kidar hai ya
    When user click on Our Culture CTA
    Then Information related to the selected criteria is displayed


  Scenario: Verify Discover your path today on Locum-pharmacist
    And User is on Pharmacy page
    And User click on Locum-pharmacist
    And Discover your path today displayed with CTA Let's start displayed
    When user click Let's start CTA
    Then User getting moved to different modal at footer


  Scenario: Verify Why join us CTA on Support Office Jobs page
    And user is on Support Office Jobs Page
    And Why join us CTA displayed
    When user click on Buying & Merchandising
    Then assert URL contains text 'BuyingMerchandisingUrl.key'
    When user click on Ecommerce & Digital
    Then assert URL contains text 'EcommerceDigitalUrl.key'
    When user click on Digital Transformation
    Then assert URL contains text 'DigitalTransformationUrl.key'
    When user click on Data & Insights
    Then assert URL contains text 'DataInsightsUrl.key'
    When user click on Finance
    Then assert URL contains text 'FinanceUrl.key'
    When user click on HR
    Then assert URL contains text 'HRUrl.key'
    When user click on Marketing, Brand & Communications
    Then assert URL contains text 'MarketingBrandCommunicationUrl.key'
    When user click on Property & Estates
    Then assert URL contains text 'PropertyEstatesUrl.key'
    When user click on Research & Development
    Then assert URL contains text 'ResearchDevelopmentUrl.key'
    When user click on Supply & Demand Planning
    Then assert URL contains text 'SupplyDemandPlanningUrl.key'
    When user click on Technology
    Then assert URL contains text 'TechnologyUrl.key'


  Scenario: Verify Video  Support Office Jobs page
    And user is on Support Office Jobs Page
    And Video is displayed
    When user click on play button
    Then Video should get played


  Scenario: Verify Support Office Jobs List pages
    And user is on Support Office Jobs Page
    And 'Current Vacancies' displayed
    And Share page dropdown displayed
    When user click on 'Current Vacancies' CTA
    Then assert URL contains text 'SearchJobsUrl.key'
    When user Click on Share page Dropdown with social media links displayed.
#  Check all the above steps for below pages:
#  Business Support & Operations
#  Buying & Merchandising
#  Ecommerce & Digital
#  Digital Transformation
#  Data & Insights
#  Finance
#  HR
#  Marketing, Brand & Communications
#  Property & Estates
#  Research & Development
#  Supply & Demand Planning
#  Technology


  Scenario: Verify  Why Join us CTAs on Opticians Jobs page
    And User is on Pharmacy Jobs
    And Optometrist, Pre-registration Optometrist, Optical Support Colleague, Opticians Store Management ,Franchise CTA displayed
    When user click on Optometrist
    Then assert URL contains text 'OptometristUrl.key'
    When user click on Pre-registration Optometrist
    Then assert URL contains text 'PreRegistrationOptometristUrl.key'
    When user click on Optical Support Colleague
    Then assert URL contains text 'OpticalSupportColleagueUrl.key'
    When user click on Opticians Store Management
    Then assert URL contains text 'OpticianStoreManagementUrl.key'
    When user click on Pharmacy Store Management page
    Then assert URL contains text 'PharmacyStoreManagementUrl.key'
    When user click on Franchise
    Then assert URL contains text 'FranchiseUrl.key'


  Scenario: Verify Video Opticians page
    And User is on Opticians page
    And Video is displayed
    When user click on play button
    Then Video should get played


  Scenario: Verify Video Optometrist page
    And User is on Optometrist page
    And Video is displayed
    When user click on play button
    Then Videos should get played


  Scenario: Verify Headers on pre-reg-optometrist page
    And User is on Opticians page
    And User is on Pre-reg-optometrist Page
    And  Headers displayed
    When user click on Our Optometrist Programme
    Then Our Optometrist Programme section displayed
    When user click on Application Process
    Then Application Process section displayed
    When user click on Our culture
    Then Our culture section displayed
    When user click on Our Team
    Then Our Team section displayed
    When User click on FAQs
    Then FAQs section displayed


  Scenario: Verify Apply now and Benefit CTA on pre-reg-optometrist page
    And User is on Opticians page
    And User is on Pre-reg-optometrist Page
    And Apply now CTA displayed
    And Benefit CTA displayed
    When  user click on Benefit
    Then User get redirected
    And Popup with Salary, Pension Scheme,  Lifeworks, Bonus scheme, Then Benefits Box and GPHC / PSNI  is displayed with icons.
    When user click on 'Apply now'
    Then user redirected to Search page


  Scenario: Verify Application process in pre-reg-optometrist page
    And User is on pre-reg-optometrist page
    And Application Process displayed
    When user click on Application Process stage CTA
    Then Stage should get selected and information displayed



  Scenario: Verify Our culture pre-reg-optometrist page
    And User is on pre-reg-optometrist page
    When user click on Our Culture scroll CTA
    Then images with information displayed
    When user click on Option Store scroll CTA
    Then images with information displayed


  Scenario: Verify Hint & Tips  CTA on pre-reg-optometrist page
    And User is on pre-reg-optometrist page
    And Hint & tips CTA displayed
    When user click on Hint & tips' CTA
    Then Popup with Interviews and application information displayed


  Scenario: Verify Headers on Franchise Page
    And User is on Opticians page
    And User is on  Franchise Page
    And  Headers displayed
    When user click on Introduction
    Then Introduction section displayed
    When user click on About franchise opportunities
    Then About franchise opportunities section displayed
    When user click on Process
    Then Process section displayed
    When user click on each stage
    Then Stages with information displayed
    When User click on Testimonials
    Then Testimonials  section displayed
    When user click on scroll on testimonial options
    Then Images with information should get displayed
    When user click on Our Team
    Then Our Team section displayed with image and details
    When User click on FAQs
    Then FAQs section displayed


  Scenario: Verify Enquire now CTA  on Franchise Page
    And User is on Opticians page
    And User is on Franchise Page
    And Enquire now CTA displayed
    When user click on Enquire now
    Then User redirected to email


  Scenario: Verify Opticians List pages
    Given User is on Boots home page
    And User is on Career areas page
    And user is on Opticians Page
    And Current Vacancies displayed
    And Share page dropdown displayed
    When user click on 'Current Vacancies' CTA
    Then User get redirected to search job page
    When user Click on Share page Dropdown with social media links displayed.
#  Check all the above steps for below pages:
#  Optometrist Jobs
#  Optical Support Roles
#  opticians-store-management


  Scenario: Verify Why Join us CTAs on Supply Chain Jobs page
    And User is on Supply-chain page
    And Pharmacy Distribution, Warehousing, Supply & Demand Planning CTA displayed
    When user click on Pharmacy Distribution
    Then assert URL contains text 'PharmacyDistributionUrl.key'
    When user click on Warehousing
    Then assert URL contains text 'WarehousingUrl.key'
    When user click on Supply & Demand Planning
    Then assert URL contains text 'SupplyDemandPlanningUrl.key'


  Scenario: Verify Supply Chain Page list Pharmacy-distribution
    And user is on Supply Chain Page
    And user is on Pharmacy-distribution
    And 'Current Vacancies' displayed
    And Share page dropdown displayed
    When user click on 'Current Vacancies' CTA
    Then assert URL contains text 'SearchJobsUrl.key'
    When user Click on Share page Dropdown with social media links displayed


  Scenario: Verify Warehouse Job under  Supply Chain Page list
    And user is on Supply Chain Page
    And user is on Warehouse Job
    And Current Vacancies displayed
    And Pertemps , AM2PM CTA displayed
    And Share page dropdown displayed
    When user click on Current Vacancies CTA
    Then User get redirected to search job page
    When user Click on Share page Dropdown with social media links displayed.
    When user click on Pertemps
    Then it get redirected to Pertemps page
    When user click on AM2PMx
    Then it get redirect to AM2PM


  Scenario: Verify  Why Join us CTAs on Early Careers page
    And User is on Early Careers Page
    And Apprenticeships, Graduates, Summer Internships and Work Experience CTA displayed
    When user click on Apprenticeships
    Then User redirects to Apprenticeships page
    When user click on Graduates
    Then user redirects to Graduates page
    When user click on Summer Internships
    Then user redirects to Summer Internships page
    When user click on Work Experience
    Then user redirects to Work Experience page


  Scenario: Verify Video on Early Careers page
    And User is on Early Careers page
    And Video is displayed
    When user click on play button
    Then Video should get played


  Scenario: Verify Headers on Apprenticeships page
    And User is on Early Careers page
    And User is on  Apprenticeships page
    And  Headers displayed
    When user click on Our Apprenticeship
    Then Our Apprenticeship section displayed
    When user click on Application Process
    Then Application Process section displayed
    When user click on Our culture
    Then Our culture section displayed
    When user click on Our Team
    Then Our Team section displayed
    When user click on Resources
    Then Resources section displayed
    When user click on Parents & teachers
    Then Parents & teachers section displayed
    When user click on Safeguarding
    Then Safeguarding section displayed
    When User click on FAQs
    Then FAQs section displayed


  Scenario: Verify Apprenticeships page
    And User is on Early Careers page
    And User is on  Apprenticeships page
    And  Video displayed
    And Hint & Tips CTA displayed
    And Application Process stages displayed
    And Our Culture and Stories images and scroll CTA displayed
    And Parents & teachers Scroll and Video displayed
    When user click on video
    Then Video gets played
    When user click on hints and tips
    Then Popup modal opened with details


  Scenario: Verify Resources and Safeguarding on Apprenticeships page
    And User is on Early Careers page
    And User is on  Apprenticeships page
    And  Resources displayed
    And Safeguarding displayed
    When user click on download CTA for Student's Guide to Apprenticeships
    Then PDF files get downloaded / User redirected to new tab with PDF
    When user click on download CTA for Our Safeguarding policy
    Then PDF files get downloaded / User redirected to new tab with PDF
    When user click on Safeguarding & prevent videos
    Then User redirected to YouTube page
    When user click on download CTA Parent support pack
    Then PDF files get downloaded / User redirected to new tab with PDF


  Scenario: Verify Headers on Graduates page
    And User is on Early Careers page
    And User is on  Graduates page
    And  Headers displayed
    When user click on Introduction
    Then Introduction section displayed
    When user click on Graduate Opportunities
    Then Graduate Opportunities section displayed
    When user click on Application Process
    Then Application Process section displayed
    When user click on Our culture
    Then Our culture section displayed
    When user click on Resources
    Then Resources section displayed
    When User click on FAQs
    Then FAQs section displayed


  Scenario: Verify Graduates page
    And User is on Early Careers page
    And User is on  Graduates page
    And  Video displayed
    And Hint & Tips CTA displayed
    And Application Process stages displayed
    And Our Culture and Stories images and scroll CTA displayed
    And Parents & teachers Scroll and Video displayed
    When user click on video
    Then Video gets played
    When user click on hints and tips
    Then Popup modal opened with details


  Scenario: Verify Work Experience page
    And User is on Early Careers page
    And User is on Work Experience page
    And  Speakers for Schools CTA displayed
    When user click on Speakers for Schools CTA
    Then assert URL contains text 'SpeakerSchoolUrl.key'


  Scenario: Verify Why Join us CTAs on Ireland Jobs page
    And User is on  Ireland Jobs page
    And  Pharmacist, Pharmacy Support, Retail, Support Office CTA displayed
    When user click on Pharmacist
    Then User redirects to Pharmacist page
    When user click on Pharmacy Support
    Then user redirects to Pharmacy Support
    When user click on Retail
    Then user redirects to Retail page
    When user click on Support Office
    Then user redirects to Support Office page


  Scenario: Verify Ireland page options
    Given User is on Boots home page
    And User is on Career areas page
    And User is on  Ireland Jobs page
    And  Pharmacist, Pharmacy Support, Retail, Support Office CTA displayed
    And Learning & Development with 'Find out more' CTA
    And Video displayed
    And View Benefits CTA displayed
    When user click on Find out more
    Then Modal with details displayed
    When user click on video
    Then Video played
    When user click on View Benefit CTA
    Then Modal with details displayed
#  Verify this for all the below pages:
#  Pharmacist, Pharmacy Support, Retail, Support Office


  Scenario: Verify Hearing care link on Career areas page
    When user click on Hearing care link
    Then assert URL open in different tabs contains text 'HearingCareUrl.key'


  Scenario: Verify Walgreens Boots Alliance link on Career areas page
    When user click on Walgreens Boots Alliance link
    Then assert URL open in different tabs contains text 'WalgreensBootsAllianceUrl.key'


  Scenario: Verify No7 beauty company link on Career areas page
    When user click on NoSeven beauty company link
    Then assert URL open in different tabs contains text 'No7BeautyCompanyUrl.key'
