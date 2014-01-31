package com.kodcu.func;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Created by usta on 21.12.2013.
 */
public class App {
    public static void main(String[] args) throws ScriptException {

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("Nashorn");

        engine.eval("var person={};");
        engine.eval("person.name='Rahman';");
        engine.eval("person.surname='Usta';");
        engine.eval("person.fullName=function(){return this.name+' '+this.surname};");

        engine.eval("print('FullName: '+person.fullName());");

    }
}
