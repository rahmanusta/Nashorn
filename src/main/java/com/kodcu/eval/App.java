package com.kodcu.eval;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by usta on 21.12.2013.
 */
public class App {
    public static void main(String[] args) throws ScriptException {

        ScriptEngineManager engineManager = new ScriptEngineManager();
        ScriptEngine engine = engineManager.getEngineByName("Nashorn");

        engine.eval("var person= new Object();");
        engine.eval("person.name='Rahman';");
        engine.eval("person.surname='Usta';");

        engine.eval("print(JSON.stringify(person));");

        engine.eval("person.age=26;");

        engine.eval("print(JSON.stringify(person));");
    }
}
