package com.kodcu.engines;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by usta on 23.12.2013.
 */
public class App {

    public static void main(String[] args) throws FileNotFoundException, ScriptException {

        ScriptEngineManager mgr = new ScriptEngineManager();

        for (ScriptEngineFactory factory : mgr.getEngineFactories()) {
            System.out.println("ScriptEngineFactory Info");
            System.out.printf("\tScript Engine: %s (%s)\n", factory.getEngineName(), factory.getEngineVersion());
            System.out.printf("\tLanguage: %s (%s)\n", factory.getLanguageName(), factory.getLanguageVersion());
            for (String name : factory.getNames()) {
                System.out.printf("\tEngine Alias: %s\n", name);
            }
        }

    }
}
