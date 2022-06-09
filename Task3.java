import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task3 {
    public static void main(String[] args) throws IOException {
        // name - ip - count
        // sorted by name ASC, ip by the order of appearance
        Map<String, LinkedHashMap<String, Integer>> map = new TreeMap<>();

        BufferedReader reader = new BufferedReader(new FileReader(new File("task3input.txt")));
        String inputLine;

        while((inputLine = reader.readLine()) != null){
            String[] tokens = inputLine.split("\\s+");
            String ip = tokens[0];
            String username = tokens[1];

            if (map.containsKey(username)) {
                if (map.get(username).containsKey(ip)) {
                    int counter = map.get(username).get(ip);
                    map.get(username).put(ip, counter + 1);
                } else {
                    map.get(username).put(ip, 1);
                }
            } else {
                map.put(username, new LinkedHashMap<>());
                map.get(username).put(ip, 1);
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, Integer>> entry : map.entrySet()) {
            String username = entry.getKey();

            System.out.println(username);

            for (Map.Entry<String, Integer> e : entry.getValue().entrySet()) {
                String ip = e.getKey();
                int counter = e.getValue();
                System.out.println(String.format("  %s => %d time%s", ip, counter, counter > 1 ? "s" : ""));
            }
        }
    }
}