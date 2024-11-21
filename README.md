# PRIMM: Guess the Word

## Predict
Without running the program, **predict** two things.

1. What is the program **supposed.** to do?
    > The program is supposed to pick a random word and prompt the user to guess a word, asking again if incorrect and saying that it was correct if the correct word is given

2. What does the program **actually** do?
    > It only provides "the" as the word.

## Run
Now run the program. 

3. What did the program actually do?
    > None of the answers actually worked.

## Investigate
1. Go through the code and **annotate** with single line comments what the major blocks of code do.

2. Based on the instructor's lecture, why is the `while` loop not breaking when the user enters the correct answer?

## Modify
1. Correct the while loop so that the `while` loop breaks when the user enters the correct answer.

2. Change the `getRandomWord()` method so that it actually selects a random word from the list.

## Make
1. Modify the program so that it limits the number of user guesses.

2. Modify the program so that it tells the user how many characters are in the word.

3. Modify the program so that it gives more detailed feedback about their guesses. See the output below:

```
Guess the 3-letter word I'm thinking of: *** 
5 guesses left: the

Your answer 'the' comes after the correct one in alphabetical order. ***
4 guesses left: dog


Your answer 'dog' comes before the correct one in alphabetical order. *o*
3 guesses left: fox

You guessed the answer 'fox' correctly in 3 guesses!
```
