# Game Gourmet
Welcome to Game Gourmet, a guessing game implemented in Java that uses a binary tree data structure to generate new options based on the user's answers. The game presents you with two options and you must try to guess the correct answer.

# How to play
- Clone the repository
- Open the project in your Java development environment
- Run the Main class
- The game will start by asking you to think of a dish you like
- The game will present you with two options. Select the option that you think is the correct answer
- If your answer is correct, you win! If not, the game will ask you to provide a characteristic that differentiates the dish you thought of from the options presented, and a new node will be added to the binary tree
- Continue guessing until you either win or reach the end of the tree

# Data Structure
The game uses a binary tree data structure to generate new options based on the user's previous answers. Each node of the tree represents a dish, and the left and right children of a node represent two characteristics that differentiate the dish from the other options. The game will navigate the tree using the characteristics provided by the user until it reaches a leaf node that represents the dish the user thought of.
