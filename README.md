javac file.java
javah file
cat file.h

JNI........)
 //copy this to _.c file
 
 gcc -o file.so _.c -shared -fPIC -I/usr/lib/jvm/java-8-openjdk-amd64/include  -I/usr/lib/jvm/java-8-openjdk-amd64/include/linux
 
 pwd
 // [ /home/comp/file.so] copied to file.java
 
 javac file.java
 java file
 
 //output:
 
 addition is :100
 
 
Write a program to create a Dynamic Link Library for any
mathematical operation and write an application program
to test it. (Java Native Interface / Use VB or VC++)
