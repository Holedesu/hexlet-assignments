@import exercise.dto.articles.BuildArticlePage
@param BuildArticlePage page
<%--@import exercise.dto.articles.ArticlesPage--%>
<%--@param ArticlesPage page--%>

@template.layout.page(
    content = @`
        @if(page.getErrors() != null)
            <ul>
                @for(var validator : page.getErrors().values())
                    @for(var error : validator)
                        <li>${error.getMessage()}</li>
                    @endfor
                @endfor
            </ul>
        @endif
        <form action="/articles" method="post">
            <div>
                <label>
                    Title
                    <input type="text" required name="title" value="${page.getTitle()}"/>

                </label>
            </div>
            <div>
                <label>
                    Text Area
                    <textarea required name="textarea">${page.getTextArea()}</textarea>
                </label>
            </div>
            <input type="submit" value="Зарегистрировать" />

        </form>
        )
    `)