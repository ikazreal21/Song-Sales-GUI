package songSales_GUI;

public class songSales_GUI {
	
	//link identifier
	static songSales_GUI_sub b = new songSales_GUI_sub();
	
	@SuppressWarnings("static-access")

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b.title = b.j.showInputDialog("Enter the Title of the Song:");
		b.price = b.j.showInputDialog("Enter the Purchase Price of the Song:");
		b.p = Double.parseDouble(b.price);
		b.quan = b.j.showInputDialog("Enter No. of Copies Sold:");
		b.q = Integer.parseInt(b.quan);
		
		b.Compute();
		b.Display();
	}

}
