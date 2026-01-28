
/* Write a code to check if number is power of 2 */

// #include <iostream>
// using namespace std;

// int main(){
//     int n;
//     cin>> n;
//     if((n & (n-1)) == 0){
//         cout<< n << " is power of 2."<<endl;
//     }
//     else {
//         cout<< n <<" is not power of 2."<<endl;
//     }
//     return 0;
// }

// /* Write a code to check if number is even or odd */

// #include <iostream>
// using namespace std;

// int main(){
//     int n;
//     cin>> n;
//     if((n&1) == 0){
//         cout << "Even"<<endl;
//     }
//     else {
//         cout <<"Odd"<<endl;
//     }
//     return 0;
// }

/* Write a code to swap 2 nos with bitwise */

// #include <iostream>
// using namespace std;

// int main(){
//     int a;
//     cin>> a;
//     int b ;
//     cin >> b;
//     cout << "Initial : " << a <<' '<<b << endl;
//     a = a ^ b;
//     b= b ^ a;
//     a = a^ b;

//     cout << "Final : " <<a <<' ' <<b;

// }

/* Write a code to find porduct of number with power of 2. */

// #include <iostream>
// using namespace std;

// int main(){

//     int a = 7;
//     int b = 3;
//     int res;
//     res = a<<b;

//     cout << res;
// }

/* Write a code to get most significznt bit of number */


// #include <iostream>
// using namespace std;

// int main(){
//     int n = 25;
//     int ans=0;
//     while (n!=0){
//         n = n >> 1;
//         ans++;
//     }
//     cout << ans;
// }


/* Write a code to toggle the nth bit of a number */
// #include <iostream>
// using namespace std;
// int main(){
//     int n = 13;
// int a = 2;


// int ans = 1<<a;

// int fans = (n ^ ans);
// cout << fans;
// }

/* Write a code to check if signs of 2 numbers are same or different using bitwise */

// #include <iostream>
// using namespace std;

// int main(){
//     int a = -5;
//     int b = 6;
//     if((a^b) >0)
//         cout << "Same";
//     else
//         cout << "Different";
    
// }

/* Write a code to clear nth bit of a number */ 

// #include <iostream>
// using namespace std;

// int main(){
//     int n;
//     int k;
// cin >> n;
// cin >> k;
 
 
// int m  = 1<<k;
// int s = ~m;

// int ans = n&s;

// cout << ans << endl;
// }


/* Write code to change nth bit to 1 */

// #include <iostream>
// using namespace std;

// int main(){
//     int n;
//     cin >> n;
//     int k;
//     cin >> k;
    
//     int m = (1<< k);
    
//     cout << (n | k) << endl;
// }


/* Write code to find single number */

// #include <iostream>
// using namespace std;

// int main(){
//     int arr[] = {2,2,4,4,7,7,9,9,12};
//     int size = 8;
//     int ans = arr[0];
//     for(int i=1;i<=size;i++){
//         ans = ans^arr[i];
//     }
//     cout << ans;

// }

/* Write a code to find missing number */

// #include <iostream>
// using namespace std;

// int main(){
//     int fans = 0;
//     int ans = 0;
//     int size = 5;
//     int arr[] = {1,2,3,5,6};
//     for(int i=0;i < size;i++){
//         ans = ans ^ arr[i];
//     }
//     for(int i=1;i<=size+1;i++){
//         fans = fans ^ i;
//     }
//     cout << (fans^ans);
// }






















