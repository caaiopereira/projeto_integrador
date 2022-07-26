/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visão;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.Usuario;

/**
 *
 * @author 36127512021.2
 */
public class MenuAdm extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdm
     */
    public MenuAdm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        pesquisa = new javax.swing.JButton();
        editar = new javax.swing.JButton();
        cadatro = new javax.swing.JButton();
        excluir = new javax.swing.JButton();
        voltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 50)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Página do Bibliotecária(o) ");

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seja bem-vindo");

        lblNome.setFont(new java.awt.Font("Agency FB", 1, 30)); // NOI18N

        pesquisa.setBackground(new java.awt.Color(102, 153, 255));
        pesquisa.setFont(new java.awt.Font("Agency FB", 1, 25)); // NOI18N
        pesquisa.setText("Pesquisar");
        pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisaActionPerformed(evt);
            }
        });

        editar.setBackground(new java.awt.Color(255, 153, 51));
        editar.setFont(new java.awt.Font("Agency FB", 1, 25)); // NOI18N
        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        cadatro.setBackground(new java.awt.Color(102, 153, 255));
        cadatro.setFont(new java.awt.Font("Agency FB", 1, 25)); // NOI18N
        cadatro.setText("Cadastrar");
        cadatro.setFocusable(false);
        cadatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cadatro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cadatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadatroActionPerformed(evt);
            }
        });

        excluir.setBackground(new java.awt.Color(255, 153, 51));
        excluir.setFont(new java.awt.Font("Agency FB", 1, 25)); // NOI18N
        excluir.setText("Excluir");
        excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirActionPerformed(evt);
            }
        });

        voltar.setBackground(new java.awt.Color(255, 153, 102));
        voltar.setFont(new java.awt.Font("Agency FB", 1, 25)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(cadatro, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(186, 186, 186)
                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblNome, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadatro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisaActionPerformed
        
        String login = null, senha = null;
            Usuario model = new Usuario();
            String Consultar = JOptionPane.showInputDialog("Digite o Login"); 
            
            if (Consultar.equals("")){
               JOptionPane.showMessageDialog(null,"USUÁRIO NÃO ENCONTRADO OU CAMPO EM BRANCO!\n");
               
               dispose();
               MenuAdm MENU = new MenuAdm();
               MENU.setVisible(true);
         }
          else{  
        try 
	   {           
             String url = "jdbc:mysql://localhost/db_livros";
             String SQL = "SELECT * FROM usuario WHERE login='"+Consultar+"'";
             
	     Connection conexao = DriverManager.getConnection(url,"root","");
             PreparedStatement pesquisa = conexao.prepareStatement(SQL);	     
             ResultSet resultado = pesquisa.executeQuery();
             
             while (resultado.next()) {  
                login  = resultado.getString("login");
                senha = resultado.getString("senha");
     
           } 
             
	     JOptionPane.showMessageDialog(null,"Dados encontrados com sucesso!\n"+
						                    "------------------------------\n"+
						                    "LOGIN  : "+login+"\n"+
						                    "SENHA : "+senha+"\n"+
						                    "------------------------------"); 
               dispose();
               MenuAdm MENU = new MenuAdm();
               MENU.setVisible(true);  
	   }
        catch(Exception erro) {            
              JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);                   
        }
            
            }
        
    }//GEN-LAST:event_pesquisaActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
            String login = null, senha = null;
            Usuario model = new Usuario();
            String Consultar = JOptionPane.showInputDialog("Digite o Login");
            
            if (Consultar.equals("")){
               JOptionPane.showMessageDialog(null,"USUÁRIO NÃO ENCONTRADO OU CAMPO EM BRANCO!\n");
               
               dispose();
               MenuAdm MENU = new MenuAdm();
               MENU.setVisible(true);
         }
          else{
            try 
	   {           
             String url = "jdbc:mysql://localhost/db_livros";
             String SQL = "SELECT * FROM usuario WHERE login='"+Consultar+"'";
             
	     Connection conexao = DriverManager.getConnection(url,"root","");
             PreparedStatement pesquisa = conexao.prepareStatement(SQL);	     
             ResultSet resultado = pesquisa.executeQuery();
             
             while (resultado.next()) {  
                login  = resultado.getString("login");
                senha = resultado.getString("senha");
           } 
             
	     JOptionPane.showMessageDialog(null,"Dados encontrados com sucesso!\n"+
						                    "------------------------------\n"+
						                    "LOGIN  : "+login+"\n"+
						                    "SENHA : "+senha+"\n"+
						                    "------------------------------");
             
            String Senha = JOptionPane.showInputDialog("Digite a nova senha para editar");
             
            String URL02 = "jdbc:mysql://localhost/db_livros";
            String sql = "UPDATE usuario SET senha='"+Senha+"' WHERE login='"+Consultar+"'";


	     Connection conexao02 = DriverManager.getConnection(url,"root","");
	     PreparedStatement atualizar1 = conexao02.prepareStatement(sql);
	     atualizar1.executeUpdate();
	     JOptionPane.showMessageDialog(null,"Atualizado com sucesso!"); 
             
	   }
        catch(Exception erro) {            
              JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);                   
        }
            }
        
    }//GEN-LAST:event_editarActionPerformed

    private void cadatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadatroActionPerformed

        CadastroAdm CAS = new CadastroAdm();
       
       CAS.setVisible(true);
       
       /**Usuario model = new Usuario();
                    
        if ((login.getText().equals("")) && (senha.getText().equals("") )){
        
            JOptionPane.showMessageDialog(null,"NAO PODE HAVER CAMPOS EM BRANCO!\n"+
                                               "PREENCHA TODOS ELES!!");
            login.setText("");
            senha.setText("");
            
            setVisible(true);
        }
        else{
             try{
               
            String url = "jdbc:mysql://localhost/db_livros";
            String sql = "INSERT INTO usuario(login,senha) values ('"+login.getText()+"','"+senha.getText()+"')";

	     Connection conexao = DriverManager.getConnection(url,"root","");

	     PreparedStatement cadastrar = conexao.prepareStatement(sql);

	     cadastrar.executeUpdate();

	     JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
             
	   }
	   catch(Exception erro) { 
           
              JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);
               
           }
             
            
        }**/
        
    }//GEN-LAST:event_cadatroActionPerformed

    private void excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirActionPerformed

        String login = null, senha = null;
            Usuario model = new Usuario();
            String Consultar = JOptionPane.showInputDialog("Digite o Login para Excluir");
            
            if (Consultar.equals("")){
               JOptionPane.showMessageDialog(null,"USUÁRIO NÃO ENCONTRADO OU CAMPO EM BRANCO!\n");
               
               dispose();
               MenuAdm MENU = new MenuAdm();
               MENU.setVisible(true);
         }
          else{
            try 
	   {           
             String url = "jdbc:mysql://localhost/db_livros";
             String SQL = "SELECT * FROM usuario WHERE login='"+Consultar+"'";
             
	     Connection conexao = DriverManager.getConnection(url,"root","");
             PreparedStatement pesquisa = conexao.prepareStatement(SQL);	     
             ResultSet resultado = pesquisa.executeQuery();
             
             while (resultado.next()) {  
                login  = resultado.getString("login");
                senha = resultado.getString("senha");
     
           } 
             
	     JOptionPane.showMessageDialog(null,"Dados encontrados com sucesso!\n"+
						                    "------------------------------\n"+
						                    "LOGIN  : "+login+"\n"+
						                    "SENHA : "+senha+"\n"+
						                    "------------------------------");
             
             String Excluir = JOptionPane.showInputDialog("Digite novamente o login que deseja excluir");
             
             String URL02 = "jdbc:mysql://localhost/db_livros";
             String SQL02 = "DELETE FROM usuario WHERE login='"+Excluir+"'";
             
	     Connection conexao02 = DriverManager.getConnection(URL02,"root","");
	     PreparedStatement excluir = conexao02.prepareStatement(SQL02);
             excluir.executeUpdate();
             
	     JOptionPane.showMessageDialog(null,"Excluido com sucesso!");
             
                
            }
                catch(Exception erro) {            
              JOptionPane.showMessageDialog(null,"Erro na Conexão com Banco de Dados : "+erro);                   
        }}
        
    }//GEN-LAST:event_excluirActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
                dispose();
    }//GEN-LAST:event_voltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadatro;
    private javax.swing.JButton editar;
    private javax.swing.JButton excluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblNome;
    private javax.swing.JButton pesquisa;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
