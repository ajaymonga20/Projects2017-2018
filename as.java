package org.garion.games.jeopardy.ui; 
 
import java.awt.BorderLayout; 
import java.awt.event.*; 
import java.io.File; 
import javax.swing.*; 
import org.garion.games.jeopardy.Game; 
import org.garion.games.jeopardy.util.Const; 
import org.garion.games.jeopardy.util.ExternalPlayerReader; 
import org.garion.games.jeopardy.util.IO; 
import org.garion.games.jeopardy.util.builder.GameBuilder; 
import org.garion.games.scorecard.Scorecard; 
import org.garion.global.Global; 
 
/**
 * The main Jeopardy program 
 *  
 * @author Dallin Lauritzen 
 * @version 1.0 (7 May 2010) 
 */ 
public class Jeopardy { 
 
 private Game game; 
 private JFrame frame; 
 private JPanel main; 
 
 private final BoardPanel boardPanel; 
 
 private JMenuBar menuBar; 
 private JMenu gameMenu; 
 private JMenuItem newGame, exitMenu; 
 private JMenu roundMenu; 
 private JMenuItem showSingleRound, showDoubleRound, showFinalRound; 
 private JMenu toolsMenu; 
 private JMenuItem scoreCardItem, builderItem; 
 private JMenu helpMenu; 
 private JMenuItem aboutItem, readmeItem, licenseItem; 
 
 private JFileChooser chooser; 
 
 /**
  * Create the jeopardy frame 
  */ 
 public Jeopardy() { 
  Global.setSystemUI(); 
   
  game = null; 
  frame = new JFrame( "Jeopardy" ); 
  frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE ); 
  main = new JPanel( new BorderLayout() ); 
  boardPanel = new BoardPanel(); 
   
  // start delivering serial events to the BoardPanel (in a sep. thread) 
  new Thread(new ExternalPlayerReader(boardPanel)).start(); 
   
  createMenuBar(); 
  chooser = new JFileChooser(); 
  chooser.setMultiSelectionEnabled( false ); 
  chooser.setFileFilter( IO.ext ); 
   
  main.add( boardPanel, BorderLayout.CENTER ); 
  main.setBorder( BorderFactory.createEmptyBorder( 5, 5, 5, 5 ) ); 
  frame.getContentPane().add( main ); 
  frame.setSize( 800, 600 ); 
  frame.setLocationRelativeTo( null ); 
  frame.setVisible( true ); 
 } 
 
 private void createMenuBar() { 
  menuBar = new JMenuBar(); 
  // Game menu 
  gameMenu = new JMenu( "Game" ); 
  newGame = new JMenuItem( "Load New Game" ); 
  exitMenu = new JMenuItem( "Exit" ); 
  gameMenu.add( newGame ); 
  gameMenu.add( exitMenu ); 
  // Round menu 
  roundMenu = new JMenu( "Round" ); 
  showSingleRound = new JMenuItem( "Show Single Jeopardy" ); 
  showDoubleRound = new JMenuItem( "Show Double Jeopardy" ); 
  showFinalRound = new JMenuItem( "Show Final Jeopardy" ); 
  roundMenu.add( showSingleRound ); 
  roundMenu.add( showDoubleRound ); 
  roundMenu.add( showFinalRound ); 
  // Tools menu 
  toolsMenu = new JMenu( "Tools" ); 
  scoreCardItem = new JMenuItem( "Score Card" ); 
  builderItem = new JMenuItem( "Game Builder" ); 
  toolsMenu.add( scoreCardItem ); 
  toolsMenu.add( builderItem ); 
  // Help menu 
  helpMenu = new JMenu( "Help" ); 
  aboutItem = new JMenuItem( "About Java Jeopardy" ); 
  readmeItem = new JMenuItem( "Read Me (How to Use)" ); 
  licenseItem = new JMenuItem( "GNU General Public License" ); 
  helpMenu.add( aboutItem ); 
  helpMenu.add( readmeItem ); 
  helpMenu.add( licenseItem ); 
  // menu 
  menuBar.add( gameMenu ); 
  menuBar.add( roundMenu ); 
  menuBar.add( toolsMenu ); 
  menuBar.add( helpMenu ); 
  frame.setJMenuBar( menuBar ); 
  // listeners 
  newGame.addActionListener( menuListener ); 
  exitMenu.addActionListener( menuListener ); 
  showSingleRound.addActionListener( menuListener ); 
  showDoubleRound.addActionListener( menuListener ); 
  showFinalRound.addActionListener( menuListener ); 
  scoreCardItem.addActionListener( menuListener ); 
  builderItem.addActionListener( menuListener ); 
  aboutItem.addActionListener( menuListener ); 
  readmeItem.addActionListener( menuListener ); 
  licenseItem.addActionListener( menuListener ); 
  // accelerators 
  newGame.setAccelerator( KeyStroke.getKeyStroke( 'O', 
   InputEvent.CTRL_DOWN_MASK ) ); 
  exitMenu.setAccelerator( KeyStroke.getKeyStroke( 'Q', 
   InputEvent.CTRL_DOWN_MASK ) ); 
  showSingleRound.setAccelerator( KeyStroke.getKeyStroke( 'S', 
   InputEvent.CTRL_DOWN_MASK ) ); 
  showDoubleRound.setAccelerator( KeyStroke.getKeyStroke( 'D', 
   InputEvent.CTRL_DOWN_MASK ) ); 
  showFinalRound.setAccelerator( KeyStroke.getKeyStroke( 'F', 
   InputEvent.CTRL_DOWN_MASK ) ); 
  scoreCardItem.setAccelerator( KeyStroke.getKeyStroke( 'C', 
   InputEvent.CTRL_DOWN_MASK ) ); 
  builderItem.setAccelerator( KeyStroke.getKeyStroke( 'B', 
   InputEvent.CTRL_DOWN_MASK ) ); 
  readmeItem.setAccelerator( KeyStroke.getKeyStroke( KeyEvent.VK_F1, 0 ) ); 
  // mnemonics 
  gameMenu.setMnemonic( 'g' ); 
  newGame.setMnemonic( 'n' ); 
  exitMenu.setMnemonic( 'x' ); 
  roundMenu.setMnemonic( 'r' ); 
  showSingleRound.setMnemonic( 's' ); 
  showDoubleRound.setMnemonic( 'd' ); 
  showFinalRound.setMnemonic( 'f' ); 
  toolsMenu.setMnemonic( 't' ); 
  scoreCardItem.setMnemonic( 'c' ); 
  builderItem.setMnemonic( 'b' ); 
  helpMenu.setMnemonic( 'h' ); 
  aboutItem.setMnemonic( 'a' ); 
  readmeItem.setMnemonic( 'r' ); 
  licenseItem.setMnemonic( 'l' ); 
 } 
 
 /**
  * Load a new game 
  *  
  * @param g 
  *            the game to load 
  */ 
 public void loadGame( Game g ) { 
  this.game = g; 
  boardPanel.loadGame( game ); 
  frame.setTitle( String.format( "Jeopardy :: %s - %s", game.title, 
   game.subject ) ); 
 } 
 
 private ActionListener menuListener = new ActionListener() { 
 
  public void actionPerformed( ActionEvent e ) { 
   String command = e.getActionCommand(); 
   if ( command.equals( "Load New Game" ) ) { 
    int s = chooser.showOpenDialog( frame ); 
    if ( s == JFileChooser.APPROVE_OPTION ) { 
     File f = chooser.getSelectedFile(); 
     try { 
      loadGame( IO.detectAndLoad( f ) ); 
     } catch ( Exception ex ) { 
      JOptionPane 
       .showMessageDialog( frame, 
        "Exception thrown loading file. " 
         + ex.getMessage(), "Error Loading File", 
        JOptionPane.ERROR_MESSAGE ); 
     } 
    } 
   } else if ( command.equals( "Exit" ) ) { 
    System.exit( 0 ); 
   } else if ( command.equals( "Show Single Jeopardy" ) ) { 
    if ( game != null ) 
     boardPanel.loadRound( Const.SINGLEROUND ); 
   } else if ( command.equals( "Show Double Jeopardy" ) ) { 
    if ( game != null ) 
     boardPanel.loadRound( Const.DOUBLEROUND ); 
   } else if ( command.equals( "Show Final Jeopardy" ) ) { 
    if ( game != null ) 
     boardPanel.loadRound( Const.FINALROUND ); 
   } else if ( command.equals( "Score Card" ) ) { 
    new Scorecard( false ); 
   } else if ( command.equals( "Game Builder" ) ) { 
    new GameBuilder( false ); 
   } else if ( command.equals( "About Java Jeopardy" ) ) { 
    AboutFrame.showFrame( AboutFrame.ABOUT ); 
   } else if ( command.equals( "Read Me (How to Use)" ) ) { 
    AboutFrame.showFrame( AboutFrame.README ); 
   } else if ( command.equals( "GNU General Public License" ) ) { 
    AboutFrame.showFrame( AboutFrame.LICENSE ); 
   } 
  } 
 }; 
 
 /**
  * Run the program 
  *  
  * @param args 
  *            command-line arguments (ignored) 
  */ 
 public static void main( String[] args ) { 
  new Jeopardy(); 
 } 
 
}