package tema1;

import javax.swing.JOptionPane;

public class Ejercicio2 {

	public static void main(String[] args) {
		int num1=0; int num2=0; 
		String intnum1, intnum2; 
	
		boolean correcto=true;

		do{
			try{
				intnum1=JOptionPane.showInputDialog(null, "Dame el primer numeró","Num int",JOptionPane.QUESTION_MESSAGE);
				
					if(intnum1==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecución
						else {
							num1 =Integer.parseInt(intnum1);
							correcto=true;
				}}
							catch(Exception e){
									JOptionPane.showMessageDialog(null, "No has introducido un numeró", "Error",JOptionPane.ERROR_MESSAGE);
									correcto=false;
				}
		}
		while(correcto==false);
		do{
			try {
				
				intnum2=JOptionPane.showInputDialog(null, "Dame el segundo numeró","Num int",JOptionPane.QUESTION_MESSAGE);
				
					if(intnum2==null){
					JOptionPane.showMessageDialog(null, "Saliendo de la aplicación","Saliendo",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}//al usuario pulsar cancelar o cerrar la vtna del showinputdialog, acaba la ejecución
						else {
								num2 =Integer.parseInt(intnum2);
								correcto=true;
				}}
							catch(Exception e){
								JOptionPane.showMessageDialog(null, "No has introducido un numeró", "Error",JOptionPane.ERROR_MESSAGE);
								correcto=false;
				}
		
				
			
		}
		while(correcto==false);
		if(num1>num2){
			JOptionPane.showMessageDialog(null, num1 +" es mayor que " + num2);

		  } else {
			  JOptionPane.showMessageDialog(null, num2 + " es mayor que " + num1);
		}
		

	}

}
