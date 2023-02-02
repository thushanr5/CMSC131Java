public class MarvelBoard{
    public static void main(String[]args){
        //Creaing 3 Marvel Character Objects
        MarvelVerse Spiderman = new MarvelVerse("Spiderman","webs",'N',150,45, 75);
        MarvelVerse Thor = new MarvelVerse("Thor","Lightning",'Y',220,50,51);
        MarvelVerse Thanos = new MarvelVerse("Thanos","GemStones",'N',500,90,30);

        //Creating 3 DC Character Objects
        DC Flash = new DC("Flash", "speed", 'N',150,40, Integer.MAX_VALUE);
        DC Batman = new DC("Batman","Flight",'Y',300,50,200);
        DC LexLuthor = new DC("LexLuthor","Tool",'N',200,150,Integer.MIN_VALUE);


        //Calling Marvel Characters
        System.out.println("This is " + Spiderman.getName() + "\n");
        System.out.println("This is " + Thanos.getName() + "\n");
        System.out.println("This is " + Thanos.getName() + "\n");

        System.out.println("-----------------" + "\n");

        //Call DC Characters
       System.out.println("This is " + Flash.getName());
       System.out.println("This is " + Batman.getName());
       System.out.println("This is " + LexLuthor.getName());
       System.out.println("Flyable State: " + Flash.getFlyable());
       System.out.println(Flash.nameOfCharacter);


    }
}
