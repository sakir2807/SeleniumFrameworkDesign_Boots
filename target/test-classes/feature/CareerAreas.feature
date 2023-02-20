Feature: Career Areas feature

  Background: Navigate to Boots homePage
    Given User is on Boots Home page
    When user accept cookie


  Scenario: Verify Current vacancies and Share jobs on Retail Jobs page
    And User is on Retail page
    And Current Vacancies displayed
    And Share page dropdown displayed
    When user click on Current Vacancies CTA
    Then assert URL contains text 'SearchJobsUrl.key'


  Scenario: Verify Why Join us CTAs on Retail Jobs page
    And User is on Retail page
    When user click on Customer advisor option
    Then assert URL contains text 'CustomerAdvisorUrl.key'
    When user click on Beauty specialist
    Then assert URL contains text 'BeautySpecialistUrl.key'
    When user click on Retail management
    Then assert URL contains text 'RetailManagementUrl.key'
    When user click on NoSeven
    Then assert URL contains text 'No7Url.key'
    When user click on Liz Earle
    Then assert URL contains text 'LizEarleUrl.key'
    When user click on Airport
    Then assert URL contains text 'AirportUrl.key'


  Scenario: Verify Video on beauty-specialist page
    And User is on Retail page
    And User is on beauty-specialist page
    And Current Vacancies displayed
    And Share page dropdown displayed
    And Video is displayed
    When user click on play button
    Then Video should get played


  Scenario: Verify Current vacancies and Share jobs on Customer-advisor page
    And User is on Retail page
    And User is on customer-advisor
    And Current Vacancies displayed
    And Share page dropdown displayed
    When user Click on Share page Dropdown with social media links displayed


  Scenario: Verify Current vacancies and Share jobs on Liz-earle page
    And User is on Retail page
    And User is on Liz-earle
    And Current Vacancies displayed
    And Share page dropdown displayed
    And Meet David – Service & Education Trainer for Liz Earle Displayed with image and Read more button
    When user click on Read more under  Meet David – Service & Education Trainer for Liz Earle
    Then assert URL contains text 'LizEarleDavidUrl.key'


  Scenario: Verify Video on No7 page
    And User is on Retail page
    And User is on NoSeven page
    And Video is displayed
    When user click on play button
    Then Video should get played


  Scenario: Verify Retail-management page
    And User is on Retail page
    And User is on Retail management
    And Current Vacancies displayed
    And Share page dropdown displayed
    When user click on Current Vacancies CTA
    Then assert URL contains text 'SearchJobsUrl.key'


  Scenario: Verify Why Join us CTAs on Pharmacy Jobs page
    And User is on Pharmacy page
    And User is on Pharmacist page
    Then assert URL contains text 'PharmacistUrl.key'
    When user click on Pharmacist - newly qualified
    Then assert URL contains text 'PharmacistNewlyQualifiedUrl.key'
    When user click on Pharmacy Support
    Then assert URL contains text 'PharmacySupportUrl.key'
    When user click on Trainee Pharmacist
    Then assert URL contains text 'TraineePharmacistUrl.key'
    When user click on Pharmacy Store Management
    Then assert URL contains text 'PharmacyStoreManagementUrl.key'
    When user click on Locum Pharmacist option
    Then assert URL contains text 'LocumPharmacistUrl.key'


  Scenario: Verify Video Pharmacy page
    And User is on Pharmacy page
    And Video is displayed
    When user click on play button
    Then Video should get played


  Scenario: Verify Discover your path today on Pharmacy page
    And User is on Pharmacy page
    And Discover your path today displayed with CTA Let's start displayed
#    And View job CTA displayed # don't know where it is
#    When user click on View job CTA
#    Then assert URL contains text 'SearchJobsUrl.key'
    When user click Let's start CTA
    Then User getting moved to different modal at footer
    When user again click on Let's start
    Then Graph with different CTA displayed
    When user click on any one icon
    Then User is getting redirected to the role selected content
    When user click on continue my story
    Then Next button with content displayed
    When user click on next
    Then user redirected to next role in graph


  Scenario: Verify Pharmacist page
    And User is on Pharmacy page
    And User is on Pharmacist page
    And Discover your path today displayed with CTA Let's start displayed
    And Relocate with us CTA displayed
#    And Chat with us CTA displayed
    When user click Let's start CTA
    Then User getting moved to different modal at footer
    When user click on relocate with us
    Then assert URL contains text 'RelocationUrl.key'



  Scenario: Verify Pharmacist-newly-qualified page
    And User is on Pharmacy page
    And user is on pharmacist-newly-qualified
    And Discover your path today displayed with CTA Let's start displayed
    When user click Let's start CTA
    Then User getting moved to different modal at footer
    And Video is displayed
    When user click on play button
    Then Video should get played


  Scenario: Verify Headers on Trainee-pharmacist Page
    And User is on Pharmacy page
    And User is on Trainee-pharmacist Page
    And Headers displayed
    Then click and verify each header


  Scenario: Verify Register your interest and Benefit CTA on Trainee-pharmacist page
    And User is on Pharmacy page
    And User is on Trainee-pharmacist Page
    And Register your interest and Benefit CTA displayed
    And user click on Benefit
    And Popup with Salary, Pension Scheme,  Lifeworks, Bonus scheme, The Benefits Box and GPHC PSNI  is displayed with icons


  Scenario: Verify Our Pharmacy Programmes Trainee-pharmacist page
    And User is on Pharmacy page
    And User is on Trainee-pharmacist Page
    And Our Pharmacy Programmes displayed
    When user click on Each programmes available verify information displayed


#  Scenario: Verify How to apply clicks CTA on Trainee-pharmacist Page//look//not getting test case
#    And User is on Pharmacy page
#    And User is on Trainee-pharmacist Page
#    And How to apply slider is displayed
#    When user click on How to apply slider CTA
#    Then Information related to the selected criteria is displayed


  Scenario: Verify Our Culture and Trainee pharmacist stories scroll CTA on Trainee-pharmacist Page//look
    And User is on Pharmacy page
    And User is on Trainee-pharmacist Page
    And Our Culture displayed
    And Trainee pharmacist stories displayed
    And View story CTA displayed
    #When user click on Our Culture scroll CTA
    #Then Our culture images with information displayed
    When user click on Trainee pharmacist stories scroll CTA
    Then Trainee pharmacist stories images with information displayed
    When user click on View all stories of trainee
    Then assert URL contains text 'OurStoriesUrl.key'


  Scenario: Verify Pharmacy-support page
    And User is on Pharmacy page
    And user is on Pharmacy-support
    And Discover your path today displayed with CTA Let's start displayed
    When user click Let's start CTA
    Then User getting moved to different modal at footer


#  Scenario: Verify Discover your path today on pharmacy-store-management // not present
#    And User is on Pharmacy page
#    And User is on Pharmacy-store-management
#    And  Our Culture displayed #Kidar hai ya
#    When user click on Our Culture CTA
#    Then Information related to the selected criteria is displayed


  Scenario: Verify Discover your path today on Locum-pharmacist
    And User is on Pharmacy page
    And User click on Locum-pharmacist
    And Discover your path today displayed with CTA Let's start displayed
    When user click Let's start CTA
    Then User getting moved to different modal at footer


  Scenario: Verify Why join us CTA on Support Office Jobs page
    And user is on Support Office Jobs Page
    And Why join us content displayed
#    When user click on Business Support
#    Then assert URL contains text 'BusinessSupportUrl.key'
    When user click on Buying & Merchandising
    Then assert URL contains text 'BuyingMerchandisingUrl.key'
#    When user click on Ecommerce & Digital
#    Then assert URL contains text 'EcommerceDigitalUrl.key'
#    When user click on Digital Transformation
#    Then assert URL contains text 'DigitalTransformationUrl.key'
    When user click on Data & Insights
    Then assert URL contains text 'DataInsightsUrl.key'
    When user click on Finance
    Then assert URL contains text 'FinanceUrl.key'
    When user click on HR
    Then assert URL contains text 'HRUrl.key'
    When user click on Marketing, Brand & Communications
    Then assert URL contains text 'MarketingBrandCommunicationUrl.key'
#    When user click on Property & Estates
#    Then assert URL contains text 'PropertyEstatesUrl.key'
#    When user click on Research & Development
#    Then assert URL contains text 'ResearchDevelopmentUrl.key'
    When user click on Supply & Demand Planning Support
    Then assert URL contains text 'SupplyDemandPlanningUrl.key'
    When user click on Technology
    Then assert URL contains text 'TechnologyUrl.key'


  Scenario: Verify Video Support Office Jobs page
    And user is on Support Office Jobs Page
    And Video is displayed
    When user click on play button
    Then Video should get played


  Scenario: Verify Support Office Jobs List pages
    And user is on Support Office Jobs Page
    And Current Vacancies displayed
    And Share page dropdown displayed
    When user click on Current Vacancies CTA
    Then assert URL contains text 'SearchJobsUrl.key'


  Scenario: Verify Why Join us CTAs on Opticians Jobs page
    And User is on Opticians page
    And Optometrist, Pre-registration Optometrist, Optical Support Colleague, Opticians Store Management ,Franchise CTA displayed
    When user click on Optometrist
    Then assert URL contains text 'OptometristUrl.key'
    When user click on Pre-Reg-Optometrist
    Then assert URL contains text 'PreRegistrationOptometristUrl.key'
    When user click on Optical Support Colleague
    Then assert URL contains text 'OpticalSupportColleagueUrl.key'
    When user click on Opticians Store Management
    Then assert URL contains text 'OpticianStoreManagementUrl.key'
    When user click on Franchise
    Then assert URL contains text 'FranchiseUrl.key'


  Scenario: Verify Video Opticians page
    And User is on Opticians page
    And Video is displayed
    When user click on play button
    Then Video should get played


  Scenario: Verify Video Optometrist page
    And User is on Opticians page
    And User is on Optometrist page
    Then assert URL contains text 'OptometristUrl.key'
    And Video is displayed
    When user click on play button
    Then Video should get played


  Scenario: Verify Headers on pre-reg-optometrist page
    And User is on Opticians page
    And User is on Pre-reg-optometrist Page
    Then assert URL contains text 'PreRegistrationOptometristUrl.key'
    And Headers displayed
    Then click on each pre-reg-optometrist header link and verify it


  Scenario: Verify Apply now and Benefit CTA on pre-reg-optometrist page
    And User is on Opticians page
    And User is on Pre-reg-optometrist Page
    And Apply now CTA displayed
    And Benefit CTA displayed
    When user click on Benefit CTA
    Then user get informative popup
    When user click on Apply now
    Then assert URL open in different tabs contains text 'Pre-reg-optometristSearchJobsUrl.key'


  Scenario: Verify Application process in pre-reg-optometrist page
    And User is on Opticians page
    And User is on Pre-reg-optometrist Page
    And Application Process displayed
    When user click on Application Process stage CTA
    Then Stage should get selected and information displayed



  Scenario: Verify Our culture pre-reg-optometrist page
    And User is on Opticians page
    And User is on Pre-reg-optometrist Page
    Then user click on Our Culture and verify content
    Then user click on Optician stories and verify content


  Scenario: Verify Hint & Tips CTA on pre-reg-optometrist page
    And User is on Opticians page
    And User is on Pre-reg-optometrist Page
    And Hint & tips CTA displayed
    When user click on Hint & tips CTA
    Then Popup with Interviews and application information displayed


  Scenario: Verify Headers on Franchise Page
    And User is on Opticians page
    And User is on Franchise Page
    Then assert URL contains text 'FranchiseUrl.key'
    And Headers displayed
    Then click on each header link and verify it


  Scenario: Verify Enquire now CTA on Franchise Page
    And User is on Opticians page
    And User is on Franchise Page
    And Enquire now CTA displayed
    When user click on Enquire now
    Then assert URL open in different tabs contains text 'EnquireFormUrl.key'

  Scenario: Verify Opticians List pages
    And User is on Opticians page
    And Current Vacancies displayed
    And Share page dropdown displayed
    When user click on Current Vacancies CTA
    Then assert URL contains text 'SearchJobsUrl.key'


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
    And User is on Supply-chain page
    And user click on Pharmacy Distribution
    And Current Vacancies displayed
    And Share page dropdown displayed
    When user click on Current Vacancies CTA
    Then assert URL contains text 'SearchJobsUrl.key'


  Scenario: Verify Warehouse Job under Supply Chain Page list
    And User is on Supply-chain page
    And user click on Warehousing
    And Current Vacancies displayed
    And Share page dropdown displayed//specified issue
    And Pertemps, AMPM CTA displayed
    When user click on Pertemps
    Then assert URL open in different tabs contains text 'PertempsUrl.key'
    When user click on AMPM
    Then assert URL open in different tabs contains text 'AMPMUrl.key'


  Scenario: Verify Why Join us CTAs on Early Careers page
    And User is on Early Careers page
    And Apprenticeships, Graduate and Work Experience CTA displayed
    When user click on Apprenticeships
    Then assert URL contains text 'ApprenticeshipsUrl.key'
    When user click on Graduates
    Then assert URL contains text 'GraduateUrl.key'
    When user click on Work Experience
    Then assert URL contains text 'WorkExperienceUrl.key'


  Scenario: Verify Video on Early Careers page
    And User is on Early Careers page
    And Video is displayed
    When user click on play button
    Then Video should get played


  Scenario: Verify Headers on Apprenticeships page
    And User is on Early Careers page
    And user click on Apprenticeships
    And Headers displayed
    Then click on each Apprenticeships header link and verify it


  Scenario: Verify Apprenticeships page
    And User is on Early Careers page
    And user click on Apprenticeships
    And Hint & tips CTA displayed
    And Application Process stages displayed
    And Our Culture and Stories images and scroll CTA displayed
    And Parents & teachers Scroll and Video displayed
    And Video is displayed graduate
    When user click on play button graduate
    Then Video should get played


  Scenario: Verify Resources and Safeguarding on Apprenticeships page
    And User is on Early Careers page
    And user click on Apprenticeships
    And Resources Section is displayed
    And download options are display


  Scenario: Verify Headers on Graduates page
    And User is on Early Careers page
    And user click on Graduates
    And Headers displayed
    Then click on each header link and verify it


  Scenario: Verify Graduates page
    And User is on Early Careers page
    And user click on Graduates
    And Hint & tips CTA displayed
    And Application Process stages displayed
    And Our Culture and Stories images and scroll CTA displayed
    And Video is displayed graduate
    When user click on play button graduate
    Then Video should get played


  Scenario: Verify Work Experience page
    And User is on Early Careers page
    And User is on Work Experience page
    And  Speakers for Schools CTA displayed
    When user click on Speakers for Schools CTA
    Then assert URL contains text 'SpeakerSchoolUrl.key'


  Scenario: Verify Why Join us CTAs on Ireland Jobs page
    And User is on Ireland Jobs page
    And  Pharmacist, Pharmacy Support, Retail, Support Office CTA displayed
    When user click on Pharmacist ireland
    Then assert URL contains text 'PharmacistIrelandUrl.key'
    When user click on Pharmacy Support ireland
    Then assert URL contains text 'PharmacySupportIrelandUrl.key'
    When user click on Retail ireland
    Then assert URL contains text 'RetailIrelandUrl.key'
    When user click on Support Office ireland
    Then assert URL contains text 'SupportOfficeIrelandUrl.key'


  Scenario: Verify Ireland page options
    And User is on Ireland Jobs page
    And Learning & Development with Find out more CTA
    And Video is displayed
    And View Benefits CTA displayed
    When user click on play button
    Then Video should get played


  Scenario: Verify Hearing care link on Career areas page
    When user click on Hearing care link
    Then assert URL open in different tabs contains text 'HearingCareUrl.key'


  Scenario: Verify Walgreens Boots Alliance link on Career areas page
    When user click on Walgreens Boots Alliance link
    Then assert URL open in different tabs contains text 'WalgreensBootsAllianceUrl.key'


  Scenario: Verify No7 beauty company link on Career areas page
    When user click on NoSeven beauty company link
    Then assert URL open in different tabs contains text 'No7BeautyCompanyUrl.key'
