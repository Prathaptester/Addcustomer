 #Author: your.prathap@your.domain.com
Feature: Add Customer Flow Validation


  Scenario: Add customer
    Given user launch demo telecom application
    And user click on add customer button
    When user enter all the field
    And user click on submit button
    Then user verify customer id is generated
    
