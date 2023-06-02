package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    int a;
    int b;

    public void logic() {
        System.out.println("Logic parent");

    }

    public void duplicateChar() {
        String name = "Api test testing";
        name = name.toLowerCase();
        int len = name.length();
        int count = 0;
        char[] cha = name.toCharArray();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (cha[i] == cha[j]) {
                    System.out.println("Duplicate char" + " " + cha[j]);
                    break;

                }

            }


        }


    }
    public void secondLargestNum(){
        int a[] = {1, 2, 3, 5, 4};
        int largest=0;
        int secondLargest=0;
        int length=a.length;

        for (int i = 0; i < length; i++) {

            if(a[i]>largest){
                secondLargest= largest;
                largest=a[i];
            }

            if(a[i]>secondLargest && a[i]!=largest){
                secondLargest= a[i];
            }

        }
        System.out.println("largest"+largest);
        System.out.println("secondLargest"+secondLargest);

    }
}