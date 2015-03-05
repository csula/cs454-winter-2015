# Homework 3

## Objective

The purpose of this assignment is to rank and index webpages (and metadata) collected from previous assignments.  

Your program will read two files: (a) a control file: `control.json` and (b) a stop word file: `words.txt`.  It produces two files: (a) `index.json` and (b) `ranking.json`.

The control file enumerates all the files (and their respective metadata).  The stop word file contains words that should be ignored when indexing and ranking webpages.

The `index.json` file contains index of words found in the data collection.  This file include words and links to documents.  The words of the index table is generated from text extracted from documents and from metadata information.

The `ranking.json` file contains a listing of documents and their ranking values.  The values are expressed as a vector of three numbers: (a) page ranking calculated from link analysis, (b) value of word calculation, (c) your own ranking function.  Link analysis is based on the Brin/Sergei ranking analysis.  The value of word calculation is based on the TFIDF or term frequency inverse document frequency.  Finally, the third ranking calculation is something that your team would need to come up with.

## Coding

Use maven and java to write the index-rank application.  Your program should be executed as followed:

```
java -jar index.jar -c <control-file json> -s <stop-word txt> -i <index json> -r <rank json>
```

## Grading 

Your team will be graded as followed:

1. Index and ranking correctness
2. Storage of metadata obtained from index and ranking
