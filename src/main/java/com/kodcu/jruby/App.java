package com.kodcu.jruby;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.InputStreamReader;

/**
 * Created by usta on 13.01.2014.
 */
public class App {
    public static void main(String[] args) throws ScriptException {

        ScriptEngineManager engineManager = new ScriptEngineManager();
        ScriptEngine engine = engineManager.getEngineByName("ruby");
        engine.eval(new InputStreamReader(App.class.getResourceAsStream("/jruby.rb")));
    }
}
