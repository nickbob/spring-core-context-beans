package ru.nickbob.beans;

import org.springframework.stereotype.Component;

import ru.nickbob.interfaces.Environment;

@Component
public class LinuxEnv implements Environment {

    @Override
    public String buildEnv() {
        return "SWITCH TO *NIX SYSTEM";
    }

}