@import exercise.dto.users.UsersPage
@import exercise.model.User
@import gg.jte.Content

@param Content content = null
@param UsersPage users


@template.layout.page(content = @`

    <div class="card">
        <div class="card-header">
            <h5 class="card-title">Пользователи</h5>
        </div>
        <div class="card-body">
        <ul class="list-group">
            <li class="list-group-item">
                @for(var user : users.getUsers())
                    <li>${user.getFirstName()}</li>
                @endfor
            </li>
        </ul>
        </div>
    </div>`)


