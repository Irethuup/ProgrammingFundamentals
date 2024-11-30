package ObjectsAndClassesExercises_WO5;

import java.util.Scanner;

class Articles_02 {
    private String title;
    private String content;
    private String author;

    public Articles_02(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit(String newContent) {
        this.content = newContent;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void rename(String newTitle) {
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return String.format("%s - %s: %s", this.title, this.content, this.author);
    }
}

public class Articles_02_Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] articleData = scanner.nextLine().split(", ");
        String title = articleData[0];
        String content = articleData[1];
        String author = articleData[2];

        Articles_02 article = new Articles_02(title, content, author);

        int commandsCount = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < commandsCount; i++) {
            String[] commandParts = scanner.nextLine().split(": ");
            String command = commandParts[0];
            String argument = commandParts[1];

            switch (command) {
                case "Edit":
                    article.edit(argument);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(argument);
                    break;
                case "Rename":
                    article.rename(argument);
                    break;
            }
        }

        System.out.println(article);
    }
}

