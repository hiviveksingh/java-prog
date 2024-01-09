
package Leethcode;

public class SameSumOfPair {

	public static void main(String[] args) {

		System.out.println(" Output...."+solution(new Array[]{1, 9, 8, 100, 2}));

	}

  public int solution(int[] arr) {
        List<Integer> list = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
        Map<Integer, Integer> individualFreqMap = new HashMap<>();
        for (Integer num: list) {
            if (individualFreqMap.containsKey(num)) {
                individualFreqMap.put(num, individualFreqMap.get(num) + 1);
            } else {
                individualFreqMap.put(num, 1);
            }
        }

        List<Integer> uniqueList = list.stream().distinct().collect(Collectors.toList());
        Map<String, Integer> uniqueComboMap = new HashMap<>();
        int count = 0;
        for (Integer num: uniqueList) {
            for(int i = count; i < uniqueList.size(); i++) {
                if(!(uniqueComboMap.containsKey(num + "-" + uniqueList.get(i)) ||
                        uniqueComboMap.containsKey(uniqueList.get(i) + "-" + num)) &&
                        !num.equals(uniqueList.get(i))) {
                    int count1 = individualFreqMap.get(num);
                    int count2 = individualFreqMap.get(uniqueList.get(i));
                    uniqueComboMap.put(num + "-" + uniqueList.get(i), Math.min(count1, count2));
                }
            }
            count++;
        }

        for (Integer num: uniqueList) {
            if(individualFreqMap.get(num) > 1) {
                int val = individualFreqMap.get(num) / 2;
                uniqueComboMap.put(num + "-" + num, val);
            }
        }

        Map<Integer, Integer> sumMap = new HashMap<>();
        for (Map.Entry<String, Integer> entry: uniqueComboMap.entrySet()) {
            String[] strArr =  entry.getKey().split("-");
            Integer key = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[1]);
            if (sumMap.containsKey(key)) {
                sumMap.put(key, sumMap.get(key) + entry.getValue());
            } else {
                sumMap.put(key, entry.getValue());
            }
        }

        return sumMap.entrySet().stream().sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .findFirst().map(Map.Entry::getValue).get();
    }

}
