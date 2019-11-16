package com.mallowigi.config.ui;

import com.mallowigi.config.AtomFileIconsConfig;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.ArrayList;
import java.util.List;

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

    public final void setFormState(final AtomFileIconsConfig config) {
        setSettingsTable();
    }

    private void setSettingsTable() {
        List<String> columns = new ArrayList<String>();
        List<String[]> values = new ArrayList<String[]>();

        columns.add("Enabled");
        columns.add("Type");
        columns.add("Name");
        columns.add("Pattern");

        for (int i = 0; i < 100; i++) {
            values.add(new String[] {"val"+i+" col1","val"+i+" col2","val"+i+" col3"});
        }

        TableModel tableModel = new DefaultTableModel(values.toArray(new Object[][] {}), columns.toArray());
        table1.setModel(tableModel);
    }
}
