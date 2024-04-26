package exercise.controller;

import static io.javalin.rendering.template.TemplateUtil.model;
import java.util.stream.Collectors;

import exercise.dto.posts.PostsPage;
import exercise.dto.posts.PostPage;
import exercise.repository.PostRepository;

import exercise.util.NamedRoutes;
import io.javalin.http.Context;
import io.javalin.http.NotFoundResponse;

public class PostsController {

    // BEGIN
    public static void index(Context ctx) {
        var page = ctx.queryParamAsClass("page", Integer.class).getOrDefault(1);
        var per = ctx.queryParamAsClass("per", Integer.class).getOrDefault(5);
        var users = PostRepository.getEntities().stream()
                .skip((long) (page - 1) * per)
                .limit(per)
                .collect(Collectors.toList());
//        var users = PostRepository.getEntities();
        var result = new PostsPage(users, page);



        ctx.render(NamedRoutes.postsPath() + "/" +  "index.jte", model("page", result));
    }

    public static void show(Context ctx) {
        var id = ctx.pathParamAsClass("id", Long.class).get();
        try {
            var post = PostRepository.find(id).get();
            var page = new PostPage(post);
            ctx.render(NamedRoutes.postsPath() + "/" + "show.jte", model("page", page));
        } catch (Exception e) {
            throw new NotFoundResponse();
        }
    }
    // END
}
