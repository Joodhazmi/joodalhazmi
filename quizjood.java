//jood ghazi ali alhazmi 
// 443005216


//----------------------------------------------------------------------------------------------

// Java code for linearly search x in array[]. If x

// is present then return its location, otherwise

// return -1

class LinearSearch {

            // This function returns index of element x in array[]

            static int search(int array[], int n, int x)

            {

                        for (int i = 0; i < n; i++) {

                                // Return the index of the element if the element

                                    // is found

                                    if (array[i] == x)

                                                return i;

                        }

 

                        // return -1 if the element is not found

                        return -1;

            }

 

            public static void main(String[] args)

            {

                        int[] array = { 6, 4, 1, 7, 5 };

                        int n = array.length;

                        int x = 4;

                        int index = search(array, n, x);

                        if (index == -1)

                          System.out.println("Element is not present in the array");

                        else

                          System.out.println("Element found at position " + index);

            }

}

//------------------------------------------------------------------------------------------------------