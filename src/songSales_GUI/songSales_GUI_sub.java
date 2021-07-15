package songSales_GUI;

import javax.swing.*;

public class songSales_GUI_sub {
	
	//variables
	public String title,price,quan;
	double p;
	int q;
	double rev,manCom,siteCom;
	
	public static JOptionPane j;
	
	//methods
	public void Compute() {
		rev = p*q;
		manCom = rev*0.12;
		siteCom = rev*0.03;
	}
	
	@SuppressWarnings("static-access")
	public void Display() {
		j.showMessageDialog(null, "Total Revenue: " + rev);
		j.showMessageDialog(null, "Manager's Commission: " + manCom + "\nInternet Site's Commission: " + siteCom);
	}
}
