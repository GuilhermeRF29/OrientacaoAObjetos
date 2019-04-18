package exercicio;

	import javax.swing.JOptionPane;

public class Pessoa {
	public void andar () {
		JOptionPane.showMessageDialog(null, "Você está andando");
	}
	
	protected void respirar () {
		JOptionPane.showMessageDialog(null, "Você está respirando");
	}
	
	private void dormir () {
		JOptionPane.showMessageDialog(null, "Você está dormindo");
	}
}
