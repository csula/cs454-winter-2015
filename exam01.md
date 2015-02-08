# Exam 1

## Programming Part

Write a crawler program as followed:

(a) The crawler application crawls the computer starting with a specified path and recursively visit all files.

(b) The crawler is only interested in `xlsx` files.  It ignores everything else.

(d) Once it finds an xlsx file, it will crack open the document and keep only the create date and author

(c) The crawler must save information to a metadata file: `metadata.txt` and this file should look like this:

```
file: /path/to/file.xlsx
date: Fri Feb  6 20:37:29 PST 2015
author: John T.
file: /path/to/file2.xlsx
date: Fri Feb  6 20:47:29 PST 2015
author: Michael J.
```
(d) Bonus:  Implement your metadata storage in JSON format, i.e. create a file `metadata.json` that looks like this:

```
{
  file : /path/to/file.xlsx
  data : 'Fri Feb  6 20:37:29 PST 2015'
  author: 'John T.'
}
{
  file : /path/to/file2.xlsx
  data : 'Fri Feb  6 20:47:29 PST 2015'
  author: 'Michael J.'
}

```

Submit your source code to CSNS as a complete zip package: `exam1.zip`.  Be sure to include your `pom.xml` file.  Your code should compile cleanly with the command `mvn compile` and it should run with `mvn exec:java`.  For more information on the maven exec directive see this [Stack Overflow](https://stackoverflow.com/questions/9846046/run-main-class-of-maven-project) tutorial.  Default the command line argument to current working directory, unless specified otherwise.

## Theory Part

1. Provide an example of Zipf's law as it pertains to something other than information retrieval. 

2. How does one reach a page on a website that does not have links to this?

3. Explain how/why it's important to consider consider anchor text as part of building search terms.

4. What is a magic header and is that less/more reliable that using filename extension? 
