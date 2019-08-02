
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * @author vitthal.ashok
 */
public class UserPermissions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalUsers = Integer.parseInt(scanner.nextLine());

        LinkedList<User> users = new LinkedList<>();
        for (int i = 0; i <= totalUsers; i++) {
            User user = new User(i);
            user.setPermissions(scanner.nextLine().split(" "));
            users.add(i, user);
        }

        for (int i = 1; i <= totalUsers; i++) {
            //Assigning manager to user i
            String managerStr = scanner.nextLine();
            User user = users.get(i);
            User manager;
            if (managerStr.equals("CEO")) {
                manager = users.get(0);
                user.setManager(manager);
                continue;
            }

            if (!managerStr.chars().allMatch( Character::isDigit )) {
                System.err.println("Not an number");
                i--;
                continue;
            }

            int index = Integer.parseInt(managerStr);
            if (index <= 0 || index > totalUsers) {
                System.err.println("Invalid user id");
                i--;
                continue;
            }

            manager = users.get(Integer.parseInt(managerStr));
            user.setManager(manager);
        }

        System.out.println(users.toString());
    }

}


class User {
    private int id;
    private User manager;
    private String[] permissions;

    public User(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getManager() {
        return manager;
    }

    public void setManager(User manager) {
        manager.addPermissions(this.getPermissions());
        this.manager = manager;
    }

    public String[] getPermissions() {
        return permissions;
    }

    public void setPermissions(String[] permissions) {
        this.permissions = permissions;
    }

    private void addPermissions(String[] newPermissions) {
        List<String> permissionList = new ArrayList<>(Arrays.asList(this.getPermissions()));
        for(int i = 0; i < newPermissions.length; i++) {
            if (!permissionList.contains(newPermissions[i])) {
                permissionList.add(newPermissions[i]);
            }
        }

        this.setPermissions(
            permissionList.toArray(new String[permissionList.size()])
        );

        if (this.getManager() != null) {
            this.getManager().addPermissions(this.getPermissions());
        }

    }
}