# Daily-Dev-Challenges

Hi 👋! This repository contains my solutions to various coding challenges from LeetCode and Codewars.

## Table of Contents

- [*Introduction*](#introduction)
- [*Repository Structure*](#repository-structure)
- [*Getting Started*](#getting-started)
- [*Running Tests*](#running-tests)
- [*License*](#license)

## Introduction

*This repository is designed to keep track of my progress on coding challenges that I do in my day-to-day life.
Currently, each solution is written in Java and is covered with unit tests using the JUnit framework.*

### ![LeetCode](https://img.shields.io/badge/LeetCode-000000?style=for-the-badge&logo=LeetCode&logoColor=#d16c06)

LeetCode is a popular online platform for coding challenges and technical interviews. It offers a vast collection of
problems that cover a wide range of topics including algorithms, data structures, databases, and more. LeetCode is
widely used by software developers to prepare for technical interviews and to improve their problem-solving skills.

Key features of LeetCode include:

- **Practice Problems**: Over 2000 problems ranging from easy to hard.
- **Contests**: Regularly hosted contests to compete with peers.
- **Discuss**: A community forum to discuss problems, solutions, and interview experiences.
- **Interview Preparation**: Curated lists of problems to help prepare for specific company interviews.

*Visit [LeetCode](https://leetcode.com/) to learn more.*

![](https://leetcard.jacoblin.cool/p1ne_?ext=heatmap&theme=dark)

### ![Codewars](https://img.shields.io/badge/Codewars-B1361E?style=for-the-badge&logo=codewars&logoColor=grey)

CodeWars is an online platform that provides coding challenges known as "katas" to help developers improve their coding
skills through practice and competition. The challenges are designed by the community and cover various programming
languages and skill levels.

Key features of CodeWars include:

- **Katas**: Challenges of varying difficulty to practice coding skills.
- **Rank Progression**: A ranking system that rewards users as they complete katas.
- **Community**: Engage with other developers to solve problems and discuss solutions.
- **Languages**: Supports multiple programming languages, making it a versatile tool for learning and practicing.

*Visit [CodeWars](https://www.codewars.com/) to learn more.*

[![Github Readme Codewars](https://codewars-stats-ignacio-cuadra.vercel.app/?username=p1ne&theme=dark)](https://github.com/ignacio-cuadra/github-readme-codewars)

## Repository Structure

*The repository is organized as follows:*

    . 
    └── src/ 
		    ├── main/ 
		    │ 	└── java/ 
		    │ 		├── codewars/ 
		    │ 		│ 	├── eight_kyu/ 
		    │ 		│ 	│ 	└── problem/ 
		    │ 		│ 	│ 		└── ProblemSolver.java 
		    │ 		│ 	├── seven_kyu 
		    │ 		│ 	├── ...
		    │ 		│ 	└── one_kyu 
		    │ 		└── leetcode/ 
		    │ 			├── easy/ 
		    │ 			│ 	└── problem/ 
		    │ 			│ 		└── ProblemSolver.java 
		    │ 			├── medium 
		    │ 			└── hard 
		    └── test/ 
			    └── java/ 
				    ├── codewars/ 
				    │ 	├── eight_kyu/ 
				    │ 	│ 	└── problem/ 
				    │ 	│ 		└── ProblemSolverTest.java 
				    │ 	├── ...
				    └── leetcode/ 
					    ├── easy/ 
					    │ 	└── problem/ 
					    │ 		└── ProblemSolverTest.java 
					    ├── medium 
					    └── hard

## Getting Started

To get a local copy up and running, follow these simple steps:

### Prerequisites

* **Java**: Make sure you have Java 19 installed on your machine. You can download Java
  from [oracle.com](https://www.oracle.com/java/technologies/javase-downloads.html).
* **Maven**: Ensure you have Maven 3.6 or later installed. You can download Maven
  from [maven.apache.org](https://maven.apache.org/download.cgi).

### Installation

1. Clone the repo

       git clone https://github.com/tom-ketipov/daily-code-challenges.git

2. Navigate to the project directory

       cd daily-code-challenges

## Running Tests

You can run all tests in the repository using the following command from the root directory:

	mvn clean test

## License

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)


