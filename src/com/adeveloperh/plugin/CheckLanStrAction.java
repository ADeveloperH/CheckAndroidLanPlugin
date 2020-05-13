package com.adeveloperh.plugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.util.SystemIndependent;

public class CheckLanStrAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        Project project = e.getData(PlatformDataKeys.PROJECT);
        @SystemIndependent String basePath = project.getBasePath();
        CheckAndroidStrings.startCheck(basePath);
        Messages.showMessageDialog("check finished", "Result", Messages.getInformationIcon());
    }
}
