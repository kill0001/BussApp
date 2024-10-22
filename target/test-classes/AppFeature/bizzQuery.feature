#Author: Sudarshan killekar

@tag
Feature: Verify Home Page

  @tag1
  Scenario: Verify if all four options are present  
    Given User is on home page 
    And user gets All the modules 
    |BizQuery|
    |Master List|
    |Lookup|
    |Project Tracker|
    Then the count for the module should be 4