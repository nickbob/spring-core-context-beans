package ru.nickbob.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import ru.nickbob.interfaces.Environment;

@Component
@Scope("prototype")
public class Context {
    private Environment environment;
    private String system;
    private String name;

    @Autowired
    public Context(LinuxEnv linuxEnv, WindowsEnv windowsEnv, @Value("${config.system}") String system,
            @Value("${config.name}") String name) {

        if (system.equals("linux")) {
            this.environment = linuxEnv;
            this.system = system;
            this.name = name;
        } else if (system.equals("windows")) {
            this.environment = windowsEnv;
            this.system = system;
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return "Context instance=" + environment + "\nname=" + name + "\nsystem=" + system + "";
    }

    @PostConstruct
    public void initContext() {
        System.out.println(">>> Initialization Context bean\n");
    }

    @PreDestroy
    public void destroyContext() {
        System.out.println("\n<<< Destroy Context bean");
    }

}