# Majority Element Solution Approaches

#### Problem - Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times. You may assume that the array is non-empty and the majority element always exist in the array. <br>

<b>Approach 1 - Using Hash Map</b>

Using the concept of Hash Map. 
Loop through all the given elemnts and insert each element into the hashmap. In hashmap we will be storing the element and it occurene count. finally Loop through the HashMap and return the elements which occurence count are greater than n/2

Time Complexity - O(n)
Space Complexity - O(n)

<b>Approach 2 - Using Sorting</b>

Since the the majority element always exist in the array with this condition if we sort the array definitely the element will be in middle position since it occurs n/2 times. So sorting the array and returning the middle element gives the majority element.

Time Complexity - O(n logn)
Space Complexity - O(1)

<b>Approach 3 - Using Boyer-Moore Voting Algorithm</b>

Time Complexity - O(n)
Space Complexity - O(1)
