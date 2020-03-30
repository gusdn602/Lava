package hw_package.day01;

public class Hw01 {

	public static void main(String[] args) {
		String str = "create a repository, start a branch, write comments, open a pull request";
		String tmp = str;
		
		// , 가 몇번 나오는지 카운트 한다.
		int cnt = 0;
		
		for(int i = 0 ; i < tmp.length() ; i++ ) {
			// 문자를 한자씩 꺼내서 만약 쉼표와 같으면 카운트를 올려준다.
			if(tmp.charAt(i) == ',') {
				cnt += 1;
			}
		}
		
		// 이제 쉼표가 몇개가 포함이 되었는지 알아냈으니
		// 배열을 만들고
		String[] arr = new String[cnt + 1];
		// 반복해서 배열에 쉼표 앞은 잘라서 넣어주고 쉼표 뒤쪽은 tmp에 대체해주자.
		
		for(int i = 0 ; i < cnt; i++) {
			// 쉼표의 위치 알아내고
			int idx = tmp.indexOf(",");
			// 쉼표 이전까지 문자열 잘라서 배열에 담고
			arr[i] = tmp.substring(0, idx);
			// tmp 는 다음 문자열로 교체하고
			tmp = tmp.substring(idx + 2);
		}
		// 마지막 문자열 채워주고
		arr[cnt] = tmp;
		
		System.out.println("자른배열 : " + Arrays.deepToString(arr));
		System.out.println(arr.length);
		
		for(String msg : arr) {
			System.out.println(msg);
		}

	}

}
