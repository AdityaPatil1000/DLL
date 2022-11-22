import java.util.*;

 class Myjava

{
public native void JNIadd(int n1,int n2);

static
{
System.load("/home/ubuntu/Patil_codes/Myjava.so");
}

public static void main(String args[])
{
Myjava MJ =new Myjava();
MJ.JNIadd(50,50);
}
}