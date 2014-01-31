package com.kodcu.compilable;

import javax.script.*;

/**
 * Created by usta on 21.12.2013.
 */
public class App {
    public static void main(String[] args) throws ScriptException, NoSuchMethodException {

        ScriptEngine engine = new ScriptEngineManager().getEngineByName("Nashorn");

        Compilable compilable = (Compilable) engine;

        CompiledScript compiled =
                compilable.compile("var calculate=function(one,two){ return (one*two); }");

        Object mul=null;
        try{
            mul = engine.eval("calculate(20,30)");
        }
        catch (ScriptException se){
            System.out.println(se.getMessage());
            compiled.eval();

            mul = engine.eval("calculate(5,10)");
        }

        System.out.println(mul);


    }
}
