package exercicio;

	import javax.swing.JOptionPane;

public class Pessoa {
	public void andar () {
		JOptionPane.showMessageDialog(null, "Voc� est� andando");
	}
	
	protected void respirar () {
		JOptionPane.showMessageDialog(null, "Voc� est� respirando");
	}
	
	private void dormir () {
		JOptionPane.showMessageDialog(null, "Voc� est� dormindo");
	}
}
