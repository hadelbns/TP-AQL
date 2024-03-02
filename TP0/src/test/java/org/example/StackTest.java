package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
     private Stack S ;
    @BeforeEach
    void setUp() {
        S= new Stack();
    }

    @Test
    //tester si li ajout reelement elle ajout un element (classe d'equivalence de base )
    // quand on ajoute  element  mais la pile est saturer
    // 1 er classe d'equivalence assume que la pile n'est pas pleine
    public void PushShouldAddElementToTheTopOFStack(){
        S.push(5);
        // on supposant que les deux methode sont correct
        assertEquals(1,S.size());
        assertEquals(1,S.peek());
    }

    @Test
    public void PushShouldExpandArrayIfStackIsFull(){
        // remplir la pile
        assertEquals(10,S.size());
        S.push(10);
        assertEquals(11,S.size());
        assertEquals(10,S.peek());
    }
    // ona deux aussi por le pop la 1 er le fonctionement et le 2 eme esque  pop verfie la pile est vide don lever une exception

    @Test
    public void testPushAndPop() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);
        stack.push(15);

        // donc on peut utiliser
        assertEquals(15, stack.pop());
        assertEquals(10, stack.pop());
        assertEquals(5, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    // deux class d'equivalence lsl n5dem b ASSERTTHROWS
    public void testPeek() {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);

        assertEquals(10, stack.peek());
        assertEquals(10, stack.peek());
        assertFalse(stack.isEmpty());
    }

    @Test
    // les classes d'equivalence ona 2
    public void testIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
        stack.push(5);
        assertFalse(stack.isEmpty());
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    // on a une seule class d'equivalenc
    public void testSize() {
        Stack stack = new Stack();
        assertEquals(0, stack.size());
        stack.push(5);
        stack.push(10);
        assertEquals(2, stack.size());
        stack.pop();
        assertEquals(1, stack.size());
    }

    @Test
    public void testPopEmptyStack() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, () -> {
            stack.pop();
        });
    }

    @Test
    public void testPeekEmptyStack() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, () -> {
            stack.peek();
        });
    }
}
