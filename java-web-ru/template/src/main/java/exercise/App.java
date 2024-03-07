package exercise;

import io.javalin.Javalin;
import java.util.List;
import io.javalin.http.NotFoundResponse;
import exercise.model.User;
import exercise.dto.users.UserPage;
import exercise.dto.users.UsersPage;
import java.util.Collections;
import java.util.Map;
import java.util.stream.Collectors;

public final class App {

    // Каждый пользователь представлен объектом класса User
    private static final List<User> USERS = Data.getUsers();



    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });

        // BEGIN
        app.get("/users", ctx -> {
            var users = new UsersPage(USERS);
            System.out.println(USERS);
            ctx.render("users/index.jte",  Collections.singletonMap("users", users));

        });

        app.get("/users/{id}", ctx -> {
            // Retrieve the user ID from the path parameter
            int userId = Integer.parseInt(ctx.pathParam("id"));
            User user = findUserById(userId);
            if (user != null) {
                UserPage userPage = new UserPage(user);
                ctx.render("users/show.jte", Collections.singletonMap("user", userPage));
            } else {
                ctx.status(404).result("User not found");
            }
        });
        // END

        app.get("/", ctx -> {
            ctx.render("index.jte");
        });

        return app;
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }

    private static User findUserById(int id) {
        for (User user : USERS) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
