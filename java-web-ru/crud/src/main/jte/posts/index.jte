@import exercise.dto.posts.PostsPage
@import exercise.model.Post
@import exercise.util.NamedRoutes

@param PostsPage page

@template.layout.page(

    content = @`
        <div class="mx-auto p-4 py-md-5">
            <ul class="list-group">
                @for (Post post : page.getPosts())
                    <li class="member-list"><a href="${NamedRoutes.postPath(post.getId())}">${post.getName()}</a></li>
                @endfor

                <%--                <p>current page: ${}</p>--%>
                @if(page.getCurrentPage() + 1 < 8)
                    <p><a href="?page=${page.getCurrentPage() + 1}">next page</a></p>
                @endif
                <p> current page: ${page.getCurrentPage()}</p>
                @if(page.getCurrentPage() -1 > 0)
                    <p><a href="?page=${page.getCurrentPage() - 1}">previous page</a></p>
                @endif
            </ul>
        </div>
    `
)