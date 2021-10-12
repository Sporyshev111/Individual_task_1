package com.company;
import java.util.Scanner;

public class Main {
    public enum Stroy{
        G, GU
    }


    public static class Geography {

         Scanner scanner = new Scanner(System.in);
         String gosudarstvo = scanner.nextLine();
         String stoliza = scanner.nextLine();

         int naselenie = scanner.nextInt();
         int stroy = scanner.nextInt();



        public Geography(String gosudarstvo, String stoliza, int naselenie, int stroy) {

            this.gosudarstvo = gosudarstvo;
            this.stoliza = stoliza;
            this.naselenie = naselenie;
            this.stroy = stroy;
        }

        public Geography() {

        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();

        Geography[] countries = new Geography[n];
for(int i = 0; i < n;i++) {
    System.out.println("Введите данные певой страны: 1)Гос, 2)Стол, 3)Нас, 4)Строй 1-G|0-GU");
    Geography g1 = new Geography();
   countries[i]= g1;
//    System.out.println("Введите данные второй страны: 1)Гос, 2)Стол, 3)Нас, 4)Строй 1-G|0-GU ");
//    Geography g2 = new Geography();
//    System.out.println("Введите данные третьей страны: 1)Гос, 2)Стол, 3)Нас, 4)Строй 1-G|0-GU");
//    Geography g3 = new Geography();
//    System.out.println("Введите данные четвертой страны: 1)Гос, 2)Стол, 3)Нас, 4)Строй 1-G|0-GU ");
//    Geography g4 = new Geography();
}








       for (int i = 0; i < countries.length; i++)
       { switch (countries[i].stroy) {
           case 1:
           {
               Stroy stroy = Stroy.G;
               System.out.println("Государство: "+countries[i].gosudarstvo+"| Столица: "+countries[i].stoliza+"| Население: "+countries[i].naselenie+"| Сторой: "+stroy);
               break;
           }

           case 0:
           {
               Stroy stroy1 = Stroy.GU;
               System.out.println("Государство: "+countries[i].gosudarstvo+"| Столица: "+countries[i].stoliza+"| Население: "+countries[i].naselenie+"| Сторой: "+stroy1);
               break;
           }
           default:
           {
               System.out.println("Строя нет");
           }

       }


           }


       }


}
