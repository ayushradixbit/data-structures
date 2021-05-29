package com.datastructures.algorithms;

/**
 * @author Harshal Patil
 * Resizable implementation of Queue(FIFO) data structure.
 */
public class Queue {

    /**
     * Starting point of the Queue
     */
    int head = 0;

    /**
     * next element position in the queue
     */
    int tail = 0;

    /**
     * The array in which the data to be store.
     */
    Object[] elements = new Object[]{0, 0};

    /**
     * The maximum size of array to allocate.
     */
    private static final int ARRAY_SIZE = 20;

    /**
     * Method to dequeue/remove elements from array
     */
    public void dequeue(){
        if(head != tail && head < tail){
            elements[head] = null;
            head++;
        }else {
            System.out.println("Queue is empty");
        }
    }

    /**
     * Method to add elements in array
     * @param input
     */
    public void enqueue(Object input){
        if (null != input)
            elements[tail] = input;
            resizeArray();
            tail++;
    }

    /**
     * Initialise array with default value
     */
    public void clear() {
        elements = new Object[ARRAY_SIZE];
        tail = 0;
        head = 0;
    }

    /**
     * Increased size of array depending on the inputs
     */
    private void resizeArray() {
        if(tail == elements.length-1){
            Object newArray[] = new Object[elements.length + 2];
            int i = 0;
            for(Object value: elements) {
                newArray[i] = value;
                i++;
            }
            elements = newArray;
        }
    }
}
