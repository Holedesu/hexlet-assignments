@import exercise.dto.posts.PostPage;

@param PostPage page

@template.layout.page(
content = @`
    <div class="mx-auto p-4 py-md-5">
        <ul class="list-group">

            <li class="member-list">${page.getPost().getId()}  ${page.getPost().getName()}</li>
            <li class="member-list">${page.getPost().getBody()}</li>
        </ul>
    </div>
`
)