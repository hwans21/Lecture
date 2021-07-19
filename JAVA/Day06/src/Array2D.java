import java.util.Arrays;

public class Array2D {
	public static void main(String[] args) {
		/*
		 * # 2차원 배열 - 배열 안에 배열이 존재하는 형태를 2차원 배열이라 합니다.
		 * - 실제 배열에는 배열의 주소값이 들어가게 됩니다.
		 */
//		
//		int[] arr = {1,2,3};
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12,13,14}};
		
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		System.out.println(arr[3][3]);
		
		System.out.println(Arrays.deepToString(arr));
		System.out.println("====================");
		
		/*
		   4
		   [1, 2, 3]
		   [4, 5, 6]
		   [7, 8, 9]
		   13
		   [[1, 2, 3], [4, 5, 6], [7, 8, 9], [10, 11, 12, 13, 14]]
		   ====================
		*/
		
		//빈 2차원 배열 만들기
		int[][] arr3by4 = new int[3][4];
		
		// 2차원 배열에 값 넣기
		arr3by4[1][2] = 50;
		arr3by4[2][1] = 70;
		
		for(int[] array : arr3by4) {
			for(int n : array) {
				System.out.print(n + " ");
				
			}
			System.out.println();
		}
				
		/*
			0 0 0 0 
			0 0 50 0 
			0 70 0 0 
		 */
		
		/*
		 * 이클립스 단축키
		 * Ctrl+F11 : 프로그램 실행
		 * Alt+Shift+S : getter setter 생성자 빠르게 생성하기
		 * Ctrl+Alt+위아래 방향키 : 블럭지정한 줄이나 해당줄을 위아래로 빠르게 복사하기
		 * Shift+Enter : 커서를 중간에 두고도 빠르게 개행하기
		 * Ctrl+D : 줄 삭제
		 * Ctrl+Space : 자동완성
		 * F3 : 함수 호출 부분으로 빠르게 이동
		 * 
		 */
	}
}
