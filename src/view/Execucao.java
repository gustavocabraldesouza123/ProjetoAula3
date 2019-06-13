package view;

import javax.swing.JOptionPane;

import model.Professor;

public class Execucao {

	public static void main(String[] args) {
		Professor p = new Professor();
		//OBS :: ESTE CÓDIGO FOI ALTERADO COM UM COMENTÁRIO
		//COMENTÁRIO PARA TESTE PARA REALIZAÇÃO DO UPDATE NO GITHUB
		
		p.setNome(JOptionPane.showInputDialog(null,"Digite seu nome"));
		p.setEndereco(JOptionPane.showInputDialog(null,"Digite seu endereco"));
		p.setBairro(JOptionPane.showInputDialog(null,"Digite seu bairro"));
		p.setCep(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite seu cep")));
		p.setCidade(JOptionPane.showInputDialog(null,"Digite sua cidade"));
		p.setEstado(JOptionPane.showInputDialog(null,"Digite seu estado"));
		p.setRg(Long.parseLong(JOptionPane.showInputDialog(null,"Digite seu rg")));
		p.setCpf(Long.parseLong(JOptionPane.showInputDialog(null,"Digite seu cpf")));
		
		String disc1[] = new String[100];
		String curs1[] = new String[100];
		int cont1=0;
		int cont2=0;
		
		try {
			int dis = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantas disciplinas você possui ?"));
			String disciplinas[] = new String[100];
			for(int i=1;i<dis;i++) {
				disciplinas[i] = JOptionPane.showInputDialog(null,"Digite a disciplina"+i);
				disc1[i] = disciplinas[i];
				cont1++;
			}
			p.setDisciplinas(disciplinas);
			
		} catch (Exception e){
			e.printStackTrace();
		}

		try {
			int cur = Integer.parseInt(JOptionPane.showInputDialog(null,"Quantos cursos você possui ?"));
			String cursos[] = new String[100];
			
			for(int i=1;i < cur;i++) {
				cursos[i] = JOptionPane.showInputDialog(null,"Digite o curso" +i+1);
				curs1[i] = cursos[i];
				cont2++;
				
			}
			p.setCursos(cursos);
			
		} catch (Exception e){
			e.printStackTrace();
			
		}
		JOptionPane.showMessageDialog(null, "Seus dados são :");

		JOptionPane.showMessageDialog(null, p.getNome());
		JOptionPane.showMessageDialog(null, p.getEndereco());
		JOptionPane.showMessageDialog(null, p.getBairro());
		JOptionPane.showMessageDialog(null, p.getCep());
		JOptionPane.showMessageDialog(null, p.getCidade());
		JOptionPane.showMessageDialog(null, p.getEstado());
		JOptionPane.showMessageDialog(null, p.getRg());
		JOptionPane.showMessageDialog(null, p.getCpf());
		
		for(int i=0;i<cont1;i++) {
			 JOptionPane.showMessageDialog(null,"Suas disciplinas são :"+disc1[i]);
		}
		for(int i=0;i<cont2;i++) {
			 JOptionPane.showMessageDialog(null,"Seus cursos são :"+curs1[i]);
		}
		
		
	}
		

}


