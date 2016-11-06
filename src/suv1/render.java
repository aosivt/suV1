/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package suv1;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author oschepkovau
 */
public class render  extends DefaultTableCellRenderer {
    	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
boolean hasFocus, int row, int column) {
super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
setHorizontalAlignment(SwingConstants.CENTER);
int currentLine = 3;
int currentPlace = 0;


if((row >= (currentLine - 1))) {
setBackground(Color.RED);
return this;
} else {
setBackground(Color.BLUE);
}

/*if ((row == 4) && (column == 1)){
setBackground(Color.RED);
} else {
setBackground(Color.WHITE);
} */
return this;
}
}
