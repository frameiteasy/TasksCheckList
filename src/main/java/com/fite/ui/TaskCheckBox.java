package com.fite.ui;

import com.fite.main.IDataManager;
import com.fite.main.Task;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TaskCheckBox  extends JCheckBox implements ItemListener {

    private Task _task;
    private IDataManager _dataManager;

    public TaskCheckBox(Task task, IDataManager IDataManager){
        _dataManager = IDataManager;
        _task = task;
        setText(_task.getTaskName());
        setSelected(_task.getTaskDone());
        addItemListener(this);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        _task.setTaskDone(!_task.getTaskDone());
        _dataManager.updateUIComponents();
    }
}
