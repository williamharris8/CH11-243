PHASE 1 - swap() would be useful once sorting begins. Since it is moving values into the right positions.

PHASE 2 - No the numberof comparisons remains the same even if already sorted. On every pass minIndex takes every number left in the unsorted part finding the smallest. Can't be sure which is smallest until all have been processed.

PHASE 3 - Merge sort needs extra memory and uses a second array making it O(N). Selection sort only needs one extra variable and is O(1) extra space. With limited ram there might not be room for a second array.

PHASE 4 - Yes when N grew 100 times bigger Selections Sorts was 10000x more and took almost five minutes. No, time depends on the computer and what else is running though. Accidentally put methods into printValues which stopped it from compiling but fixed that by moving them outside.