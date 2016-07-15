Feature: to test a duckduckgo search

  Scenario: Check if a test search was successful
    Given I am on Duck
    When populate the search box with 'test'
    And I click on the search link
    Then I should be on the search test page
