public class Main {
    public static void main(String[] args)
    {
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;

        System.out.println("Dog"+" = "+dog);
        System.out.println("Сat"+" = "+cat);
        System.out.println("Paper"+" = "+paper);

        System.out.println("     ");

        dog = dog+4;
        cat = cat+4;
        paper = paper+4;

        System.out.println("Dog"+" = "+dog);
        System.out.println("Сat"+" = "+cat);
        System.out.println("Paper"+" = "+paper);

        System.out.println("     ");
        dog = (int) (dog-3.5);
        cat = cat-1.6;
        paper = paper-7639;

        System.out.println("Dog"+" = "+dog);
        System.out.println("Сat"+" = "+cat);
        System.out.println("Paper"+" = "+paper);

        var sport1 = 78.2;
        var sport2 = 82.7;
        var common = sport1+sport2;
        var common2 = sport2-sport1;
        var common3 = sport2%sport1;
        System.out.println("     ");

        System.out.println("Общее кол-во = "+ common);
        System.out.println("Разница между бойцами = "+ common2);
        System.out.println("Остаток от деления = "+ common3);

        System.out.println("     ");
        var employeeCom = 640/8;

        System.out.println("Колличество сотрудников = "+employeeCom);

        var CommonFinish =  (employeeCom+94)*8;

        System.out.println("Всего часов = "+CommonFinish);
    }
}