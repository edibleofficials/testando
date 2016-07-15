Feature: Multiple Scenarios
  
  The main objective of this feature file is to use multiple scenarios to check if all the pages
  of my website are being opened properly by checking their titles
  
  With the use of parameters on the feature file we make a shorter, simpler code

  Scenario: Check page title for Operation page
    Given I am on my smashing website
    When I navigate to "operation_link"
    Then I check if the page title is "Operation"
    And I close the old browser

  Scenario: Check page title for About page
    Given I am on my smashing website
    When I navigate to "about_link"
    Then I check if the page title is "About"
    And I close the old browser

  Scenario: Check page title for Contact page
    Given I am on my smashing website
    When I navigate to "contact_link"
    Then I check if the page title is "Contact"
    And I close the old browser
