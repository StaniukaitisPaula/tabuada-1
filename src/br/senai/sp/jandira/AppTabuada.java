package br.senai.sp.jandira;

import java.awt.Color;
import java.awt.Font;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {

	public static void main(String[] args) {



		FrameTabuada tela = new FrameTabuada();
		tela.titulo = "Tabuada";
		tela.largura = 405;
		tela.altura = 555;
		tela.corDeFundo = new Color(226, 226, 226);
		tela.fonteDosLabels = new Font("BankGothic Md BT", Font.ITALIC, 20);
		tela.corDoButton = new Color(128, 128,255);
		tela.corDoButtoon = new Color(160, 240,180);
				
		tela.criarTela();
		
			
		}
	}

