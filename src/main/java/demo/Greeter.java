package demo;

import java.util.Random;

/** Synthetic demo code with deliberate issues for scan exploration. */
public class Greeter {

    // Hotspot: weak PRNG used for a token
    public String token() {
        return Long.toString(new Random().nextLong());
    }

    public String greet(String name) {
        if (name == null) {
            return "Hello";
        }
        return "Hello " + name;
    }

    // Code smell: duplicated logic
    public String greetFormal(String name) {
        if (name == null) {
            return "Good day";
        }
        return "Good day " + name;
    }

    // Bug: string compared with ==
    public boolean isAdmin(String role) {
        return role == "admin";
    }
}
