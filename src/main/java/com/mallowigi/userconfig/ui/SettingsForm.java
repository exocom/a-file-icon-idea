package com.mallowigi.userconfig.ui;

import com.mallowigi.userconfig.UserConfig;

import javax.swing.*;

public class SettingsForm implements SettingsFormUI {
    private JPanel panel1;

    @Override
    public void init() {

    }

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

    public void setFormState(final UserConfig config) {

    }

    public boolean isModified(final UserConfig config) {
        return false;
    }
}
