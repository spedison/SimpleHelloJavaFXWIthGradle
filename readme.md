# This is a Simplest Application with JavaFX and Gradle

## Use this application with start point.

## Read tutor for install JavaFX in:
*       https://gluonhq.com/products/javafx/ 
## Read instructions for run this application in:
*       https://openjfx.io/openjfx-docs/#install-javafx

### Each jar in JAVA_FX dir is a module. You can add other modules for use.
  * In gradle File:
    * javafx.modules
  * In command line: 
    *  "--module-path $JAVA_FX_DIR --add-modules javafx.controls"

## For run using Gradle
 * gradle run
## For make a jar file
 * gradle jar
## For run a jar file
 * $ java --module-path $JAVA_FX_DIR --add-modules javafx.controls  -jar <jar_file_buided>.jar 

## Versions
 * Java 21
 * Gradle 8.6
 * JavaFX 22


## For distribuition your application and run it in production.
  * You can package application using application plugin. 
    *   plugins { id 'application' }
  * It will make a Ziped package with command
    *   gradle distZip
  * Before call sh script, set the enviroment variable 
    *   $ export JAVA_FX_DIR="[[Dir lib of javaFX/]]"
    *   $ export SIMPLE_JAVAFX_WITH_GRADLE_OPTS="--module-path $JAVA_FX_DIR --add-modules javafx.controls"