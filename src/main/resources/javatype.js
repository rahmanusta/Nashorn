print(Object); // function Object() { [native code] }
print(new Object()); // [object Object]

var Object = java.lang.Object;
print(Object); // [JavaClass java.lang.Object]
print(new Object()); // java.lang.Object@...

var JavaObject = Java.type("java.lang.Object");
print(JavaObject); // [JavaClass java.lang.Object]
print(new JavaObject()); // java.lang.Object@...
///
var IntArray = Java.type("int[]");
print(IntArray); // [JavaClass [I]
var intArray = new IntArray(3);
print(intArray); // [I@78b1cc93
intArray[0]=1; intArray[1]=2; intArray[2]=3;

print(Java.from(intArray)); // 1,2,3

var jsArray=Java.from(intArray);
jsArray.shift();
jsArray.push(4);
print(jsArray); // 2,3,4