# Compiler of the yal0.4 language to Java Bytecodes #

## GROUP44

* Francisca Cerquinho: up201505791, GRADE1: 20, CONTRIBUTION1:  25%
* Mariana Silva: up201506197, GRADE2: 20, CONTRIBUTION2: 25%
* Veronica Fradique: up201506440, GRADE3:20, CONTRIBUTION3: 25%
* Joao Santos: up201504013, GRADE4:, CONTRIBUTION4: 25%

### GLOBAL Grade of the project: 18

## SUMMARY: 

Our application consists in the construction of a compiler for programs in the yal language .
The compiler generate valid JVM (Java Virtual Machine) instructions to jasmin, a tool to generate Java bytecodes given assembly programs with JVM instructions.

## EXECUTE: 

Run in the command line:

* Located in the src folder of the project
* jjtree parserGrammar.jjt
* javacc parserGrammar.jj
* javac *.java
* java parserGrammar MyFirstYalExamples/< nameOfFile > or java parserGrammar MyFirstYalExamples_1/< nameOfFile >

## DEALING WITH SYNTACTIC ERRORS: 

Our program identifies all the syntactic errors contained in the file, informing the user of the row and column where the error is. The program ends after all errors are reported.

## SEMANTIC ANALYSIS: 
(Refer the semantic rules implemented by your tool.)
As regras implementadas pelo nosso programa para verificar a análise semântica 

The goal of the semantic analysis in our tool is to verify if the programs are according to the definitions of the programming language, in our case yal.
Our tool handles with errors like non initialization of variables, incompatible types of return and operations of all types.

## CODE GENERATION: 
(when applicable, describe how the code generation of your tool works and identify the possible problems your tool has regarding code generation.)

Our solution starts by identifying in the tree obtained from the parser all data from the file and saves into a string. Then it replaces the string containing all the code and generate the file.
No optimizations were made for code generation.

## OVERVIEW: 
(refer the approach used in your tool, the main algorithms, the third-party tools and/or packages, etc.)

We defined the lexical grammar and the semantic rules, 
Third-party tools and/or packages were not used for application development.

## TESTSUITE AND TEST INFRASTRUCTURE: 
(Describe the content of your testsuite regarding the number of examples, the approach to automate the test, etc.)

## TASK DISTRIBUTION: 

All elements of the group worked evenly. Each of the elements participated in all phases of the project, in the syntactic analysis, semantics and code generation.

## PROS: 

Our tool handles all sorts of syntactic errors, includes error treatment, recovery mechanisms and includes the required symbol table.
Also, generate JVM code accepted by jasmin corresponding to the invocation of functions in yal, for arithmetic expressions, for conditional instructions (if and if-else), for loops and to deal with arrays.

## CONS: 

No optimizations were made for code generation.
