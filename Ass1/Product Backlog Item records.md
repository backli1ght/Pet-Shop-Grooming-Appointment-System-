1. Epic1:
     - Feature1: 
       - Here is the PBIs: <br> As a shop manager, I want to adjustthe price of services so that I can accommodate market fluctuation. <br> As a shop manager, I want to be able to reply to the comments of customers, so that I can enhance customer experience
       >|PBI Serial number|PBI Title|PBI Story|PBI Description|Acceptance Criteria|Status|
       >|:-|:-|:-|:-|:-|:-|
       >|1|Adjust the Price of Servic|As a shop manager, I want to adjustthe price of services so that I can accommodatemarket fluctuations|1.Prices should be ***adjustable for each service individually*** <br>2.The price of the service should be in forms of ***Chinese currency.*** <br>3.The price of the service ranges from ***0 to 999999999***|1.Given that I am a shop manager, when I select the ***“Adjust Pricing”*** button in the ***Maintain Price page***, then the ***Adjust Price page***, where the list of our services and their corresponding prices is shown, will be displayed.<br>2.Given that I am at the ***Adjust Price page***, there should be an ***input text box*** for me to write and edit the price of each service.<br>3.Given that I am at the ***Adjust Price page***, when I adjust the price in the input text box and click ***“Confirm”*** button on the page, the new price will be updated to the system.<br>4.Given that I am at the ***Adjust Price page*** and see the ***text box*** for adjusting price of a service, when I adjust the price in the text box and click ***“Confirm”*** button on the page and the new price is updated to the system successfully, the system should display” You have adjusted the price for this service successfully!” and ***redirect me to the Maintain Price page***.<br>5.Given that I am at the ***Adjust Pricingpage***, when Idid notfill in the input boxon the page and click the ***“Confirm”*** button on the page, then the system will display “The input box is empty, please input the price you want for this service.” and let me fill in the input box.<br>6.Given that I am at the ***Adjust Price page***, when the price I fill in is outside the ***interval (0-999999)***, the system should display” The price should be in 0 to 999999999!” and let me reinput an appropriateprice ranging between 0 and 999999999.<br>7.Given that I am at the ***Adjust Price page***, when I click the ***“Cancel” button***, then the system will redirect me back to ***Maintain Price page***|
       >|2|Reply to comment|As a shop manager, I want to be able to reply to the comments of customers, so that I can enhance customer experienc|1.The ***name*** and the ***profile photo*** of the manager who write the reply will be displayed in the beginning of the reply message.<br>2.The reply the manager write should be less than ***1000 words***|1.Given that I am a shop manager, when I select the ***“reply”*** button below the comment of a customer in the ***Comment page***, then a ***Reply Comment page*** for me to write replies will be displayed.<br>2.Given that I am at the ***Reply Comment page***, there should be an ***input box*** for me to write and edit the reply.<br>3.Given that I am at the ***Reply Comment page***,when I fill in the ***textbox*** to reply and click the ***“Confirm”*** button on the page, then a new reply will be added to the comment in the system.<br>4.Given that I am at the ***Reply comment page***, when I click the ***“Confirm”*** button on the page, and the reply is successfully added to the comment, the system should display ***“You reply is added to the comment successfully”*** and ***redirect*** me back to the ***Comment page***.<br>5.Given that I am at the ***Reply comment page***, when I did not fill in the text box of reply on the page and click the ***“Confirm”*** button on the page, then the system will display ***“The reply is empty, please fill in.”*** and let me fill in the input box.<br>6.Given that I am at the ***Reply Comment page***, when I finish my reply in the text box and click the ***“Confirm”*** button on the page but the length of the reply text is more than 1000 words, then the system will display***” You need to write the reply less than 1000 words”*** and let me adjust the length of my reply.<br>7.Given that I am at the ***Reply comment page***, when I click the ***“Confirm”*** button on the page but the reply fails to be sent for some reasons(such as networking error), the system will display ***”Your reply is failed to send, please check the network or contact the system administrator”***<br> 8.Given that I am at the ***Reply Comment page***, when I click the ***“Cancel”*** button, then the system will close the reply text box and redirect me to the ***Comment page***|
       >|3|Log in to the website|As a user I want to be able to log in to the website so that I can start booking my service.|1. Username and it corresponding password are required for successful login. 2. If you enter the wrong password three times, system will prompt you whether to retrieve the password.(retrieve the password is another PBI)|1. Given that I am a user, when I select the “Login” button in the main page, then the Login page will be display. 2. Given that I am at the Login Page, when I fill in all the required fields on the page and click the “Log in” button, then the page will display “Successful Login” and the system will redirect me back to the main page with all function unlocked. 3. Given that I am at the Login, when I did not fill in all the required fields on the page and click the “Log in” button on the page, then the system will display “Require Field Not Provided, Please Input Again” and let me fill in the required field. 4. Given that I am at the Login page, when I enter the incorrect Username or Passwords on the page and click the “Log in” button on the page, then the system will display “Username and/or Passwords Invalid, Please Input Again” and clear the input box and let me enter again. 5. Given that I am at the Login page, when I enter the incorrect username or password on the page for three times in a row, then the system will display “Username and/or Password Invalid, would you like to retrieve your password?” and clear the input box and let me enter again. 6. Given that I am at the Login page, when I click the “Cancel” button, then the system will redirect me back to the main page
       >|4|Modify appointment information|As a customer, I want to modify the information of my appointment so that I can change the service I need.|1.	Every attribute (except ID) of the appointment can be modified.2.	Each appointment can be modified only once.3.	Modifications are applied only when the customer confirms and saves the changes.|1.	Given that I am a customer, when I select the “Modify” button to the right of an appointment that has not been modified before, then the Appointment Modify Page will be displayed.2.	Given that I am a customer, when I select the “Modify” button to the right of an appointment that has been modified before, then the system will display “The appointment has already been modified and it cannot be modified again.”3.	Given that I am a customer, when I finish all my modification and click on the “Save” button at the bottom of the page, then the system will display “Are you sure you want to save the changes?" and ask for a reconfirmation with “Yes” and “Cancel” button.4.	Given that I am at the reconfirmation sub-menu, when I click on the “Yes” button, then the modifications will be applied and the system will redirect me to the Appointment List Page. 5.	Given that I am at the reconfirmation sub-menu, when I click on the "Cancel" button, then the appointment will not be modified and the system will redirect me to the Appointment List Page.|
       >|5|Add new pet|As a customer, I want to add a new pet to the Pet List so that I can continue making appointments for it.|1.	It has attributes such as ID, name, image, breed, and description. 2.	The system will automatically generate a unique ID for each pet.3.	The type and size of the pet are compulsorily required. 4.	Other attributes such as image are optional.|1.	Given that I am a logged-in customer, when I select the “Add New” button on Pet List Page, then the Add New Pet page will be displayed.2.	Given that I am a logged-in customer, when I am at the Add New Pet page, when I fill in all the required information and click the “Submit” button at the bottom of the page, then a new record of pet will be added to the system and the system will redirect me back to Pet List Page.3.	Given that I am a logged-in customer, when I am at the Add Pet Page, when I did not fill in all the required information on the page and click the “Submit” button on the page, then the system will display “You must fill all the compulsorily required information” and guide me to fill in the required information.4.	Given that I am at the Add Pet page, when I click the “Cancel” button, then the system will redirect me back to Pet List Page.|
       >|6|Cancel appointment|As a customer, I want to cancel a current appointment so that I can avoid unnecessary spending.|1.	Once the customer shows up and the service has already started, the appointment cannot be cancelled and the "Cancel" button will turn grey and be unclickable.2.	After half an hour before the appointment starts, it cannot be canceled and the "Cancel" button will turn grey and be unclickable.3.	Every cancellation requires a reconfirmation by the customer.|1.	Given that I am on the Appointment List Page, when I click on the clickable “Cancel” button of an appointment that has not started, then the system will ask for a reconfirmation. 2.	Given that I am an online pre-paid customer, when I click on the "Yes" button, then the appointment will be canceled and the system will return the money to the original account, and then display “Appointment canceled successfully and the money has been returned to the original account” and then redirect me to the Appointment List Page.3.	Given that I am a user who has not paid online, when I click on the "Yes" button, then the appointment will be cancelled and then the system will display “Appointment has been canceled successfully.” and then redirect me to the Appointment List Page.4.	Given that I am asked to confirm the cancellation, when I click on the "Cancel" button, then the appointment will not be canceled and the system will redirect me to the Appointment List Page.|
       >|7|Search a groomer|As a logged-in customer, I want to search for a particular pet groomer so that I can see his/her detailed information.|1.	Each groomer has a unique ID for searching. 2.	Groomers can be searched with any attributes, such as name and ID.3.	The result will be displayed in the default manner. |1.	Given that I am a logged-in customer, when I enter the Groomer List Page, then a search box will appear at the top of the page.2.	Given that I am a logged-in customer, when I have entered the keywords and clicked on the “search” button on the right of the search box, then the system will display all relevant groomers if any. 3.	Given that I am a logged-in customer, when I have entered the keywords and clicked on the “Search” button on the right of the search box and there is no relevant result, then the system will display "Sorry, no result is found." And then redirect me to the Groomer List Page.|
       >|8|Search an appointment|As a customer, I want to search a specific appointment according to some keywords, so that I can learn more about previous spending habits.|1.	Each appointment has a unique ID for searching.2.	Customers can search appointments with appointment ID or appointment name.3.	The result will be displayed in the default manner.|1.	Given that I am a logged-in customer, when I enter the Appointment List Page, a search box will appear at the top of the page.2.	Given that I am a logged- in customer, when I enter the key words and click on the “search” button on the right of the search box, the system will display all relevant appointments if any.3.	Given that I am a logged- in customer, when I enter the key words and click on the “search” button on the right of the search box, if there is no relevant result found, then the system will display "Sorry, no result found". And then redirect me to the Appointment List Page.|


       >|9||
       >|10||
1. Epic1:
     - Feature2:
       - Here is the PBIs:
       >|PBI Serial number|PBI Description|
       >|:-|:-|
       >|1||
       >|2||
       >|3||
       >|4||
       >|5||
       >|6||
       >|7||
       >|8||
       >|9||
       >|10||
1. Epic1:
     - Feature1:
       - Here is the PBIs:
       >|PBI Serial number|PBI description|
       >|:-|:-|
       >|1||
       >|2||
       >|3||
       >|4||
       >|5||
       >|6||
       >|7||
       >|8||
       >|9||
       >|10||