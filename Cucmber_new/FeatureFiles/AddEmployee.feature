Feature:
As admin user want to validate Add Employee with multiple data
@addEmp
Scenario Outline:
Validate Add Employee
Given User Navigate Url "http://orangehrm.qedgetech.com/" in a browser
When user Enter "Admin" in username
And  user Enter "Qedge123!@#" in password
And user clicks login button
And  user clicks pim button
And user click Add button
And  user Enter "<Firstname>" in first name
And  user Enter "<Middlename>" in middle name
And  user Enter "<Lastname>" in last name
And  user Capture EID Before Adding Employee
And user clicks save button
And user Capture EID After Adding Employee
Then user validates Eid 
Then user close Browser
Examples:
|Firstname|Middlename|Lastname|
|pavan|kumar|Automationtester|
|pradeep|kumar|Automationtester|
|ravi|kumar|Automationtester|
|praveen|kumar|Automationtester|