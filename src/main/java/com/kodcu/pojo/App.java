package com.kodcu.pojo;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.InputStreamReader;

/**
 * Created by usta on 12.01.2014.
 */
public class App {


    public static void main(String[] args) throws ScriptException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("js");
        engine.eval(new InputStreamReader(App.class.getResourceAsStream("/pojo.js")));


    }
}
