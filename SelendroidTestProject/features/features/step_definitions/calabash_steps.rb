require 'calabash-android/calabash_steps'

When(/^I press enButton$/) do
  touch("button id:'buttonTest'")
end


And(/^I press NO button$/) do
  touch("button id:'button2'")
end

And(/^I press popUpButton$/) do
  touch("button id:'showPopupWindowButton'")
end

Then(/^I press Web button$/) do
  touch("button id:'buttonStartWebview'")
end

Then(/^I fill username$/) do
  query("* id:'inputUsername'",{:setText => "MaryS"})
end

Then(/^I fill name$/) do
  query("* id:'inputName'",{:setText => "Mary"})
end

Then(/^I fill password$/) do
  query("* id:'inputPassword'",{:setText => "12345"})

end

Then(/^I fill email$/) do
  query("* id:'inputEmail'",{:setText => "Mary.strawberry@not.com"})

end


When(/^I tap$/) do
  tap
end

