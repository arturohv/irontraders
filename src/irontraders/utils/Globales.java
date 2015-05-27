/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irontraders.utils;

/**
 *
 * @author arturohv
 */
public class Globales {
    public static boolean isNumber(String n) {
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
}
