class RandomizedSet {
    HashMap<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))    return false;
        list.add(val);
        map.put(val, list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val))   return false;
        int idx = map.get(val);
        Collections.swap(list, idx, list.size()-1);
        int swappedWith = list.get(idx);
        map.put(swappedWith, idx);
        list.remove(list.size()-1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        int random = (int)(Math.random() * list.size());
        return list.get(random);
    }
}
