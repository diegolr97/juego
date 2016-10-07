package Controlador;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.*;
import java.applet.AudioClip;

//se importa modelo e interfaz
import Vista.Juego;



/**
 * @author Diego
 * @version 15/06/2016 21:03, diego lucas romero
 */ 




public class controlador implements ActionListener,MouseListener{

    /** instancia a nuestra interfaz de usuario*/
    Juego Vista ;
    
    /** instancia a nuestro modelo */
    

    
    /** Constrcutor de clase
     * @param vista Instancia de clase interfaz
     */
    public controlador( Juego Vista )
    {
        this.Vista = Vista;
        
        
    }
    
    public enum JuegoAction{
        Jirafa,
        Caballo,
        Perro,
        Gato,
        Leon,
        Tigre,
        
    }
    
    
    public void iniciar() throws FileNotFoundException, IOException{
        
       
        AudioClip sonido;
        sonido= java.applet.Applet.newAudioClip(getClass().getResource("/Controlador/musica_infantil.wav"));
        sonido.loop();
        
        
        Vista.setVisible(true);
        this.Vista.c.setVisible(false);
        this.Vista.p.setVisible(false);
        this.Vista.j.setVisible(false);
        this.Vista.g.setVisible(false);
        this.Vista.l.setVisible(false);
        this.Vista.t.setVisible(false);
        
        
       
        
      this.Vista.Jirafa.setActionCommand("Jirafa");
      this.Vista.Jirafa.addActionListener(this);
      
      this.Vista.Perro.setActionCommand("Perro");
      this.Vista.Perro.addActionListener(this);
      
      this.Vista.Caballo.setActionCommand("Caballo");
      this.Vista.Caballo.addActionListener(this);
      
      this.Vista.Gato.setActionCommand("Gato");
      this.Vista.Gato.addActionListener(this);
      
      this.Vista.Leon.setActionCommand("Leon");
      this.Vista.Leon.addActionListener(this);
    
      this.Vista.Tigre.setActionCommand("Tigre");
      this.Vista.Tigre.addActionListener(this);
        
        
    }
        
        
            
            
            

    @Override
    public void actionPerformed(ActionEvent e) {
        switch ( JuegoAction.valueOf( e.getActionCommand() ) )
        {
            case Jirafa:
                 
                 this.Vista.c.setVisible(false);
                 this.Vista.p.setVisible(false);
                 this.Vista.g.setVisible(false);
                 this.Vista.l.setVisible(false);
                 this.Vista.t.setVisible(false);
                 this.Vista.j.setVisible(true);
                 
                 
               
                 
           
                break;
                
            case Caballo:
                AudioClip Caballo;
                Caballo = java.applet.Applet.newAudioClip(getClass().getResource("/Controlador/caballo.wav"));
                Caballo.play();
                this.Vista.j.setVisible(false);
                this.Vista.p.setVisible(false);
                this.Vista.g.setVisible(false);
                this.Vista.l.setVisible(false);
                this.Vista.t.setVisible(false);
                this.Vista.c.setVisible(true);
                
                
                
                
                
                
                break;
                
            case Perro:
                AudioClip Perro;
                Perro= java.applet.Applet.newAudioClip(getClass().getResource("/Controlador/perro.wav"));
                Perro.play();
                this.Vista.c.setVisible(false);
                this.Vista.j.setVisible(false);
                this.Vista.g.setVisible(false);
                this.Vista.l.setVisible(false);
                this.Vista.t.setVisible(false);
                this.Vista.p.setVisible(true);
                
                
                
                
                break;
                
            case Gato:
                AudioClip Gato;
                Gato= java.applet.Applet.newAudioClip(getClass().getResource("/Controlador/gato.wav"));
                Gato.play();
                this.Vista.c.setVisible(false);
                this.Vista.j.setVisible(false);
                this.Vista.p.setVisible(false);
                this.Vista.l.setVisible(false);
                this.Vista.t.setVisible(false);
                this.Vista.g.setVisible(true);
                
                
                
                
                break;
                
            case Leon:
                AudioClip Leon;
                Leon= java.applet.Applet.newAudioClip(getClass().getResource("/Controlador/leon.wav"));
                Leon.play();
                
                this.Vista.c.setVisible(false);
                this.Vista.j.setVisible(false);
                this.Vista.p.setVisible(false);
                this.Vista.g.setVisible(false);
                this.Vista.t.setVisible(false);
                this.Vista.l.setVisible(true);
                
               
                
                break;
                
            case Tigre:
                
                AudioClip Tigre;
                Tigre= java.applet.Applet.newAudioClip(getClass().getResource("/Controlador/tigre.wav"));
                Tigre.play();
                
                this.Vista.c.setVisible(false);
                this.Vista.j.setVisible(false);
                this.Vista.p.setVisible(false);
                this.Vista.g.setVisible(false);
                this.Vista.l.setVisible(false);
                this.Vista.t.setVisible(true);
                
               
                
                break;
                
                
                
                
                
                
                
                
                
            
        }
        
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
         
    }
}

