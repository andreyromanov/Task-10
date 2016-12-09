

package chel;

import java.util.Scanner;



public class Chel {
   private String Name = new String();
   private String Height = new String();
    
    public static void  Molodoi() {
      System.out.println("Введите имя ");
      Scanner in = new Scanner(System.in);
      String Name = in.next();
      
      System.out.println("Введите рост ");
      String Height = in.next();
      System.out.println("Ваше имя "+Name);
      System.out.println("Ваш рост "+Height);
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the Height
     */
    public String getHeight() {
        return Height;
    }

    /**
     * @param Height the Height to set
     */
    public void setHeight(String Height) {
        this.Height = Height;
    }
  public static void main(String[] args) {
      Molodoi();
  }  
}
