
# IVP Hackathon 2025 CodeRush 4.0
# Round 2: Ctrl-Alt-Swift

## Question 1: Game of String Distribution

Joe has organized a party for M guests and has planned a party game. In the game, Joe gives everyone a string S and explains to them the rules to play the game. The rules to play the game are as follows:
You need to distribute the string S amongst M guests in such a way that each guest gets at least one character.
Compare all the strings and store the smallest lexicographical string among that distribution.
Out of all the stored strings, find the largest lexicographical string which is the strongest string.
Your task is to find and return the strongest string among all smallest lexicographic strings that are stored for every distribution.

Note: The lexicographical order is the order in which the words appear in the dictionary.

### Input Specification:
- `input1` : An integer value M, representing the number of guests.
- `input2` : A string value S, representing the string from which the characters are to be distributed.

### Output Specification:
Return the strongest string among all the smallest lexicographical strings that are stored for every distribution.

#### Example 1:
- `input1` : 3
- `input2` : good

**Output**: gd

#### Example 2:
- `input1` : 4
- `input2` : abacadae

**Output**: baaaa

## Question 2: And Array

You are studying at your friend's home, and you need the password for his wi-fi connection. The password is an integer value which is the sum of the elements of an array B. Your friend, however, wants you to do some thinking in order to get the password. So he has given you the wrong password in the form of an array A along with an integer X and asked you to decipher the array and extract the original array B which is the correct password. He has also given you the following hints that will help you find the original array B:
(A[1] & B[1] + A[2] & B[2] + ... + A[n] & B[n]) should be equal to X.
Out of all possible arrays, B should be the lexicographically smallest one.
Your task is to find and return the array B, and if no such array exists then return an array with an integer -1.

### Input Specification:
- `input1` : An integer value representing length of the array.
- `input2` : An integer array A.
- `input3` : An integer value X.

### Output Specification:
Return an integer array B. If no such array exists then return an array with an integer -1.

#### Example 1:
- `input1` : 3
- `input2` : {1,2,3}
- `input3` : 6

**Output**: {1,2,3}

#### Example 2:
- `input1` : 4
- `input2` : {1,4,4,4}
- `input3` : 2

**Output**: {-1}

## Question 3: Rock Paper Scissors

James and Lily are playing a tournament of rock, paper, and scissors containing N number of matches.
In the game of Rock, Paper, Scissors certain hand signs indicating rock, paper, and scissors are made by two players. Points are awarded to players, based on the following rules:
Rock beats Scissors
Scissors beats Paper
Paper beats Rock
If both players use the same hand sign, no player is awarded any points.
The player with more points wins the tournament. James never plays the same hand signs in two consecutive games. You are given the number of matches played in the tournament and Lily's hand signs in each match, in the form of a string containing R, P, and S representing rock, paper, and scissors respectively.

Your task is to find and return the total number of winning sequences in which James can win the tournament against Lily.

Note: Return answer modulo 10^9 + 7.

### Input Specification:
- `input1` : An integer value N representing the number of matches played in a tournament.
- `input2` : A string representing the hand signs played by Lily in the tournament.

### Output Specification:
Return the number of winning sequences, modulo 10^9+7, in which James can win the tournament against Lily.

#### Example 1:
- `input1` : 3
- `input2` : RPS

**Output**: 4

#### Example 2:
- `input1` : 2
- `input2` : RR

**Output**: 2

## Question 4: Mathematical Equation

Jim loves solving and experimenting with equations. He comes up with an idea that a given equation consisting of operands and operators like +, -, *, / etc., can be solved in different ways by just putting several opening and closing brackets.
Given an equation E consisting of operands and operators, your task is to help Jim find and return all the different equations that emerge in the form of a string array by putting opening and closing brackets at various positions.

Note: An operand will not consist of any leading zeroes. The number of operands in an equation will not exceed 7.

### Input Specification:
- `input1` : A string representing the equation E

### Output Specification:
Return a string array consisting of different equations formed by putting opening and closing brackets.

#### Example 1:
- `input1` : 5*3/7-3

**Output**: {(5*(3/(7-3))), (5*((3/7)-3)), ((5*3)/(7-3)), ((5*(3/7))-3), (((5*3)/7)-3)}

#### Example 2:
- `input1` : 9-7*4

**Output**: {(9-(7*4)), ((9-7)*4)}
