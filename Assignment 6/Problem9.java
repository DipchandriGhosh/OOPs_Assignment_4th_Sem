// Create an interface called Player. The interface has an abstract method called play() that displays a
// message describing the meaning of “play” to the class. Create classes called Child, Musician, and
// Actor that all implement Player. Create an application that demonstrates the use of the
// classes(UsePlayer.java

// Player interface
interface Player {
    void play();
}

// Child class implementing Player interface
class Child implements Player {
    @Override
    public void play() {
        System.out.println("Child plays with toys.");
    }
}

// Musician class implementing Player interface
class Musician implements Player {
    @Override
    public void play() {
        System.out.println("Musician plays an instrument.");
    }
}

// Actor class implementing Player interface
class Actor implements Player {
    @Override
    public void play() {
        System.out.println("Actor plays a character on stage or screen.");
    }
}

// UsePlayer application
public class Problem9 {
    public static void main(String[] args) {
        // Create objects of Child, Musician, and Actor classes
        Player child = new Child();
        Player musician = new Musician();
        Player actor = new Actor();

        // Demonstrate the use of the classes
        System.out.print("Child: ");
        child.play(); // Output: Child plays with toys.

        System.out.print("Musician: ");
        musician.play(); // Output: Musician plays an instrument.

        System.out.print("Actor: ");
        actor.play(); // Output: Actor plays a character on stage or screen.
    }
}
