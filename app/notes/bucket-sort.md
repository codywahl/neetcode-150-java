# Bucket Sort Algorithm

## Description

Bucket Sort is a comparison-based sorting algorithm that works by distributing elements into a number of buckets. Each bucket is then sorted individually, either using a different sorting algorithm or recursively applying the bucket sort. Finally, the sorted buckets are concatenated to form the final sorted array.

## Steps

1. **Create Buckets**: Divide the range of the input data into a fixed number of buckets.
2. **Distribute Elements**: Distribute the elements into the appropriate buckets based on their values.
3. **Sort Buckets**: Sort each bucket individually.
4. **Concatenate Buckets**: Concatenate the sorted buckets to get the final sorted array.

## When to Use

- **Uniform Distribution**: When the input data is uniformly distributed across a range.
- **Small Range of Values**: When the range of input values is not significantly larger than the number of elements.
- **Floating Point Numbers**: When sorting floating point numbers that are uniformly distributed.

## Tips

- Ensure that the number of buckets is appropriate for the input data to avoid overfilling or under-filling buckets.
- Choose an efficient sorting algorithm for sorting individual buckets, such as insertion sort for small buckets.
- Bucket sort is most effective when the input data is uniformly distributed.
