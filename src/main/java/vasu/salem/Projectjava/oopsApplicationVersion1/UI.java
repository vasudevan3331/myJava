//package vasu.salem.Projectjava.oopsApplicationVersion1;
//
//import java.util.Date;
//import java.util.Scanner;
//
//public class UI {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        Organise org=new Organise();
//        String operation="";
//        do{
//            System.out.println("1.new\n2.enroll\n3.announce\n4.edit\n5.cancel\n6.view\n7.host\n8.date");
//            System.out.println("Choose operation ");
//            operation=scanner.next();
//            switch(operation){
//                case "new":
//                    System.out.println("Enter the new event details such as name, host and date(MM/DD/YYYY) ");
//                    Event eve=new Event(scanner.next(),scanner.next(),new Date(scanner.next()));
//                    System.out.println(org.schedule(eve));
//                    break;
//                case "enroll":
//                    System.out.println("Enter the event name and person wish to enroll");
//                    System.out.println(org.enroll(scanner.next(), scanner.next()));
//                    break;
//                case "announce":
//                    System.out.println("Enter the event name and winner name to declare ");
//                    System.out.println(org.announce(scanner.next(), scanner.next()));
//                    break;
//                case "edit":
//                    System.out.println("Enter the event details to edit such as name, host and date(MM/DD/YYYY)  ");
//                    Event ev=new Event(scanner.next(),scanner.next(),new Date(scanner.next()));
//                    org.update(ev);
//                    break;
//                case "cancel":
//                    System.out.println("Enter the event name to cancel");
//                    org.cancel(scanner.next());
//                    break;
//                case "view":
//                    System.out.println("Viewing all the event in the record");
//                    org.listEvents();
//                    break;
//                case "host":
//                    System.out.println("Viewing the events in the record by host department");
//                    org.listBy(scanner.next());
//                    break;
//                case "date":
//                    System.out.println("viewing the events by date of held");
//                    org.listBy(new Date(scanner.next()));
//                    break;
//                default:
//                    System.out.println("Option doesn't match. Thanks");
//                    return;
//            }
//        }while(true);
//    }
//}
//
