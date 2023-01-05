//package vasu.salem.Projectjava.oopsApplicationVersion1;
//
//import java.util.Date;
//
//public class Organise extends perform {
//    private Event[] evs=new Event[10];
//    public Organise(){
//        evs[0]=new Event("PiconetPPT22","CSE",new Date("12/31/2021"));
//        evs[1]=new Event("BotsShop22","Mech",new Date("01/07/2022"));
//        evs[2]=new Event("Sparks22","ECE",new Date("10/29/2022"));
//        evs[3]=new Event("Graze2022","EEE",new Date("9/20/2022"));
//        evs[4]=new Event("InfomatixPPT21","IT",new Date("4/19/2021"));
//        evs[5]=new Event("ToolTaught20","Mech",new Date("01/07/2020"));
//        evs[6]=new Event("Transformers20","ECE",new Date("10/29/2022"));
//    }
//    @Override
//    public String schedule(Event obj) {
//        for(int index=0;index<evs.length;index++){
//            if(evs[index]==null){
//                evs[index]=obj;
//                return obj.getEveName()+" has scheduled by "+obj.getEveHost();
//            }
//        }
//        return obj.getEveName()+" can't schedule";
//    }
//
//    @Override
//    public String enroll(String name, String person) {
//        for(int index=0;index<evs.length;index++){
//            //
//            if(evs[index]!=null&&evs[index].getEveName().equalsIgnoreCase(name)){
//                if(evs[index].getEveWinner()==null){
//                    String[] tmp=evs[index].getEvePart();
//                    for(int pos=0;pos<tmp.length;pos++){
//                        if(tmp[pos]==null){
//                            tmp[pos]=person;
//                            evs[index].setEvePart(tmp);// update new participant in existing
//                            return person+" has enrolled in "+name;
//                        }
//                    }
//                    return person+" hasn't enrolled due to registration is over";
//                }
//                else{
//                    return person+" can't enroll in "+name+" since event has held already";
//                }
//            }
//        }
//        return name+" doesn't found ";
//    }
//
//    @Override
//    public String announce(String name, String person) {
//        for(int index=0;index<evs.length;index++){
//            //
//            if(evs[index]!=null&&evs[index].getEveWinner()==null){
//                String[] tmp=evs[index].getEvePart();
//                for(int pos=0;pos<tmp.length;pos++){
//                    if(tmp[pos]!=null&&person.equalsIgnoreCase(tmp[pos])){
//                        evs[index].setEveWinner(person);
//                        return person+" has announced as winner in "+name;
//                    }
//                }
//                return person+" hasn't enrolled in "+name;
//            }
//            //return name+" has winner already";
//        }
//        return name+" doesn't found ";
//    }
//
//    @Override
//    public String cancel(String name) {
//        for(int index=0;index<evs.length;index++){
//            if(evs[index]!=null&&evs[index].getEveName().equalsIgnoreCase(name)){
//                if(evs[index].getEveWinner()==null){
//                    evs[index]=null;
//                    return name+" event has cancelled";
//                }
//                return name+" event can't cancel since it has been held already";
//            }
//        }
//        return name+" doesn't found";
//    }
//
//    @Override
//    public void update(Event obj) {
//        for(int index=0;index<evs.length;index++){
//            if(evs[index]!=null&&evs[index].getEveName().equalsIgnoreCase(obj.getEveName())){
//                if(evs[index].getEveWinner()==null){
//                    evs[index]=obj;
//                    System.out.println(obj.getEveName()+" has updated");
//                    return;
//                }
//                else{
//                    System.out.println(evs[index].getEveName()+" can;t update since it has been held");
//                    return;
//                }
//            }
//        }
//        System.out.println(obj.getEveName()+" is not in the record");
//    }
//
//    @Override
//    public void listEvents() {
//        for(Event e:evs){
//            System.out.println(e);
//        }
//    }
//
//    @Override
//    public void listBy(Date date) {
//        for(Event e:evs){
//            if(e!=null&&e.getEveDate().equals(date)){
//                System.out.println(e);
//            }
//        }
//    }
//
//    @Override
//    public void listBy(String host) {
//        for(Event e:evs){
//            if(e!=null&&e.getEveHost().equalsIgnoreCase(host)){
//                System.out.println(e);
//            }
//        }
//    }
//
//}
