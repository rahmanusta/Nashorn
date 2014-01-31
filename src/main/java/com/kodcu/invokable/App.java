package com.kodcu.invokable;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by usta on 21.12.2013.
 */
public class App {
    public static void main(String[] args) throws ScriptException, NoSuchMethodException {

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("Nashorn");

        engine.eval("var person={};");
        engine.eval("person.name='Rahman';");
        engine.eval("person.surname='Usta';");

        engine.eval("person.calculate=function(age){return this.name+':'+this.surname+':'+age};");
        engine.eval("calculate=function(one,two){ return (one*two); }");

        Invocable inv = (Invocable) engine;

        Object person = engine.get("person");

        Object calculate = inv.invokeMethod(person, "calculate", 26);

        System.out.println(calculate);

        System.out.println(inv.invokeFunction("calculate",5,4));


    }
}
