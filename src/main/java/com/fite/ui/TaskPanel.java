package com.fite.ui;

import com.fite.main.IDataManager;
import com.fite.main.Task;
import com.fite.main.TasksList;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaskPanel extends JPanel implements ActionListener {

    private JButton _button;
    private JLabel _label;
    private TasksList _tasksList;
    private IDataManager _dataManager;

    public TaskPanel(TasksList tasksList, IDataManager dataManager){
        _dataManager = dataManager;

        setLayout(new GridLayout(0, 1));
        _tasksList = tasksList;
        for (Task task : _tasksList.getTasksList()) {
            add(new TaskCheckBox(task, _dataManager));
        }

        _label = new JLabel(getLabelText());
        add(_label);

        _button = new JButton("Potwierdź");
        _button.addActionListener(this);
        updateButton();
        add(_button);

        _dataManager.registerUIComponent("TaskPanel", this);
    }

    public void updateTaskPanel(){
        updateLabel();
        updateButton();
    }

    private String getLabelText(){
        return "Masz do wykonania: " + _tasksList.taskToDo();
    }

    private void updateLabel(){
        _label.setText(getLabelText());
    }

    private void updateButton(){
        if (_tasksList.taskToDo()>0) {
            _button.setEnabled(false);
        } else {
            _button.setEnabled(true);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        _dataManager.closeApp();
    }
}
