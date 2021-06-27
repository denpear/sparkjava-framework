package denpear;
import static spark.Spark.*;

/*await(await fetch ('/hello', {method:'POST'})).text()*/


public class Starter {
    public static void main (String[] args) {
        get("/", (req, res) -> "Hello World");
        post("/hello", (req, res) -> "Hello World");
    }
}
