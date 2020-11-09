
def getInput():
    arr_size = int(input("Enter the size of the array!"))
    arr = []
    print("Enter the element:")
    for i in range(arr_size):
        arr.append(int(input("Element at [{}]:".format(i))))

    print("size of the array: ",arr_size)
    print("[",end="")
    for item in arr:
        print(item,end=",")
    print("]")
    return arr