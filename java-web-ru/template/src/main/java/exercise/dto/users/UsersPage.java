package exercise.dto.users;

import exercise.model.User;
import java.util.List;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

// BEGIN

@Data
@AllArgsConstructor
@Getter
public class UsersPage {
    private List<User> users;
}
// END
