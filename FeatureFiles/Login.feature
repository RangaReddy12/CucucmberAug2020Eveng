Feature: LoginPage
@loginsingledata
Scenario: validate login with single data
Given I lanuch url in chrome browser
When I enter  into username field
When I enter  into password field
When I click on Login button
Then I should verify dashboard text int url
Then I close Browser
@Loginwithdatatable
Scenario Outline: login with data table
When Launch url  "<Browser>" in a browser
When Enter username "<Username>" in textbox
When Enter password "<Password>" in textbox
When Click login
Then validate text in url
Then Closing browser
Examples:
|Browser|Username|Password|
|chrome|Admin|Qedge123!@#|
|firefox|Admin|Qedge123!@#|
|chrome|Admin1|Qedge123!@#|
|firefox|Admin1|Qedge123!@#|
|chrome|Admin|Qedge123!@#|
|firefox|Admin|Qedge123!@#|
|chrome|Admin|Qedge123!@#|
|firefox|Admin|Qedge123!@#|

