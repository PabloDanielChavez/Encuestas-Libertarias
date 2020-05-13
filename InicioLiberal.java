import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class InicioLiberal extends JFrame implements ActionListener
{
	
	private JLabel LabelImagen, LabelBienvenida;
	private JButton BotonComenzar, BotonSalir;

	public InicioLiberal()
	{
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Cuestionario Liberal - Inicio");
		setIconImage(new ImageIcon(getClass().getResource("imagenes/icon.png")).getImage());
		
		LabelBienvenida = new JLabel("Cuestionario Liberal");
		LabelBienvenida.setBounds(110,0,300,30);
		LabelBienvenida.setFont(new Font("Andale Mono", 1, 18));
		add(LabelBienvenida);

		BotonSalir = new JButton("Salir");
		BotonSalir.setBounds(20,242,120,20);
		add(BotonSalir);
		BotonSalir.addActionListener(this);

        BotonComenzar = new JButton("Comenzar");
		BotonComenzar.setBounds(260,242,120,20);
		add(BotonComenzar);
		BotonComenzar.addActionListener(this);

		ImageIcon imagen = new ImageIcon("imagenes/fondo.png");
		LabelImagen = new JLabel(imagen);
		LabelImagen.setBounds(0,0,400,267);
		add(LabelImagen);        
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == BotonComenzar)
		{
			PagUnoLiberal pagunoliberal = new PagUnoLiberal();
			pagunoliberal.setBounds(0,0,800,600);
			pagunoliberal.setVisible(true);
			pagunoliberal.setResizable(false);
			pagunoliberal.setLocationRelativeTo(null);
			this.setVisible(false);
		}

        if(e.getSource() == BotonSalir)
        {
            System.exit(0);
        }
	}

	public static void main(String main[])
	{
		InicioLiberal inicioliberal = new InicioLiberal();
		inicioliberal.setBounds(0,0,416,306);
		inicioliberal.setVisible(true);
		inicioliberal.setResizable(false);
		inicioliberal.setLocationRelativeTo(null);
	}

}