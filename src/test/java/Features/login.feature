Feature: Application Login


Scenario: Homepage default login
Given User is on netbanking landing page
When User login into application with username "prasanth" and password "1234" 
Then homepage is populated
And Cards are displayed


Scenario Outline: Homepage default login1
Given User is on netbanking landing page1

When User login into application <username>and <password> 

Then homepage is populated now
And Cards are displayed now
Examples:
|Username|Password|
|usr01   |pass01  |
|usr02   |pass02  |
|usr03   |pass03  |
|usr04   |pass04  |
