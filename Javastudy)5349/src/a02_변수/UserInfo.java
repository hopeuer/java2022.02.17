package a02_변수;

public class UserInfo {

	public static void main(String[] args) {
		/*
		 * 학번: 2022001					-> studentCode(정수)
		 * 이름: 김준일 					-> name1, name2, name3
		 * 학년: 1							-> studentYear(정수)
		 * 성적: 85.5						-> score(실수)
		 * 평점: B							-> grade(문자)
		 * 성별: 남성(true), 여성(false)	-> gender(boolean)
		 */
		int num =10;
		System.out.println(num);
		
		int studentCode = 202201;
		System.out.println("학번: " + studentCode);
		char name1 = '구';
		char name2 = '태';
		char name3 = '모';
		System.out.print("이름: ");
		System.out.println("" + name1 + name2 + name3);
		int studentYear = 1;
		System.out.println("학년: " + studentYear);
		double score = 85.5;
		System.out.println("성적: " + score);
		char grade = 'B';
		System.out.println("평범: " + grade);
		boolean gender = true;
		System.out.println("성별: " + gender);
	}

}
