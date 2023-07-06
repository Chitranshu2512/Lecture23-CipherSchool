import java.util.Scanner;

public class StringStudy {
    public static void main(String[] args) {
        String name = "Chitranshu Kushwaha";    // string literal stored int the method area - string pool
        String name1 = "Chitranshu Kushwaha";
        String name2 = new String("Chitranshu");  // string using constructor - stored as separate obj
        String name3 = new String("Chitranshu");

        System.out.println(name == name1);
        System.out.println(name2 == name3);


        // strings are immutable
        // every time we perform any operation new object is created

        System.out.println("================================");
        System.out.println("1.Concatenation");

        String s1 = "hello";
        s1 = s1+" peeps";
        System.out.println(s1);
        System.out.println(s1+" How are you doing");
        System.out.println(s1);           //s1 remains same

        // another way of concatenation

        String s3 = new String("Hello");
        String s4 = new String("people");
        String s2 = s3.concat(s4);
        System.out.println(s2);
        System.out.println(s4);         // s4 remains same

        System.out.println("=========================");
        System.out.println("2.checking if string are equal in values");

        System.out.println(name.equals(name1));
        //equals function -> object class
        // this generally compares the references of the objects

        System.out.println("=========================");
        System.out.println("3. Creating string object using character array");

        char[] arr = {'c','h','i','t'};
        String strFromArr = new String(arr);
        System.out.println(strFromArr);

        System.out.println("=========================");
        System.out.println("4. Creating partial string object using character array");

        String partialStrFromArr = new String(arr,1,3); //  constructor overload
        System.out.println(partialStrFromArr);

        System.out.println("=========================");
        System.out.println("5. Changing the uppercase from the lower case");

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name);   //remain unchanged

        System.out.println("=========================");
        System.out.println("6. splitting");

        System.out.println("Please Enter Your Full Name");
        Scanner sc = new Scanner(System.in);
        String fullName = sc.nextLine();
        String[] strArr = fullName.split(" ");
        for (int i=0 ; i<strArr.length; i++)
            System.out.println(strArr[i]);

        System.out.println("Please Enter something separated by dots");
        String dotName = sc.nextLine();
        String[] dotArr = dotName.split("[.]");    //dot is a meta character in regex
        for (int i=0 ; i<dotArr.length; i++)
            System.out.println(dotArr[i]);

        System.out.println("=========================");
        System.out.println("7.Length of the String");

        int length = name.length();
        System.out.println("Length of the String "+name+" is " +length);

        System.out.println("=========================");
        System.out.println("8.Finding the Index of the Character in the Array");

        int index = name.indexOf('i');             //RETURN FIRST OCCURRENCE OF THE CHARACTER
        System.out.println("index of the 'i' in  "+name+" is " +index);

        int index2 = name.indexOf('O');             //RETURN -1 if character is not present
        System.out.println("index of the 'i' in  "+name+" is " +index);

        int index3 = name.indexOf("Kushwaha");             //RETURN FIRST OCCURRENCE OF THE String
        System.out.println("index of the 'i' in  "+name+" is " +index);

        int indexOFO = 0;
       while (indexOFO != -1){
           indexOFO = name.indexOf('i' , indexOFO+1);
           System.out.println("i found at "+indexOFO);
       }
    }
}
