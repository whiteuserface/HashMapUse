package list;
import java.util.Scanner;
import java.util.HashMap;
public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //해쉬맵 생성
        HashMap<String, Integer> hm = new HashMap<>(); 
        boolean oc = true;
        String name;
        Integer age;

        while(oc){    
            menu();
            System.out.print("목록 번호를 입력:");
            int menuNum = sc.nextInt();
            
            
            if(menuNum == 1){
                System.out.print("이름을 입력:");
                name = sc.next();
                System.out.print("나이를 입력:");
                age = sc.nextInt();
                hm.put(name, age);
            } else if(menuNum == 2){
                System.out.print("수정할 이름을 입력:");
                name = sc.next();
                hm.remove(name);
                System.out.print("새로운 이름을 입력:");
                name = sc.next();
                System.out.print("새로운 나이를 입력:");
                age = sc.nextInt();
                hm.put(name, age );
                } 
             else if(menuNum == 3){
                System.out.println("수정된 목록");
                for(String key : hm.keySet()){
                    System.out.println("name ="+key);
                }
            } else if(menuNum == 4){
                System.out.print("삭제할 이름을 입력:");
                name = sc.next();
                hm.remove(name);
            } else if(menuNum == 5){
                System.out.print("검색할 이름을 입력:");
                name = sc.next();
                System.out.println(name+"의 나이는:"+hm.get(name));
                
            } else if(menuNum == 6){
                System.out.println("종료하겠습니다.");
                oc = false;
            }
        }


    }

    private static void menu() {
        System.out.println("1.등록");
        System.out.println("2.수정");
        System.out.println("3.목록");
        System.out.println("4.삭제");
        System.out.println("5.나이검색");
        System.out.println("6.종료");
    }

    
}
