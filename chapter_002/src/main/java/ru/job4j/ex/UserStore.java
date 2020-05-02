package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User reqired = null;
        for (int index = 0; index < users.length; index++) {
            if(users[index].getUsername().equals(login)) {
               reqired = users[index];
               break;
            }
        }
        if(reqired == null) {
           throw new UserNotFoundException("User " + login + " not found");
        }
        return reqired;
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("The user name must be longer than 3 characters!");
        }
        if(!user.isValid()) {
            throw new UserInvalidException("The user is not validated!");
        }
        return user.isValid();
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
           User user = findUser(users, "Ivan Ivanov");
           UserStore.validate(user);
        }
        catch (UserInvalidException iE) {
            iE.printStackTrace();
        }
        catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
