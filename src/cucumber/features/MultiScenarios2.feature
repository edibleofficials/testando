Feature: Test Page Titles
  
  The main objective of this feature file is to navigate through the site and
  confirm that the links are working by checking the page titles.
  
  We already made the code simpler with parameters and now we will make the
  feature file simple by using scenario outlines and data tables.

  #Scenario: Test page title for Contact
  #    Given I am on the nice site
  #    When I click on "operation_link"
  #    Then I check if I am on "Operation"
  #    And I close the good browser
  
  Scenario Outline: Test Page Titles
    Given I am on the nice site
    When I click on <Link>
    Then I check if I am on <Title>
    And I close the good browser

    Examples: 
      | Link           | Title     |
      | operation_link | Operation |
      | about_link     | About     |
      | contact_link   | Contact   |
      | index_link     | Home      |
