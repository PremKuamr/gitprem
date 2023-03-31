Feature:Verify AdactinHotel Booking page
Scenario:login
Given User should be in login page
When User should be entered the UserName  and password
And user should be Click the login button
Then user should be verify the login page
Scenario:search hotel
Given User should be select location,hotel,room type
When user should be select number of rooms,check in date,check out date
And User should be select adults per room,children per room
Then user should select search button
Scenario:select hotel
Given user should be select the hotel
When user should be select continue button
Scenario:book a hotel
Given User should be select first name,User should be select last name 
When User should be select billing Address,user should be entered credit card number
And user should be select expiry date, user should select book now option
Scenario:Booking confirmation
Given User should select My itinerary
Scenario:Booked itinerary
Given user should select search order id
When user should select order Id
And user should select cancel Id
Then user should select Alert box 
