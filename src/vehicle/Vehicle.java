package vehicle;

import java.io.IOException;
import java.util.Scanner;

public class Vehicle {
     public String name;
     int points;
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


}
