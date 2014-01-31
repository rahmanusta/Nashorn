var DoubleArray = Java.type("double[]");
var javaArray = new DoubleArray(3);
print(DoubleArray); // [JavaClass [D]
print(javaArray); // [D@a74868d

var jsArray = Java.from(javaArray);
jsArray.push(7.9);
print(jsArray); // 0,0,0,7.9