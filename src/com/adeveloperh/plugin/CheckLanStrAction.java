package com.adeveloperh.plugin;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.Messages;

public class CheckLanStrAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        Messages.showMessageDialog(com.adeveloperh.plugin.CheckAndroidStrings.startCheck(), "Result", Messages.getInformationIcon());
    }
}
