# Compiler of the yal0.4 language to Java Bytecodes #

## GROUP44

* Francisca Cerquinho: up201505791, GRADE1: 20, CONTRIBUTION1:  25%
* Mariana Silva: up201506197, GRADE2: 20, CONTRIBUTION2: 25%
* Veronica Fradique: up201506440, GRADE3: 20, CONTRIBUTION3: 25%
* Joao Santos: up201504013, GRADE4: 20, CONTRIBUTION4: 25%

### GLOBAL Grade of the project: 18

## SUMMARY: 

Our application consists in the construction of a compiler for programs in the yal language .
The compiler generate valid JVM (Java Virtual Machine) instructions to jasmin, a tool to generate Java bytecodes given assembly programs with JVM instructions.

## EXECUTE: 

#### For linux and macOS

Run in the command line:

* Located in the src folder of the project
* make 
* java parserGrammar testsuite/< nameOfFile > 

#### For windows

Run in the command line:

* Located in the src folder of the project
* jjtree parserGrammar.jjt
* javacc parserGrammar.jj
* javac *.java
* java parserGrammar testsuite/< nameOfFile > 

## DEALING WITH SYNTACTIC ERRORS: 

Our program identifies all the syntactic errors contained in the file, informing the user of the row and column where the error is. The program ends after all errors are reported.

## SEMANTIC ANALYSIS: 

The goal of the semantic analysis in our tool is to verify if the programs are according to the definitions of the programming language, in our case yal.
Our tool handles with errors like non initialization of variables, incompatible types of return, the return have to be initialized, operations of all types, like comparisons and sums have to be between two arguments with the same type, and also a call to a fucntion cannot be equal to a function it it does not have return or a return with the same type. 

## CODE GENERATION: 

Our solution starts by identifying, in the tree obtained from de parser, all data from the file. During this proccess we prepare the instructions based on jasmin language to convert each statement of yal programs. This information goes to a string which will be used to generate the jasmin file.
No optimizations were made for code generation.

## OVERVIEW: 
(refer the approach used in your tool, the main algorithms, the third-party tools and/or packages, etc.)

We defined the lexical grammar and the semantic rules, 
Third-party tools and/or packages were not used for application development.

## TESTSUITE AND TEST INFRASTRUCTURE: 

The testsuite folder has 19 test files and to test them you should go to execute topic.

## TASK DISTRIBUTION: 

All elements of the group worked evenly. Each of the elements participated in all phases of the project, in the syntactic analysis, semantics and code generation.

## PROS: 

Our tool handles all sorts of syntactic errors, includes error treatment, recovery mechanisms and includes the required symbol table.
Also, generate JVM code accepted by jasmin corresponding to the invocation of functions in yal, for arithmetic expressions, for conditional instructions (if and if-else), for loops and to deal with arrays.

## CONS: 

No optimizations were made for code generation.
