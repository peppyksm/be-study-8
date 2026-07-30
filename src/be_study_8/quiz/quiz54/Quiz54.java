package be_study_8.quiz.quiz54;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Quiz54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant1 = {
		"leo", "kiki", "eden"
		};
		String[] completion1 = {
		"eden", "kiki"
		};

		String[] participant2 = {
		"marina", "josipa", "nikola", "vinko", "filipa"
		};
		String[] completion2 = {
		"marina", "josipa", "nikola", "filipa"
		};


		String[] participant3 = {
		"mislav", "stanko", "ana", "mislav"
		};
		String[] completion3 = {
		"mislav", "stanko", "ana"
		};

		String result1 = solution(participant1, completion1); //leo
		String result2 = solution(participant2, completion2); //vinko
		String result3 = solution(participant3, completion3); //mislav

		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		}

		//메소드 선언부분
		public static String solution(String[] participant, String[] completion){
			
			//List 		추가, 삭제 (중복 가능)
			
			//참가자 인원 -> List 추가 "leo", "kiki", "eden"
			//완주자 인원 -> List 삭제 "eden", "kiki"
			//1명 남은 인원이 완주 못한 사람
			
//			List<String> list1 = new ArrayList<String>();
//			for(String s : participant) {
//				list1.add(s);
//			}
//			System.out.println(list1);
//			for(String s : completion) {
//				list1.remove(s);
//			}
//			System.out.println(list1);
			
			//참가자수 - 완주자수 = 1;
			//완주하지 못한 사람 이름 return
//			return list1.get(0);
			
			
			
			
			
			
			//Set		//중복허용 x .
			//완벽한 로직은 X, 케이스에 따라 오답이 나올 수 있음
			
//			Set<String> set = new HashSet<String>();
//			for(String s : completion) {
//				set.add(s);
//			}
//			String result = null;
//			for(String s : participant) {
//				if(set.contains(s)) {
//					set.remove(s);
//				}else { //완주자 목록에 참여자이름이 없다?
//					result = s;
//					break;
//				}
//			}
//			return result;
			
			
			
			
			
			//Map
			
			//키 : 값(밸류)
			//key 이름 : value 갯수
			
			//key 이름 : 3 참여자 수를 체크
			//key 이름 : 2 완주자 만큼 마이너스
			//key 이름 : 1 완주자 만큼 마이너스
			//key 이름 : 0 완주자 만큼 마이너스
			
			Map<String, Integer> map = new HashMap<String, Integer>();
			
			for(String s : participant) {
				
				//기존에 해당 키값으로 있으면? 이름 : 1
				//기존에 키값 있으면? 이름 : n+1
				
				map.put(s, map.getOrDefault(s, 0) + 1);
				
				if(map.containsKey(s)) {
					//기존 값에 +1
					map.put(s, map.get(s)+1);
				}else { //기존에 없으면 1명이라고 새로 등록
					map.put(s, 1);
				}

			}
			
			for(String s : completion) {
				map.put(s,  map.get(s) - 1);
				
			
				
				//0일때 아예 삭제
				if(map.get(s) == 0) {
					map.remove(s);
				}
			}
			
			String result = null;
			for(String key : map.keySet()) {
				if(map.get(key) == 1) {
					result = key;
					break;
				}
			}
			
			return result;
			
			
			
		}
}