Feature: Visit to the www.squashtest.org website 

	Scenario: launch a test upon the www.squashtest.org website with Selenium Webdriver
		Given a user is on Google Home Page with Chrome browser
		When he searches for "squashtest"
		When he chooses the first link
		Then he is navigated to "www.squashtest.org/fr" website
		When he changes to the English version
		Then he is navigated to "www.squashtest.org/en" website

	