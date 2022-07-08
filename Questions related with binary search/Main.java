    public class Main {
        private static int firstBig(int[] a, int x) {
            int l = 0;
            int r = a.length-1;

            int res = -1; //Temporary answer
            while (l <=  r) {
                int mid = (r - l) / 2 + l;
                if (a[mid] >= x) {
                    res = a[mid];
                    r = mid - 1;
                }
                else {
                    l = mid + 1;
                }
            }
            return res;
        }

        public static void main(String[] args) {
            int[] a = {2, 3, 5, 6, 8, 10, 12};
            System.out.println(firstBig(a, 4));
        }

    }


    //2,3,5,6,8,10,12 // x=4 l=0, r=6
    //2,3,5//res=6 l=0,r=2,
    //    5    l=2,r=2
