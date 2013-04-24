/*deserializing Object*/
import java.io.*;
class DeserializationDemo {
public static void main(String args[]) {
// Object serialization
try {
MyClass object1 = new MyClass("Hello", -7, 2.7e10);
System.out.println("object1: " + object1);
FileInputStream fis = new FileInputStream("serial");
ObjectInputStream ois = new ObjectInputStream(fis);
Object o=ois.readObject();

ois.close();
}
catch(Exception e) {
System.out.println("Exception during serialization: " + e);
System.exit(0);
}
// Object deserialization
try {
MyClass object2;
FileInputStream fis = new FileInputStream("serial");
ObjectInputStream ois = new ObjectInputStream(fis);
object2 = (MyClass)ois.readObject();
ois.close();
System.out.println("object2: " + object2);
}
catch(Exception e) {
System.out.println("Exception during deserialization: " + e);
System.exit(0);
}
}
}
class MyClass implements Serializable {
String s;
int i;
double d;
public MyClass(String s, int i, double d) {
this.s = s;
this.i = i;
this.d = d;
}
public String toString() {
return "s=" + s + "; i=" + i + "; d=" + d;
}
}
