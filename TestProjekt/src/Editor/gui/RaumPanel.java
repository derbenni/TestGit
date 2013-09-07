package Editor.gui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import Editor.gui.ItemPanel.ItemIcon;


public class RaumPanel extends JPanel
{

    /**
     * 
     */
    private static final long serialVersionUID = -7867620357529780250L;
    private JPanel _inneresPanel;
    private JPanel _nordTuer;
    private JPanel _suedTuer;
    private JPanel _westTuer;
    private JPanel _ostTuer;
    private JPanel _itemPanel;
    private JPanel _charPanel;
    private JLabel _namensLabel;
    private String _name;
    

    /**
     * 
     * @param items
     *            anzahl der platzierbaren Items
     * @param chars
     *            Anzahl der moeglichen NPCs
     */
    public RaumPanel(int items, int chars)
    {
        this.setPreferredSize(new Dimension(150,150));
        this.setLayout(new BorderLayout());
        this.setBackground(Color.WHITE);
        _namensLabel = new JLabel();
        _inneresPanel = new JPanel(new BorderLayout());
        _inneresPanel.setBackground(Color.WHITE);
        _inneresPanel.add(_namensLabel, BorderLayout.CENTER);
        this.add(_inneresPanel);
        
        tuerenInitialisieren();
        erstelleItemPlaetze(items);
        
        Color itemFarbe = new Color(135, 206, 235);
        
//        JPanel item1 = new JPanel();
//        item1.setBackground(itemFarbe);
//        item1.setPreferredSize(new Dimension(50,64));
//        item1.setBorder(new LineBorder(Color.black));
//        JPanel item2 = new JPanel();
//        item2.setBackground(itemFarbe);
//        item2.setPreferredSize(new Dimension(50,64));
//        item2.setBorder(new LineBorder(Color.black));
//        JPanel item3 = new JPanel();
//        item3.setBackground(itemFarbe);
//        item3.setPreferredSize(new Dimension(50,64));
//        item3.setBorder(new LineBorder(Color.black));
//        _itemPanel.add(item1);
//        _itemPanel.add(item2);
//        _itemPanel.add(item3);
        erstelleCharPlaetze(3);
//        
        ItemPanel item1 = new ItemPanel(ItemIcon.TRANK, Color.GREEN);
        ItemPanel item2 = new ItemPanel(ItemIcon.SCHLUESSEL, Color.ORANGE);
        ItemPanel item3 = new ItemPanel(ItemIcon.TELEPORTER, Color.WHITE);
        _itemPanel.add(item1);
        _itemPanel.add(item2);
        _itemPanel.add(item3);
        
        JPanel char1 = new JPanel();
        JPanel char2 = new JPanel();
        JPanel char3 = new JPanel();
        
        char1.setBackground(new Color(255,215,0));
        char1.setPreferredSize(new Dimension(10,25));
        _charPanel.add(char1);
        _charPanel.add(char2);
        _charPanel.add(char3);
        
    }

    private void erstelleItemPlaetze(int items)
    {
        _itemPanel = new JPanel(new GridLayout(1, items));
        _itemPanel.setBackground(Color.WHITE);
        _inneresPanel.add(_itemPanel, BorderLayout.SOUTH);

    }
    
    private void erstelleCharPlaetze(int anzahl){
        _charPanel = new JPanel(new GridLayout(1,anzahl));
        _charPanel.setBackground(Color.WHITE);
        _inneresPanel.add(_charPanel, BorderLayout.NORTH);
    }

    
    /**
     * erstellt die Türen
     */
    private void tuerenInitialisieren()
    {
        _nordTuer = new JPanel();
        _suedTuer = new JPanel();
        _westTuer = new JPanel();
        _ostTuer = new JPanel();
        _suedTuer.setBackground(Color.BLACK);
        _nordTuer.setBackground(Color.BLACK);
        _westTuer.setBackground(Color.BLACK);
        _ostTuer.setBackground(Color.BLACK);
        this.add(_nordTuer, BorderLayout.NORTH);
        this.add(_suedTuer, BorderLayout.SOUTH);
        this.add(_ostTuer, BorderLayout.EAST);
        this.add(_westTuer, BorderLayout.WEST);
    }

    
    public void setzeNamen(String name){
    	_name = name;
    	_namensLabel.setName(name);
    }
    
    public void fuegeItemHinzu(JPanel item){
        _itemPanel.add(item);
        this.validate();
    }
    
    public void entferneItem(int index){
       _itemPanel.remove(index);
       this.validate();
    }
    
    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setBackground(Color.WHITE);
        frame.add(new RaumPanel(0, 0));
        frame.setVisible(true);
        frame.pack();
    }

}
