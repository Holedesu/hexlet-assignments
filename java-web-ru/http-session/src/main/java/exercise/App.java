package exercise;

import io.javalin.Javalin;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public final class App {

    private static final List<Map<String, String>> USERS = Data.getUsers();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        // BEGIN
        var users = app.get("/users", ctx -> {
            var page = ctx.queryParamAsClass("page", Integer.class).getOrDefault(1);
            var per = ctx.queryParamAsClass("per", Integer.class).getOrDefault(5);

            var result = USERS.stream()
                .skip((page - 1) * per)
                .limit(per)
                .collect(Collectors.toList());

            ctx.json(result);
        });


        // END

        return app;

    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
