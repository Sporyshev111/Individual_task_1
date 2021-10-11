package com.company;
import java.util.Scanner;

public class Main {

    public static class Geography {

         Scanner scanner = new Scanner(System.in);
         String gosudarstvo = scanner.nextLine();
         String stoliza = scanner.nextLine();;
         String stroy = scanner.nextLine();;
         int naselenie = scanner.nextInt();;



        public Geography(String gosudarstvo, String stoliza, int naselenie, String stroy) {

            this.gosudarstvo = gosudarstvo;
            this.stoliza = stoliza;
            this.naselenie = naselenie;
            this.stroy = stroy;
        }

        public Geography() {

        }


    }

    public static void main(String[] args) {

        System.out.println("Введите данные певой страны: 1)Гос, 2)Стол, 3)Строй, 4)Нас ");
        Geography g1 = new Geography();
        System.out.println("Введите данные второй страны: 1)Гос, 2)Стол, 3)Строй, 4)Нас ");
        Geography g2 = new Geography();
        System.out.println("Введите данные третьей страны: 1)Гос, 2)Стол, 3)Строй, 4)Нас" );
        Geography g3 = new Geography();
        System.out.println("Введите данные четвертой страны: 1)Гос, 2)Стол, 3)Строй, 4)Нас ");
        Geography g4 = new Geography();






        Geography[] countries = {g1, g2, g3, g4};



       for (int i = 0; i < countries.length; i++)
            System.out.println("Государство: "+countries[i].gosudarstvo+"| Столица: "+countries[i].stoliza+"| Население: "+countries[i].naselenie+"| Сторой: "+countries[i].stroy);
    }
}
