package practice_2;

public class starTriangle {
    private int height;
    private Condition condition;

   
    public enum Condition {
        RIGHT, LEFT, MIDDLE
    }

    
    public starTriangle(Condition condition, int height) {
        this.condition = condition;
        this.height = height;
    }

    
    public String toString() {
        StringBuilder triangle = new StringBuilder();

        for (int i = 1; i <= height; i++) {
            // Add spaces based on the condition
            int spacesToAdd;
            int starsToAdd;

            switch (condition) {
                case RIGHT:
                    spacesToAdd = height - i;
                    starsToAdd = i;
                    break;
                case LEFT:
                    spacesToAdd = 0;
                    starsToAdd = i;
                    break;
                case MIDDLE:
                    spacesToAdd = height - i;
                    starsToAdd = 2 * i - 1;
                    break;
                default:
                    spacesToAdd = 0;
                    starsToAdd = 0;
            }

            // Add spaces
            for (int j = 1; j <= spacesToAdd; j++) {
                triangle.append(" ");
            }

            // Add '*' characters
            for (int j = 1; j <= starsToAdd; j++) {
                triangle.append("*");
            }

            // Add a newline character after each row
            triangle.append("\n");
        }

        return triangle.toString();
    }

    public static void main(String[] args) {
        // Create a StarTriangle object with custom condition and height
        starTriangle rightTriangle = new starTriangle(Condition.RIGHT, 12);
        starTriangle leftTriangle = new starTriangle(Condition.LEFT, 6);
        starTriangle middleTriangle = new starTriangle(Condition.MIDDLE, 3);

        // Print the string representation of the triangles
        System.out.println("Right-aligned Triangle:\n" + rightTriangle.toString());
        System.out.println("Left-aligned Triangle:\n" + leftTriangle.toString());
        System.out.println("Middle-aligned Triangle:\n" + middleTriangle.toString());
    }
}

