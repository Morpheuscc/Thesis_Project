/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package automated.trading.system;

import au.com.bytecode.opencsv.CSVReader;
/**
 *
 * @author Christopher
 */
public class AutomatedTradingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String fileName = "data.csv";
        CSVReader reader = new CSVReader(new FileReader(fileName ));


        // if the first line is the header
        String[] header = reader.readNext();

        // iterate over reader.readNext until it returns null
        String[] line = reader.readNext();

         
    }
}
