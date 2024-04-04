@import exercise.dto.users.UsersPage
@param UsersPage users


@template.layout.page(content = @`

    <div class="card">
        <div class="card-header">
            <h5 class="card-title">Пользователи</h5>
        </div>
        <div class="card-body">
        <ul class="list-group">
            <li class="list-group-item">
                <a href="/users">${users.getUsers().size()}</a>--%>
<%--                @for(var userInfo : users.getUsers())--%>
<%--                    @if(userInfo != null)--%>
<%--                        <a href="/users/${userInfo.getId()}">${userInfo.getFirstName()} ${userInfo.getLastName()}</a>--%>
<%--                    @endif--%>
<%--                @endfor--%>
            </li>
        </ul>
        </div>
    </div>`)


