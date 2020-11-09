import arr_as_input

arr = arr_as_input.getInput()

print("Array obtained from input is ",arr)

#perform insertion sort - O(n2)
for i in range(1,len(arr)):
    j = i
    while j > 0 and arr[j] < arr[j-1]:
        arr[j],arr[j-1] = arr[j-1],arr[j] #easy way of swapping in python :)
        j -= 1

print("Array sorted after insertion sort : ",arr)
