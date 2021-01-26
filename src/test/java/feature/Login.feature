Feature: Application to Login


Scenario Outline: Login with different credentials
Given Intialize the chrome browser
And Naviagate to "https://rahulshettyacademy.com" Site
And Click on Login button in home page and land on secure sign in page
When User enters the <Username> and <Password>
Then Verify that the user is successfully logged
And close the browser

Examples:
|Username					    |Password	|
|sanaabullatheef@gmail.com		|sana123!@#	|
|test99@gmail.com  				|123456|