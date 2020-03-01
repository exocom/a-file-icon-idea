package com.mallowigi.config;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.project.Project;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;

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

    public static UserConfig getInstance(@NotNull Project project) {
        return ServiceManager.getService(project, UserConfig.class);
    }
}
