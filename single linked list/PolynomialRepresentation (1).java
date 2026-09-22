class PolynomialRepresentation {

    static class Node {
        int coefficient;
        int exponent;
        Node next;

        Node(int coefficient, int exponent) {
            this.coefficient = coefficient;
            this.exponent = exponent;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        Node head = new Node(5, 3);
        head.next = new Node(4, 2);
        head.next.next = new Node(3, 1);
        head.next.next.next = new Node(2, 0);

        Node temp = head;

        System.out.println("Polynomial:");

        while (temp != null) {

            System.out.print(temp.coefficient + "x^" + temp.exponent);

            if (temp.next != null) {
                System.out.print(" + ");
            }

            temp = temp.next;
        }
    }
}