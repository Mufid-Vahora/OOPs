public class GSSArray{

    private int[] a;
    private int lastindex;

    public GSSArray(int x) {
        a=new int[x];

    }//constructor

//method to insert variable x into array
    public void insert(int x) {
//lastindex must be set to 0 first time


        if(a[0]==0) {
            a[0]=x;
            lastindex=0;
        }
        //if: is first slot empty
        else {
            //when its not empty

            //test to see if the array is full, and double if necessary
            if((a[a.length-1])!=0) {
                increaseSize();
            }//if:full
            //Now insert x in the proper place:
            //First find which slot x belongs in:
            //3 case:1)first 2)middle 3)end
            //first:
            if(x<=a[0]) {
                for(int k=lastindex; k>=0; k--) {
                    a[k+1]=a[k];
                }//for
                a[0]=x;
            }//if: first
            else if(x>a[lastindex]) { //third:
                a[lastindex+1]=x;
            }//else if:third
            else { //second:
                //need to find exact position x belongs
                for(int i=lastindex; i>=0; i--) {
                    if(x>a[i]) {
                        for(int j=lastindex; j>i; j--) {
                            a[j+1]=a[j];
                        }//for: pushing back all numbers after correct slot
                        a[i+1]=x;
                        break;
                    }//if: x>a[i]

                }//for:where x belongs

            }//else second
            lastindex++;//the index increases by one if x is inserted
        }//else: when a[0] is not empty
    }//method

    //method to double the array
    private void increaseSize() {
        int[]temp=new int[a.length];//making an identical copy
        for(int i=0; i<a.length; i++) {
            temp[i]=a[i];
        }//for: copying a to copy
        a = new int[temp.length*2];//doubling a
        for(int i=0; i<temp.length; i++) {
            a[i]=temp[i];
        }//for: copying back to a
    }

    //method to delete variable x from array
    public boolean delete(int x) {
        for(int i=0; i<a.length; i++) {
            if(a[i]==x) {
                //if a number is found, all numbers past it must be brought in
                for(int j=i; j<lastindex; j++) {
                    a[j]=a[j+1];
                }//for:moving everything down
                a[lastindex]=0;
                lastindex--;
                return true;
            }//if: its found
        }//for: finding x
        return false;
    }//method
}//class