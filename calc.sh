#!/bin/bash

cd src/
if [ -d "run/" ]
then 
  cd run
  java App
else
  mkdir run
  javac App.java -d run/
  cd run
  java App
fi