package com.mallowigi.config.ui;

import javax.swing.*;

@SuppressWarnings("FieldCanBeLocal")
public class SettingsForm implements SettingsFormUI {
    private JPanel panel1;
    private JTable table1;
    private JCheckBox checkBox1;
    private JCheckBox checkBox2;
    private JCheckBox checkBox3;
    private JCheckBox checkBox4;
    private JCheckBox checkBox5;
    private JTextField textField1;

    @Override
    public JComponent getContent() {
        return panel1;
    }

    @Override
    public void afterStateSet() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void init() {

    }
}
