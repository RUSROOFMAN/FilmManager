import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    public void testListRevealing() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addOneMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("FILM I");
        String[] expected = {"FILM I"};

        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addThreeMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("FILM I");
        manager.addMovie("FILM II");
        manager.addMovie("FILM III");

        String[] expected = {"FILM I", "FILM II", "FILM III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addFiveMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("FILM I");
        manager.addMovie("FILM II");
        manager.addMovie("FILM III");
        manager.addMovie("FILM IV");
        manager.addMovie("FILM V");

        String[] expected = {"FILM I", "FILM II", "FILM III", "FILM IV", "FILM V"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastOneMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("FILM I");
        String[] expected = {"FILM I"};

        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastTheeMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("FILM I");
        manager.addMovie("FILM II");
        manager.addMovie("FILM III");

        String[] expected = {"FILM III", "FILM II", "FILM I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindLastFiveMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("FILM I");
        manager.addMovie("FILM II");
        manager.addMovie("FILM III");
        manager.addMovie("FILM IV");
        manager.addMovie("FILM V");

        String[] expected = {"FILM V", "FILM IV", "FILM III", "FILM II", "FILM I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void FindAllMovies() {
        MovieManager manager = new MovieManager();
        manager.addMovie("FILM I");
        manager.addMovie("FILM II");
        manager.addMovie("FILM III");

        String[] expected = {"FILM I", "FILM II", "FILM III"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void LimitFindLast() {
        MovieManager manager = new MovieManager(5);
        manager.addMovie("FILM I");
        manager.addMovie("FILM II");
        manager.addMovie("FILM III");
        manager.addMovie("FILM IV");
        manager.addMovie("FILM V");
        manager.addMovie("FILM VI");

        String[] expected = {"FILM VI","FILM V","FILM IV","FILM III","FILM II"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}