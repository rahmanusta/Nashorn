package com.kodcu.bind;

import javax.script.*;

/**
 * Created by usta on 21.12.2013.
 */
public class App {
    public static void main(String[] args) throws ScriptException {

        ScriptEngineManager engineManager = new ScriptEngineManager();
        ScriptEngine engine = engineManager.getEngineByName("Nashorn");

        engine.put("name","Rahman");
        engine.put("surname","Usta");

        String fullName=engine.get("name")+" "+engine.get("surname");

        engine.put("fullName",fullName);

        engine.eval("var person={};");
        engine.eval("person.name=name;");
        engine.eval("person.surname=surname;");

        engine.eval("print(JSON.stringify(person));");

        engine.put("age",26);
        engine.eval("person.age=age; person.fullName=fullName");


        engine.eval("print(JSON.stringify(person));");
    }
}
