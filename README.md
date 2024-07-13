# Daily Code Challenges

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![JUnit5 Badge](https://img.shields.io/badge/JUnit5-25A162?logo=junit5&logoColor=fff&style=for-the-badge) ![Apache Maven Badge](https://img.shields.io/badge/Apache%20Maven-C71A36?logo=apachemaven&logoColor=fff&style=for-the-badge)  [![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/thomas-ketipov-623b82178/)
[![By - P1N3](https://img.shields.io/badge/By-P1N3-ffffff?style=for-the-badge)](https://github.com/tom-ketipov)

This is a repository, where I share my solutions to various coding challenges from LeetCode and Codewars. Currently, each solution is written in Java and is covered with unit tests using JUnit5.


## Table of Contents

- [*Repository Structure*](#repository-structure)
- [*Coding Challenge Progress*](#coding-challenge-progress)
- [*Getting Started*](#getting-started)
- [*Running Tests*](#running-tests)


## Repository Structure

*The repository is organized as follows:*

    . 
    └── src/ 
        ├── main/ 
	    │ 	└── java/ 
	    │ 	    ├── codewars/ 
	    │ 	    │ 	    ├── eight_kyu/ 
	    │ 	    │ 	    │ 	└── problem/ 
	    │ 	    │ 	    │ 		└── Solution.java 
	    │ 	    │ 	    ├── seven_kyu 
	    │ 	    │ 	    ├── ...
	    │ 	    │ 	    └── one_kyu 
	    │ 	    └── leetcode/ 
	    │ 	    	    ├── easy/ 
	    │ 	    	    │ 	└── problem/ 
	    │ 	    	    │ 		└── Solution.java 
	    │ 	    	    ├── medium 
	    │ 	    	    └── hard 
	    └── test/ 
            └── java/ 
                ├── codewars/ 
                │ 	    ├── eight_kyu/ 
                │ 	    │ 	└── problem/ 
                │ 	    │ 		└── SolutionTest.java 
                │ 	    ├── ...
                └── leetcode/ 
                        ├── easy/ 
                        │ 	└── problem/ 
                        │ 		└── SolutionTest.java 
                        ├── medium 
                        └── hard



Each solution in the `src/main/java/leetcode` or `src/main/java/codewars` directories has a corresponding test class in the `src/test/java/leetcode` or `src/test/java/codewars` directories to check if the solution works as expected.

---
## Coding Challenge Progress

In this section, you can find a snapshot of my current progress on LeetCode and Codewars.

![LeetCode](https://img.shields.io/badge/LeetCode-000000?style=for-the-badge&logo=LeetCode&logoColor=#d16c06)

Here’s a snapshot of my current progress on LeetCode:

![](https://leetcard.jacoblin.cool/p1ne_?ext=heatmap&theme=dark)

For more details, visit my LeetCode profile.

---
### ![Codewars](https://img.shields.io/badge/Codewars-B1361E?style=for-the-badge&logo=codewars&logoColor=grey)
Here’s a summary of my Codewars progress:

[![Github Readme Codewars](https://codewars-stats-ignacio-cuadra.vercel.app/?username=p1ne&theme=dark)](https://github.com/ignacio-cuadra/github-readme-codewars)

---
## Getting Started

To get a local copy of this project up and running on your machine, follow the instructions below.

### Prerequisites
Before you begin, ensure you have the following software installed on your machine:

#### 1. Java
Make sure you have Java 19 or later installed. It is required to compile and run the code in this repository.
<br>

To check your Java version, run the following command in your terminal:

    java -version

#### 2. Maven
Ensure you have Maven 3.6 or later installed. Maven is used for managing dependencies and building the project.

To check your Java version, run the following command in your terminal:

    mvn -version


### Installation

1. Clone the repo

       git clone https://github.com/tom-ketipov/daily-code-challenges.git

2. Navigate to the project directory

       cd daily-code-challenges

---
## Running Tests

To run all the tests for the project, use the following Maven command:

	mvn clean test

