#!/bin/bash
javac -cp lib/Matematica.jar com/holbertonschool/main/Program.java
jar -cvmf MANIFEST.MF Executavel.jar com
java -jar Executavel.jar
