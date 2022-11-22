#include<stdio.h>
#include <jni.h>

JNIEXPORT void JNICALL Java_Myjava_JNIadd
  (JNIEnv *e, jobject obj, jint n1, jint n2)
  
{
int c = n1+n2;
printf("\naddition is: %d\n",c);
}