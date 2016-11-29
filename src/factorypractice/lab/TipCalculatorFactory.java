/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypractice.lab;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author aschindler1
 */
public abstract class TipCalculatorFactory {
    
    
    public static TipCalculator getTipCalcOfType(TipCalcTypes tct, ServiceQuality sq, double amount){
        TipCalculator tc = null;
        switch(tct){
            case BAGGAGE:
                int amount2 = (int)amount;
                tc = new BaggageServiceTipCalculator(sq, amount2);
            break;
            case FOOD:
                tc = new FoodServiceTipCalculator(sq, amount);
            break;            
        }
        return tc;
    }
    
    /*public static TipCalculator getTipCalcOfType(){
        TipCalculator tc = null;
        File propCheck = new File("src" + File.separatorChar + "config.properties");
        Properties p = new Properties();
        FileInputStream in;
        try{
            in = new FileInputStream(propCheck);
            p.load(in);
            in.close();
            
            String className = p.getProperty("calculator");
            String classService = p.getProperty("service.quality");
            System.out.println(className + " " + classService);
            
        }
        catch(Exception e){
            System.out.println("Warning! File not found! Make sure you have a config.properties value in the src/ location!");
        }
        
        return tc;     
    }*/
}
