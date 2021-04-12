/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Dr.Abuzant
 */
public class AwsParse implements ParseMethod{
     public StringBuffer parse(String line,StringBuffer buffer){
     
						
  return buffer.append(line.replace("ttl",":").replace(", ","\n"));
						
				    	
				    
    }
}
