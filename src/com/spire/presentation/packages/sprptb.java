/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprclb;
import com.spire.presentation.packages.sprikb;
import com.spire.presentation.packages.sprkjb;
import com.spire.presentation.packages.sprlida;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprqqb;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprrpb;
import com.spire.presentation.packages.sprwtb;

public class sprptb
extends sprikb {
    @Override
    public sprrlb cfr_renamed_1772(sprrlb arg0) {
        sprclb sprclb2;
        int[] nArray;
        int[] nArray2;
        sprclb sprclb3;
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
        sprptb sprptb2 = this;
        sprpib sprpib2 = sprptb2.cfr_renamed_1769();
        sprclb sprclb4 = (sprclb)sprptb2.cfr_renamed_2;
        sprclb sprclb5 = (sprclb)this.cfr_renamed_4;
        sprclb sprclb6 = (sprclb)arg0.cfr_renamed_1832();
        sprclb sprclb7 = (sprclb)arg0.cfr_renamed_1831();
        sprclb sprclb8 = (sprclb)this.cfr_renamed_0[0];
        sprclb sprclb9 = (sprclb)arg0.cfr_renamed_1964(0);
        int[] nArray5 = sprkjb.cfr_renamed_1633();
        int[] nArray6 = sprkjb.cfr_renamed_1631();
        int[] nArray7 = sprkjb.cfr_renamed_1631();
        int[] nArray8 = sprkjb.cfr_renamed_1631();
        boolean bl = sprclb8.cfr_renamed_287();
        if (bl) {
            nArray4 = sprclb6.cfr_renamed_4;
            nArray3 = sprclb7.cfr_renamed_4;
            sprclb3 = sprclb9;
        } else {
            nArray3 = nArray7;
            sprqqb.cfr_renamed_1627(sprclb8.cfr_renamed_4, nArray3);
            nArray4 = nArray6;
            sprclb3 = sprclb9;
            sprqqb.cfr_renamed_2022(nArray3, sprclb6.cfr_renamed_4, nArray4);
            sprqqb.cfr_renamed_2022(nArray3, sprclb8.cfr_renamed_4, nArray3);
            sprqqb.cfr_renamed_2022(nArray3, sprclb7.cfr_renamed_4, nArray3);
        }
        boolean bl2 = sprclb3.cfr_renamed_287();
        if (bl2) {
            nArray2 = sprclb4.cfr_renamed_4;
            nArray = sprclb5.cfr_renamed_4;
        } else {
            nArray = nArray8;
            sprqqb.cfr_renamed_1627(sprclb9.cfr_renamed_4, nArray);
            nArray2 = nArray5;
            sprqqb.cfr_renamed_2022(nArray, sprclb4.cfr_renamed_4, nArray2);
            sprqqb.cfr_renamed_2022(nArray, sprclb9.cfr_renamed_4, nArray);
            sprqqb.cfr_renamed_2022(nArray, sprclb5.cfr_renamed_4, nArray);
        }
        int[] nArray9 = sprkjb.cfr_renamed_1631();
        sprqqb.cfr_renamed_2021(nArray2, nArray4, nArray9);
        int[] nArray10 = nArray6;
        sprqqb.cfr_renamed_2021(nArray, nArray3, nArray10);
        if (sprkjb.cfr_renamed_1660(nArray9)) {
            if (sprkjb.cfr_renamed_1660(nArray10)) {
                return this.cfr_renamed_1774();
            }
            return sprpib2.cfr_renamed_1770();
        }
        int[] nArray11 = nArray7;
        sprqqb.cfr_renamed_1627(nArray9, nArray11);
        int[] nArray12 = sprkjb.cfr_renamed_1631();
        sprqqb.cfr_renamed_2022(nArray11, nArray9, nArray12);
        int[] nArray13 = nArray7;
        int[] nArray14 = nArray12;
        sprqqb.cfr_renamed_2022(nArray11, nArray2, nArray13);
        sprqqb.cfr_renamed_2027(nArray12, nArray14);
        sprkjb.cfr_renamed_1636(nArray, nArray14, nArray5);
        sprqqb.cfr_renamed_2032(sprkjb.cfr_renamed_1663(nArray13, nArray13, nArray12), nArray12);
        sprclb sprclb10 = sprclb2 = new sprclb(nArray8);
        sprqqb.cfr_renamed_1627(nArray10, sprclb10.cfr_renamed_4);
        sprqqb.cfr_renamed_2021(sprclb10.cfr_renamed_4, nArray12, sprclb2.cfr_renamed_4);
        sprclb sprclb11 = new sprclb(nArray12);
        sprqqb.cfr_renamed_2021(nArray13, sprclb10.cfr_renamed_4, sprclb11.cfr_renamed_4);
        sprclb sprclb12 = sprclb11;
        sprqqb.cfr_renamed_2037(sprclb12.cfr_renamed_4, nArray10, nArray5);
        sprqqb.cfr_renamed_2028(nArray5, sprclb12.cfr_renamed_4);
        sprclb sprclb13 = new sprclb(nArray9);
        if (!bl) {
            sprqqb.cfr_renamed_2022(sprclb13.cfr_renamed_4, sprclb8.cfr_renamed_4, sprclb13.cfr_renamed_4);
        }
        if (!bl2) {
            sprqqb.cfr_renamed_2022(sprclb13.cfr_renamed_4, sprclb9.cfr_renamed_4, sprclb13.cfr_renamed_4);
        }
        sprwtb[] sprwtbArray = new sprwtb[1];
        sprwtbArray[0] = sprclb13;
        sprwtb[] sprwtbArray2 = sprwtbArray;
        return new sprptb(sprpib2, sprclb2, sprclb11, sprwtbArray2, this.cfr_renamed_91);
    }

    public sprptb(sprpib arg0, sprwtb arg1, sprwtb arg2, boolean arg3) {
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
            throw new IllegalArgumentException(sprlida.cfr_renamed_9("T\u0005p\u001ee\u0011h]~\u0013t]~\u001b1\ty\u00181\u001bx\u0018}\u00191\u0018}\u0018|\u0018\u007f\tb]x\u000e1\u0013d\u0011}"));
        }
        this.cfr_renamed_91 = arg3;
    }

    @Override
    public sprrlb cfr_renamed_1774() {
        sprclb sprclb2;
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprptb sprptb2 = this;
        sprpib sprpib2 = sprptb2.cfr_renamed_1769();
        sprclb sprclb3 = (sprclb)sprptb2.cfr_renamed_4;
        if (sprclb3.cfr_renamed_805()) {
            return sprpib2.cfr_renamed_1770();
        }
        sprclb sprclb4 = (sprclb)this.cfr_renamed_2;
        sprclb sprclb5 = (sprclb)this.cfr_renamed_0[0];
        int[] nArray = sprkjb.cfr_renamed_1631();
        int[] nArray2 = sprkjb.cfr_renamed_1631();
        int[] nArray3 = sprkjb.cfr_renamed_1631();
        sprqqb.cfr_renamed_1627(sprclb3.cfr_renamed_4, nArray3);
        int[] nArray4 = sprkjb.cfr_renamed_1631();
        sprclb sprclb6 = sprclb5;
        sprqqb.cfr_renamed_1627(nArray3, nArray4);
        boolean bl = sprclb6.cfr_renamed_287();
        int[] nArray5 = sprclb6.cfr_renamed_4;
        if (!bl) {
            nArray5 = nArray2;
            sprqqb.cfr_renamed_1627(sprclb5.cfr_renamed_4, nArray5);
        }
        sprqqb.cfr_renamed_2021(sprclb4.cfr_renamed_4, nArray5, nArray);
        int[] nArray6 = nArray2;
        sprqqb.cfr_renamed_1654(sprclb4.cfr_renamed_4, nArray5, nArray6);
        sprqqb.cfr_renamed_2022(nArray6, nArray, nArray6);
        int n = sprkjb.cfr_renamed_1663(nArray6, nArray6, nArray6);
        sprqqb.cfr_renamed_2032(n, nArray6);
        int[] nArray7 = nArray3;
        sprqqb.cfr_renamed_2022(nArray3, sprclb4.cfr_renamed_4, nArray7);
        n = sprrpb.cfr_renamed_1705(7, nArray7, 2, 0);
        sprqqb.cfr_renamed_2032(n, nArray7);
        n = sprrpb.cfr_renamed_1731(7, nArray4, 3, 0, nArray);
        sprqqb.cfr_renamed_2032(n, nArray);
        sprclb sprclb7 = new sprclb(nArray4);
        sprqqb.cfr_renamed_1627(nArray6, sprclb7.cfr_renamed_4);
        sprclb sprclb8 = sprclb7;
        sprqqb.cfr_renamed_2021(sprclb7.cfr_renamed_4, nArray7, sprclb8.cfr_renamed_4);
        sprqqb.cfr_renamed_2021(sprclb8.cfr_renamed_4, nArray7, sprclb7.cfr_renamed_4);
        sprclb sprclb9 = sprclb2 = new sprclb(nArray7);
        sprqqb.cfr_renamed_2021(nArray7, sprclb7.cfr_renamed_4, sprclb9.cfr_renamed_4);
        sprclb sprclb10 = sprclb2;
        sprqqb.cfr_renamed_2022(sprclb9.cfr_renamed_4, nArray6, sprclb10.cfr_renamed_4);
        sprqqb.cfr_renamed_2021(sprclb10.cfr_renamed_4, nArray, sprclb2.cfr_renamed_4);
        sprclb sprclb11 = new sprclb(nArray6);
        sprqqb.cfr_renamed_2024(sprclb3.cfr_renamed_4, sprclb11.cfr_renamed_4);
        if (!bl) {
            sprqqb.cfr_renamed_2022(sprclb11.cfr_renamed_4, sprclb5.cfr_renamed_4, sprclb11.cfr_renamed_4);
        }
        sprwtb[] sprwtbArray = new sprwtb[1];
        sprwtbArray[0] = sprclb11;
        return new sprptb(sprpib2, sprclb7, sprclb2, sprwtbArray, this.cfr_renamed_91);
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

    public sprptb(sprpib arg0, sprwtb arg1, sprwtb arg2) {
        this(arg0, arg1, arg2, false);
    }

    @Override
    public sprrlb cfr_renamed_1773() {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprptb sprptb2 = this;
        sprptb sprptb3 = this;
        return new sprptb(sprptb2.cfr_renamed_3, sprptb2.cfr_renamed_2, this.cfr_renamed_4.cfr_renamed_1773(), sprptb3.cfr_renamed_0, sprptb3.cfr_renamed_91);
    }

    @Override
    public sprrlb cfr_renamed_1977() {
        return new sprptb(null, this.cfr_renamed_1969(), this.cfr_renamed_1973());
    }

    @Override
    public sprrlb cfr_renamed_1804() {
        if (this.cfr_renamed_1952() || this.cfr_renamed_4.cfr_renamed_805()) {
            return this;
        }
        return this.cfr_renamed_1774().cfr_renamed_1772(this);
    }

    /*
     * WARNING - void declaration
     */
    public sprptb(sprpib sprpib2, sprwtb sprwtb2, sprwtb sprwtb3, sprwtb[] sprwtbArray, boolean bl) {
        super((sprpib)arg0, (sprwtb)arg1, (sprwtb)arg2, (sprwtb[])arg3);
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_91 = bl;
    }
}

