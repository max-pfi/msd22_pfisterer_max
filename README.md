# UE09_Hangman
UE09_Hangman is a digitagl version of the well known Hangman-game, that can be played inside a console. 
***

## Installation
To install UE09_Hangman download and unpack the **UE09_Hangmen.zip**  folder. To play the game you will need the openjdk-19 or a newer version which you can download  [here](https://www.oracle.com/de/java/technologies/downloads/).
***

## Usage
### Before starting
Before you start a game, someone needs to enter the words which should be searched for in this game into the **wantedWords.txt** file whicht can be found directly in the **UE09_Hangmen** folder. Each line represents exactly one word and for a given game you can enter as many as you like. Please note that it is not allowed to use empty spaces, numbers or special characters. The game is not case sensitive.
#### Starting the game
Open a console and navigate to **UE09_Hangmen/src**. Type `javac Hangmen.java` and then `java Hangmen ../wantedWords.txt` to start the game.
### Gameplay
The game has as many rounds as words were entered in the **wantedWords** file. For each round the user is shown how long the wanted word is and has to guess each letter of the word. If a guess is false, the program draws part of a Hangman figure. If the figure is finished before the user geuesses the word the user looses. After a user has finished this process for all words in the wantedWords text file he is shown how many rounds he has lost and won.
***
## Contributing
This game was created by Max Pfisterer in the **Programming 1** course at FH Joanneum, following the instructions in the course.
***
## Exercise List
- [Exercise1](exercise1.md)
- [Exercise2](exercise2.md)
- [Exercise3](exercise3.md)
- [Exercise4](exercise4.md)

***
## Author
GitHub Profile: [https://github.com/max-pfi](https://github.com/max-pfi)

FH Joanneum: [https://www.fh-joanneum.at](https://www.fh-joanneum.at)


