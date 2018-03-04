/*
Write a method called removeRange that accepts a starting and ending index as parameters and removes
the elements at those indexes (inclusive) from the list. For example, if a variable list stores
the values [8, 13, 17, 4, 9, 12, 98, 41, 7, 23, 0, 92], the call of listRange.removeRange(3, 8);
should remove values between index 3 and index 8 (the values 4 and 7), leaving the list of
[8, 13, 17, 23, 0, 92]. The method should throw an IllegalArgumentException if either of the positions is negative.
Otherwise you may assume that the positions represent a legal range of the list (0 start end size).
 */
public class ch16_17 {
    public static void main(String[] args) {
        LinkedIntList liste = new LinkedIntList();
        liste.add(8);
        liste.add(13);
        liste.add(17);
        liste.add(4);
        liste.add(9);
        liste.add(12);
        liste.add(98);
        liste.add(41);
        liste.add(7);
        liste.add(23);
        liste.add(0);
        liste.add(92);
        liste.removeRange(3,8);
        System.out.println(liste);
    }

    /*
    Kaldte metode:

    public void removeRange(int startIndex, int endIndex) {
        //Sørger først for at de indtastede indexer er 0 eller over.
        if (startIndex < 0 || endIndex < 0) {
            throw new IllegalArgumentException("The given index(es) can't be below 0.");
        } else {
            //Laver 3 referencer til front så jeg kan navigere igennem min linkedintlist.
            int indexCounter = 0;
            ListNode current = front;
            ListNode start = front;
            ListNode end = front;
            //kører igennem listen så længe current er en valid node.
            while (current != null) {

                //laver et if-statement som sørger for at sætte start til noden før det givne index
                //for at kunne navigere den uden om start indexet (altså fjerne det og alt andet imellem det og end+1).
                if (indexCounter+1 == startIndex) {
                    start = current;
                }
                //laver et if-statement som sørger for at sætte end til noden efter det givne index da endindexet
                //skal inkluderes og derfor også fjernes.
                if (indexCounter-1 == endIndex) {
                    end = current;
                }

                //bruger current til at cycle igennem listen
                current = current.next;
                indexCounter++;
            }
            //Tjekker om startindexet er 0 for at kunne linke front direkte til end hvis det er tilfældet.
            if (startIndex == 0){
                front.next = end;
            } else {
            start.next = end;
        }
     */
}
