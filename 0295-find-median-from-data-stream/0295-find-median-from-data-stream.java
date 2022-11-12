class MedianFinder {
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;

    public MedianFinder() {
        min = new PriorityQueue<>((a,b) -> b-a);
        max = new PriorityQueue<>((a,b) -> a-b);
    }
    
    public void addNum(int num) {
        if(min.isEmpty() || num<min.peek()) {
            min.offer(num);
            if(max.size()+1 < min.size()) {
                max.offer(min.poll());
            }
        } else {
            max.offer(num);
            if(min.size() < max.size()) {
                min.offer(max.poll());
            }
        }
    }
    
    public double findMedian() {
        if(min.size() > max.size()) {
            return min.peek();
        }
        return (min.peek() + max.peek())/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */