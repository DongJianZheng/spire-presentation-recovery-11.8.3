/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfcs;
import com.spire.presentation.packages.sprikb;
import com.spire.presentation.packages.sprirb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprrpb;
import com.spire.presentation.packages.sprwtb;
import com.spire.presentation.packages.spryrb;
import com.spire.presentation.packages.sprzjb;

public class sprdnb
extends sprikb {
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

    /*
     * WARNING - void declaration
     */
    public sprdnb(sprpib sprpib2, sprwtb sprwtb2, sprwtb sprwtb3, sprwtb[] sprwtbArray, boolean bl) {
        super((sprpib)arg0, (sprwtb)arg1, (sprwtb)arg2, (sprwtb[])arg3);
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_91 = bl;
    }

    @Override
    public sprrlb cfr_renamed_1772(sprrlb arg0) {
        sprirb sprirb2;
        int[] nArray;
        int[] nArray2;
        sprirb sprirb3;
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
        sprdnb sprdnb2 = this;
        sprpib sprpib2 = sprdnb2.cfr_renamed_1769();
        sprirb sprirb4 = (sprirb)sprdnb2.cfr_renamed_2;
        sprirb sprirb5 = (sprirb)this.cfr_renamed_4;
        sprirb sprirb6 = (sprirb)arg0.cfr_renamed_1832();
        sprirb sprirb7 = (sprirb)arg0.cfr_renamed_1831();
        sprirb sprirb8 = (sprirb)this.cfr_renamed_0[0];
        sprirb sprirb9 = (sprirb)arg0.cfr_renamed_1964(0);
        int[] nArray5 = spryrb.cfr_renamed_1633();
        int[] nArray6 = spryrb.cfr_renamed_1631();
        int[] nArray7 = spryrb.cfr_renamed_1631();
        int[] nArray8 = spryrb.cfr_renamed_1631();
        boolean bl = sprirb8.cfr_renamed_287();
        if (bl) {
            nArray4 = sprirb6.cfr_renamed_4;
            nArray3 = sprirb7.cfr_renamed_4;
            sprirb3 = sprirb9;
        } else {
            nArray3 = nArray7;
            sprzjb.cfr_renamed_1627(sprirb8.cfr_renamed_4, nArray3);
            nArray4 = nArray6;
            sprirb3 = sprirb9;
            sprzjb.cfr_renamed_2022(nArray3, sprirb6.cfr_renamed_4, nArray4);
            sprzjb.cfr_renamed_2022(nArray3, sprirb8.cfr_renamed_4, nArray3);
            sprzjb.cfr_renamed_2022(nArray3, sprirb7.cfr_renamed_4, nArray3);
        }
        boolean bl2 = sprirb3.cfr_renamed_287();
        if (bl2) {
            nArray2 = sprirb4.cfr_renamed_4;
            nArray = sprirb5.cfr_renamed_4;
        } else {
            nArray = nArray8;
            sprzjb.cfr_renamed_1627(sprirb9.cfr_renamed_4, nArray);
            nArray2 = nArray5;
            sprzjb.cfr_renamed_2022(nArray, sprirb4.cfr_renamed_4, nArray2);
            sprzjb.cfr_renamed_2022(nArray, sprirb9.cfr_renamed_4, nArray);
            sprzjb.cfr_renamed_2022(nArray, sprirb5.cfr_renamed_4, nArray);
        }
        int[] nArray9 = spryrb.cfr_renamed_1631();
        sprzjb.cfr_renamed_2021(nArray2, nArray4, nArray9);
        int[] nArray10 = nArray6;
        sprzjb.cfr_renamed_2021(nArray, nArray3, nArray10);
        if (spryrb.cfr_renamed_1660(nArray9)) {
            if (spryrb.cfr_renamed_1660(nArray10)) {
                return this.cfr_renamed_1774();
            }
            return sprpib2.cfr_renamed_1770();
        }
        int[] nArray11 = nArray7;
        sprzjb.cfr_renamed_1627(nArray9, nArray11);
        int[] nArray12 = spryrb.cfr_renamed_1631();
        sprzjb.cfr_renamed_2022(nArray11, nArray9, nArray12);
        int[] nArray13 = nArray7;
        int[] nArray14 = nArray12;
        sprzjb.cfr_renamed_2022(nArray11, nArray2, nArray13);
        sprzjb.cfr_renamed_2027(nArray12, nArray14);
        spryrb.cfr_renamed_1636(nArray, nArray14, nArray5);
        sprzjb.cfr_renamed_2032(spryrb.cfr_renamed_1663(nArray13, nArray13, nArray12), nArray12);
        sprirb sprirb10 = sprirb2 = new sprirb(nArray8);
        sprzjb.cfr_renamed_1627(nArray10, sprirb10.cfr_renamed_4);
        sprzjb.cfr_renamed_2021(sprirb10.cfr_renamed_4, nArray12, sprirb2.cfr_renamed_4);
        sprirb sprirb11 = new sprirb(nArray12);
        sprzjb.cfr_renamed_2021(nArray13, sprirb10.cfr_renamed_4, sprirb11.cfr_renamed_4);
        sprirb sprirb12 = sprirb11;
        sprzjb.cfr_renamed_2037(sprirb12.cfr_renamed_4, nArray10, nArray5);
        sprzjb.cfr_renamed_2028(nArray5, sprirb12.cfr_renamed_4);
        sprirb sprirb13 = new sprirb(nArray9);
        if (!bl) {
            sprzjb.cfr_renamed_2022(sprirb13.cfr_renamed_4, sprirb8.cfr_renamed_4, sprirb13.cfr_renamed_4);
        }
        if (!bl2) {
            sprzjb.cfr_renamed_2022(sprirb13.cfr_renamed_4, sprirb9.cfr_renamed_4, sprirb13.cfr_renamed_4);
        }
        sprwtb[] sprwtbArray = new sprwtb[1];
        sprwtbArray[0] = sprirb13;
        sprwtb[] sprwtbArray2 = sprwtbArray;
        return new sprdnb(sprpib2, sprirb2, sprirb11, sprwtbArray2, this.cfr_renamed_91);
    }

    public sprdnb(sprpib arg0, sprwtb arg1, sprwtb arg2) {
        this(arg0, arg1, arg2, false);
    }

    @Override
    public sprrlb cfr_renamed_1774() {
        sprirb sprirb2;
        sprirb sprirb3;
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprdnb sprdnb2 = this;
        sprpib sprpib2 = sprdnb2.cfr_renamed_1769();
        sprirb sprirb4 = (sprirb)sprdnb2.cfr_renamed_4;
        if (sprirb4.cfr_renamed_805()) {
            return sprpib2.cfr_renamed_1770();
        }
        sprirb sprirb5 = (sprirb)this.cfr_renamed_2;
        sprirb sprirb6 = (sprirb)this.cfr_renamed_0[0];
        int[] nArray = spryrb.cfr_renamed_1631();
        sprirb sprirb7 = sprirb4;
        sprzjb.cfr_renamed_1627(sprirb7.cfr_renamed_4, nArray);
        int[] nArray2 = spryrb.cfr_renamed_1631();
        int[] nArray3 = nArray;
        sprzjb.cfr_renamed_1627(nArray3, nArray2);
        int[] nArray4 = spryrb.cfr_renamed_1631();
        sprzjb.cfr_renamed_1627(sprirb5.cfr_renamed_4, nArray4);
        int n = spryrb.cfr_renamed_1663(nArray4, nArray4, nArray4);
        sprzjb.cfr_renamed_2032(n, nArray4);
        int[] nArray5 = nArray;
        sprzjb.cfr_renamed_2022(nArray3, sprirb5.cfr_renamed_4, nArray5);
        n = sprrpb.cfr_renamed_1705(8, nArray5, 2, 0);
        sprzjb.cfr_renamed_2032(n, nArray5);
        int[] nArray6 = spryrb.cfr_renamed_1631();
        n = sprrpb.cfr_renamed_1731(8, nArray2, 3, 0, nArray6);
        sprzjb.cfr_renamed_2032(n, nArray6);
        sprirb sprirb8 = sprirb3 = new sprirb(nArray2);
        sprzjb.cfr_renamed_1627(nArray4, sprirb8.cfr_renamed_4);
        sprzjb.cfr_renamed_2021(sprirb8.cfr_renamed_4, nArray5, sprirb3.cfr_renamed_4);
        sprzjb.cfr_renamed_2021(sprirb8.cfr_renamed_4, nArray5, sprirb3.cfr_renamed_4);
        sprirb sprirb9 = sprirb2 = new sprirb(nArray5);
        sprzjb.cfr_renamed_2021(nArray5, sprirb3.cfr_renamed_4, sprirb9.cfr_renamed_4);
        sprirb sprirb10 = sprirb2;
        sprzjb.cfr_renamed_2022(sprirb9.cfr_renamed_4, nArray4, sprirb10.cfr_renamed_4);
        sprzjb.cfr_renamed_2021(sprirb10.cfr_renamed_4, nArray6, sprirb2.cfr_renamed_4);
        sprirb sprirb11 = new sprirb(nArray4);
        sprzjb.cfr_renamed_2024(sprirb7.cfr_renamed_4, sprirb11.cfr_renamed_4);
        if (!sprirb6.cfr_renamed_287()) {
            sprzjb.cfr_renamed_2022(sprirb11.cfr_renamed_4, sprirb6.cfr_renamed_4, sprirb11.cfr_renamed_4);
        }
        sprwtb[] sprwtbArray = new sprwtb[1];
        sprwtbArray[0] = sprirb11;
        return new sprdnb(sprpib2, sprirb3, sprirb2, sprwtbArray, this.cfr_renamed_91);
    }

    @Override
    public sprrlb cfr_renamed_1773() {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprdnb sprdnb2 = this;
        sprdnb sprdnb3 = this;
        return new sprdnb(sprdnb2.cfr_renamed_3, sprdnb2.cfr_renamed_2, this.cfr_renamed_4.cfr_renamed_1773(), sprdnb3.cfr_renamed_0, sprdnb3.cfr_renamed_91);
    }

    public sprdnb(sprpib arg0, sprwtb arg1, sprwtb arg2, boolean arg3) {
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
            throw new IllegalArgumentException(sprfcs.cfr_renamed_9("%\u001c\u0001\u0007\u0014\b\u0019D\u000f\n\u0005D\u000f\u0002@\u0010\b\u0001@\u0002\t\u0001\f\u0000@\u0001\f\u0001\r\u0001\u000e\u0010\u0013D\t\u0017@\n\u0015\b\f"));
        }
        this.cfr_renamed_91 = arg3;
    }

    @Override
    public sprrlb cfr_renamed_1804() {
        if (this.cfr_renamed_1952() || this.cfr_renamed_4.cfr_renamed_805()) {
            return this;
        }
        return this.cfr_renamed_1774().cfr_renamed_1772(this);
    }

    @Override
    public sprrlb cfr_renamed_1977() {
        return new sprdnb(null, this.cfr_renamed_1969(), this.cfr_renamed_1973());
    }
}

