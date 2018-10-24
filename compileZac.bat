@echo off
set JDK_HOME=C:\PROGRA~1\Java\jdk1.8.0_71
@echo "Compiling code ..."
@mkdir bin
%JDK_HOME%/bin/javac.exe -d bin -cp src src/ltu/Apples2Apples.java
@echo "Compiling tests ..."
set JUNIT=E:\D7032E\assignment3testing\assignment3testing\lib\org.junit4-4.3.1.jar
%JDK_HOME%/bin/javac.exe -d bin -cp %JUNIT%;src src/ltu/Apples2ApplesTest.java