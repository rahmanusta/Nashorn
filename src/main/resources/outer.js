
var person={};
person.name="Hüseyin";
person.surname="Akdoğan";
person.fullName = fullName = function(){
    return this.name+" "+this.surname;
}

print(JSON.stringify(person));
print(person.fullName());