$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("F:/HybridFramework/CucumberPOM/src/main/java/com/qa/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Amazom Login Feature",
  "description": "",
  "id": "amazom-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Validate Amazon Home Page Test",
  "description": "",
  "id": "amazom-login-feature;validate-amazon-home-page-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_is_already_on_Login_Page()"
});
formatter.result({
  "duration": 13962171600,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.title_of_login_page_is_Free_CRM()"
});
formatter.result({
  "duration": 483750900,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_enters_username_and_password()"
});
formatter.result({
  "duration": 2919716000,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.user_is_on_home_page()"
});
formatter.result({
  "duration": 4782694300,
  "status": "passed"
});
});