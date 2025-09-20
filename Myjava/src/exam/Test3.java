package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Test3 {
	private static final int ramdom_max = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] array = new int[5];
		int[] array = makearr(5);

		printarr(array);

	}

	private static int[] makearr(int size) {
		int[] array = new int[size];
		Random ran = new Random() ;
		for (int i = 0 ; i < array.length; i++) {
			array[i] = ran.nextInt(ramdom_max);
		}

		return array;
		

	}

	private static void printarr(int[] arr) {
		for (int z = 0; z < arr.length; z++) {

			System.out.println(arr[z]);
		}
	}
	

	public List<Map<String, Object>> getDynamicData(Map<String, Object> params) {
	    // 1. 파라미터로 받은 날짜 범위 (예: 202501 ~ 202503)
	    String startDate = (String) params.get("startDate");
	    String endDate = (String) params.get("endDate");

	    // 2. (중요) 동적으로 생성할 날짜 컬럼 목록을 만듭니다.
	    //    실제로는 이 목록을 DB에서 조회하거나, 파라미터를 기반으로 생성해야 합니다.
	    //    여기서는 예시로 하드코딩합니다.
	    List<String> dateColumns = new ArrayList<>();
	    dateColumns.add("202501");
	    dateColumns.add("202502");
	    dateColumns.add("202503");
	    
	    // ※ 주의: dateColumns에 담긴 값은 반드시 'YYYYMM' 형식인지 검증해야 
	    //         SQL Injection을 방지할 수 있습니다. (Mapper에서 ${}를 사용하기 때문)

	    // 3. Mapper에 날짜 목록과 기타 조회 조건을 전달
	    params.put("dateColumnList", dateColumns);
		return null;

	  //  return yourMapper.selectDynamicData(params);
	}
}
