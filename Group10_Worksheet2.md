Iteration 2 Worksheet
=====================

### Paying off Technical Debt

#### Technical Debt 1
For some of our features implemented in iteration 1, the group was not able to include unit testing to the project. The group was not able to properly test the functionality of each units that were implemented. For iteration 2, we have implemented unit testing to the features that have been previously implemented in iteration 1 and have added unit tests for the features implemented in this current iteration.

[Unit Testing for Game](https://code.cs.umanitoba.ca/winter-2022-a01/group-10/sport-box-score-manager/-/commit/3e33f02b77e44e5b0ad3a893fcf2effcac6fbf1d)

This technical debt can be classified as prudent technical debt. The group was aware that the feature was not tested and the group decided to ship it out and test it later on.

#### Technical Debt 2




### SOLID


### Retroperspective
When the group was working on iteration 1, the group was split onto the presentation, business, and logic groups. However, this has not been working out well and as a group, looking back at iteration 1 we as a group decided to change up the way we work on the project. The group decided to take up and work on a feature individually from the UI elements to testing.

### Design Patterns


### Iteration 1 Feedback Fixes
From Iteration 1 [Issue #19](https://code.cs.umanitoba.ca/winter-2022-a01/group-10/sport-box-score-manager/-/issues/19), there was a single responsibility principle violation in our Score.activity.class. Adding and subtracting scores were in this UI layer class which violates SRP. In commit 7564ce87830d0d3c349e3ec16d6571c00eef2e37, we have fixed this problem and have moved addScore and subScore functionalities to points.java.
