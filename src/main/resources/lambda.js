load("nashorn:mozilla_compat.js");

var window = new JavaImporter(java.lang, java.util,Packages.com.kodcu);

var obj = {};
obj.calc = function (a, b, func) {
    return func.apply(this, [a, b]);
}
obj.compare = function (a, b, func) {
    return func.apply(this, [a, b]);
}

obj.consume = function (func, msg) {
    return func.apply(this, [msg]);
};

obj.biconsume = function (func) {
    return func.apply(this, arguments);
};

var calcR = obj.calc(3, 5, function (a, b) {
    return a + b;
});

print(calcR);

var compareR = obj.compare(10, 5, function (a, b) {
    return (a / 2) === b;
});

print(compareR);

var consumeR = obj.consume(function (msg) {
    print(msg);
}, "Merhaba Uranüs");

var ex = new java.lang.Thread(function () {
    print("Im working");
});
ex.start();

with (window) {
// Some Turkish Name & null
    var liste = Arrays.asList("Halil", "İbrahim", "Davut", null, "Ali");

    liste.parallelStream()
        .filter(function (e) {
            return  (!Objects.equals(e, null));
        })
        .filter(function (e) {
            return  (e.length() > 3);
        })
        .forEach(function (e) {
            print("Bigger length than 3 in List: " + e);
        });
}

with (window) {
    var Kitap = Java.type("com.kodcu.Kitap");
    var k1 = new Kitap("Java Mimarisiyle Kurumsal Çözümler", "Rahman Usta", 24)
    var k2 = new Kitap("C# Mimarisiyle Kurumsal Çözümler", "Rahman Usta", 30)
    var k3 = new Kitap("Php Mimarisiyle Kurumsal Çözümler", "Rahman Usta", 40)
    var k4 = new Kitap("C++ Mimarisiyle Kurumsal Çözümler", "Rahman Usta", 26)
    var k5 = new Kitap("Ruby Mimarisiyle Kurumsal Çözümler", "Rahman Usta", 45)

    var liste = Arrays.asList(k1, k2, k3, k4, k5);
    var dVal = liste.stream().map(function (e) {
        return e.price;
    }).reduce(0,function (a, b) {
        return a + b;
    }).doubleValue();

    print(dVal);

    var KitapArray = java.util.ArrayList;

    var kkk=new KitapArray(liste);

    print(kkk);


}


