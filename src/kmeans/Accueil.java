/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmeans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JFileChooser;

/**
 *
 * @author Nader
 */
public class Accueil extends javax.swing.JFrame {

    /**
     * Creates new form Accueil
     */
    public Accueil() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        file = new javax.swing.JTextField();
        nbcl = new javax.swing.JTextField();
        Valider = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(null);
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setText("Choisir Fichier....");
        jButton1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(490, 190, 140, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de clusters");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 169, 170, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fichier des données");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 200, 150, 17);

        file.setEditable(false);
        file.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileActionPerformed(evt);
            }
        });
        getContentPane().add(file);
        file.setBounds(160, 200, 310, 21);

        nbcl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nbcl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbclActionPerformed(evt);
            }
        });
        getContentPane().add(nbcl);
        nbcl.setBounds(160, 170, 310, 21);

        Valider.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Valider.setForeground(new java.awt.Color(51, 0, 255));
        Valider.setText("Cliquez  Ici");
        Valider.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Valider.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        Valider.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Valider.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ValiderMouseClicked(evt);
            }
        });
        Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValiderActionPerformed(evt);
            }
        });
        getContentPane().add(Valider);
        Valider.setBounds(230, 230, 140, 30);

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 0, 153));
        jTextField1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("K-Means");
        jTextField1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jTextField1);
        jTextField1.setBounds(0, 0, 650, 80);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Réalisé par : Tounekti Nader / Abdelkader Jouini");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(210, 290, 440, 22);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 650, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileActionPerformed

    private void nbclActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbclActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbclActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JFileChooser chooser = new JFileChooser();
       chooser.showOpenDialog(null);
       File f= chooser.getSelectedFile() ;
       String filename = f.getAbsolutePath();
       file.setText(filename);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
       
    }//GEN-LAST:event_ValiderActionPerformed
public ArrayList<cluster> chartpoint;
    private void ValiderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ValiderMouseClicked
        
        try{
        distance d= new distance();
        String nb=Accueil.nbcl.getText();
        int nbc= Integer.parseInt(nb);
            String fn=Accueil.file.getText();
            FileReader f1= new FileReader(fn);
        BufferedReader b= new BufferedReader(f1);
        String ligne;
        int m=0;
        while((ligne=b.readLine())!= null)
        {//System.out.println(ligne);
            point p= new point("p"+(m+1));
            StringTokenizer st = new StringTokenizer(ligne,",");
    while (st.hasMoreTokens())
    {
        String ch=st.nextToken();
        double chd=Double.parseDouble(ch);
        //System.out.println(chd);
        p.ajout(chd);
    }
        d.ajoutpoint(p);
        //System.out.println(p.affichagPoint());
        if(m<nbc)
        {
        cluster c=new cluster();
        point rt;
        rt=p.copy();
        c.setCentre(rt);
        d.ajoutcluster(c);
        //System.out.println(d.getCluster().get(m).affichage());
        }
    m++;
    }
        
        while(d.comparecentrecluster()==false)
        { //System.out.println("dfddfd");
            
            d.compare();
           
            //System.out.println("3");
            for (int i = 0; i < nbc; i++) {
              //  System.out.println(i);
                d.getCluster().get(i).calculeCentre();
            }
            
         //System.out.println("2");   
        }
        //System.out.println("1");
        String env="";
        
            for (int i = 0; i < nbc; i++) 
            {
                env+=(d.getCluster().get(i).affichage())+"\n";
            }
            for (int i = 0; i < nbc; i++) {
               BubbleChartSample.t.add(d.getCluster().get(i));
            }
            Resultat t=new Resultat ();
            Resultat.res.setText(env);
            t.setVisible(true);
        }catch(Exception e){System.out.println(e.getMessage());}
        dispose();
    }//GEN-LAST:event_ValiderMouseClicked

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
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Accueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Valider;
    public static javax.swing.JTextField file;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField nbcl;
    // End of variables declaration//GEN-END:variables

    private void setlocation(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
