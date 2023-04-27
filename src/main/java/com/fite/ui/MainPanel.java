package com.fite.ui;



import com.fite.main.IDataManager;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JPanel{

    private JPanel _taskPanel;
    private IDataManager _dataManager;
    int _count = 0;

    public MainPanel(IDataManager dataManagerr){
        super();
        _dataManager = dataManagerr;
        _taskPanel = new TaskPanel(_dataManager.getTaskList(), _dataManager);

        setBorder(BorderFactory.createEmptyBorder(30, 30, 100, 30));
        setLayout(new GridLayout(0, 1));
        add(_taskPanel);

        _dataManager.registerUIComponent("MainPanel", this);
    }

}
