
 Feature:  Room booking from Adactin hotel
 
@sc1
 Scenario: login page 
 Given the user launch Adactin hotel url
 When the user Enter the user name in the user name field
 And the user Enter the password in the password field
 And the user click the login button 
 Then the user view the hotel search page
 
 @sc2
 Scenario: Search hotel
 When the user select loction in the location dropdown box 
 And the user select hotel in the hotel dropdown box
 And the user select room type in the room type drop down box
 And the user select the number of rooms in the drop down box
 And the user Enter the check in date in the field
 And the user enter the check out date in the field
 And the user select the number of adults stay in the hotel dropdown box
 And the user select the number of childrens stay in the hotel dropdown box
 And the user click the search button
 #Then the user view the select hotel page
 When the user select radio button from select hotel page
 And the user click the continue button 
 Then the user view Book a hotel page
 
 @sc3
 Scenario: Book hotel
 When  the user Enter the first name in the first name field
 And the user Enter the last name in the last name field
 And the user enter the Adress in the Billing Adress field
 And the user Enter credit card number in the credit card field
 And the user select credit card type in the drop down box
 And the user select the month and year of credit card data on expiry date drop down box
 And the user enter the cvv number in the Cvv field
 And the user click the book now button
 #Then the user viewed the booking confirmation page
 And the user click on the logout page
 Then the user have successfully loggedout

 

 
 
 
