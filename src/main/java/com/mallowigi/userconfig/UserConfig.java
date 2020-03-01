package com.mallowigi.userconfig;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import com.mallowigi.userconfig.ui.SettingsForm;

@State(
        name = "AtomFileIconsUserConfig",
        storages = @Storage("a-file-icons-user.xml")
)
public class UserConfig implements PersistentStateComponent<UserConfig> {
    public String stateValue;

    public UserConfig getState() {
        return this;
    }

    public void loadState(UserConfig state) {
        XmlSerializerUtil.copyBean(state, this);
    }

    public static UserConfig getInstance() {
        return ServiceManager.getService(UserConfig.class);
    }

//    public static UserConfig getInstance(@NotNull Project project) {
//        return ServiceManager.getService(project, UserConfig.class);
//    }

    void applySettings(final SettingsForm form) {
    }
}
