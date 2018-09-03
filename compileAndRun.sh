#!/bin/bash
find src/main -name '*.java' > sources.list
mkdir -p out
javac @sources.list -d out && java -cp out/ main.com.java.battleoftrams.Main
