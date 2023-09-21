import java.util.Scanner;
public class Simple369 {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99사이의 정수를 입력하시오 >>");
		int niter = scanner.nextInt(); // 사용자가 입력하는 숫자를 스캔하기 위한 niter선언
		
		int a = niter/10; // /연산은 10으로 나누었을때의 몫을 의미. 이는 10의자리숫자를 a로선엄함을 의미
		int b = niter%10; // %연산은 10으로 나누었을때의 나머지를 의미. 이는 1의자리 숫자를 b로선엄함을 의미
		int num=0;
		
		if(niter <10) { //niter가 10보다 작은것은 niter가 1의 자리숫자임을 의미.
			if (b%3 == 0 ) // niter가 1의 자리이므로 1의자리 변수 b를 3으로 나누어지는지를 통해 3의 배수인지 아닌지 확인 . 나머지가 0이면 3의배수
				num++;
		}
		
		else {  // niter >10 임을 의미. 10보다 크므로 이때 niter는 10의자리와 1의자리 둘다 가짐.
			if(a %3 == 0) { //10의자리 변수 a를 3으로 나누어지는지를 통해 3의 배수인지 아닌지 확인 . 나머지가 0이면 3의배수
				num++;
			}
			if(b%3 == 0 ){//1의자리 변수 b를 3으로 나누어지는지를 통해 3의 배수인지 아닌지 확인 . 나머지가 0이면 3의배수
				num++;
			}
		}
		
		switch(num) { // switch 괄호안 변수에 따른 코드. num이 0일때와 1일때 2일때를 설명함.
		case 0:// num이 0인것은 3으로 나누어진게 없다는 의미이므로 박수 없음.
			System.out.println("박수 없음");
			break;
		case 1: // 1의자리b 또는 10의자리a 둘중하나가 3의배수인경우. 박수 짝
			System.out.println("박수짝");
			break;
		case 2: // a와b둘다 3의배수임을 의미.
			System.out.println("박수짝짝");
			break;	
		}	
	}
}