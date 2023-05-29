import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Frame extends JPanel {
    Frame(int left,int top,int width,int height,String backgroundColor){
        this.setBounds(left,top,width,height);
        this.setLayout(null);
        Color myBackgroundColor = null;
        try{
            myBackgroundColor = Color.decode(backgroundColor);
        }catch (NumberFormatException e){
            System.err.println("Frame::bgc::La chaîne de caractères n'est pas un code couleur valide.");
        }
        if(myBackgroundColor !=null){
            this.setBackground(myBackgroundColor);
        }
    }
    public JLabel newLabel(int left,int top,int width,int height,String text,String icon,String toolTip,boolean enable,String color,String backgroundColor,int fontSize,String fontFamily,boolean bold,boolean italic){
        JLabel label = new JLabel();
        label.setBounds(left,top,width,height);
        if(!"".equals(text)){
            label.setText(text);
        }
        if(!"".equals(toolTip)){
            label.setToolTipText(toolTip);
        }
        File iconFile = new File(icon);
        if(iconFile.exists()){
            ImageIcon  iconImage = new ImageIcon(icon);
            label.setIcon(iconImage);
        }

        label.setEnabled(enable);
        label.setBounds(left,top,width,height);
        Color myColor =null;
        try {
            myColor = Color.decode(color);
        } catch (NumberFormatException e) {
            System.err.println("JButton::c::La chaîne de caractères n'est pas un code couleur valide.");
        }

        // Utilisation de la couleur dans votre application
        if (myColor != null) {
            label.setForeground(myColor);
        }
        Color myBackgroundColor = null;
        try{
            myBackgroundColor = Color.decode(backgroundColor);
        }catch (NumberFormatException e){
            System.err.println("JButton::bgc::La chaîne de caractères n'est pas un code couleur valide.");
        }
        if(myBackgroundColor !=null){
            label.setBackground(myBackgroundColor);
        }
        boolean isFontAvailable = false;
        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String name : fontNames) {
            if (name.equals(fontFamily)) {
                isFontAvailable = true;
                break;
            }
        }
        label.setBackground(Color.blue);
        // Utilisation de la police de caractères dans votre application
        if (isFontAvailable) {
            if(bold && italic){
                label.setFont(new Font(fontFamily,Font.ITALIC+Font.BOLD,fontSize));
            }
            else if(bold){
                label.setFont(new Font(fontFamily,Font.BOLD,fontSize));
            }
            else if(italic){
                label.setFont(new Font(fontFamily,Font.ITALIC,fontSize));
            }else{

                label.setFont(new Font(fontFamily,Font.PLAIN,fontSize));
            }
        } else {
            System.err.println("La police de caractères n'est pas disponible sur le système.");
        }
        this.add(label);
        return label;
    }
    public JButton newButton(int left , int top,int width,int height,String text,String icon,String toolTip,boolean enable,String color,String backgroundColor,int fontSize,String fontFamily,boolean bold,boolean italic){
        JButton btn = new JButton();
        if(!"".equals(text)){
            btn.setText(text);
        }
        if(!"".equals(toolTip)){
            btn.setToolTipText(toolTip);
        }
        File iconFile = new File(icon);
        if(iconFile.exists()){
            ImageIcon  iconImage = new ImageIcon(icon);
            btn.setIcon(iconImage);
        }

        btn.setEnabled(enable);
        btn.setBounds(left,top,width,height);
        Color myColor =null;
        try {
            myColor = Color.decode(color);
        } catch (NumberFormatException e) {
            System.err.println("JButton::c::La chaîne de caractères n'est pas un code couleur valide.");
        }

        // Utilisation de la couleur dans votre application
        if (myColor != null) {
            btn.setForeground(myColor);
        }
        Color myBackgroundColor = null;
        try{
            myBackgroundColor = Color.decode(backgroundColor);
        }catch (NumberFormatException e){
            System.err.println("JButton::bgc::La chaîne de caractères n'est pas un code couleur valide.");
        }
        if(myBackgroundColor !=null){
            btn.setBackground(myBackgroundColor);
        }
        boolean isFontAvailable = false;
        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String name : fontNames) {
            if (name.equals(fontFamily)) {
                isFontAvailable = true;
                break;
            }
        }

        // Utilisation de la police de caractères dans votre application
        if (isFontAvailable) {
            if(bold && italic){
                btn.setFont(new Font(fontFamily,Font.ITALIC+Font.BOLD,fontSize));
            }
            else if(bold){
                btn.setFont(new Font(fontFamily,Font.BOLD,fontSize));
            }
            else if(italic){
                btn.setFont(new Font(fontFamily,Font.ITALIC,fontSize));
            }else{
                btn.setFont(new Font(fontFamily,Font.PLAIN,fontSize));
            }

        } else {
            System.err.println("La police de caractères n'est pas disponible sur le système.");
        }
        this.add(btn);
        return btn;
    }



    public JRadioButton newRadioButton(int left , int top,int width,int height,String text,String icon,String toolTip,boolean enable,String color,String backgroundColor,int fontSize,String fontFamily,boolean bold,boolean italic){
        JRadioButton btn = new JRadioButton();
        if(!"".equals(text)){
            btn.setText(text);
        }
        if(!"".equals(toolTip)){
            btn.setToolTipText(toolTip);
        }
        File iconFile = new File(icon);
        if(iconFile.exists()){
            ImageIcon  iconImage = new ImageIcon(icon);
            btn.setIcon(iconImage);
        }
        btn.setEnabled(enable);
        btn.setBounds(left,top,width,height);
        Color myColor =null;
        try {
            myColor = Color.decode(color);
        } catch (NumberFormatException e) {
            System.err.println("JRadioButton::c::La chaîne de caractères n'est pas un code couleur valide.");
        }
        // Utilisation de la couleur dans votre application
        if (myColor != null) {
            btn.setForeground(myColor);
        }
        Color myBackgroundColor = null;
        try{
            myBackgroundColor = Color.decode(backgroundColor);
        }catch (NumberFormatException e){
            System.err.println("JRadioButton::bgc::La chaîne de caractères n'est pas un code couleur valide.");
        }
        if(myBackgroundColor !=null){
            btn.setBackground(myBackgroundColor);
        }
        boolean isFontAvailable = false;
        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String name : fontNames) {
            if (name.equals(fontFamily)) {
                isFontAvailable = true;
                break;
            }
        }
        // Utilisation de la police de caractères dans votre application
        if (isFontAvailable) {
            if(bold && italic){
                btn.setFont(new Font(fontFamily,Font.ITALIC+Font.BOLD,fontSize));
            }
            else if(bold){
                btn.setFont(new Font(fontFamily,Font.BOLD,fontSize));
            }
            else if(italic){
                btn.setFont(new Font(fontFamily,Font.ITALIC,fontSize));
            }else{
                btn.setFont(new Font(fontFamily,Font.PLAIN,fontSize));
            }
        } else {
            System.err.println("La police de caractères n'est pas disponible sur le système.");
        }
        this.add(btn);
        return btn;
    }
    public JTextArea newInputTextArea(int left , int top,int width,int height,String text,String toolTip,String color,String backgroundColor,int fontSize,String fontFamily,boolean bold,boolean italic,boolean isEditable){
        JTextArea input = new JTextArea();
        input.setBounds(left,top,width,height);
        if(!"".equals(text)){
            input.setText(text);
        }
        if(!"".equals(toolTip)){
            input.setToolTipText(toolTip);
        }
        Color myColor =null;
        try {
            myColor = Color.decode(color);
        } catch (NumberFormatException e) {
            System.err.println("JRadioButton::c::La chaîne de caractères n'est pas un code couleur valide.");
        }

        // Utilisation de la couleur dans votre application
        if (myColor != null) {
            input.setForeground(myColor);
        }
        Color myBackgroundColor = null;
        try{
            myBackgroundColor = Color.decode(backgroundColor);
        }catch (NumberFormatException e){
            System.err.println("JRadioButton::bgc::La chaîne de caractères n'est pas un code couleur valide.");
        }
        if(myBackgroundColor !=null){
            input.setBackground(myBackgroundColor);
        }
        boolean isFontAvailable = false;
        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String name : fontNames) {
            if (name.equals(fontFamily)) {
                isFontAvailable = true;
                break;
            }
        }
        // Utilisation de la police de caractères dans votre application
        if (isFontAvailable) {
            if(bold && italic){
                input.setFont(new Font(fontFamily,Font.ITALIC+Font.BOLD,fontSize));
            }else if(bold){
                input.setFont(new Font(fontFamily,Font.BOLD,fontSize));
            }else if(italic){
                input.setFont(new Font(fontFamily,Font.ITALIC,fontSize));
            }else{
                input.setFont(new Font(fontFamily,Font.PLAIN,fontSize));
            }
        }else{
            System.err.println("La police de caractères n'est pas disponible sur le système.");
        }
        input.setEditable(isEditable);
        input.setLineWrap(true);
        this.add(input);
        return input;
    }
    public JTextField newInput(int left , int top,int width,int height,String text,String toolTip,String color,String backgroundColor,int fontSize,String fontFamily,boolean bold,boolean italic,boolean isEditable){
        JTextField input = new JTextField();
        input.setBounds(left,top,width,height);
        if(!"".equals(text)){
            input.setText(text);
        }
        if(!"".equals(toolTip)){
            input.setToolTipText(toolTip);
        }
        Color myColor =null;
        try {
            myColor = Color.decode(color);
        } catch (NumberFormatException e) {
            System.err.println("JRadioButton::c::La chaîne de caractères n'est pas un code couleur valide.");
        }

        // Utilisation de la couleur dans votre application
        if (myColor != null) {
            input.setForeground(myColor);
        }
        Color myBackgroundColor = null;
        try{
            myBackgroundColor = Color.decode(backgroundColor);
        }catch (NumberFormatException e){
            System.err.println("JRadioButton::bgc::La chaîne de caractères n'est pas un code couleur valide.");
        }
        if(myBackgroundColor !=null){
            input.setBackground(myBackgroundColor);
        }
        boolean isFontAvailable = false;
        String[] fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for (String name : fontNames) {
            if (name.equals(fontFamily)) {
                isFontAvailable = true;
                break;
            }
        }
        // Utilisation de la police de caractères dans votre application
        if (isFontAvailable) {
            if(bold && italic){
                input.setFont(new Font(fontFamily,Font.ITALIC+Font.BOLD,fontSize));
            }else if(bold){
                input.setFont(new Font(fontFamily,Font.BOLD,fontSize));
            }else if(italic){
                input.setFont(new Font(fontFamily,Font.ITALIC,fontSize));
            }else{
                input.setFont(new Font(fontFamily,Font.PLAIN,fontSize));
            }
        }else{
            System.err.println("La police de caractères n'est pas disponible sur le système.");
        }
        input.setEditable(isEditable);
        this.add(input);
        return input;
    }
    public JPasswordField newInput(int left , int top,int width,int height,String text,String toolTip,String color,String backgroundColor){
        JPasswordField input = new JPasswordField();
        input.setBounds(left,top,width,height);
        if(!"".equals(text)){
            input.setText(text);
        }
        if(!"".equals(toolTip)){
            input.setToolTipText(toolTip);
        }
        Color myColor =null;
        try {
            myColor = Color.decode(color);
        } catch (NumberFormatException e) {
            System.err.println("JRadioButton::c::La chaîne de caractères n'est pas un code couleur valide.");
        }
        // Utilisation de la couleur dans votre application
        if (myColor != null) {
            input.setForeground(myColor);
        }
        Color myBackgroundColor = null;
        try{
            myBackgroundColor = Color.decode(backgroundColor);
        }catch (NumberFormatException e){
            System.err.println("JRadioButton::bgc::La chaîne de caractères n'est pas un code couleur valide.");
        }
        if(myBackgroundColor !=null){
            input.setBackground(myBackgroundColor);
        }
        this.add(input);
        return input;
    }
    public JCheckBox newCheckBox(int left , int top,int width,int height,String text){
        JCheckBox chekBox = new JCheckBox();
        chekBox.setBounds(left,top,width,height);
        chekBox.setText(text);
        this.add(chekBox);
        return chekBox;
    }
    public JComboBox<String> newComboBox(int left , int top, int width, int height, String[] items){
        JComboBox comboBox= new JComboBox(items);
        comboBox.setBounds(left,top,width,height);
        this.add(comboBox);
        return comboBox;
    }

    public static void main(String[] args) {
        // créer un nouvea frame
        JFrame frame = new JFrame("frame");

        // créer un objet


        // définir la disposition du frame
        frame.setLayout(new FlowLayout());

        // tableau de chaînes contenant des langages
        String s1[] = { "Java", "PHP", "Python", "C++", "Ruby" };

        // créer une case à cocher
        JComboBox<String> combobox = new JComboBox<>(s1);

        // ajouter ItemListener
        //combobox.addItemListener(obj);

        // créer des étiquettes
        JLabel l1 = new JLabel("Quel est votre langage prefere? ");
        JLabel l2 = new JLabel("[Java]");

        // définir la couleur du texte
        l2.setForeground(Color.blue);

        // créer un nouveau panneau
        JPanel p = new JPanel();
        // ajouter combobox et labels au panneau
        p.add(l1);
        p.add(combobox);
        p.add(l2);
        // ajouter le panneau au frame
        frame.add(p);
        // définir la taille du frame
        frame.setSize(400, 200);
        frame.show();
}
    public void Show(){
        this.setVisible(true);
    }
    public void close(){
        this.setVisible(false);
    }
}
