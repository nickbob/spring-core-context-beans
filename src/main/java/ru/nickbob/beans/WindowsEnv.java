package ru.nickbob.beans;

import org.springframework.stereotype.Component;

import ru.nickbob.interfaces.Environment;

@Component
public class WindowsEnv implements Environment {

    @Override
    public String buildEnv() {
        return "SWITCH TO WINDOWS SYSTEM";
    }

}