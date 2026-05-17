package vehicle;

import java.io.IOException;
import java.util.Scanner;

public class Vehicle {
     public String name;
     private int price;
     private int weight;
     private int width;

     Vehicle() throws IOException {
          setVehicle();
     }

     public void Print(){
         System.out.println("F1팀 이름 : "+name);
     }

     public void setVehicle() throws IOException {
          String[] teams = {
                  "Mercedes","Ferrari","Aston Martin","Audi","Redbull","Haas","Williams","McLaren"
          };

          StringBuilder teamStr = new StringBuilder();
          for (int i =0;i<teams.length;i++){
               teamStr.append(" "+(int) (i + 1)).append(". "+teams[i]);
          }

          System.out.println(" 팀 이름 입력하세요: "+teamStr);
          Scanner sc = new Scanner(System.in);
          name = sc.nextLine();


     }


     public int getPrice() {
          return price;
     }

     public void setPrice(int price) {
          this.price = price;
     }

     public int getWeight() {
          return weight;
     }

     public void setWeight(int weight) {
          this.weight = weight;
     }

     public int getWidth() {
          return width;
     }

     public void setWidth(int width) {
          this.width = width;
     }
}
