package com.example.todo_app;

public class Task {
    public int id;
    public boolean completed;
    public  String name;

    public Task(int id, String name, boolean completed) {
        this.id = id;
        this.name = name;
        this.completed = completed;
    }
}
