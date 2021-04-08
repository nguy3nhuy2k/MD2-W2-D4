package Book;

import java.util.Scanner;

public class mainBook {
    public static void main(String[] args) {
        ProgrammingBook[] listBook = new ProgrammingBook[10];
        listBook[0] = new ProgrammingBook("book1",11,"java");
        listBook[1] = new ProgrammingBook("book2",12,"java2");
        listBook[2] = new ProgrammingBook("book3",13,"java");
        listBook[3] = new ProgrammingBook("book4",14,"java2");
        listBook[4] = new ProgrammingBook("book5",15,"java");
        listBook[5] = new ProgrammingBook("book6",16,"java2");
        listBook[6] = new ProgrammingBook("book7",17,"java");
        listBook[7] = new ProgrammingBook("book8",18,"java2");
        listBook[8] = new ProgrammingBook("book9",19,"java");
        listBook[9] = new ProgrammingBook("book10",20,"java2");

        System.out.println("tong tien 10 quyen sach la :" + isPrice(listBook));
        isLanguage(listBook);
        isTestMoney(listBook);

    }
        public static int isPrice(ProgrammingBook[] listBook){
            int total = 0;
            for (int i = 0; i < listBook.length; i++) {
                total += listBook[i].getPrice();

            }
            return total;
    }
        public static void isLanguage(ProgrammingBook[] listBook){
        int count = 0;

            for (int i = 0; i < listBook.length ; i++) {
                    if(listBook[i].getLanguage() == "java")
                        count++;
            }
            System.out.println("so sach co language la java = " + count++);
        }
        public static void isTestMoney(ProgrammingBook[] listBook){
            Scanner s = new Scanner(System.in);
            System.out.println("enter so tien : ");
            int moneybook = s.nextInt();
            for (int i = 0; i < listBook.length; i++) {
                if(listBook[i].getPrice() < moneybook)
                    System.out.println("quyen sach co so tien thap hon la : " + listBook[i].getName());
            }
        }

}
