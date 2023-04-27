package com.fite.ui;

import com.fite.main.IDataManager;

import javax.swing.*;
import java.awt.*;

public class AppUI  {
    private JDialog _frame;
    private MainPanel _panel;
    private IDataManager _dataManager;

    public AppUI(IDataManager dataManager){
        _dataManager = dataManager;
        _frame = new JDialog();
        _frame.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        _frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        _panel = new MainPanel(_dataManager);

        _frame.add(_panel, BorderLayout.CENTER);
        _frame.setTitle("Staś checklista");
        _frame.pack();
        _dataManager.registerUIComponent("AppUI", this);
        _frame.setVisible(true);
    }

    public void closeApp(){
        if (_dataManager.getTaskList().isTasksListDone()) {
            _frame.dispose();
        }
    }
}
