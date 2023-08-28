package basic.array;


// 내가 한것!!!!!!!!


import java.util.Arrays;
import java.util.Scanner;

public class EmployeeManager1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//사원의 정보:사번,이름,나이,부서명
		String[] userNums = new String[100];
		String[] names = new String[100];
		int[] ages = new int[100];
		String[] departments = new String[100];
		
		int count = 0;
		
		while(true) {
			//실제로 입력된 데이터(사원의 정보)의 개수를 체크하는 변수.
			
			System.out.println("\n========== 사원 관리 프로그램 ==========");
	        System.out.println("# 1. 사원 정보 신규 등록");
	        System.out.println("# 2. 모든 사원 정보 보기");
	        System.out.println("# 3. 사원 정보 검색");
	        System.out.println("# 4. 사원 정보 수정");
	        System.out.println("# 5. 사원 정보 삭제");
	        System.out.println("# 6. 프로그램 종료");            
	        System.out.println("====================================");
	    
	        System.out.print("> ");
	        int menu = sc.nextInt();
	        if(menu == 1) {
	            //사원 정보 4가지를 입력받아 각 배열에 저장하는 코드를 작성.
	            //사번은 중복되면 안됩니다.
	            //(무한루프를 구현해서 사번 중복이 발생하면 다시 입력받기.)
	        	
	        	
	        	loop1: while(true) {
	        		
	        		Boolean flag = true;
	        		System.out.print("사번 입력 : ");
	        		String userNum = sc.next();
	        		for(int i=0;i<userNums.length;i++) {
	        			if(userNum.equals(userNums[i])) {
	        				System.out.println("이미 입력된 사번입니다.!");
	        				flag = false;
	        				break;
	        			}
	        		}
	        		if(flag) {
		        		System.out.print("이름 입력 : ");
		        		String name = sc.next();
		        		System.out.print("나이 입력 : ");
		        		int age = sc.nextInt();
		        		System.out.print("부서명 입력 : ");
		        		String department = sc.next();
		        		
		        		userNums[count] = userNum;
		        		names[count]    = name;
		        		ages[count]     = age;
		        		departments[count] = department;
		        		System.out.println("사원 정보 입력 완료." + (count+1) + "건" );
		        		System.out.println("계속 입력하시겠습니다.(y/n) ? " );
		        		String yn = sc.next();
		        		count ++;
		        		if(yn.equals("n")) {
		        			System.out.println(Arrays.toString(userNums));
		        			System.out.println("입력을 종료합니다. ");
		        			break loop1;
		        		}	        				
	        		}
	        	}
	        	
	        }else if(menu == 2) {
	        	
	        	
	        	//각 배열을 반복문을 통해 저장된 데이터까지만 출력하도록 작성. (count)
	            //만약 사용자가 사원 등록을 한 명도 하지 않았다면
	            //"등록된 사원 정보가 없습니다." 를 출력하시면 됩니다.
	        	if(count == 0) {
	        		System.out.println("등록된 사원 정보가 없습니다.");
	        		break;
	        	}
	        	System.out.println("===================================");
	        	System.out.println("= count , 사번  , 이름  , 나이 , 부서명 =");
	        	System.out.println("===================================");
	        	for(int i=0 ; i<count ; i++) {
	        		System.out.printf("= %d ,  %s ,  %s , %d , %s \n" , i+1 , userNums[i], names[i] ,ages[i],departments[i] );
	        	}
	        	System.out.println("== 조회가 완료 되었습니다. ===============");
	        	
	        	
	        } else if(menu == 3) {
	            //입력한 사번에 일치하는 사원의 4가지 정보를 모두 출력하세요.
	            //입력한 사번이 존재하지 않는다면 "조회하신 사원의 정보가 없습니다." 를 출력.
	        	while(true) {
	        		System.out.print("사번 입력 ,종료(n): ");
	        		String userNum = sc.next();
	        		if(userNum.equals("n")) break;
	        		
	        		int i = 0;
	        		for(i=0 ; i<count ; i++) {
	        			if(userNum.equals(userNums[i])) {
	        				System.out.println("===========================");
	        	        	System.out.println("= 사번  , 이름  , 나이 , 부서명 =");
	        	        	System.out.println("===========================");
	        				System.out.printf("= %s ,  %s , %d , %s \n" , userNums[i], names[i] ,ages[i],departments[i] );
	        				System.out.println("=조회 완료====================");
	        				break;
	        			}
	        		}
	        		if(i == count) {
	        			System.out.println("조회하신 사원의 정보가 없습니다.");
        			}
	        	}
	        	
	        } else if(menu == 4) {
	        	//해당 사번과 일치하는 사원의 나이와 부서를 선택적으로 변경할 수 있도록
	            //프로그램을 구성하시고, 나이와 부서를 수정하는 코드를 작성하세요.
	            //사번 입력 -> 존재하는 사번이 맞다면 -> [1. 나이변경 | 2. 부서변경 | 3.취소]
	            //사번이 존재하지 않는다면 없다고 얘기해 주세요.
	        	if(count == 0) {
	        		System.out.println("등록된 사원 정보가 없습니다.");
	        		break;
	        	}
	        	System.out.print("사번 입력 : ");
        		String userNum = sc.next();
        		
        		int i = 0;
        		for(i=0 ; i<count ; i++) {
        			if(userNum.equals(userNums[i])) {
        				System.out.println("수정하고자 하는 번호 선택 : [1. 나이변경 | 2. 부서변경 | 3.취소]");
        				int sel = sc.nextInt();
        				if(sel == 1) {
        					int age = sc.nextInt();
        					ages[i] = age ;
        					System.out.println("나이 변경 완료");
        					break;
        				}else if(sel == 2){
        					String department = sc.next();
        					departments[i] = department ;
        					System.out.println("부서 변경 완료");
        					break;
    					}else if(sel == 3){
        					System.out.println("수정을 종료합니다.");
        					break;
    					}else {
    						System.out.println("선택 오류 입니다.");
        					break;
    					}
        			}
    			}
        		if(i == count) {
        			System.out.println("수정할 사원의 정보가 없습니다.");
    			}
	        } else if(menu == 5) {
	        	//사번을 입력받아서
	            //해당 사번과 일치하는 사원의 4가지 정보를 각 배열에서 모두 삭제하고
	            //삭제하기 전에 "정말 삭제하시겠습니까? [Y/N]" 를 입력받아서
	            //y를 눌렀을 시에 삭제가 되도록 코드를 구성하세요.
	            //배열의 크기는 줄이지 않겠습니다. 삭제할 인덱스를 기준으로 뒤에 있는 값들을
	            //앞으로 한칸씩 땡기신 다음 count를 하나 내려주시면 됩니다.
	        	if(count == 0) {
	        		System.out.println("등록된 사원 정보가 없습니다.");
	        		break;
	        	}
	        	System.out.print("사번 입력 : ");
        		String userNum = sc.next();
        		
        		
        		int i = 0;
        		boolean flag = false;
        		for(i=0 ; i<count ; i++) {
        			if(userNum.equals(userNums[i])) {
        				System.out.println("삭제할 사원 이름 : " + names[i]);
        				System.out.println("정말 삭제하시겠습니까? [Y/N]");
                		String ynn = sc.next();
                		if(ynn.equals("n")) {
                			System.out.println("삭제를 취소합니다. ");
                			break;
                		}

        				for(int j=i;j<count;j++) {
        					if(j == userNums.length-1 ) {
        						userNums[j] = null;
        		        		names[j]    = null;
        		        		ages[j]     = 0;
        		        		departments[j] = null;
        					} else {
        					userNums[j] = userNums[j+1];
    		        		names[j]    = names[j+1];
    		        		ages[j]     = ages[j+1];
    		        		departments[j] = departments[j+1];
        					}
        				}
        				System.out.println(Arrays.toString(userNums));
        				System.out.println("삭제 완료 되었습니다. ");
        				flag = true;
        				count --;
        				break;
        			}
    			}
        		if(!flag) {
        			System.out.println("삭제할 사원의 정보가 없습니다.");
    			}
		        

	        } else if(menu == 6) {
	        	System.out.println("프로그램을 종료합니다.");
	        	sc.close();
	        	break; //while true break
	        }else {
	        	System.out.println("메뉴를 잘못 입력하셨습니다.");
	        }
		} //end while true
	}//end main

}
