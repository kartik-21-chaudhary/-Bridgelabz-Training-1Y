import java.util.Scanner;
class FriendsInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age of Amar:");
        int ageAmar = sc.nextInt();
        System.out.println("Enter height of Amar:");
        int heightAmar = sc.nextInt();
        System.out.println("Enter age of Akbar:");
        int ageAkbar = sc.nextInt();
        System.out.println("Enter height of Akbar:");
        int heightAkbar = sc.nextInt();
        System.out.println("Enter age of Anthony:");
        int ageAnthony = sc.nextInt();
        System.out.println("Enter height of Anthony:");
        int heightAnthony = sc.nextInt();
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Amar is the youngest");
        } else if (ageAkbar < ageAnthony) {
            System.out.println("Akbar is the youngest");
        } else {
            System.out.println("Anthony is the youngest");
        }
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Amar is the tallest");
        } else if (heightAkbar > heightAnthony) {
            System.out.println("Akbar is the tallest");
        } else {
            System.out.println("Anthony is the tallest");
        }
    }
}
