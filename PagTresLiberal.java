import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class PagTresLiberal extends JFrame implements  ActionListener, ChangeListener
{
	private JLabel LabelImagen, LabelBienvenida, LabelOpcion1, LabelOpcion2, LabelOpcion3, LabelOpcion4;
	private JButton BotonSalir, BotonAtras, BotonSiguiente;
	private JCheckBox Check1, Check2, Check3, Check4;
	public int Contador3 = 0;

	public PagTresLiberal()
	{
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Cuestionario Liberal - Pregunta Tres");
		
		setIconImage(new ImageIcon(getClass().getResource("imagenes/icon.png")).getImage());
		
		LabelBienvenida = new JLabel("<html>Porque Argentina a lo largo de toda su historia tuvo problemas de alta inflacion?<html>");
		LabelBienvenida.setBounds(30,30,740,30);
		LabelBienvenida.setFont(new Font("Andale Mono", 1, 18));
		add(LabelBienvenida);

		LabelOpcion1 = new JLabel("<html>La Argentina siempre tuvo empresarios los cuales tuvieron hambre de riquezas, esto generaba que los mismos empresarios aumenten los precios descontroladamente y sin control, y gracias a esto es que hace aumenta la inflacion.<html>");
		LabelOpcion1.setBounds(70,75,680,60);
		LabelOpcion1.setFont(new Font("Andale Mono", 0, 12));		
		add(LabelOpcion1);

		Check1 = new JCheckBox("");
		Check1.setBounds(35,95,20,20);
		Check1.addChangeListener(this);
		add(Check1);


		LabelOpcion2 = new JLabel("<html>La inflacion es siempre en todo lugar una estrategia del neoliberalismo para volvernos mas pobres, Por ejemplo Macri que libero la economoa y eso produjo que la inflacion aumentara por la bicicleta financiera.<html>");
		LabelOpcion2.setBounds(70,175,680,60);
		LabelOpcion2.setFont(new Font("Andale Mono", 0, 12));		
		add(LabelOpcion2);

		Check2 = new JCheckBox("");
		Check2.setBounds(35,195,20,20);
		Check2.addChangeListener(this);
		add(Check2);

		LabelOpcion3 = new JLabel("<html>La inflacion es un fenomeno monetario el cual es producido por un aumento de pesos en la economia sin tener demanda suficiente, ya sea por emitir muchos pesos o por que la gente decide tener una moneda extranjera como reserva de valor.<html>");
		LabelOpcion3.setBounds(70,275,680,60);
		LabelOpcion3.setFont(new Font("Andale Mono", 0, 12));		
		add(LabelOpcion3);

		Check3 = new JCheckBox("");
		Check3.setBounds(35,295,20,20);
		Check3.addChangeListener(this);
		add(Check3);

		LabelOpcion4 = new JLabel("<html>La inflacion es multicausal, esto depende de varios factores como por ejemplo: Empresarios neoliberales remarcando precios, Politicas neoliberales, Problemas externos, y una de las razones mas conocidas es por que Manuel Adorni mata jubilados.<html>");
		LabelOpcion4.setBounds(70,375,680,60);
		LabelOpcion4.setFont(new Font("Andale Mono", 0, 12));		
		add(LabelOpcion4);

		Check4 = new JCheckBox("");
		Check4.setBounds(35,395,20,20);
		Check4.addChangeListener(this);
		add(Check4);			

		BotonSalir = new JButton("Salir");
		BotonSalir.setBounds(10,530,120,20);
		add(BotonSalir);
		BotonSalir.addActionListener(this);
	
		BotonAtras = new JButton("Atras");
		BotonAtras.setBounds(470,530,120,20);
		add(BotonAtras);
		BotonAtras.addActionListener(this);

        BotonSiguiente = new JButton("Siguiente");
		BotonSiguiente.setBounds(650,530,120,20);
		BotonSiguiente.setEnabled(false);		
		add(BotonSiguiente);
		BotonSiguiente.addActionListener(this);

		ImageIcon imagen = new ImageIcon("imagenes/fondopreguntas.png");
		LabelImagen = new JLabel(imagen);
		LabelImagen.setBounds(0,0,800,600);
		add(LabelImagen);        
	}

	public void stateChanged(ChangeEvent e)
	{
		if(Check1.isSelected() == true)
		{
			BotonSiguiente.setEnabled(true);
		}
		else if(Check2.isSelected() == true)
		{
			BotonSiguiente.setEnabled(true);
		}
		else if(Check3.isSelected() == true)
		{
			BotonSiguiente.setEnabled(true);
		}
		else if(Check4.isSelected() == true)
		{
			BotonSiguiente.setEnabled(true);
		}
		else if(Check1.isSelected() == false && Check2.isSelected() == false && Check3.isSelected() == false && Check4.isSelected() == false)
		{
			BotonSiguiente.setEnabled(false);
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == BotonSalir)
        {
            System.exit(0);
		}
		if(e.getSource() == BotonAtras)
		{
			PagDosLiberal pagdosliberal = new PagDosLiberal();
			pagdosliberal.setBounds(0,0,800,600);
			pagdosliberal.setVisible(true);
			pagdosliberal.setResizable(false);
			pagdosliberal.setLocationRelativeTo(null);
			this.setVisible(false);
			if(Check3.isSelected() == true && Check1.isSelected() == false  && Check2.isSelected() == false && Check3.isSelected() == false)
			{
				Contador3 -= 1;
			}
		}
		if(e.getSource() == BotonSiguiente)
		{
			PagCuatroLiberal pagcuatroliberal = new PagCuatroLiberal();
			pagcuatroliberal.setBounds(0,0,800,600);
			pagcuatroliberal.setVisible(true);
			pagcuatroliberal.setResizable(false);
			pagcuatroliberal.setLocationRelativeTo(null);
			this.setVisible(false);
			if(Check3.isSelected() == true && Check1.isSelected() == false  && Check2.isSelected() == false && Check3.isSelected() == false)
			{
				Contador3 = 1;
			}

		}
	}

	public static void main(String args[])
	{
		PagTresLiberal pagtresliberal = new PagTresLiberal();
		pagtresliberal.setBounds(0,0,416,306);
		pagtresliberal.setVisible(true);
		pagtresliberal.setResizable(false);
		pagtresliberal.setLocationRelativeTo(null);
	}
}