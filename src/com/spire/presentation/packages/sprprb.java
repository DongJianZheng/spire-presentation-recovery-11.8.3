/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spranb;
import com.spire.presentation.packages.spretb;
import com.spire.presentation.packages.sprikb;
import com.spire.presentation.packages.sprkjb;
import com.spire.presentation.packages.sprlfo;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprrpb;
import com.spire.presentation.packages.sprwtb;

public class sprprb
extends sprikb {
    @Override
    public sprrlb cfr_renamed_1774() {
        spretb spretb2;
        spretb spretb3;
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprprb sprprb2 = this;
        sprpib sprpib2 = sprprb2.cfr_renamed_1769();
        spretb spretb4 = (spretb)sprprb2.cfr_renamed_4;
        if (spretb4.cfr_renamed_805()) {
            return sprpib2.cfr_renamed_1770();
        }
        spretb spretb5 = (spretb)this.cfr_renamed_2;
        spretb spretb6 = (spretb)this.cfr_renamed_0[0];
        int[] nArray = sprkjb.cfr_renamed_1631();
        spretb spretb7 = spretb4;
        spranb.cfr_renamed_1627(spretb7.cfr_renamed_3, nArray);
        int[] nArray2 = sprkjb.cfr_renamed_1631();
        int[] nArray3 = nArray;
        spranb.cfr_renamed_1627(nArray3, nArray2);
        int[] nArray4 = sprkjb.cfr_renamed_1631();
        spranb.cfr_renamed_1627(spretb5.cfr_renamed_3, nArray4);
        int n = sprkjb.cfr_renamed_1663(nArray4, nArray4, nArray4);
        spranb.cfr_renamed_2032(n, nArray4);
        int[] nArray5 = nArray;
        spranb.cfr_renamed_2022(nArray3, spretb5.cfr_renamed_3, nArray5);
        n = sprrpb.cfr_renamed_1705(7, nArray5, 2, 0);
        spranb.cfr_renamed_2032(n, nArray5);
        int[] nArray6 = sprkjb.cfr_renamed_1631();
        n = sprrpb.cfr_renamed_1731(7, nArray2, 3, 0, nArray6);
        spranb.cfr_renamed_2032(n, nArray6);
        spretb spretb8 = spretb3 = new spretb(nArray2);
        spranb.cfr_renamed_1627(nArray4, spretb8.cfr_renamed_3);
        spranb.cfr_renamed_2021(spretb8.cfr_renamed_3, nArray5, spretb3.cfr_renamed_3);
        spranb.cfr_renamed_2021(spretb8.cfr_renamed_3, nArray5, spretb3.cfr_renamed_3);
        spretb spretb9 = spretb2 = new spretb(nArray5);
        spranb.cfr_renamed_2021(nArray5, spretb3.cfr_renamed_3, spretb9.cfr_renamed_3);
        spretb spretb10 = spretb2;
        spranb.cfr_renamed_2022(spretb9.cfr_renamed_3, nArray4, spretb10.cfr_renamed_3);
        spranb.cfr_renamed_2021(spretb10.cfr_renamed_3, nArray6, spretb2.cfr_renamed_3);
        spretb spretb11 = new spretb(nArray4);
        spranb.cfr_renamed_2024(spretb7.cfr_renamed_3, spretb11.cfr_renamed_3);
        if (!spretb6.cfr_renamed_287()) {
            spranb.cfr_renamed_2022(spretb11.cfr_renamed_3, spretb6.cfr_renamed_3, spretb11.cfr_renamed_3);
        }
        sprwtb[] sprwtbArray = new sprwtb[1];
        sprwtbArray[0] = spretb11;
        return new sprprb(sprpib2, spretb3, spretb2, sprwtbArray, this.cfr_renamed_91);
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
    public sprrlb cfr_renamed_1772(sprrlb arg0) {
        spretb spretb2;
        int[] nArray;
        int[] nArray2;
        spretb spretb3;
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
        sprprb sprprb2 = this;
        sprpib sprpib2 = sprprb2.cfr_renamed_1769();
        spretb spretb4 = (spretb)sprprb2.cfr_renamed_2;
        spretb spretb5 = (spretb)this.cfr_renamed_4;
        spretb spretb6 = (spretb)arg0.cfr_renamed_1832();
        spretb spretb7 = (spretb)arg0.cfr_renamed_1831();
        spretb spretb8 = (spretb)this.cfr_renamed_0[0];
        spretb spretb9 = (spretb)arg0.cfr_renamed_1964(0);
        int[] nArray5 = sprkjb.cfr_renamed_1633();
        int[] nArray6 = sprkjb.cfr_renamed_1631();
        int[] nArray7 = sprkjb.cfr_renamed_1631();
        int[] nArray8 = sprkjb.cfr_renamed_1631();
        boolean bl = spretb8.cfr_renamed_287();
        if (bl) {
            nArray4 = spretb6.cfr_renamed_3;
            nArray3 = spretb7.cfr_renamed_3;
            spretb3 = spretb9;
        } else {
            nArray3 = nArray7;
            spranb.cfr_renamed_1627(spretb8.cfr_renamed_3, nArray3);
            nArray4 = nArray6;
            spretb3 = spretb9;
            spranb.cfr_renamed_2022(nArray3, spretb6.cfr_renamed_3, nArray4);
            spranb.cfr_renamed_2022(nArray3, spretb8.cfr_renamed_3, nArray3);
            spranb.cfr_renamed_2022(nArray3, spretb7.cfr_renamed_3, nArray3);
        }
        boolean bl2 = spretb3.cfr_renamed_287();
        if (bl2) {
            nArray2 = spretb4.cfr_renamed_3;
            nArray = spretb5.cfr_renamed_3;
        } else {
            nArray = nArray8;
            spranb.cfr_renamed_1627(spretb9.cfr_renamed_3, nArray);
            nArray2 = nArray5;
            spranb.cfr_renamed_2022(nArray, spretb4.cfr_renamed_3, nArray2);
            spranb.cfr_renamed_2022(nArray, spretb9.cfr_renamed_3, nArray);
            spranb.cfr_renamed_2022(nArray, spretb5.cfr_renamed_3, nArray);
        }
        int[] nArray9 = sprkjb.cfr_renamed_1631();
        spranb.cfr_renamed_2021(nArray2, nArray4, nArray9);
        int[] nArray10 = nArray6;
        spranb.cfr_renamed_2021(nArray, nArray3, nArray10);
        if (sprkjb.cfr_renamed_1660(nArray9)) {
            if (sprkjb.cfr_renamed_1660(nArray10)) {
                return this.cfr_renamed_1774();
            }
            return sprpib2.cfr_renamed_1770();
        }
        int[] nArray11 = nArray7;
        spranb.cfr_renamed_1627(nArray9, nArray11);
        int[] nArray12 = sprkjb.cfr_renamed_1631();
        spranb.cfr_renamed_2022(nArray11, nArray9, nArray12);
        int[] nArray13 = nArray7;
        int[] nArray14 = nArray12;
        spranb.cfr_renamed_2022(nArray11, nArray2, nArray13);
        spranb.cfr_renamed_2027(nArray12, nArray14);
        sprkjb.cfr_renamed_1636(nArray, nArray14, nArray5);
        spranb.cfr_renamed_2032(sprkjb.cfr_renamed_1663(nArray13, nArray13, nArray12), nArray12);
        spretb spretb10 = spretb2 = new spretb(nArray8);
        spranb.cfr_renamed_1627(nArray10, spretb10.cfr_renamed_3);
        spranb.cfr_renamed_2021(spretb10.cfr_renamed_3, nArray12, spretb2.cfr_renamed_3);
        spretb spretb11 = new spretb(nArray12);
        spranb.cfr_renamed_2021(nArray13, spretb10.cfr_renamed_3, spretb11.cfr_renamed_3);
        spretb spretb12 = spretb11;
        spranb.cfr_renamed_2037(spretb12.cfr_renamed_3, nArray10, nArray5);
        spranb.cfr_renamed_2028(nArray5, spretb12.cfr_renamed_3);
        spretb spretb13 = new spretb(nArray9);
        if (!bl) {
            spranb.cfr_renamed_2022(spretb13.cfr_renamed_3, spretb8.cfr_renamed_3, spretb13.cfr_renamed_3);
        }
        if (!bl2) {
            spranb.cfr_renamed_2022(spretb13.cfr_renamed_3, spretb9.cfr_renamed_3, spretb13.cfr_renamed_3);
        }
        sprwtb[] sprwtbArray = new sprwtb[1];
        sprwtbArray[0] = spretb13;
        sprwtb[] sprwtbArray2 = sprwtbArray;
        return new sprprb(sprpib2, spretb2, spretb11, sprwtbArray2, this.cfr_renamed_91);
    }

    /*
     * WARNING - void declaration
     */
    public sprprb(sprpib sprpib2, sprwtb sprwtb2, sprwtb sprwtb3, sprwtb[] sprwtbArray, boolean bl) {
        super((sprpib)arg0, (sprwtb)arg1, (sprwtb)arg2, (sprwtb[])arg3);
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_91 = bl;
    }

    @Override
    public sprrlb cfr_renamed_1977() {
        return new sprprb(null, this.cfr_renamed_1969(), this.cfr_renamed_1973());
    }

    @Override
    public sprrlb cfr_renamed_1773() {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprprb sprprb2 = this;
        sprprb sprprb3 = this;
        return new sprprb(sprprb2.cfr_renamed_3, sprprb2.cfr_renamed_2, this.cfr_renamed_4.cfr_renamed_1773(), sprprb3.cfr_renamed_0, sprprb3.cfr_renamed_91);
    }

    @Override
    public sprrlb cfr_renamed_1804() {
        if (this.cfr_renamed_1952() || this.cfr_renamed_4.cfr_renamed_805()) {
            return this;
        }
        return this.cfr_renamed_1774().cfr_renamed_1772(this);
    }

    public sprprb(sprpib arg0, sprwtb arg1, sprwtb arg2) {
        this(arg0, arg1, arg2, false);
    }

    public sprprb(sprpib arg0, sprwtb arg1, sprwtb arg2, boolean arg3) {
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
            throw new IllegalArgumentException(sprlfo.cfr_renamed_9("\u0010j4q!~,2:|02:tuf=wut<w9vuw9w8w;f&2<au| ~9"));
        }
        this.cfr_renamed_91 = arg3;
    }
}

