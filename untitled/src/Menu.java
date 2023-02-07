import java.util.Scanner;

public class Menu {
    private int option;
    private Scanner sc;

    public Menu() {
        sc = new Scanner(System.in);
    }
    public void displayMenu() {
        option = 0;
        while (option != 3) {
            System.out.println("Menu:");
            System.out.println("1. Что вас интересует?");
            System.out.println("2. Вывести список всех книг");
            System.out.println("3. Выход");
            System.out.print("Enter your choice: ");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Что вас интересует?");
                    int option2 = 0;
                    while (option2 != 6) {
                        System.out.println("1. Жанр");
                        System.out.println("2. Цена");
                        System.out.println("3. Количество книг");
                        System.out.println("4. Год");
                        System.out.println("5. Язык");
                        System.out.println("6. Выход");
                        option2 = sc.nextInt();
                        switch (option2) {
                            case 1:
                                System.out.println("1. Romance");
                                System.out.println("2. Manga");
                                System.out.println("3. IT");
                                System.out.println("4. Psychology");
                                System.out.println("5. Fantastic");
                                int genre = 0;
                                genre = sc.nextInt();
                                switch (genre)
                                    {
                                        case 1:
                                            UsingDataBase romance = new Romance();
                                            romance.GetAllBooks();
                                            System.out.println("Какую книжку хотите купить?");
                                            romance.SelectOneBook();
                                            System.out.println("Спасибо за покупку!");
                                            System.out.println("-----------------------------------------------------");
                                            break;
                                        case 2:
                                            UsingDataBase manga = new Manga();
                                            manga.GetAllBooks();
                                            System.out.println("Какую книжку хотите купить?");
                                            manga.SelectOneBook();
                                            System.out.println("Спасибо за покупку!");
                                            System.out.println("-----------------------------------------------------");
                                            break;
                                        case 3:
                                            UsingDataBase it = new IT();
                                            it.GetAllBooks();
                                            System.out.println("Какую книжку хотите купить?");
                                            it.SelectOneBook();
                                            System.out.println("Спасибо за покупку!");
                                            System.out.println("-----------------------------------------------------");
                                            break;
                                        case 4:
                                            UsingDataBase psychology = new Psychology();
                                            psychology.GetAllBooks();
                                            System.out.println("Какую книжку хотите купить?");
                                            psychology.SelectOneBook();
                                            System.out.println("Спасибо за покупку!");
                                            System.out.println("-----------------------------------------------------");
                                            break;
                                        case 5:
                                            UsingDataBase fantastic = new Fantastic();
                                            fantastic.GetAllBooks();
                                            System.out.println("Какую книжку хотите купить?");
                                            fantastic.SelectOneBook();
                                            System.out.println("Спасибо за покупку!");
                                            System.out.println("-----------------------------------------------------");
                                            break;
                                    }
                                break;
                            case 2:
                                System.out.println("1. 2500");
                                System.out.println("2. 4000");
                                System.out.println("3. 5000");
                                System.out.println("4. 7000");
                                System.out.println("5. 10000");
                                int prise = 0;
                                prise = sc.nextInt();
                                UsingDataBase romance = new Romance();
                                UsingDataBase manga = new Manga();
                                UsingDataBase IT = new IT();
                                UsingDataBase psychology = new Psychology();
                                UsingDataBase Fantastic = new Fantastic();
                                UsingDataBase usingDataBase = new UsingDataBase();
                                switch (prise)
                                {
                                    case 1:
                                        romance.GetBooksByPrice2500();
                                        psychology.GetBooksByPrice2500();
                                        manga.GetBooksByPrice2500();
                                        IT.GetBooksByPrice2500();
                                        Fantastic.GetBooksByPrice2500();
                                        romance.SelectOneBook();
                                        psychology.SelectOneBook();
                                        manga.SelectOneBook();
                                        IT.SelectOneBook();
                                        Fantastic.SelectOneBook();
                                        break;
                                    case 2:
                                        romance.GetBooksByPrice4000();
                                        psychology.GetBooksByPrice4000();
                                        manga.GetBooksByPrice4000();
                                        IT.GetBooksByPrice4000();
                                        Fantastic.GetBooksByPrice4000();romance.SelectOneBook();
                                        psychology.SelectOneBook();
                                        manga.SelectOneBook();
                                        IT.SelectOneBook();
                                        Fantastic.SelectOneBook();

                                        break;
                                    case 3:
                                        romance.GetBooksByPrice5000();
                                        psychology.GetBooksByPrice5000();
                                        manga.GetBooksByPrice5000();
                                        IT.GetBooksByPrice5000();
                                        Fantastic.GetBooksByPrice5000();
                                        romance.SelectOneBook();
                                        psychology.SelectOneBook();
                                        manga.SelectOneBook();
                                        IT.SelectOneBook();
                                        Fantastic.SelectOneBook();
                                        break;
                                    case 4:
                                        romance.GetBooksByPrice7000();
                                        psychology.GetBooksByPrice7000();
                                        manga.GetBooksByPrice7000();
                                        IT.GetBooksByPrice7000();
                                        Fantastic.GetBooksByPrice7000();
                                        romance.SelectOneBook();
                                        psychology.SelectOneBook();
                                        manga.SelectOneBook();
                                        IT.SelectOneBook();
                                        Fantastic.SelectOneBook();
                                        break;
                                    case 5:
                                        romance.GetBooksByPrice10000();
                                        psychology.GetBooksByPrice10000();
                                        manga.GetBooksByPrice10000();
                                        IT.GetBooksByPrice10000();
                                        Fantastic.GetBooksByPrice10000();
                                        romance.SelectOneBook();
                                        psychology.SelectOneBook();
                                        manga.SelectOneBook();
                                        IT.SelectOneBook();
                                        Fantastic.SelectOneBook();
                                        break;
                                }
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break;
                            case 6:
                                break;
                        }
                    }
                    break;
                case 2:
                    UsingDataBase romance = new Romance();
                    romance.GetAllBooks();
                    UsingDataBase psychology = new Psychology();
                    psychology.GetAllBooks();
                    UsingDataBase manga = new Manga();
                    manga.GetAllBooks();
                    UsingDataBase it = new IT();
                    it.GetAllBooks();
                    UsingDataBase fantastic = new Fantastic();
                    fantastic.GetAllBooks();
                    System.out.println("-----------------------------------------------------");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
