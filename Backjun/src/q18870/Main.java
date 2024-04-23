package q18870;

import java.util.Scanner;


//1st case
public class Main {
	   public static void main(String[] args) throws Exception {
	      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	      int n = Integer.parseInt(br.readLine());
	      StringTokenizer st = new StringTokenizer(br.readLine());
	      int[] nums = new int[n];
	      for (int i = 0; i < n; i++) {
	         nums[i] = Integer.parseInt(st.nextToken());
	      }

	      int[] numsCo = Arrays.copyOf(nums, n);

	      List<Integer> distinctSortedNums = Arrays.stream(numsCo).distinct().sorted().boxed()
	            .collect(Collectors.toList());

	      Map<Integer, Integer> numMap = new HashMap<>();
	      for (int i = 0; i < distinctSortedNums.size(); i++) {
	         numMap.put(distinctSortedNums.get(i), i);
	      }

	      for (int i = 0; i < n; i++) {
	         int index = numMap.get(nums[i]);
	         bw.write(String.valueOf(index) + " ");
	      }

	      bw.flush();
	      bw.close();
	      br.close();
	   }
	}


// 2nd case
public class Main {

	   public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      Scanner sc = new Scanner(System.in);
	      int num = sc.nextInt();
	      int arr[] = new int[num];
	      int sorted[] = new int[num];
	      HashMap<Integer, Integer> rankMap = new HashMap<Integer, Integer>();
	      for (int i = 0; i < arr.length; i++) {
	         arr[i] = sc.nextInt();
	         sorted[i] = arr[i];
	      }
	      sc.close();
	      Arrays.sort(sorted);
	      int rank = 0;
	      for (int v : sorted) {
	         if (!rankMap.containsKey(v)) {
	            rankMap.put(v, rank);
	            rank++;
	         }
	      }

	      for (int value : arr) {
	         System.out.print(rankMap.get(value) + " ");
	      }

	   }
	}