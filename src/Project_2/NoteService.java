package Project_2;

public class NoteService {

    protected static void changeNoteName(Note note) throws EmptyNoteNameException{
        System.out.println("Введите новое название:");
        String name = Main.SCANNER.nextLine();
        if ("".equals(name)) {
            name = Main.SCANNER.nextLine();
        }
        if ("".equals(name)){
            throw new EmptyNoteNameException("Название заметки не может быть пустым.");
        }
        note.setName(name);
        System.out.println("Готово.");
    }

    protected static void changeNoteBody(Note note) {
        System.out.println("Введите новое содержание:");
        String body = Main.SCANNER.nextLine();
        if ("".equals(body)) {
            body = Main.SCANNER.nextLine();
        }
        note.setBody(body);
        System.out.println("Готово.");
    }

    protected static void changeNoteWord(Note note) {
        System.out.println("Какое слово Вы хотите заменить?");
        String oldWord = Main.SCANNER.nextLine();
        if ("".equals(oldWord)) {
            oldWord = Main.SCANNER.nextLine();
        }
        while (!note.getBody().contains(oldWord)) {
            System.out.println("Такого слова нет. Введите слово ещё раз:");
            oldWord = Main.SCANNER.nextLine();
        }

        System.out.println("На какое слово меняем?");
        String newWord = Main.SCANNER.nextLine();
        if ("".equals(newWord)) {
            newWord = Main.SCANNER.nextLine();
        }
        String newBody = note.getBody().replaceAll(oldWord, newWord);
        note.setBody(newBody);
        System.out.println("Готово.");
    }

    protected static void deleteNote(Note note) {
        Main.notes.remove(note);
    }

    protected static void createNote() throws EmptyNoteNameException{
        System.out.println("Выберите тип заметки:\n" +
                "1. Рецепты\n" +
                "2. Список дел\n" +
                "3. Список покупок");
        int input = Main.SCANNER.nextInt();
        Note note = null;

        switch (input) {
            case 1:
                note = new Recipe(Main.currentUser.getName());
                break;
            case 2:
                note = new ToDoList(Main.currentUser.getName());
                break;
            case 3:
                note = new ShoppingList(Main.currentUser.getName());
                break;
            default:
                System.out.println("Некорректный ввод");
                createNote();
        }

        System.out.println("Введите название заметки:");
        String name = Main.SCANNER.nextLine();
        if ("".equals(name)) {
            name = Main.SCANNER.nextLine();
        }

        if ("".equals(name)) {
            throw new EmptyNoteNameException("Название заметки не может быть пустым.");
        }
        note.setName(name);

        System.out.println("Напишите заметку:");
        String body = Main.SCANNER.nextLine();
        if ("".equals(body)) {
            body = Main.SCANNER.nextLine();
        }
        note.setBody(body);
        Main.notes.add(note);

        System.out.println("Заметка " + note.getName() + " создана.");
    }

    protected static Note searchNote(){
        System.out.println("Введите название заметки:");
        String name = Main.SCANNER.nextLine();
        if ("".equals(name)) {
            name = Main.SCANNER.nextLine();
        }
        Note resultNote = null;
        for (Note note : Main.notes) {
            if (name.equalsIgnoreCase(note.getName())) {
                resultNote = note;
                System.out.println(note);
            }
        }
        return resultNote;
    }
}
