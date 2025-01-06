import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int defaultTime = fees[0];
        int defaultFee = fees[1];
        int time = fees[2];
        int fee = fees[3];
        
        Map<String, List<String>> cars = new HashMap<>();
        
        for(int i = 0; i < records.length; i++){
            String[] sArr = records[i].split("\\s+");
            List<String> car = cars.getOrDefault(sArr[1], new ArrayList<>());
            car.add(sArr[0]);
            cars.put(sArr[1], car);
        }
        
        List<String> keysets = new ArrayList<>(cars.keySet());
        
        Collections.sort(keysets);
        
        int idx = 0;
        int[] answer = new int[cars.size()];
        
        for(String key : keysets){
            List<String> car = cars.get(key);
            int count = 0;
            int min = 0;
            if(car.size() % 2 == 1) car.add("23:59");
            for(int i = 0; i < car.size(); i += 2){
                String[] in = car.get(i).split(":");
                String[] out = car.get(i + 1).split(":");
                min += (Integer.parseInt(out[0]) - Integer.parseInt(in[0])) * 60 + (Integer.parseInt(out[1]) - Integer.parseInt(in[1]));
            }
            int value = min < defaultTime ? defaultFee : defaultFee + ((int)Math.ceil((double)(min - defaultTime) / time)) * fee;
            answer[idx++] = value;
        }
        
        
        
        return answer;
    }
}