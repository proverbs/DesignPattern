package top.proverbs;

import top.proverbs.middleware.Middleware;
import top.proverbs.middleware.RoleCheckMiddleware;
import top.proverbs.middleware.ThrottlingMiddleware;
import top.proverbs.middleware.UserExistsMiddleware;
import top.proverbs.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * One of the most popular use cases for the pattern is bubbling events to the parent components in GUI classes.
 * Another notable use case is sequential access filters.
 * */
public class Main {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        // All checks are linked. Client can build various chains using the same
        // components.
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());

        // Server gets a chain from client code.
        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();

        boolean success;
        do {
            System.out.print("Enter email: ");
            String email = reader.readLine();
            System.out.print("Input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }
}
