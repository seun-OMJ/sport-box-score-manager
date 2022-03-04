Iteration 1 Worksheet
=====================

Adding a feature
-----------------
### Feature:
Score plus and minus button feature (https://code.cs.umanitoba.ca/winter-2022-a01/group-10/sport-box-score-manager/-/issues/11)

The ability to manipulate the scores for each team was added to our project, because it is important to be able to freely add and subtract to the scores of each team. An extra point may be accidentally added by a user and it needs to be reversible in order for the user to correct their mistake. Accurately tracking each team's score is an integral part of this project, we need to have safety measures for when accidents and slips happen.

### User Stories:
"As a user, I need to be able to add and subtract scores during a game" (https://code.cs.umanitoba.ca/winter-2022-a01/group-10/sport-box-score-manager/-/issues/4)

As mentioned before, accurate tracking of scores is very important for this project. Mistakes and and user errors can and will happen. There needs to be safety measures for the user to undo their actions so that they can resume to what they were doing.

It would be easy for the user to have a visual button when adding or subtracting scores, on our project, the buttons are clearly indicated.

Exceptional code
----------------

Provide a link to a test of exceptional code. In a few sentences,
provide an explanation of why the exception is handled or thrown
in the code you are testing.

Branching
----------

From the vision statement, our branching strategy would be each developer will have their own branch to make some changes and add some features and user stories. We then test and make sure that those features are functional before merging that branch into the main branch and test it again to make sure that everything is still functioning properly. 

![](branchPicture.png)

The image above shows our branching strategy in action. We each have our own branch and then add user stories and features into our own branch then merge it into the main branch (the red line).

SOLID
-----

The following link will redirect you to the issue found: https://code.cs.umanitoba.ca/winter-2022-a01/group-11/dnd-character-manager/-/blob/main/app/src/main/java/g11/cs3350/dnd_character_manager/data/HasRoll.java

For Group 11's project, our group found a SOLID violation in the file HasRoll.java. The HasRoll.java interface includes a "dmgType" variable, this variable would prevent them from adding in items that do not do damage.

Agile Planning
--------------

There are quite a bit of features and user stories that we decided as a group to push back for future iterations. A few reasons we decided to push back some features and user stories are time constraint, lack of familiarity with Android Studio, and some features are too big to implement with the given time.

1. "As a user, I need to be able to save a game's progress." (https://code.cs.umanitoba.ca/winter-2022-a01/group-10/sport-box-score-manager/-/issues/5)

Different sports have different scoring systems. In order to implement a variety of sports modes into our project, we would need to carefully look at and implement different scoring systems into our project, which can be time consuming. So we decided to push this user story back to future iterations.

2. Sports dropdown list (https://code.cs.umanitoba.ca/winter-2022-a01/group-10/sport-box-score-manager/-/issues/12)

This feature is directly tied in with 1. This feature would display a dropdown menu of the available sports mode.

3. "As a user, I need to be able to pause a game for timeouts and then resume" (https://code.cs.umanitoba.ca/winter-2022-a01/group-10/sport-box-score-manager/-/issues/8)

"As a user, I need to be able to reset a game's progress" (https://code.cs.umanitoba.ca/winter-2022-a01/group-10/sport-box-score-manager/-/issues/7)

"As a user, I need to be able to save a game's progress and continue it" (https://code.cs.umanitoba.ca/winter-2022-a01/group-10/sport-box-score-manager/-/issues/6)

These user stories deal with the manipulation of the flow of the sport being played by the user. Timeout, saving the game progress and continue another time, resetting the game are all controlling the flow of the user's game. These user stories were considered low-medium priority by the group, thus we decided to focus on the higher priorities and push these back for future iterations.
