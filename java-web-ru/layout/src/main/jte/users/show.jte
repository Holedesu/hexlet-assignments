@import exercise.dto.users.UsersPage
@import exercise.dto.users.UserPage
@import gg.jte.Content

@param UserPage user

@template.layout.page(content = @`
    <div class="card">
        <div class="card-header">
            <h5 class="card-title">${user.getUser().getFirstName()}</h5>
        </div>
        <div class="card-body">
            <ul class="list-group">
                <li class="list-group-item">Имя: ${user.getUser().getFirstName()}</li>
                <li class="list-group-item">Фамилия: ${user.getUser().getLastName()}</li>
                <li class="list-group-item">Email: ${user.getUser().getEmail()}</li>
            </ul>
        </div>
    </div>
`)
