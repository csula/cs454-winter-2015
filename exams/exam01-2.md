1. Please write a program as followed:

   (a) Crawls your computer starting with a specified `url` and recursive find files with a set of specific criteria

   (b) Your crawler is only interested in `xlxs` files.  

   (d) Once it finds an xlxs file, it will crack open the document and keep only the create date and author

   (c) In particular your crawler will save information to a metadata file: `metadata.txt` and the file should look like this:

```
file: /path/to/file.xlxs
date: Fri Feb  6 20:37:29 PST 2015
author: John T.
file: /path/to/file2.xlxs
date: Fri Feb  6 20:47:29 PST 2015
author: Michael J.
```
   
   (d) Bonus:  Implement your metadata storage in JSON format, i.e. create a file `metadata.json` that looks like this:
```
{
  file : /path/to/file.xlxs
  data : 'Fri Feb  6 20:37:29 PST 2015'
  author: 'John T.'
}
{
  file : /path/to/file2.xlxs
  data : 'Fri Feb  6 20:47:29 PST 2015'
  author: 'Michael J.'
}

```

Submit your source code to CSNS as a complete zip package: `exam1.zip`.  Be sure to include your `pom.xml` file.  Your code should compile cleanly with the command `mvn compile` and it should run with `mvn exec:java` -- for more information on the maven exec directive see this (Stack Overflow)[https://stackoverflow.com/questions/9846046/run-main-class-of-maven-project] tutorial.  Please default command line argument to current working directory unless specified otherwise.

2. Please answer the following theory questions:

   (a) Provide an example of Zipf's law as it pertains to something other than information retrieval. 

   (b) How does one reach a page on a website that does not have links to this?

   (c) Explain how/why it's important to consider consider anchor text as part of building search terms.

   (d) What is a magic header and is that less/more reliable that using filename extension? 

