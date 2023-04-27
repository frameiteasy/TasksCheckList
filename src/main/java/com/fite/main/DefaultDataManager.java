package com.fite.main;

import com.fite.ui.AppUI;
import com.fite.ui.TaskPanel;

import java.util.HashMap;

public class DefaultDataManager extends DataManager implements IDataManager {

    public DefaultDataManager() {
        if (_tasksList == null) {
            _tasksList = new TasksList();
        }
        if (_uiComponents == null) {
            _uiComponents = new HashMap<String, Object>();
        }
    }

    @Override
    public TasksList getTaskList() {
        return _tasksList;
    }

    @Override
    public void registerUIComponent(String name, Object component) {
        _uiComponents.put(name, component);
    }

    @Override
    public void updateUIComponents() {
        ((TaskPanel) _uiComponents.get("TaskPanel")).updateTaskPanel();
    }

    @Override
    public void closeApp() {
        ((AppUI) _uiComponents.get("AppUI")).closeApp();
    }
}
