package com.kodcu.outerjs;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

/**
 * Created by usta on 12.01.2014.
 */
public class App {

    public static void main(String[] args) throws URISyntaxException, FileNotFoundException, ScriptException {

        ScriptEngineManager engineManager = new ScriptEngineManager();
        ScriptEngine engine = engineManager.getEngineByName("js");
        engine.eval(new InputStreamReader(App.class.getResourceAsStream("/outer.js")));


    }
}
