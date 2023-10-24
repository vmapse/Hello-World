package prac;

import java.util.Scanner;

class Niter {
    String name;
    String number;

    public Niter() {
        // default constructor 연락처 정보를 저장하는 class name:이름 number:전화번호 line 32에 쓰기 위함
    }

    public Niter(String name, String number) { // 이름과 전화번호를 인자로 받는 생성자
        this.name = name;
        this.number = number; 
    }
}

class MyPhoneBook {
    Scanner sc; 
    Niter[] phoneBook; 

    public MyPhoneBook() {
        sc = new Scanner(System.in); // 사용자 입력을 위한 Scanner object를 생성하는 생성자
    }

    void store() { // 이름을 저장하기위한 store method 
        System.out.print("Number of Persons >> "); //연락처의 수를 입력받기 위해 작성 
        int num = sc.nextInt();
        sc.nextLine(); // Enter key 처리하기 위해 추가

        phoneBook = new Niter[num]; // 연락처를 저장할 배열 생성
        for (int i = 0; i < phoneBook.length; i++) { 
            phoneBook[i] = new Niter(); // 각 연락처에 대한 Niter 객체 생성
            System.out.print("Name and PhoneNumber (ex. 홍길동 010-1234-5678) >> ");
            String input = sc.nextLine(); //사용자로부터 이름과 전화번호를 입력받음 
            String[] parts = input.split(" "); // 사용자 입력을 공백을 기준으로 분리, 이름과 전화번호를 저장
            phoneBook[i].name = parts[0];
            phoneBook[i].number = parts[1];
            
        }
        System.out.println("Store Done.");
    }

    void search() { // 이름을 검색하기위한 search method
        while (true) {
            System.out.print("Name to Search >> ");
            String name = sc.nextLine(); // 검색할 이름을 입력받음

            if (name.equalsIgnoreCase("stop")) { // 대소문자관계없이 현재의 입력받은 문자열이 stop과 같으면 true 프로그램을 종료함
                System.out.println("종료");
                break;
            }

            int cnt = -1; // 검색결과를 나타내기 위한 변수, 초기값을 -1로 설정함
            for (int i = 0; i < phoneBook.length; i++) {
                if (name.equals(phoneBook[i].name)) { // 입력된 이름이 연락처배열에 있는 이름과 동일할 경우 정보를 출력하고 cnt를 1로 설정
                    System.out.println(phoneBook[i].name + "'s number is " + phoneBook[i].number);
                    cnt=1;
                    break;
                }
            }

            if (cnt==-1) { // 입력받은 이름이 배열의 저장된 이름과 일치하지 않은 경우
                System.out.println(name + " not found.");
            }
        }
    }

    void run() { // store method 와 search method를 실행하기 위한 run method
        store();
        search();
    }
}

public class PhoneBook {
    public static void main(String[] args) {
        MyPhoneBook myPhoneBook = new MyPhoneBook(); // MyPhoneBook객체 생성 및 run method를 호출하여 프로그램 실행 
        myPhoneBook.run();
    }
}
