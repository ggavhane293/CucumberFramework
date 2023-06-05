
      
   Feature: Login functionality
   Scenario: checking user is able to login successfully or not
   Given Browser opened successfully
   When User open the url "https://nims.nihilent.com/hrms/"
   And User enter email address "ganesh.gavhane@nihilent.com" and password "5tg6yh7uj&77"
   And Select the organasation type from dropdown list
   And Click on login button
   Then Page title should be "NIMS~"
   When User click on logout
   And Close the browser
   
