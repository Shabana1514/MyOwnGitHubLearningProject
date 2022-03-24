Feature: Login-Feature


Scenario Outline: Login with Valid username and password
Given User is already on login page
When User Clicks on My account menu 
And when user enters valid "<username>" and "<password>" and clicks on Login button
Then User should be able to successfully login to the application.  
Examples:

  |username| Password|
  |zoyashabu@gmail.com|Zoya#1514|
  |shabana.sk.ind@gmail.com|Shabu#1514|
  |heenakhan.p1991@gmail.com| FatehKhan#7863|
  
  Scenario: Login with valid username and Invalid password
  Given User is already on login page
When User Clicks on My account menu 
And when user enters valid username and invalid passwordand clicks on Login button
Then User should be not be able to successfully login to the application.  
    