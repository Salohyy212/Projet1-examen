import lombok.Getter;

@Getter
public class Affirmation {
    private final String text;
    private final String status;

    public Affirmation(String text, String status){
        this.text=text;
        this.status=status;
    }
}
