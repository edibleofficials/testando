Feature: Execute an operation
  
  The main objective of this feature file is to execute a sucessfull operation
  
  Behind the lines we are now using the scenario hooks and tag hooks to make a
  better, more organized code.

  #@web
  Scenario: Execute an available operation
    Given I am on the best website
    When I navigate to the operation
    And I check for an available operation
    And I populate the form
    Then There should be a confirmation message
