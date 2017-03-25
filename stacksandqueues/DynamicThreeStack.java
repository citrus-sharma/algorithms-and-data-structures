package stacksandqueues;

import java.util.HashSet;
import java.util.Set;

public class DynamicThreeStack {
    private int[] stackPointer = {-1,-1,-1};
    private int stackSize = 5;
    private StackNode[] buffer = new StackNode[stackSize];

    private Set<Integer> freeList = new HashSet<Integer>();

    public void populateFreeList() {
        for(int i=0; i<stackSize; i++) {
            freeList.add(i);
        }
    }

    private int getFreeIndex() {
        if(freeList.size() == 0){
            throw new RuntimeException("overflow error");
        }
        int index = freeList.iterator().next();
        freeList.remove(index);
        return index;
    }

    public void push(int stackNum, int value) {
        int freeIndex  = getFreeIndex();
        StackNode node = new StackNode(stackPointer[stackNum], value, stackNum);
        buffer[freeIndex] = node;
        stackPointer[stackNum] = freeIndex;
    }

    public int pop(int stackNum) {
        if(stackPointer[stackNum] == -1) {
            throw new RuntimeException("under flow");
        }
        StackNode node = buffer[stackPointer[stackNum]];
        freeList.add(stackPointer[stackNum]);
        stackPointer[stackNum] = node.getPrevious();
        return node.getValue();
    }

    public int getStackSize() {
        return stackSize;
    }

    public StackNode[] getBuffer() {
        return buffer;
    }
}
