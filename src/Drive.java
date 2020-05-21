import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Drive {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose Speed: 40km, 80km, 100km, 200km");
        System.out.print("Choose: ");
        String speed = scanner.next();

        switch(speed){
            case "40" :
                System.out.println("Too Slow");
                break;
            case "80":
                System.out.println("Thats fine");
                break;
            case "100":
                System.out.println("Slow Down a bit");
            case "200":
                System.out.println("Thats too Fast!!!");
            default:
                System.out.println("Thats not in the list");
                if(speed.equals("200")) {
                    System.out.println("Are you drunk or something?!!??");
            }
        }
    }
}