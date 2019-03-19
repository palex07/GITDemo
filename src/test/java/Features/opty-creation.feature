Feature: Opty creation
Scenario: User want to create opty
Given user is on opty page

When enter all the required fields for opty details below and click submit
|Prasanth|ABCD|prasanth@gmail.com|Bangalore|Karnataka|India|

Then opty creation sucessfull
And moved to procing page


