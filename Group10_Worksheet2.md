Iteration 2 Worksheet
=====================

### Paying off Technical Debt

#### Technical Debt 1
For some of our features implemented in iteration 1, the group was not able to include unit testing to the project. The group was not able to properly test the functionality of each units that were implemented. For iteration 2, we have implemented unit testing to the features that have been previously implemented in iteration 1 and have added unit tests for the features implemented in this current iteration.

[Unit Testing for Game](https://code.cs.umanitoba.ca/winter-2022-a01/group-10/sport-box-score-manager/-/commit/3e33f02b77e44e5b0ad3a893fcf2effcac6fbf1d)

This technical debt can be classified as prudent technical debt. The group was aware that the feature was not tested and the group decided to ship it out and test it later on.

#### Technical Debt 2
For iteration 1, we implemented the UI with the mentality of delivering something quickly. This has resulted into the UI being buggy and needing to be fixed multiple times to be able to display UI elements properly, in several commits (d6c0d7aa85d31bfbf43ac845ce8d7debe817b4fd, ddf0651b4d5f666072008b46e8c61e4bc3208570, 94f48cc87a15212555f5a2b595029d4e918bed0a) it can be seen that the group has tried to fix many bugs with the UI.

This technical debt can be classified as prudent technical debt. The group was aware that the UI was not properly tested and the group decided to ship it out and test it later on.

### SOLID
Group 9 had very good quality of code and  a SOLID violation was very hard to find. We could only find one Open/Close Principle violation in https://code.cs.umanitoba.ca/winter-2022-a01/group-9/virtualcloset-A01/-/blob/cdce1912f3a5b554d1217896fa95b6c971c0bba5/app/src/main/java/com/example/virtualcloset/presentation/AddClothingActivity.java AddClothingActivity.java as it has many if block which could be refactored into one.

### Retroperspective
When the group was working on iteration 1, the group was split onto the presentation, business, and logic groups. However, this has not been working out well and as a group, looking back at iteration 1 we as a group decided to change up the way we work on the project. The group decided to take up and work on a feature individually from the UI elements to testing.

### Design Patterns
The design pattern that the group has used for this project is based on the behavioural classification of software design. Our objects are designed communicate with each other and each object are created with SOLID principles in mind.

### Iteration 1 Feedback Fixes
From Iteration 1 [Issue #19](https://code.cs.umanitoba.ca/winter-2022-a01/group-10/sport-box-score-manager/-/issues/19), there was a single responsibility principle violation in our Score.activity.class. Adding and subtracting scores were in this UI layer class which violates SRP. In commit 7564ce87830d0d3c349e3ec16d6571c00eef2e37, we have fixed this problem and have moved addScore and subScore functionalities to points.java.
