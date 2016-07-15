Feature: Multiple Scenarios
  
  The main objective of this feature file is to use multiple scenarios to check if all the pages
  of my website are being opened properly by checking their titles
  
  While the code for this is correct and works as intended, it could be 

  Scenario: Check page title for Operation page
    Given I am on my funky website
    When I navigate to Operation
    Then I check if the page title is Operation
    And I close the browser

  Scenario: Check page title for About page
    Given I am on my funky website
    When I navigate to About
    Then I check if the page title is About
    And I close the browser

  Scenario: Check page title for Contact page
    Given I am on my funky website
    When I navigate to Contact
    Then I check if the page title is Contact
    And I close the browser
