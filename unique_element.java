public class unique_element {
    public static void main(String[] args) {
        int[] arr1 = {1, 2,3};
        int [] arr2 = {3,4,5};
        
        System.out.println("unique elements of array :");
        for(int i = 0; i < arr1.length; i++) {
            boolean found = false;
            for(int j = 0; j < arr2.length; j++) {
                if(arr1[i] == arr2[j]) {
                    found = true;
                    break;
                    }
                    }
                    if(!found) {
                        System.out.println(arr1[i]);

                    }
                }
                for(int i=0;i<arr2.length;i++){
                    boolean found = false;
                    for(int j = 0; j < arr1.length; j++) {
                        if(arr2[i] == arr1[j]) {
                            found = true;
                            break;
                            }
                            }
                            if(!found) {
                                System.out.println(arr2[i]);

                                
                }

            }

        }

    
}
