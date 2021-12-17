# GreedKata

Greed Kata

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

# Clarifying Questions that I came up with
Is there any invalid input when the program should not run?
Is this a six sided dice?
Are the input values suppose to be random?
Does the array need to be sorted?
How does the data need to be stored?
What are some constraints?
What are some edge cases to take into account to test?

# Assumptions I made
- That the dice is 6 sided
- 1 roll for each dice
- We have a fixed number of dice, meaning that we only need to loop through in constant time to count scoring
- For counting scoring of triples, 2 to 6, the score will be the value * 100
- For counting scoring of a triple one, the score will be the value * 1000
- Only need an array of a specfifc size because of the number specfifced of how many dice there would be and how many rolls
- Need an array to solve this problem because size is given

# The different paths or solutions I contemplated
- The first thing that came to my mind was creating 6 for loops, 6 variables, have a counter and if the element of the dice number shows up in the array then it would add one to the count for that dice numbers variable. If there are more than two of the number then it would add to the score according to the triple scorng guidlines. Then count for the rest of how many single ones or single fives there are and add that to the score. This was orginally my approach to this problem, but then I thought of creating a better solution which is my current approach which is much better as it does not use 6 for loops to do the same thing. 
