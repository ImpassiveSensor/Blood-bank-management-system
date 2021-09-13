package panels;


import javax.swing.JPanel;



public class ChangePanel {
    //
    private JPanel container;
    private JPanel content;


    /**
     * Constructor class
     */
    public ChangePanel(JPanel container, JPanel content) {
        this.container = container;
        this.content = content;
        this.container.removeAll();
        this.container.revalidate();
        this.container.repaint();
        
        this.container.add(this.content);
        this.container.revalidate();
        this.container.repaint();
    }

}//--> fin clase

