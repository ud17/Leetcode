func maxArea(height []int) int {
    
    var start = 0;
    var end = len(height) - 1; 
    var capacity = 0;

    for start < end {
        var min = min(height[start], height[end]);
        var current = (end - start) * min;

        if current > capacity {
            capacity = current;
        }

        if height[start] == height[end] {
            start++;
            end--;
        } else if height[start] > height[end] {
            end--;
        } else {
            start++;
        }
    }

    return capacity;
}

func min(n1, n2 int) int {
    if n1 > n2 {
        return n2;
    }
    return n1;
}