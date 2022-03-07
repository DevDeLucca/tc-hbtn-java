#!/bin/bash
mkdir build
cd com/holbertonschool/matematica
javac -d ../../../build Aritmeticos.java
cd ../../..
cd build
jar -cf Matematica.jar Aritmeticos.class
