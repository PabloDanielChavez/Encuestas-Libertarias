import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class FinalLiberal extends JFrame implements ActionListener
{
	
	private JLabel LabelImagen, LabelBienvenida, LabelDerechos;
    private JButton BotonReiniciar, BotonSalir;
    int ContadorUno = 0;
    int ContadorDos = 0;
    int ContadorTres = 0;
    int ContadorCuatro = 0;
    int ContadorCinco = 0;
    int ContadorFinal = 0;

	public FinalLiberal()
	{
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Cuestionario Liberal - Final");
        setIconImage(new ImageIcon(getClass().getResource("imagenes/icon.png")).getImage());

        PagUnoLiberal pagunoliberal = new PagUnoLiberal();
        PagDosLiberal pagdosliberal = new PagDosLiberal();
        PagTresLiberal pagtresliberal = new PagTresLiberal();
        PagCuatroLiberal pagcuatroliberal = new PagCuatroLiberal();
        PagCincoLiberal pagcincoliberal = new PagCincoLiberal();
        //ContadorUno = pagunoliberal.Contador1;
        //ContadorDos = pagdosliberal.Contador2;
        //ContadorTres = pagtresliberal.Contador3;
        //ContadorCuatro = pagcuatroliberal.Contador4;
        //ContadorCinco = pagcincoliberal.Contador5;
        if(pagunoliberal.Contador1 == 1)
        {
            ContadorFinal += 1;
        }
        if(pagdosliberal.Contador2 == 1)
        {
            ContadorFinal += 1;
        }
        if(pagtresliberal.Contador3 == 1)
        {
            ContadorFinal += 1;
        }
        if(pagcuatroliberal.Contador4 == 1)
        {
            ContadorFinal += 1;
        }
        if(pagcincoliberal.Contador5 == 1)
        {
            ContadorFinal += 1;
        }

		LabelBienvenida = new JLabel("Cuestionario Liberal " + ContadorFinal);
		LabelBienvenida.setBounds(110,0,300,30);
		LabelBienvenida.setFont(new Font("Andale Mono", 1, 18));
		add(LabelBienvenida);

		BotonSalir = new JButton("Salir");
		BotonSalir.setBounds(20,242,120,20);
		add(BotonSalir);
		BotonSalir.addActionListener(this);

        BotonReiniciar = new JButton("Reiniciar");
		BotonReiniciar.setBounds(260,242,120,20);
		add(BotonReiniciar);
		BotonReiniciar.addActionListener(this);

		ImageIcon imagen = new ImageIcon("imagenes/fondo.png");
		LabelImagen = new JLabel(imagen);
		LabelImagen.setBounds(0,0,400,267);
		add(LabelImagen);        
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == BotonReiniciar)
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
		FinalLiberal finalliberal = new FinalLiberal();
		finalliberal.setBounds(0,0,416,306);
		finalliberal.setVisible(true);
		finalliberal.setResizable(false);
		finalliberal.setLocationRelativeTo(null);
	}

}