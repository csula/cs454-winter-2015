# Exam 2

## Theory Part

### Index Calculation

Given the following four documents

Document 1
```
The green frog is not a reptile.  The yellow dog is a mammal and it is also not a reptile.
```

Document 2
```
Tropical fish is not a reptile.  The green dog is a mammal and it is also not a reptile.
```

Document 3
```
Tropical fish is a fish.  The red dog is a mammal and it is also not a fish.
```

Document 4
```
The green frog is not a fish. Tropical fish is a fish.
```

Construct an index table.  For this example, consider `is`, `a`, `the` as stop words.

### Ranking Calculation

We have in our collection of documents 5 pages:

* A has links to B, C, and D
* B has links to C, D, and E
* C has links to A, B
* D has links to E
* E has links to B, C

1. Do the ranking calculation *without* random jump factor.  Calculate the rank for each page after 1 iterations, 2 iterations, and 3 iterations. 

2. Do the ranking calculation *with* random jump factor _lambda = 0.15_ with for 2 iterations.

## Programming Part 

Give the following URL: `http://ocean.pcwerk.com/~jtran/search/a.html`.  Write a java application that prints out the index table and for each of the pages that is discovered without leaving the domain, print out the ranking.  The algorithm should use 10 iterations with no random jump factor.

Your java program should be executed as followed:

```bash
mvn clean
mvn compile
mvn package
cd target
java -jar exam2.jar http://ocean.pcwerk.com/~jtran/search/a.html
```

The output should look like this:

```
# word [document #:# of occurence(s)]
fish [1:1] [2:3] ...
reptile [1:2] [2:2] ...
```
and

```
# document number, page.html, ranking
1. a.html 0.24
2. b.html 0.21
3. c.html 0.12
4. d.html 0.50
5. e.html 0.78
```

Note that the above is not the actual output -- just the example format for your reference.


