package com.fite.main;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileTasksListReader implements ITasksListReader{

    private final InputStream fileStream = getClass().getClassLoader().getResourceAsStream("taskslist.txt");

    @Override
    public List<Task> getTasksList() {
        List<Task> tasksList = new ArrayList<Task>();
        InputStreamReader streamReader;
        BufferedReader reader;

        try {
            streamReader = new InputStreamReader(fileStream, StandardCharsets.UTF_8);
            reader = new BufferedReader(streamReader);
            String line = reader.readLine();

            while (line != null) {
                tasksList.add(new Task(line, false));
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return tasksList;
    }

}
