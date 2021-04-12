/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem;

/**
 *
 * @author Dr.Abuzant
 */
public class AWS extends Company {
    public AWS(){
        setParseMethod(new AwsParse());
    }
}
