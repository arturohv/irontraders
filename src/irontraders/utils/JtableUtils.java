/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irontraders.utils;

import javax.swing.JTable;
import javax.swing.table.TableColumn;

/**
 *
 * @author arturohv
 */
public class JtableUtils {
    
    public static void setJTableColumnsPercentage(JTable table, int tablePreferredWidth,
			double... percentages) {
		double total = 0;
		for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
			total += percentages[i];
		}

		for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
			TableColumn column = table.getColumnModel().getColumn(i);
			column.setPreferredWidth((int)
					(tablePreferredWidth * (percentages[i] / total)));
		}
	}
    
    public static void setJTableColumnsWidth(JTable table, int... widths) {
		for (int i = 0; i < table.getColumnModel().getColumnCount(); i++) {
			TableColumn column = table.getColumnModel().getColumn(i);
			column.setPreferredWidth((int) widths[i]);
		}
	}
    
    public static void setJTableSingleColumnWidth(JTable table, int column, int width) {
		TableColumn tc = table.getColumnModel().getColumn(column);
		tc.setPreferredWidth(width);
	}
}
