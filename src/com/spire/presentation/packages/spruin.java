/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprmbka;
import com.spire.presentation.packages.sprpon;
import com.spire.presentation.packages.sprqjn;
import com.spire.presentation.packages.sprrhn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprvvja;
import java.util.Iterator;

@sprtea
public class spruin {
    private static /* synthetic */ Integer[] cfr_renamed_13043(String[] arg0, int arg1, int[] arg2, int[] arg3, sprvrx[] arg4) {
        int n;
        Integer[][] integerArrayArray;
        int n2;
        Integer[] integerArray;
        block6: {
            boolean bl = arg1 == 0;
            int n3 = arg2[0];
            arg4[0] = new sprvrx(2);
            integerArray = new Integer[bl ? spruin.cfr_renamed_13044(arg0, arg2[0], arg3[0]) : arg1];
            int n4 = arg1;
            n2 = 0;
            while (n4 > 0 || bl) {
                integerArrayArray = arg0[arg2[0]];
                int[] nArray = arg3;
                int n5 = sprmbka.cfr_renamed_13045((String)integerArrayArray, arg3[0]);
                integerArray[n2++] = n5;
                nArray[0] = nArray[0] + (sprmbka.cfr_renamed_13046((String)integerArrayArray, arg3[0]) ? 2 : 1);
                if (arg3[0] >= integerArrayArray.length() || arg3[0] == -1) {
                    if (arg2[0] != n3) {
                        arg4[0].add(arg2[0]);
                    }
                    int[] nArray2 = arg2;
                    nArray2[0] = nArray2[0] + 1;
                    if (arg2[0] >= arg0.length) {
                        n = n2;
                        break block6;
                    }
                    arg3[0] = 0;
                }
                if (bl) continue;
                if (n5 <= 65535) {
                    --n4;
                    continue;
                }
                n4 -= 2;
            }
            n = n2;
        }
        if (n < integerArray.length) {
            Integer[][] integerArrayArray2 = new Integer[1][];
            integerArrayArray2[0] = integerArray;
            integerArrayArray = integerArrayArray2;
            sprvvja.cfr_renamed_13047(integerArrayArray, n2);
            integerArray = integerArrayArray[0];
        }
        return integerArray;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 4 << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 5;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    private static /* synthetic */ int cfr_renamed_13044(String[] arg0, int arg1, int arg2) {
        int n = arg0[arg1].length() - arg2;
        while (++arg1 < arg0.length) {
            n += arg0[arg1].length();
        }
        return n;
    }

    @sprtea
    public static sprpon[][] cfr_renamed_13048(sprrhn arg0, String[] arg1, boolean arg2) {
        int n;
        sprpon[][] sprponArray = new sprpon[arg1.length][];
        int[] nArray = (int[])arg0.cfr_renamed_13026().clone();
        if (!arg2 || arg0.cfr_renamed_13026().length > 1) {
            // empty if block
        }
        int n2 = 0;
        int n3 = 0;
        sprpon[] sprponArray2 = new sprpon[nArray.length];
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = nArray[n5];
        int n8 = n = 1;
        while (n8 <= nArray.length) {
            boolean bl;
            boolean bl2 = bl = n >= nArray.length;
            if (bl || nArray[n] != n7) {
                int n9;
                int n10 = 0;
                if (!bl) {
                    n10 = nArray[n] - n7;
                    n7 = nArray[n];
                }
                int n11 = n2;
                sprvrx sprvrx2 = null;
                int[] nArray2 = new int[1];
                nArray2[0] = n2;
                int[] nArray3 = nArray2;
                int[] nArray4 = new int[1];
                nArray4[0] = n3;
                int[] nArray5 = nArray4;
                sprvrx[] sprvrxArray = new sprvrx[1];
                sprvrxArray[0] = sprvrx2;
                sprvrx[] sprvrxArray2 = sprvrxArray;
                Integer[] integerArray = spruin.cfr_renamed_13043(arg1, n10, nArray3, nArray5, sprvrxArray2);
                n2 = nArray3[0];
                n3 = nArray5[0];
                sprvrx2 = sprvrxArray2[0];
                Iterator iterator = sprvrx2.iterator();
                while (iterator.hasNext()) {
                    Iterator iterator2;
                    int n12 = (Integer)iterator2.next();
                    sprponArray[n12] = new sprpon[0];
                    iterator = iterator2;
                }
                int n13 = n6 - n5 + 1;
                sprqjn[] sprqjnArray = new sprqjn[n13];
                int n14 = arg2 ? arg0.cfr_renamed_13026().length - n6 - 1 : n5;
                int n15 = n9 = 0;
                while (n15 < n13) {
                    int n16 = n9;
                    sprqjn sprqjn2 = new sprqjn(arg0.cfr_renamed_13027()[n9 + n14], arg0.cfr_renamed_13029()[n9 + n14], arg0.cfr_renamed_13025()[n9 + n14], arg0.cfr_renamed_13028()[n9 + n14]);
                    sprqjnArray[n16] = sprqjn2;
                    n15 = ++n9;
                }
                sprponArray2[n4++] = new sprpon(integerArray, sprqjnArray);
                if (n11 != n2) {
                    n9 = n4;
                    sprpon[] sprponArray3 = new sprpon[n9];
                    System.arraycopy(sprponArray2, 0, sprponArray3, 0, n9);
                    sprponArray[n11] = sprponArray3;
                    n4 = 0;
                }
                n5 = n;
            }
            n6 = n++;
            n8 = n;
        }
        return sprponArray;
    }
}

