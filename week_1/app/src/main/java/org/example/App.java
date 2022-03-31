package org.example;


public class App {

    public static void main(String[] args) {
        System.out.println(challenge());

    }

    public static int challenge(){
        Boolean lockers[] = new Boolean[100];
        int openDoors=0;
        for(Boolean locker : lockers){
            openLockers(lockers);
            closeEverySecondLocker(lockers);
            toggleThirdLocker(lockers);
        }
        if(lockers[99]==false){
            lockers[99]=true;
        }else{
            lockers[99]=false;
        }
        for(int i=0; i<lockers.length;i++){
            if(lockers[i]==true){
                openDoors++;
            }
        }
        return openDoors;
    }

    public static void openLockers(Boolean[] lockers){
        for(int i=0;i<lockers.length;i++){
            lockers[i] = true;
        }
    }

    public static void closeEverySecondLocker(Boolean[] lockers){
        for(int i=0; i<lockers.length;i++){
            if(i%2==0){
                lockers[i]=false;
            }
        }
    }

    public static void toggleThirdLocker(Boolean[] lockers){
        for(int i=0; i<lockers.length;i++) {
            if(i%3==0){
                if(lockers[i]==true){
                    lockers[i]=false;
                }else{
                    lockers[i]=true;
                }
            }
        }
    }
}