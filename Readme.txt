	Find Hotel Availability
	
	Case Study: Find Hotel Availability
	
	Problem Statement:  
	
	Hotel Availability Automation
	
	1) Availability of hotel rooms in next week (e.g. 27 July Check in and 28 July Check out) for a specific city. Ex: Mumbai
	
	2) Get the Price of All the Hotels
	
	3) Sort the hotels by rating
	
	4) Check if the first 5 hotels belongs to the specific city searched for. Ex: Mumbai
	
	Suggested site: https://www.trivago.in/
	
	Detailed Description:
	
	Open the application https://www.trivago.in/ in chrome or fire fox browser.
	In search field, enter City “Mumbai” as destination.
	Select Check-In Date for the next week (e.g. 27 July)
	Select Check-Out Date for the next week (e.g.28 July)
	Select Adults 1
	Select Rooms 1
	Click on Apply.
	Click on Search.
	Select Sort By “Rating only”
	Get the list of Rent of the hotels displayed.
	Check that the all the ratings of the hotels is in descending order (e.g. 10.0>9.8>9.6..)
	Close the browser
	Key Automation Scope:
	
	Multiple browser handling
	Assign synchronization technique
	Use Calendar or Date-Picker
	Navigation to Home page
	Exception Handling
	Locating Elements
	
	
	Result:-
	
	For Chrome:
	Select the Browser you want to test the website(1:chrome ,2:edge )
	1
	Browser is Launched and website is loading
	==================================================================================================================
	Destination input is cliked.In destination Feild Data is Entered
	input Value :Mumbai
	==================================================================================================================
	Check In Date Element is Clicked
	Checking for calender Page: -----> September 2024
	Current Calender Page(Check-In):March 2024   April 2024
	Check-In-Next button of calender page  cliked
	Current Calender Page(Check-In):April 2024   May 2024
	Check-In-Next button of calender page  cliked
	Current Calender Page(Check-In):May 2024   June 2024
	Check-In-Next button of calender page  cliked
	Current Calender Page(Check-In):June 2024   July 2024
	Check-In-Next button of calender page  cliked
	Current Calender Page(Check-In):July 2024   August 2024
	Check-In-Next button of calender page  cliked
	Current Calender Page(Check-In):August 2024   September 2024
	Calender Page Founded..... 
	Check in month number 09
	Check-In Value is  Enterd
	 [Value is: 04-09-2024]
	==================================================================================================================
	For Check In Date,calender is navigated and date is selected
	 selected date value :04-Sep-2024
	Checking for calender Page: -----> September 2024
	Current Calender Page(Check-Out):August 2024   September 2024
	Calender Page Founded..... 
	Check out month number 09
	Check-In Value is  Enterd
	 [Value is: 08-09-2024]
	========================================================
	==================================================================================================================
	For Check Out Date,calender is navigated and date is selected
	 selected date value :08-Sep-2024
	==================================================================================================================
	Geuests And Room is selected(clicked)
	Adults-Count-Increase Displayed
	==================================================================================================================
	Adults value is :1
	==================================================================================================================
	Room Count value is :1
	==================================================================================================================
	Guests and rooms Section Apply Button is Clicked.
	==================================================================================================================
	From Sort By select box Rating Only is selected
	 selected option :Rating Only
	============================================================================================
	************************ printing Hotel Price*****************************
	FabHotel Landmark Guestline-----1,786
	FabExpress Embassy Grand Ghatkopar-----2,144
	The Oberoi Mumbai-----19,116
	Nap Manor-----3,331
	Taj Mahal Tower, Mumbai-----23,010
	Taj The Trees, Mumbai-----17,110
	Hotel Nirvana Grace-----3,218
	Treebo Trend Olive Inn-----6,804
	FabExpress Adore Inn Andheri East-----3,737
	FabExpress Bliss Executive Andheri East-----2,974
	Treebo Tryst Metropolis Mumbai-----5,376
	Treebo Trend Blue Moon-----4,800
	The Taj Mahal Palace, Mumbai-----40,120
	Treebo Tryst Royal Garden Juhu Tara-----9,322
	Empire Suites Andheri East-----3,056
	Avirahi Hotel-----824
	Capital O 30550 Riva International-----2,901
	Hotel Mantra-----2,399
	Aurika Mumbai Skycity-----23,363
	Trident Nariman Point-----14,337
	Taj Lands End-----19,323
	The St. Regis Mumbai-----23,305
	Trident Bandra Kurla-----20,444
	JW Marriott Mumbai Sahar-----19,913
	The Westin Mumbai Garden City-----21,240
	Treebo Trend Oxford-----1,680
	Treebo Trip We Stay-----1,985
	Taj Santacruz, Mumbai-----20,503
	Treebo Trip Magnet-----3,045
	The Leela Mumbai-----16,520
	FabExpress Spring Inn Kandivali West-----3,969
	FabExpress Sher-E-Punjab Andheri East-----3,506
	Treebo Trend Legend II-----5,040
	Hotel Vinyasa-----2,486
	Deluxe Residency-----4,431
	============================================================================================
	============================================================================================
	************************printing All TheHotel Ratings *****************************
	FabHotel Landmark Guestline-----9.8
	FabExpress Embassy Grand Ghatkopar-----9.8
	The Oberoi Mumbai-----9.7
	Nap Manor-----9.7
	Taj Mahal Tower, Mumbai-----9.6
	Taj The Trees, Mumbai-----9.6
	Hotel Nirvana Grace-----9.6
	Treebo Trend Olive Inn-----9.6
	FabExpress Adore Inn Andheri East-----9.6
	FabExpress Bliss Executive Andheri East-----9.6
	Treebo Tryst Metropolis Mumbai-----9.5
	Treebo Trend Blue Moon-----9.5
	The Taj Mahal Palace, Mumbai-----9.5
	Treebo Tryst Royal Garden Juhu Tara-----9.4
	Empire Suites Andheri East-----9.4
	Avirahi Hotel-----9.4
	Capital O 30550 Riva International-----9.4
	Hotel Mantra-----9.3
	Aurika Mumbai Skycity-----9.3
	Trident Nariman Point-----9.2
	Taj Lands End-----9.2
	The St. Regis Mumbai-----9.2
	Trident Bandra Kurla-----9.2
	JW Marriott Mumbai Sahar-----9.2
	The Westin Mumbai Garden City-----9.2
	Treebo Trend Oxford-----9.2
	Treebo Trip We Stay-----9.2
	Taj Santacruz, Mumbai-----9.2
	Treebo Trip Magnet-----9.2
	The Leela Mumbai-----9.1
	FabExpress Spring Inn Kandivali West-----9.1
	FabExpress Sher-E-Punjab Andheri East-----9.1
	Treebo Trend Legend II-----9.1
	Hotel Vinyasa-----9.1
	Deluxe Residency-----9.1
	Test Passed
	Rating Validation:Test Passed:
	============================================================================================
	ScreenShot Of HotelDetails Page is Taken
	=============================================================================================
	Checking if the first 5 hotels belongs to the specific city searched for. Ex: Mumbai
	Mumbai
	Mumbai
	Mumbai
	Mumbai
	Mumbai
	Test Passed
	City Name Validation Passed:
    =============================================================================================

=============================================================================================
		
		
  For Edge:
	 Select the Browser you want to test the website(1:chrome ,2:edge )
	2
	Browser is Launched and website is loading
	==================================================================================================================
	Destination input is cliked.In destination Feild Data is Entered
	input Value :Mumbai
	==================================================================================================================
	Check In Date Element is Clicked
	Checking for calender Page: -----> September 2024
	Current Calender Page(Check-In):March 2024   April 2024
	Check-In-Next button of calender page  cliked
	Current Calender Page(Check-In):April 2024   May 2024
	Check-In-Next button of calender page  cliked
	Current Calender Page(Check-In):May 2024   June 2024
	Check-In-Next button of calender page  cliked
	Current Calender Page(Check-In):June 2024   July 2024
	Check-In-Next button of calender page  cliked
	Current Calender Page(Check-In):July 2024   August 2024
	Check-In-Next button of calender page  cliked
	Current Calender Page(Check-In):August 2024   September 2024
	Calender Page Founded..... 
	Check in month number 09
	Check-In Value is  Enterd
	 [Value is: 04-09-2024]
	==================================================================================================================
	For Check In Date,calender is navigated and date is selected
	 selected date value :04-Sep-2024
	Checking for calender Page: -----> September 2024
	Current Calender Page(Check-Out):August 2024   September 2024
	Calender Page Founded..... 
	Check out month number 09
	Check-In Value is  Enterd
	 [Value is: 08-09-2024]
	========================================================
	==================================================================================================================
	For Check Out Date,calender is navigated and date is selected
	 selected date value :08-Sep-2024
	==================================================================================================================
	Geuests And Room is selected(clicked)
	Adults-Count-Increase Displayed
	==================================================================================================================
	Adults value is :1
	==================================================================================================================
	Room Count value is :1
	==================================================================================================================
	Guests and rooms Section Apply Button is Clicked.
	==================================================================================================================
	From Sort By select box Rating Only is selected
	 selected option :Rating Only
	============================================================================================
	************************ printing Hotel Price*****************************
	FabHotel Landmark Guestline-----1,786
	FabExpress Embassy Grand Ghatkopar-----2,144
	The Oberoi Mumbai-----19,116
	Hammock Hostels - Bandra-----4,480
	Nap Manor-----3,331
	Treebo Tryst Heritage Grand-----7,106
	Taj Mahal Tower, Mumbai-----23,010
	Taj The Trees, Mumbai-----17,110
	Hotel Nirvana Grace-----3,218
	Treebo Trend Olive Inn-----6,804
	FabExpress Adore Inn Andheri East-----3,737
	FabExpress Bliss Executive Andheri East-----2,974
	Hotel Hometown-----2,897
	Treebo Tryst Metropolis Mumbai-----5,376
	Treebo Trend Blue Moon-----4,800
	The Taj Mahal Palace, Mumbai-----40,120
	Treebo Tryst Royal Garden Juhu Tara-----9,322
	Empire Suites Andheri East-----3,056
	Avirahi Hotel-----824
	Capital O 30550 Riva International-----2,901
	Hotel Mantra-----2,399
	Aurika Mumbai Skycity-----23,363
	Trident Nariman Point-----14,337
	Taj Lands End-----19,323
	The St. Regis Mumbai-----23,305
	Trident Bandra Kurla-----20,444
	JW Marriott Mumbai Sahar-----19,913
	The Westin Mumbai Garden City-----21,240
	Treebo Trend Oxford-----1,680
	Treebo Trip We Stay-----1,985
	Taj Santacruz, Mumbai-----20,503
	Treebo Trip Magnet-----3,045
	The Leela Mumbai-----16,520
	FabExpress Spring Inn Kandivali West-----3,969
	FabExpress Sher-E-Punjab Andheri East-----3,506
	============================================================================================
	============================================================================================
	************************printing All TheHotel Ratings *****************************
	FabHotel Landmark Guestline-----9.8
	FabExpress Embassy Grand Ghatkopar-----9.8
	The Oberoi Mumbai-----9.7
	Hammock Hostels - Bandra-----9.9
	Nap Manor-----9.7
	Treebo Tryst Heritage Grand-----9.9
	Taj Mahal Tower, Mumbai-----9.6
	Taj The Trees, Mumbai-----9.6
	Hotel Nirvana Grace-----9.6
	Treebo Trend Olive Inn-----9.6
	FabExpress Adore Inn Andheri East-----9.6
	FabExpress Bliss Executive Andheri East-----9.6
	Hotel Hometown-----9.6
	Treebo Tryst Metropolis Mumbai-----9.5
	Treebo Trend Blue Moon-----9.5
	The Taj Mahal Palace, Mumbai-----9.5
	Treebo Tryst Royal Garden Juhu Tara-----9.4
	Empire Suites Andheri East-----9.4
	Avirahi Hotel-----9.4
	Capital O 30550 Riva International-----9.4
	Hotel Mantra-----9.3
	Aurika Mumbai Skycity-----9.3
	Trident Nariman Point-----9.2
	Taj Lands End-----9.2
	The St. Regis Mumbai-----9.2
	Trident Bandra Kurla-----9.2
	JW Marriott Mumbai Sahar-----9.2
	The Westin Mumbai Garden City-----9.2
	Treebo Trend Oxford-----9.2
	Treebo Trip We Stay-----9.2
	Taj Santacruz, Mumbai-----9.2
	Treebo Trip Magnet-----9.2
	The Leela Mumbai-----9.1
	FabExpress Spring Inn Kandivali West-----9.1
	FabExpress Sher-E-Punjab Andheri East-----9.1
	Test Failed
	Rating Validation:Test Failed:
	============================================================================================
	ScreenShot Of HotelDetails Page is Taken
	=============================================================================================
	Checking if the first 5 hotels belongs to the specific city searched for. Ex: Mumbai
	Mumbai
	Mumbai
	Mumbai
	Mumbai
	Mumbai
	Test Passed
	City Name Validation Passed:
	=============================================================================================
