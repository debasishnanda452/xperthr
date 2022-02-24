Feature: testing of search functionality in xpertHR

    Scenario: Validate user is able to search in xpertHR website
    Given User opens xperthr homepage
    When User submits the search with keyword 'pay'
    Then List of articles displayed
    And User clicks on show more
    And User clicks on Law Practise
