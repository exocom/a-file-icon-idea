/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2020 Chris Magnussen and Elior Boukhobza
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 *
 */

/*
 * Created by JFormDesigner on Mon May 21 20:14:40 IDT 2018
 */

package com.mallowigi.config.ui;

import com.intellij.openapi.ui.ComboBox;
import com.intellij.ui.ColorPanel;
import com.intellij.ui.ColorUtil;
import com.intellij.ui.ListCellRendererWrapper;
import com.mallowigi.config.AtomFileIconsConfig;
import com.mallowigi.tree.arrows.ArrowsStyles;
import net.miginfocom.swing.MigLayout;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.util.Objects;
import java.util.ResourceBundle;

/**
 * @author Elior Boukhobza
 */
@SuppressWarnings({"FieldCanBeLocal",
  "HardCodedStringLiteral",
  "StringConcatenation",
  "PublicMethodNotExposedInInterface",
  "FeatureEnvy",
  "BooleanMethodNameMustStartWithQuestion"})
public final class SettingsForm implements SettingsFormUI {
  public SettingsForm() {
    initComponents();
  }

  // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
  // Generated using JFormDesigner non-commercial license
  private JPanel content;
  private JLabel enableFileIconsIcon;
  private JCheckBox enableFileIconsCheckbox;
  private JLabel enableDirectoryIconsIcon;
  private JCheckBox enableDirectoryIconsCheckbox;
  private JLabel monochromeIcon;
  private JCheckBox monochromeCheckbox;
  private ColorPanel monoColorChooser;
  private JLabel enableUIIconsIcon;
  private JCheckBox enableUIIconsCheckbox;
  private JLabel enablePSIIconsIcon;
  private JCheckBox enablePSIIconsCheckbox;
  private JLabel enablePSIIconsIcon3;
  private JCheckBox hideFileIconsCheckbox;
  private JLabel enablePSIIconsIcon2;
  private JCheckBox hollowFoldersCheckbox;
  private JLabel arrowsStyleLabel;
  private ComboBox<ArrowsStyles> arrowsStyleComboBox;
  // JFormDesigner - End of variables declaration  //GEN-END:variables

  @SuppressWarnings({"Convert2MethodRef",
    "LocalCanBeFinal"})
  private void initComponents() {
    // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
    // Generated using JFormDesigner non-commercial license
    ResourceBundle bundle = ResourceBundle.getBundle("config.AtomFileIconsBundle");
    content = new JPanel();
    enableFileIconsIcon = new JLabel();
    enableFileIconsCheckbox = new JCheckBox();
    enableDirectoryIconsIcon = new JLabel();
    enableDirectoryIconsCheckbox = new JCheckBox();
    monochromeIcon = new JLabel();
    monochromeCheckbox = new JCheckBox();
    monoColorChooser = new ColorPanel();
    enableUIIconsIcon = new JLabel();
    enableUIIconsCheckbox = new JCheckBox();
    enablePSIIconsIcon = new JLabel();
    enablePSIIconsCheckbox = new JCheckBox();
    enablePSIIconsIcon3 = new JLabel();
    hideFileIconsCheckbox = new JCheckBox();
    enablePSIIconsIcon2 = new JLabel();
    hollowFoldersCheckbox = new JCheckBox();
    arrowsStyleLabel = new JLabel();
    arrowsStyleComboBox = new ComboBox<>();

    //======== content ========
    {
      content.setLayout(new MigLayout(
        "hidemode 3",
        // columns
        "[fill]" +
          "[::600,fill]" +
          "[fill]",
        // rows
        "[]" +
          "[]" +
          "[]" +
          "[]" +
          "[]" +
          "[]" +
          "[]" +
          "[50]" +
          "[]"));

      //---- enableFileIconsIcon ----
      enableFileIconsIcon.setIcon(new ImageIcon(getClass().getResource("/icons/settings/atom@2x.png")));
      content.add(enableFileIconsIcon, "cell 0 0");

      //---- enableFileIconsCheckbox ----
      enableFileIconsCheckbox.setText(bundle.getString("SettingsForm.enableFileIconsCheckbox.text"));
      enableFileIconsCheckbox.setToolTipText(bundle.getString("SettingsForm.enableFileIconsCheckbox.toolTipText"));
      content.add(enableFileIconsCheckbox, "cell 1 0");

      //---- enableDirectoryIconsIcon ----
      enableDirectoryIconsIcon.setIcon(new ImageIcon(getClass().getResource("/icons/settings/compiledClassesFolder@2x.png")));
      content.add(enableDirectoryIconsIcon, "cell 0 1");

      //---- enableDirectoryIconsCheckbox ----
      enableDirectoryIconsCheckbox.setText(bundle.getString("SettingsForm.enableDirectoryIconsCheckbox.text"));
      enableDirectoryIconsCheckbox.setToolTipText(bundle.getString("SettingsForm.enableDirectoryIconsCheckbox.toolTipText"));
      content.add(enableDirectoryIconsCheckbox, "cell 1 1");

      //---- monochromeIcon ----
      monochromeIcon.setIcon(new ImageIcon(getClass().getResource("/icons/settings/monochrome@2x.png")));
      content.add(monochromeIcon, "cell 0 2");

      //---- monochromeCheckbox ----
      monochromeCheckbox.setText(bundle.getString("SettingsForm.monochromeCheckbox.text"));
      monochromeCheckbox.setToolTipText(bundle.getString("SettingsForm.monochromeCheckbox.toolTipText"));
      monochromeCheckbox.setIcon(null);
      monochromeCheckbox.addChangeListener(e -> monochromeCheckboxStateChanged(e));
      content.add(monochromeCheckbox, "cell 1 2");

      //---- monoColorChooser ----
      monoColorChooser.setToolTipText(bundle.getString("SettingsForm.monoColorChooser.toolTipText"));
      content.add(monoColorChooser, "cell 1 2,alignx right,growx 0");

      //---- enableUIIconsIcon ----
      enableUIIconsIcon.setIcon(new ImageIcon(getClass().getResource("/icons/settings/plugin@2x.png")));
      content.add(enableUIIconsIcon, "cell 0 3");

      //---- enableUIIconsCheckbox ----
      enableUIIconsCheckbox.setText(bundle.getString("SettingsForm.enableUIIconsCheckbox.text"));
      enableUIIconsCheckbox.setToolTipText(bundle.getString("SettingsForm.enableUIIconsCheckbox.toolTipText"));
      content.add(enableUIIconsCheckbox, "cell 1 3");

      //---- enablePSIIconsIcon ----
      enablePSIIconsIcon.setIcon(new ImageIcon(getClass().getResource("/icons/settings/psiIcons@2x.png")));
      content.add(enablePSIIconsIcon, "cell 0 4");

      //---- enablePSIIconsCheckbox ----
      enablePSIIconsCheckbox.setText(bundle.getString("SettingsForm.enablePSIIconsCheckbox.text"));
      enablePSIIconsCheckbox.setToolTipText(bundle.getString("SettingsForm.enablePSIIconsCheckbox.toolTipText"));
      content.add(enablePSIIconsCheckbox, "cell 1 4");

      //---- enablePSIIconsIcon3 ----
      enablePSIIconsIcon3.setIcon(new ImageIcon(getClass().getResource("/icons/settings/hideFileAction@2x.png")));
      content.add(enablePSIIconsIcon3, "cell 0 5");

      //---- hideFileIconsCheckbox ----
      hideFileIconsCheckbox.setText(bundle.getString("SettingsForm.hideFileIconsCheckbox.text"));
      hideFileIconsCheckbox.setToolTipText(bundle.getString("SettingsForm.hideFileIconsCheckbox.toolTipText"));
      content.add(hideFileIconsCheckbox, "cell 1 5");

      //---- enablePSIIconsIcon2 ----
      enablePSIIconsIcon2.setIcon(new ImageIcon(getClass().getResource("/icons/settings/folderOpen@2x.png")));
      content.add(enablePSIIconsIcon2, "cell 0 6");

      //---- hollowFoldersCheckbox ----
      hollowFoldersCheckbox.setText(bundle.getString("SettingsForm.hollowFoldersCheckbox.text"));
      hollowFoldersCheckbox.setToolTipText(bundle.getString("SettingsForm.hollowFoldersCheckbox.toolTipText"));
      content.add(hollowFoldersCheckbox, "cell 1 6");

      //---- arrowsStyleLabel ----
      arrowsStyleLabel.setText(bundle.getString("SettingsForm.arrowsStyleLabel.text"));
      arrowsStyleLabel.setToolTipText(bundle.getString("SettingsForm.arrowsStyleLabel.toolTipText"));
      content.add(arrowsStyleLabel, "pad 0,cell 1 7,aligny center,grow 100 0");

      //---- arrowsStyleComboBox ----
      arrowsStyleComboBox.setToolTipText(bundle.getString("SettingsForm.arrowsStyleComboBox.toolTipText"));
      content.add(arrowsStyleComboBox, "cell 2 7,align right center,grow 0 0,width 120:120:120");
    }
    // JFormDesigner - End of component initialization  //GEN-END:initComponents

    // Arrows
    arrowsStyleComboBox.setModel(new DefaultComboBoxModel<>(ArrowsStyles.values()));
    arrowsStyleComboBox.setRenderer(new ListCellRendererWrapper<ArrowsStyles>() {
      @Override
      public void customize(final JList list, final ArrowsStyles value, final int index, final boolean selected, final boolean hasFocus) {
        final Icon baseIcon;
        if (value == null) {
          return;
        }
        baseIcon = value.getIcon();
        setIcon(baseIcon);
      }
    });
  }

  @SuppressWarnings("unused")
  private void monochromeCheckboxStateChanged(final ChangeEvent e) {
    monoColorChooser.setEnabled(monochromeCheckbox.isEnabled());
  }

  @Override
  public void init() {

  }

  public void setFormState(final AtomFileIconsConfig config) {
    setIsEnabledIcons(config.isEnabledIcons());
    setIsEnabledDirectories(config.isEnabledDirectories());
    setIsEnabledMonochromeIcons(config.isMonochromeIcons());
    setIsEnabledUIIcons(config.isEnabledUIIcons());
    setMonochromeColor(config.getMonochromeColor());
    setIsEnabledPsiIcons(config.isEnabledPsiIcons());
    setIsHiddenFileIcons(config.isHideFileIcons());
    setIsHollowFoldersEnabled(config.isUseHollowFolders());
    setArrowsStyle(config.getArrowsStyle());

    afterStateSet();
  }

  public boolean isModified(final AtomFileIconsConfig config) {

    boolean modified = config.isEnabledIconsChanged(getIsEnabledIcons());
    modified = modified || config.isEnabledDirectoriesChanged(getIsEnabledDirectories());
    modified = modified || config.isMonochromeIconsChanged(getIsEnabledMonochromeIcons());
    modified = modified || config.isEnabledUIIconsChanged(getIsEnabledUIIcons());
    modified = modified || config.isMonochromeColorChanged(getMonochromeColor());
    modified = modified || config.isEnabledPsiIconsChanged(getIsEnabledPsiIcons());
    modified = modified || config.isHideFileIconsChanged(getIsHiddenFileIcons());
    modified = modified || config.isUseHollowFoldersChanged(getIsHollowFoldersEnabled());
    modified = modified || config.isArrowsStyleChanged(getArrowsStyle());

    return modified;
  }

  @Override
  public JComponent getContent() {
    return content;
  }

  @Override
  public void afterStateSet() {

  }

  @Override
  public void dispose() {

  }

  //region File Icons
  public boolean getIsEnabledIcons() {
    return enableFileIconsCheckbox.isSelected();
  }

  private void setIsEnabledIcons(final boolean enabledIcons) {
    enableFileIconsCheckbox.setSelected(enabledIcons);
  }
  //endregion

  //region Directory Icons
  public boolean getIsEnabledDirectories() {
    return enableDirectoryIconsCheckbox.isSelected();
  }

  private void setIsEnabledDirectories(final boolean enabledDirectories) {
    enableDirectoryIconsCheckbox.setSelected(enabledDirectories);
  }
  //endregion

  //region Monochrome Icons
  public boolean getIsEnabledMonochromeIcons() {
    return monochromeCheckbox.isSelected();
  }

  private void setIsEnabledMonochromeIcons(final boolean isEnabledMonochromeIcons) {
    monochromeCheckbox.setSelected(isEnabledMonochromeIcons);
  }
  //endregion

  //region UI Icons
  public boolean getIsEnabledUIIcons() {
    return enableUIIconsCheckbox.isSelected();
  }

  private void setIsEnabledUIIcons(final boolean enabledUIIcons) {
    enableUIIconsCheckbox.setSelected(enabledUIIcons);
  }
  //endregion

  //region mono color
  public String getMonochromeColor() {
    return ColorUtil.toHex(Objects.requireNonNull(monoColorChooser.getSelectedColor()));
  }

  private void setMonochromeColor(final String color) {
    monoColorChooser.setSelectedColor(ColorUtil.fromHex(color));
  }
  //endregion

  //region psi Icons
  public boolean getIsEnabledPsiIcons() {
    return enablePSIIconsCheckbox.isSelected();
  }

  private void setIsEnabledPsiIcons(final boolean enabledPsiIcons) {
    enablePSIIconsCheckbox.setSelected(enabledPsiIcons);
  }
  //endregion

  //region hidden file icons
  public boolean getIsHiddenFileIcons() {
    return hideFileIconsCheckbox.isSelected();
  }

  @SuppressWarnings("NegativelyNamedBooleanVariable")
  private void setIsHiddenFileIcons(final boolean isHiddenFileIcons) {
    hideFileIconsCheckbox.setSelected(isHiddenFileIcons);
  }
  //endregion

  //region hollow folders
  public boolean getIsHollowFoldersEnabled() {
    return hollowFoldersCheckbox.isSelected();
  }

  private void setIsHollowFoldersEnabled(final boolean isHollowFoldersEnabled) {
    hollowFoldersCheckbox.setSelected(isHollowFoldersEnabled);
  }
  //endregion

  //region arrows styles
  public ArrowsStyles getArrowsStyle() {
    return (ArrowsStyles) arrowsStyleComboBox.getSelectedItem();
  }

  private void setArrowsStyle(final ArrowsStyles arrowsStyle) {
    arrowsStyleComboBox.setSelectedItem(arrowsStyle);
  }
  //endregion
}
