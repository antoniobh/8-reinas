/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eq;

/**
 *
 * @author Antonio
 */
public class GAME extends javax.swing.JFrame {

    /**
     * Creates new form GAME
     */
    public GAME() {
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

        queen = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tablero = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        posField = new javax.swing.JTextField();
        setQueen = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        statusField = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        queen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eq/images/corona.png"))); // NOI18N
        queen.setMaximumSize(new java.awt.Dimension(55, 55));
        queen.setMinimumSize(new java.awt.Dimension(55, 55));
        queen.setPreferredSize(new java.awt.Dimension(70, 70));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setLayout(null);

        tablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eq/images/Tablero.jpg"))); // NOI18N
        tablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableroMouseClicked(evt);
            }
        });
        jPanel1.add(tablero);
        tablero.setBounds(2, 0, 450, 450);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Instrucciones del Juego");

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(java.awt.SystemColor.controlHighlight);
        jTextPane1.setText("El objetivo del juego 8R es lograr colocar 8 reinas en el tablero sin que estas choquen con las demas, tomando en cuenta que se pueden mover de forma Horizontal, Vertical y Diagonal.\n\nPara colocar una pieza en el tablero, debe de ingresar en el campo de coordenadas los valores de forma Columna Fila, por ejemplo A8.");
        jTextPane1.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(jTextPane1);

        jLabel3.setText("Colocar Reina");

        setQueen.setText("Colocar");
        setQueen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setQueenActionPerformed(evt);
            }
        });

        jButton2.setText("Reintentar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        statusField.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        statusField.setText("Coloca una pieza y a jugar!!");
        statusField.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eq/images/logo.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(statusField)
                .addGap(36, 36, 36))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(posField, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(setQueen))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusField)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(posField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(setQueen))
                .addGap(26, 26, 26)
                .addComponent(jButton2)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableroMouseClicked
        
    }//GEN-LAST:event_tableroMouseClicked

    private void setQueenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setQueenActionPerformed
    try{
        char Y = posField.getText().toLowerCase().charAt(0);
        char X = posField.getText().charAt(1);
        
        if(countQueens<=7 && !checkPosition(String.valueOf(X)+String.valueOf(Y))){
            
            
            /*
            
                en caso de haber posibilidades de reinas
            
            
            
            */
            posField.setText("");
            boolean passX = false;
            boolean passY = false;
            int VectorX = 9;
            int VectorY = 9;
            

        int PosX = 0;
        int PosY = 0;
        switch(X){
            case '8':
                PosX = 31;
                VectorX = 0;
                passX = true;
            break;
            case '7':
                PosX = 80;
                VectorX = 1;
                passX = true;
            break;
            case '6':
                PosX = 129;
                VectorX = 2;
                passX = true;
            break;
            case '5':
                PosX = 178;
                VectorX = 3;
                passX = true;
            break;
            case '4':
                PosX = 227;
                VectorX = 4;
                passX = true;
            break;
            case '3':
                PosX = 276;
                VectorX = 5;
                passX = true;
            break;
            case '2':
                PosX = 325;
                VectorX = 6;
                passX = true;
            break;
            case '1':
                PosX = 374;
                VectorX = 7;
                passX = true;
            break;
            default:
                passX = false;
            break;
        }
        
        
        switch(Y){
            case 'a':
                PosY = 31;
                VectorY = 0;
                passY = true;
            break;
            case 'b':
                PosY = 80;
                VectorY = 1;
                passY = true;
            break;
            case 'c':
                PosY = 129;
                VectorY = 2;
                passY = true;
            break;
            case 'd':
                PosY = 178;
                VectorY = 3;
                passY = true;
            break;
            case 'e':
                PosY = 227;
                VectorY = 4;
                passY = true;
            break;
            case 'f':
                PosY = 276;
                VectorY = 5;
                passY = true;
            break;
            case 'g':
                PosY = 325;
                VectorY = 6;
                passY = true;
            break;
            case 'h':
                PosY = 374;
                VectorY = 7;
                passY = true;
            break;
            default:
                passY = false;
            break;
        }
        
        
                if(passX && passY){
                    queen = new javax.swing.JLabel();
                    queen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/eq/images/corona.png"))); // NOI18N
                    queen.setMaximumSize(new java.awt.Dimension(55, 55));
                    queen.setMinimumSize(new java.awt.Dimension(55, 55));
                    queen.setPreferredSize(new java.awt.Dimension(70, 70));
                    tablero.add(queen);
                    queen.setBounds(PosY, PosX, 46, 46);
                    
                    
                    GAME g = new GAME();
                    g.addQueen();
                    statusField.setText(EQ.setValue(VectorX, VectorY, countQueens));
                    addPosition(X,Y);
                }
        }else{
            posField.setText("");
        }
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_setQueenActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tablero.removeAll();
        tablero.validate();
        tablero.repaint();
        resetGame();
        statusField.setText("Jugando");
    }//GEN-LAST:event_jButton2ActionPerformed

    private static void resetGame(){
       CleansPositions();
        EQ.resetGame();
        countQueens=0;
    }
    
    private static boolean checkPosition(String pos){
        return PosList.contains(pos);
    }
    
    private static void addPosition(char posX, char posY){
        PosList.add(String.valueOf(posX) + String.valueOf(posY));
    }
    private static void CleansPositions(){
        PosList.clear();
    }
    private static void addQueen(){
        countQueens += 1;
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
            java.util.logging.Logger.getLogger(GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GAME().setVisible(true);
                countQueens = 0;
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextField posField;
    private javax.swing.JLabel queen;
    private javax.swing.JButton setQueen;
    private javax.swing.JLabel statusField;
    private javax.swing.JLabel tablero;
    // End of variables declaration//GEN-END:variables
    private static int countQueens;
    private static java.util.ArrayList PosList = new java.util.ArrayList<String>();;
}