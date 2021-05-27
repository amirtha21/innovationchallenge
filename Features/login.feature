Feature: Login

@sanity

Scenario: Successful Login with Valid Credentials
    Given User Launch Chrome browser
    When User opens URL "https://e2e.innosabi.com/"
    Then User enters Email as "amirthavarshinii@gmail.com" 
    And Click on Next
    Then User enters Password as "Amirtha_1234"
    And Click on Login
    Then User click on Innovation Challenge screen
    And click on SubmitIdea
    Then user enter Idea Title "this is Good"
    And user enter Describe an Idea "Publish"
    And Click on Submit Idea
    And User enter comment other user "Great"
    Then User Click on comments 
    
@Regression
          
Scenario Outline: Login Data Driven
    Given User Launch Chrome browser
    When User opens URL "https://e2e.innosabi.com/"
    Then User enters Email as "<email>"
    And Click on Next
    Then User enters Password as "<password>"
    And Click on Login 
    
     Examples:
    			| email | password |
    			| amirthavarshinii@gmail.com | Amirtha_1234 |
    			| amirthavarshinii1@gmail.com | Amirtha_12345 |

