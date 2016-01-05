$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/surlatable/ui/test/login.feature");
formatter.feature({
  "line": 2,
  "name": "Login Functionality Feature",
  "description": "\r\nIn order to ensure Login Functionality works,\r\nI want to run the cucumber test to verify it is working",
  "id": "login-functionality-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.before({
  "duration": 23073147254,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality-feature;login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 7,
      "name": "@positiveScenario"
    },
    {
      "line": 1,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user navigates to \"http://www.surlatable.com/\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "click login or register link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "logs in using Email as \"ayuube1977@gmail.com\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "password as a \"abdi2006\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "clicks the Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "login should be successful",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "Home page should be displayed",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "should be able to logout successfully",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://www.surlatable.com/",
      "offset": 19
    }
  ],
  "location": "SmokeTest.user_navigates_to(String)"
});
formatter.result({
  "duration": 10114050090,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.click_login_or_register_link()"
});
formatter.result({
  "duration": 2490348884,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ayuube1977@gmail.com",
      "offset": 24
    }
  ],
  "location": "SmokeTest.logs_in_using_Email_as(String)"
});
formatter.result({
  "duration": 3133224954,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abdi2006",
      "offset": 15
    }
  ],
  "location": "SmokeTest.password_as_a(String)"
});
formatter.result({
  "duration": 484285815,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.clicks_the_Submit_button()"
});
formatter.result({
  "duration": 728310111,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.login_should_be_successful()"
});
formatter.result({
  "duration": 246414,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.home_page_should_be_displayed()"
});
formatter.result({
  "duration": 153609,
  "status": "passed"
});
formatter.match({
  "location": "SmokeTest.should_be_able_to_logout_successfully()"
});
formatter.result({
  "duration": 8476138145,
  "status": "passed"
});
formatter.after({
  "duration": 3202427660,
  "status": "passed"
});
});