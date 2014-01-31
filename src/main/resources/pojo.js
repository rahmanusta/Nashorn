load("nashorn:mozilla_compat.js");
importPackage("com.kodcu.pojo");

print(Person); // [JavaClass com.kodcu.pojo.Person]

var person = new Person();
person.name = "Altuğ Bilgin";
person.surname = "Altıntaş";

print(person.name); // com.kodcu.pojo.Person@4278a03f

person = new Person("Hüseyin","Akdoğan");
person.fullName="Hüseyin Akdoğan";
print(person.fullName); // undefined