/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package visao;

/**
 *
 * @author 1072417383
 */
public class FrmMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenuPrincipal
     */
    public FrmMenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jCadastrarFerramenta = new javax.swing.JMenu();
        jMenuCadastroAmigo = new javax.swing.JMenuItem();
        jMenuCadastroFerramenta = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuGerenciarAmigos = new javax.swing.JMenuItem();
        jMenuGerenciarFerramentas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jCadastrarFerramenta.setText("Cadastrar");

        jMenuCadastroAmigo.setText("Cadastrar Amigo");
        jMenuCadastroAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroAmigoActionPerformed(evt);
            }
        });
        jCadastrarFerramenta.add(jMenuCadastroAmigo);

        jMenuCadastroFerramenta.setText("Cadastrar Ferramenta");
        jMenuCadastroFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastroFerramentaActionPerformed(evt);
            }
        });
        jCadastrarFerramenta.add(jMenuCadastroFerramenta);

        jMenuBar1.add(jCadastrarFerramenta);

        jMenu2.setText("Movimento");

        jMenuItem3.setText("Empréstimo");
        jMenu2.add(jMenuItem3);

        jMenuItem2.setText("Devolução");
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Relatório");

        jMenuGerenciarAmigos.setText("Gerenciar Amigos");
        jMenuGerenciarAmigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGerenciarAmigosActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuGerenciarAmigos);

        jMenuGerenciarFerramentas.setText("Gerenciar Ferramentas");
        jMenuGerenciarFerramentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGerenciarFerramentasActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuGerenciarFerramentas);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Sobre");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jMenuCadastroAmigoActionPerformed(java.awt.event.ActionEvent evt) {                                                   
    FrmCadastrarAmigo amigo = new FrmCadastrarAmigo();
        
        amigo.setVisible (true);
    }                                                  

    private void jMenuGerenciarAmigosActionPerformed(java.awt.event.ActionEvent evt) {                                                     
    FrmGerenciadorAmigo amigo = new FrmGerenciadorAmigo();
        
        amigo.setVisible (true);
    }                                                    

    private void jMenuCadastroFerramentaActionPerformed(java.awt.event.ActionEvent evt) {                                                        
    FrmCadastrarFerramenta ferramenta = new FrmCadastrarFerramenta();
        
        ferramenta.setVisible (true);
    }                                                       

    private void jMenuGerenciarFerramentasActionPerformed(java.awt.event.ActionEvent evt) {                                                          
    FrmGerenciadorFerramenta ferramenta = new FrmGerenciadorFerramenta();
        
        ferramenta.setVisible (true);
    }                                                         

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
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JMenu jCadastrarFerramenta;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadastroAmigo;
    private javax.swing.JMenuItem jMenuCadastroFerramenta;
    private javax.swing.JMenuItem jMenuGerenciarAmigos;
    private javax.swing.JMenuItem jMenuGerenciarFerramentas;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration                   
}
