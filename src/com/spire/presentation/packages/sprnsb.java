/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdqb;
import com.spire.presentation.packages.sprdqz;
import com.spire.presentation.packages.sprikb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprrpb;
import com.spire.presentation.packages.sprwtb;
import com.spire.presentation.packages.spryjb;
import com.spire.presentation.packages.spryrb;

public class sprnsb
extends sprikb {
    @Override
    public sprrlb cfr_renamed_1772(sprrlb arg0) {
        spryjb spryjb2;
        int[] nArray;
        int[] nArray2;
        spryjb spryjb3;
        int[] nArray3;
        int[] nArray4;
        if (this.cfr_renamed_1952()) {
            return arg0;
        }
        if (arg0.cfr_renamed_1952()) {
            return this;
        }
        if (this == arg0) {
            return this.cfr_renamed_1774();
        }
        sprnsb sprnsb2 = this;
        sprpib sprpib2 = sprnsb2.cfr_renamed_1769();
        spryjb spryjb4 = (spryjb)sprnsb2.cfr_renamed_2;
        spryjb spryjb5 = (spryjb)this.cfr_renamed_4;
        spryjb spryjb6 = (spryjb)arg0.cfr_renamed_1832();
        spryjb spryjb7 = (spryjb)arg0.cfr_renamed_1831();
        spryjb spryjb8 = (spryjb)this.cfr_renamed_0[0];
        spryjb spryjb9 = (spryjb)arg0.cfr_renamed_1964(0);
        int[] nArray5 = spryrb.cfr_renamed_1633();
        int[] nArray6 = spryrb.cfr_renamed_1631();
        int[] nArray7 = spryrb.cfr_renamed_1631();
        int[] nArray8 = spryrb.cfr_renamed_1631();
        boolean bl = spryjb8.cfr_renamed_287();
        if (bl) {
            nArray4 = spryjb6.cfr_renamed_4;
            nArray3 = spryjb7.cfr_renamed_4;
            spryjb3 = spryjb9;
        } else {
            nArray3 = nArray7;
            sprdqb.cfr_renamed_1627(spryjb8.cfr_renamed_4, nArray3);
            nArray4 = nArray6;
            spryjb3 = spryjb9;
            sprdqb.cfr_renamed_2022(nArray3, spryjb6.cfr_renamed_4, nArray4);
            sprdqb.cfr_renamed_2022(nArray3, spryjb8.cfr_renamed_4, nArray3);
            sprdqb.cfr_renamed_2022(nArray3, spryjb7.cfr_renamed_4, nArray3);
        }
        boolean bl2 = spryjb3.cfr_renamed_287();
        if (bl2) {
            nArray2 = spryjb4.cfr_renamed_4;
            nArray = spryjb5.cfr_renamed_4;
        } else {
            nArray = nArray8;
            sprdqb.cfr_renamed_1627(spryjb9.cfr_renamed_4, nArray);
            nArray2 = nArray5;
            sprdqb.cfr_renamed_2022(nArray, spryjb4.cfr_renamed_4, nArray2);
            sprdqb.cfr_renamed_2022(nArray, spryjb9.cfr_renamed_4, nArray);
            sprdqb.cfr_renamed_2022(nArray, spryjb5.cfr_renamed_4, nArray);
        }
        int[] nArray9 = spryrb.cfr_renamed_1631();
        sprdqb.cfr_renamed_2021(nArray2, nArray4, nArray9);
        int[] nArray10 = nArray6;
        sprdqb.cfr_renamed_2021(nArray, nArray3, nArray10);
        if (spryrb.cfr_renamed_1660(nArray9)) {
            if (spryrb.cfr_renamed_1660(nArray10)) {
                return this.cfr_renamed_1774();
            }
            return sprpib2.cfr_renamed_1770();
        }
        int[] nArray11 = nArray7;
        sprdqb.cfr_renamed_1627(nArray9, nArray11);
        int[] nArray12 = spryrb.cfr_renamed_1631();
        sprdqb.cfr_renamed_2022(nArray11, nArray9, nArray12);
        int[] nArray13 = nArray7;
        int[] nArray14 = nArray12;
        sprdqb.cfr_renamed_2022(nArray11, nArray2, nArray13);
        sprdqb.cfr_renamed_2027(nArray12, nArray14);
        spryrb.cfr_renamed_1636(nArray, nArray14, nArray5);
        sprdqb.cfr_renamed_2032(spryrb.cfr_renamed_1663(nArray13, nArray13, nArray12), nArray12);
        spryjb spryjb10 = spryjb2 = new spryjb(nArray8);
        sprdqb.cfr_renamed_1627(nArray10, spryjb10.cfr_renamed_4);
        sprdqb.cfr_renamed_2021(spryjb10.cfr_renamed_4, nArray12, spryjb2.cfr_renamed_4);
        spryjb spryjb11 = new spryjb(nArray12);
        sprdqb.cfr_renamed_2021(nArray13, spryjb10.cfr_renamed_4, spryjb11.cfr_renamed_4);
        spryjb spryjb12 = spryjb11;
        sprdqb.cfr_renamed_2037(spryjb12.cfr_renamed_4, nArray10, nArray5);
        sprdqb.cfr_renamed_2028(nArray5, spryjb12.cfr_renamed_4);
        spryjb spryjb13 = new spryjb(nArray9);
        if (!bl) {
            sprdqb.cfr_renamed_2022(spryjb13.cfr_renamed_4, spryjb8.cfr_renamed_4, spryjb13.cfr_renamed_4);
        }
        if (!bl2) {
            sprdqb.cfr_renamed_2022(spryjb13.cfr_renamed_4, spryjb9.cfr_renamed_4, spryjb13.cfr_renamed_4);
        }
        sprwtb[] sprwtbArray = new sprwtb[1];
        sprwtbArray[0] = spryjb13;
        sprwtb[] sprwtbArray2 = sprwtbArray;
        return new sprnsb(sprpib2, spryjb2, spryjb11, sprwtbArray2, this.cfr_renamed_91);
    }

    public sprnsb(sprpib arg0, sprwtb arg1, sprwtb arg2, boolean arg3) {
        sprwtb sprwtb2;
        boolean bl;
        sprwtb sprwtb3 = arg1;
        super(arg0, sprwtb3, arg2);
        if (sprwtb3 == null) {
            bl = true;
            sprwtb2 = arg2;
        } else {
            bl = false;
            sprwtb2 = arg2;
        }
        if (bl != (sprwtb2 == null)) {
            throw new IllegalArgumentException(sprdqz.cfr_renamed_9("I%m>x1u}c3i}c;,)d8,;e8`9,8`8a8b)\u007f}e.,3y1`"));
        }
        this.cfr_renamed_91 = arg3;
    }

    @Override
    public sprrlb cfr_renamed_1774() {
        spryjb spryjb2;
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprnsb sprnsb2 = this;
        sprpib sprpib2 = sprnsb2.cfr_renamed_1769();
        spryjb spryjb3 = (spryjb)sprnsb2.cfr_renamed_4;
        if (spryjb3.cfr_renamed_805()) {
            return sprpib2.cfr_renamed_1770();
        }
        spryjb spryjb4 = (spryjb)this.cfr_renamed_2;
        spryjb spryjb5 = (spryjb)this.cfr_renamed_0[0];
        int[] nArray = spryrb.cfr_renamed_1631();
        int[] nArray2 = spryrb.cfr_renamed_1631();
        int[] nArray3 = spryrb.cfr_renamed_1631();
        sprdqb.cfr_renamed_1627(spryjb3.cfr_renamed_4, nArray3);
        int[] nArray4 = spryrb.cfr_renamed_1631();
        spryjb spryjb6 = spryjb5;
        sprdqb.cfr_renamed_1627(nArray3, nArray4);
        boolean bl = spryjb6.cfr_renamed_287();
        int[] nArray5 = spryjb6.cfr_renamed_4;
        if (!bl) {
            nArray5 = nArray2;
            sprdqb.cfr_renamed_1627(spryjb5.cfr_renamed_4, nArray5);
        }
        sprdqb.cfr_renamed_2021(spryjb4.cfr_renamed_4, nArray5, nArray);
        int[] nArray6 = nArray2;
        sprdqb.cfr_renamed_1654(spryjb4.cfr_renamed_4, nArray5, nArray6);
        sprdqb.cfr_renamed_2022(nArray6, nArray, nArray6);
        int n = spryrb.cfr_renamed_1663(nArray6, nArray6, nArray6);
        sprdqb.cfr_renamed_2032(n, nArray6);
        int[] nArray7 = nArray3;
        sprdqb.cfr_renamed_2022(nArray3, spryjb4.cfr_renamed_4, nArray7);
        n = sprrpb.cfr_renamed_1705(8, nArray7, 2, 0);
        sprdqb.cfr_renamed_2032(n, nArray7);
        n = sprrpb.cfr_renamed_1731(8, nArray4, 3, 0, nArray);
        sprdqb.cfr_renamed_2032(n, nArray);
        spryjb spryjb7 = new spryjb(nArray4);
        sprdqb.cfr_renamed_1627(nArray6, spryjb7.cfr_renamed_4);
        spryjb spryjb8 = spryjb7;
        sprdqb.cfr_renamed_2021(spryjb7.cfr_renamed_4, nArray7, spryjb8.cfr_renamed_4);
        sprdqb.cfr_renamed_2021(spryjb8.cfr_renamed_4, nArray7, spryjb7.cfr_renamed_4);
        spryjb spryjb9 = spryjb2 = new spryjb(nArray7);
        sprdqb.cfr_renamed_2021(nArray7, spryjb7.cfr_renamed_4, spryjb9.cfr_renamed_4);
        spryjb spryjb10 = spryjb2;
        sprdqb.cfr_renamed_2022(spryjb9.cfr_renamed_4, nArray6, spryjb10.cfr_renamed_4);
        sprdqb.cfr_renamed_2021(spryjb10.cfr_renamed_4, nArray, spryjb2.cfr_renamed_4);
        spryjb spryjb11 = new spryjb(nArray6);
        sprdqb.cfr_renamed_2024(spryjb3.cfr_renamed_4, spryjb11.cfr_renamed_4);
        if (!bl) {
            sprdqb.cfr_renamed_2022(spryjb11.cfr_renamed_4, spryjb5.cfr_renamed_4, spryjb11.cfr_renamed_4);
        }
        sprwtb[] sprwtbArray = new sprwtb[1];
        sprwtbArray[0] = spryjb11;
        return new sprnsb(sprpib2, spryjb7, spryjb2, sprwtbArray, this.cfr_renamed_91);
    }

    public sprnsb(sprpib arg0, sprwtb arg1, sprwtb arg2) {
        this(arg0, arg1, arg2, false);
    }

    /*
     * WARNING - void declaration
     */
    public sprnsb(sprpib sprpib2, sprwtb sprwtb2, sprwtb sprwtb3, sprwtb[] sprwtbArray, boolean bl) {
        super((sprpib)arg0, (sprwtb)arg1, (sprwtb)arg2, (sprwtb[])arg3);
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_91 = bl;
    }

    @Override
    public sprrlb cfr_renamed_1804() {
        if (this.cfr_renamed_1952() || this.cfr_renamed_4.cfr_renamed_805()) {
            return this;
        }
        return this.cfr_renamed_1774().cfr_renamed_1772(this);
    }

    @Override
    public sprrlb cfr_renamed_1697(sprrlb arg0) {
        if (this == arg0) {
            return this.cfr_renamed_1804();
        }
        if (this.cfr_renamed_1952()) {
            return arg0;
        }
        if (arg0.cfr_renamed_1952()) {
            return this.cfr_renamed_1774();
        }
        if (this.cfr_renamed_4.cfr_renamed_805()) {
            return arg0;
        }
        return this.cfr_renamed_1774().cfr_renamed_1772(arg0);
    }

    @Override
    public sprrlb cfr_renamed_1773() {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprnsb sprnsb2 = this;
        sprnsb sprnsb3 = this;
        return new sprnsb(sprnsb2.cfr_renamed_3, sprnsb2.cfr_renamed_2, this.cfr_renamed_4.cfr_renamed_1773(), sprnsb3.cfr_renamed_0, sprnsb3.cfr_renamed_91);
    }

    @Override
    public sprrlb cfr_renamed_1977() {
        return new sprnsb(null, this.cfr_renamed_1969(), this.cfr_renamed_1973());
    }
}

