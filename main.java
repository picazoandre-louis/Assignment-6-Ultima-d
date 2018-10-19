
public class Main {
    public static int worldTime = 0;
    //change worldTime value
    public static void main(String[] args) {
        System.out.printf("worldTime = " + worldTime);
        System.out.printf("\nIt is " + hour() + ":%02d on day " + day() + " of the year " + year() + ".", minutes());
        System.out.printf("\nTrammel is in day " + Trammel() + " of its 9 day phase." );
        System.out.printf("\nFelucca is in day " + Felucca() + " of its 14 day phase");


    }


      public static int year() {
          return (worldTime / (60 * 24 * 365)) + 1;
      }

      public static int day() {
          int exminutes = worldTime % (60 * 24 * 365);
          return (exminutes / (60 * 24)) + 1;
      }

      public static int hour() {
          int exminutes = ((worldTime % (60 * 24 * 365)) % (60 * 24));
          return (exminutes / 60);
      }

      public static int minutes() {
          int exminutes = ((worldTime % (60 * 24 * 365)) % (60 * 24));
          return (exminutes % 60);
      }

      public static int Felucca() {
          return ((worldTime / (60 * 24)) + 1) % 14;

      }

      public static int Trammel() {
          return ((worldTime / (60 * 24)) + 1) % 9;
      }
    }
