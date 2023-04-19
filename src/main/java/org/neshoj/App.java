package org.neshoj;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RotateArray ra = new RotateArray();
       int[] numArr = {1,2,3,4,5,6,7};
//        ra.rotateUseIntermediateArray(numArr, 3);
        ra.bubbleRotate(numArr, 3);
    }
}
