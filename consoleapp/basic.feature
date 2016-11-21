Feature: Console output
Describes the read-only (FOSS) version of the classic PlanetGreeter.com app.

Covers only one story.

In order to get better integration with text-based consumers like Jenkins and Travis CI
As a build pipleline engineer
I want to use planetgreeter from within console apps


Scenario: Greet a planet
Given an unnamed planet
When the basic console app is invoked
Then a planetary greeting is displayed in the console

