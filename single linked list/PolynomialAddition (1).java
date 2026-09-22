class PolynomialAddition {

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

    static Node add(Node p1, Node p2) {

        Node result = null;
        Node temp = null;

        while (p1 != null && p2 != null) {

            if (p1.exponent == p2.exponent) {

                Node newNode = new Node(
                    p1.coefficient + p2.coefficient,
                    p1.exponent
                );

                if (result == null) {
                    result = newNode;
                    temp = newNode;
                } else {
                    temp.next = newNode;
                    temp = newNode;
                }

                p1 = p1.next;
                p2 = p2.next;
            }

            else if (p1.exponent > p2.exponent) {

                Node newNode = new Node(p1.coefficient, p1.exponent);

                if (result == null) {
                    result = newNode;
                    temp = newNode;
                } else {
                    temp.next = newNode;
                    temp = newNode;
                }

                p1 = p1.next;
            }

            else {

                Node newNode = new Node(p2.coefficient, p2.exponent);

                if (result == null) {
                    result = newNode;
                    temp = newNode;
                } else {
                    temp.next = newNode;
                    temp = newNode;
                }

                p2 = p2.next;
            }
        }

        while (p1 != null) {
            Node newNode = new Node(p1.coefficient, p1.exponent);

            if (result == null) {
                result = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }

            p1 = p1.next;
        }

        while (p2 != null) {
            Node newNode = new Node(p2.coefficient, p2.exponent);

            if (result == null) {
                result = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }

            p2 = p2.next;
        }

        return result;
    }

    public static void main(String[] args) {

        Node p1 = new Node(5, 3);
        p1.next = new Node(4, 2);
        p1.next.next = new Node(3, 1);

        Node p2 = new Node(3, 3);
        p2.next = new Node(2, 2);
        p2.next.next = new Node(1, 1);

        Node result = add(p1, p2);

        System.out.println("First Polynomial:");
        Node temp = p1;

        while (temp != null) {
            System.out.print(temp.coefficient + "x^" + temp.exponent + " ");
            temp = temp.next;
        }

        System.out.println();

        System.out.println("Second Polynomial:");
        temp = p2;

        while (temp != null) {
            System.out.print(temp.coefficient + "x^" + temp.exponent + " ");
            temp = temp.next;
        }

        System.out.println();

        System.out.println("Addition of Two Polynomials:");
        temp = result;

        while (temp != null) {
            System.out.print(temp.coefficient + "x^" + temp.exponent + " ");
            temp = temp.next;
        }
    }
}