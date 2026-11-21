PHASE 1 - swap() would be useful once sorting begins. Since it is moving values into the right positions.

PHASE 2 - No the numberof comparisons remains the same even if already sorted. On every pass minIndex takes every number left in the unsorted part finding the smallest. Can't be sure which is smallest until all have been processed.

PHASE 3 - Merge sort needs extra memory and uses a second array making it O(N). Selection sort only needs one extra variable and is O(1) extra space. With limited ram there might not be room for a second array.