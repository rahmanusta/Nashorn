var jsArray = [];
jsArray[0] = "Ali";
jsArray.push(10);

print(jsArray); // Ali,10

var javaArray = Java.to(jsArray, "java.lang.String[]");

print(javaArray); // [Ljava.lang.String;@1786f9d5
print(javaArray[0]); // Ali
print(javaArray.length); // 2