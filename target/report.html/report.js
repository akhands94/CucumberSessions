$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature_file/demo1.feature");
formatter.feature({
  "name": "Testing demo webshop loging feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User enters Username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the login page is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdef.demo1_stepdef.the_login_page_is_opened()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters aravind.guggilla57@gmail.com",
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.demo1_stepdef.user_enters_aravind_guggilla57_gmail_com()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters aravind as password",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.demo1_stepdef.user_enters_aravind_as_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.demo1_stepdef.user_will_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "demo webshop hom page appears",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.demo1_stepdef.demo_webshop_hom_page_appears()"
});
formatter.result({
  "status": "passed"
});
});