package exam;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExamList {
	public static void main(String[] args) {
		
		List<Integer> numberList = new ArrayList<Integer>();		
		numberList.add(10);
		numberList.add(9);
		//System.out.print(numberList);
		//System.out.println(numberList.get(0) * numberList.get(1));
		
		List<String> strList = new ArrayList<String>();
		strList.add("테스트11");
		strList.add("테스트12");
		//System.out.println(strList);
		
		
		List<Map<String, Object>> myList = new ArrayList<Map<String,Object>>();
		
		Map<String, Object> myMayMap = new HashMap<String, Object>();
		
		myMayMap.put("2", numberList);
		myMayMap.put("2", strList);
		
		myList.add(myMayMap);
		
		System.out.println(myList);
		
		//배열 담기
		
		
		
		
	}

}
