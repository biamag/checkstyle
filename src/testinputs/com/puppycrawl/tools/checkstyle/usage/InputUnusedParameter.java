package com.puppycrawl.tools.checkstyle.usage;

import java.awt.Rectangle;

/** Test input for unread parameter check */
public class InputUnusedParameter
{
    public InputUnusedParameter(int aReadPrimitive, int aUnreadPrimitive)
    {
        int i = aReadPrimitive;
    }

    private void method(
        String aReadObject,
        Rectangle aRectangle,
        Object aUnreadObject)
    {
        int i = aReadObject.length();
        
        int j = aRectangle.x;
        
        try {
            i++;   
        }
        catch (Exception unreadException) {
        }
    }

    private void methodArrays(int[] aArray, int[] aArray2, int[] aUnreadArray)
    {
        int i = aArray[0];
        aArray2[0] = 0;
    }
}

interface Interface
{
    public void method(int aParam);
}

abstract class AbstractClass
{
    public abstract void method(int aParam);
}