/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbnja;
import com.spire.presentation.packages.sprcfp;
import com.spire.presentation.packages.sprcmja;
import com.spire.presentation.packages.sprmqja;
import com.spire.presentation.packages.sprpeja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtlia;
import com.spire.presentation.packages.sprvkja;
import com.spire.presentation.packages.sprygn;

@sprtea
public class sprzro {
    private double cfr_renamed_2;
    private double cfr_renamed_3;
    private double cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 4 << 1;
        int cfr_ignored_0 = 4 << 4 ^ 5 << 1;
        int n4 = n2;
        int n5 = 1 << 3 ^ 1;
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

    public static sprzro cfr_renamed_17648() {
        return new sprzro(0.5, 0.419, 0.081);
    }

    /*
     * WARNING - void declaration
     */
    public sprvkja cfr_renamed_17649(sprvkja sprvkja2) {
        void arg0;
        sprvkja sprvkja3 = sprvkja2;
        sprzro.cfr_renamed_18020(sprvkja3.cfr_renamed_17654());
        sprbnja sprbnja2 = sprvkja3.cfr_renamed_17877(new sprpeja(0, 0, arg0.cfr_renamed_1942(), arg0.cfr_renamed_1452()), 1, arg0.cfr_renamed_17654());
        sprvkja sprvkja4 = new sprvkja(arg0.cfr_renamed_1942(), arg0.cfr_renamed_1452(), 198659);
        sprvkja4.cfr_renamed_17665(arg0.cfr_renamed_14217(), arg0.cfr_renamed_14218());
        sprzro.cfr_renamed_18021(sprvkja4);
        sprbnja sprbnja3 = sprvkja4.cfr_renamed_17877(new sprpeja(0, 0, arg0.cfr_renamed_1942(), arg0.cfr_renamed_1452()), 2, 198659);
        sprbnja sprbnja4 = sprbnja2;
        this.cfr_renamed_18022(sprbnja4, sprbnja3);
        arg0.cfr_renamed_17886(sprbnja4);
        sprvkja sprvkja5 = sprvkja4;
        sprvkja5.cfr_renamed_17886(sprbnja3);
        return sprvkja5;
    }

    public static void cfr_renamed_18021(sprvkja arg0) {
        int n;
        if (arg0.cfr_renamed_17654() != 198659) {
            throw new IllegalStateException(sprcfp.cfr_renamed_9("{\u001b]\u0006K\u0011\b\u001dE\u0015O\u0011\b\u001d[TF\u001b\\T\u0010TJ\u0004XTA\u0019I\u0013MZ"));
        }
        sprcmja sprcmja2 = arg0.cfr_renamed_15619();
        int n2 = n = 0;
        while (n2 < 256) {
            int n3 = n++;
            sprcmja2.cfr_renamed_8434()[n3] = sprmqja.cfr_renamed_12796(n3, n3, n3);
            n2 = n;
        }
        arg0.cfr_renamed_18023(sprcmja2);
    }

    private static /* synthetic */ void cfr_renamed_18020(int arg0) {
        if (arg0 == 137224 || arg0 == 139273 || arg0 == 2498570) {
            return;
        }
        throw new IllegalStateException(sprygn.cfr_renamed_9("\u001f\u00199\u0002:\u0007%\u0005>\u0012.W:\u001e2\u0012&W,\u00188\u001a+\u0003"));
    }

    /*
     * WARNING - void declaration
     */
    public sprzro(double d, double d2, double d3) {
        void arg1;
        void arg0;
        sprzro sprzro2 = this;
        this.cfr_renamed_4 = arg0;
        sprzro2.cfr_renamed_3 = arg1;
        sprzro2.cfr_renamed_2 = d3;
    }

    public void cfr_renamed_18022(sprbnja arg0, sprbnja arg1) {
        int n;
        sprbnja sprbnja2 = arg0;
        int n2 = sprbnja2.cfr_renamed_1942();
        int n3 = sprbnja2.cfr_renamed_1452();
        int n4 = sprbnja2.cfr_renamed_17654() == 137224 ? 3 : 4;
        sprbnja sprbnja3 = arg0;
        int n5 = sprbnja3.cfr_renamed_17880() - n2 * n4;
        int n6 = arg1.cfr_renamed_17880() - n2;
        int n7 = (int)(65536.0 * this.cfr_renamed_4);
        int n8 = (int)(65536.0 * this.cfr_renamed_3);
        int n9 = (int)(65536.0 * this.cfr_renamed_2);
        int n10 = 0;
        int n11 = 0;
        byte[] byArray = new byte[sprbnja3.cfr_renamed_1452() * arg0.cfr_renamed_17880()];
        sprtlia.cfr_renamed_17883(sprbnja3.cfr_renamed_17881(), byArray, 0, byArray.length);
        byte[] byArray2 = new byte[arg1.cfr_renamed_1452() * arg1.cfr_renamed_17880()];
        int n12 = n = 0;
        while (n12 < n3) {
            int n13;
            int n14 = n13 = 0;
            while (n14 < n2) {
                byArray2[n11] = (byte)(n7 * (byArray[n10 + 2] & 0xFF) + n8 * (byArray[n10 + 1] & 0xFF) + n9 * (byArray[n10 + 0] & 0xFF) >> 16);
                ++n11;
                n10 += n4;
                n14 = ++n13;
            }
            n10 += n5;
            n11 += n6;
            n12 = ++n;
        }
        sprtlia.cfr_renamed_17890(byArray2, 0, arg1.cfr_renamed_17881(), byArray2.length);
    }
}

