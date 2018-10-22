@echo off
set JDK_HOME=C:\PROGRA~1\Java\jdk1.8.0_71
set REPORT=E:\D7032E\assignment3testing\assignment3testing\lib\org.jacoco.examples-0.7.7.jar
set AGENT=E:\D7032E\assignment3testing\assignment3testing\lib\org.jacoco.agent-0.7.7.jar
set JUNIT=E:\D7032E\assignment3testing\assignment3testing\lib\org.junit4-4.3.1.jar
@echo "Running unittests ..."
%JDK_HOME%/bin/java.exe -javaagent:%AGENT% -cp %JUNIT%;bin org.junit.runner.JUnitCore ltu.PaymentTest
@echo "Generating report ..."
%JDK_HOME%/bin/java.exe -jar %REPORT% .