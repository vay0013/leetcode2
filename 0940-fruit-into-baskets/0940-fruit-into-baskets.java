class Solution {
    public int totalFruit(int[] fruits) {
      int result = 0;
      int begin = 0;
      Map<Integer, Integer> map = new HashMap<>();
      for (int end = 0; end < fruits.length; end++) {
        map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);
        while (map.size() > 2) {
        map.put(fruits[begin], map.get(fruits[begin]) - 1);
        map.remove(fruits[begin], 0);
        begin++;
        }
        result = Math.max(result, end - begin + 1);
      }
      return result;
    }
}