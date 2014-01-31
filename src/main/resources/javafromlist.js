var List = java.util.LinkedList;

var liste = new List();
liste.add("Ali");
liste.add(5);

print(List); // [JavaClass java.util.LinkedList]
print(liste); // [Ali, 5]

var array = Java.from(liste);
array.push("Veli");

print(array);