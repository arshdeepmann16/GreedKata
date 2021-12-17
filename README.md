# GreedKata

Greed Kata

Source: https://github.com/ardalis/kata-catalog

# Instructions
Greed is a press-your-luck dice rolling game. In the game, the player rolls the dice and tries to
earn as many points as possible from the result. For the purposes of this kata, we will just be
scoring a single roll of five dice.
Write a scoring method that calculates the best score based on a given roll using the following
set of scoring rules.
• A single one (100 points)
• A single five (50 points)
• Triple ones [1,1,1] (1000 points)
• Triple twos [2,2,2] (200 points)
• Triple threes [3,3,3] (300 points)
• Triple fours [4,4,4] (400 points)
• Triple fives [5,5,5] (500 points)
• Triple sixes [6,6,6] (600 points)
Please also include the ability for a user to interact with the game, the user interaction should
include:
• A prompt for the user to roll their five dice
• Output that has the value rolled on each die and the total score for the user to see

# Example Scores
• [1,1,1,1,1] = 1200 points
• [1,1,1,5,1] = 1150 points
• [2,3,4,6,2] = 0 points
• [3,4,5,3,3] = 350 points

# Clarifying Questions that I came up with
Is there any invalid input when the program should not run?
Is this a six sided dice?
Are the input values suppose to be random?

# Assumptions I made
- That the dice is 6 sided

# The different paths or solutions I contemplated
- The first thing that came to my mind was creating 6 for loops, 6 variables, have a counter and if the element of the dice number shows up in the array then it would add one to the count for that dice numbers variable. If there are more than two of the number then it would add to the score according to the triple scorng guidlines. Then count for the rest of how many single ones or single fives there are and add that to the score. This was orginally my approach to this problem, but then I thought of creating a better solution which is my current approach which is much better as it does not use 6 for loops to do the same thing. 
