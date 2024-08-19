package helpers;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties",
        "system:env",
        "file:src/main/resources/conf.properties"
})
public interface ConfProperties extends Config {
    @Config.Key("url")
    String url();

    @Config.Key("login")
    String login();

    @Config.Key("password")
    String password();
}
