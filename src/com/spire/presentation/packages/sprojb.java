/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprikb;
import com.spire.presentation.packages.sprksb;
import com.spire.presentation.packages.sprnlb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprrpb;
import com.spire.presentation.packages.sprssb;
import com.spire.presentation.packages.sprwlb;
import com.spire.presentation.packages.sprwtb;

public class sprojb
extends sprikb {
    public sprojb(sprpib arg0, sprwtb arg1, sprwtb arg2) {
        this(arg0, arg1, arg2, false);
    }

    public sprojb(sprpib arg0, sprwtb arg1, sprwtb arg2, boolean arg3) {
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
            throw new IllegalArgumentException(sprwlb.cfr_renamed_9("\fD(_=P0\u001c&R,\u001c&ZiH!YiZ Y%XiY%Y$Y'H:\u001c OiR<P%"));
        }
        this.cfr_renamed_91 = arg3;
    }

    @Override
    public sprrlb cfr_renamed_1773() {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprojb sprojb2 = this;
        sprojb sprojb3 = this;
        return new sprojb(sprojb2.cfr_renamed_3, sprojb2.cfr_renamed_2, this.cfr_renamed_4.cfr_renamed_1773(), sprojb3.cfr_renamed_0, sprojb3.cfr_renamed_91);
    }

    @Override
    public sprrlb cfr_renamed_1804() {
        if (this.cfr_renamed_1952() || this.cfr_renamed_4.cfr_renamed_805()) {
            return this;
        }
        return this.cfr_renamed_1774().cfr_renamed_1772(this);
    }

    @Override
    public sprrlb cfr_renamed_1774() {
        sprssb sprssb2;
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprojb sprojb2 = this;
        sprpib sprpib2 = sprojb2.cfr_renamed_1769();
        sprssb sprssb3 = (sprssb)sprojb2.cfr_renamed_4;
        if (sprssb3.cfr_renamed_805()) {
            return sprpib2.cfr_renamed_1770();
        }
        sprssb sprssb4 = (sprssb)this.cfr_renamed_2;
        sprssb sprssb5 = (sprssb)this.cfr_renamed_0[0];
        int[] nArray = sprrpb.cfr_renamed_1716(12);
        int[] nArray2 = sprrpb.cfr_renamed_1716(12);
        int[] nArray3 = sprrpb.cfr_renamed_1716(12);
        sprnlb.cfr_renamed_1627(sprssb3.cfr_renamed_4, nArray3);
        int[] nArray4 = sprrpb.cfr_renamed_1716(12);
        sprssb sprssb6 = sprssb5;
        sprnlb.cfr_renamed_1627(nArray3, nArray4);
        boolean bl = sprssb6.cfr_renamed_287();
        int[] nArray5 = sprssb6.cfr_renamed_4;
        if (!bl) {
            nArray5 = nArray2;
            sprnlb.cfr_renamed_1627(sprssb5.cfr_renamed_4, nArray5);
        }
        sprnlb.cfr_renamed_2021(sprssb4.cfr_renamed_4, nArray5, nArray);
        int[] nArray6 = nArray2;
        sprnlb.cfr_renamed_1654(sprssb4.cfr_renamed_4, nArray5, nArray6);
        sprnlb.cfr_renamed_2022(nArray6, nArray, nArray6);
        int n = sprrpb.cfr_renamed_1738(12, nArray6, nArray6, nArray6);
        sprnlb.cfr_renamed_2032(n, nArray6);
        int[] nArray7 = nArray3;
        sprnlb.cfr_renamed_2022(nArray3, sprssb4.cfr_renamed_4, nArray7);
        n = sprrpb.cfr_renamed_1705(12, nArray7, 2, 0);
        sprnlb.cfr_renamed_2032(n, nArray7);
        n = sprrpb.cfr_renamed_1731(12, nArray4, 3, 0, nArray);
        sprnlb.cfr_renamed_2032(n, nArray);
        sprssb sprssb7 = new sprssb(nArray4);
        sprnlb.cfr_renamed_1627(nArray6, sprssb7.cfr_renamed_4);
        sprssb sprssb8 = sprssb7;
        sprnlb.cfr_renamed_2021(sprssb7.cfr_renamed_4, nArray7, sprssb8.cfr_renamed_4);
        sprnlb.cfr_renamed_2021(sprssb8.cfr_renamed_4, nArray7, sprssb7.cfr_renamed_4);
        sprssb sprssb9 = sprssb2 = new sprssb(nArray7);
        sprnlb.cfr_renamed_2021(nArray7, sprssb7.cfr_renamed_4, sprssb9.cfr_renamed_4);
        sprssb sprssb10 = sprssb2;
        sprnlb.cfr_renamed_2022(sprssb9.cfr_renamed_4, nArray6, sprssb10.cfr_renamed_4);
        sprnlb.cfr_renamed_2021(sprssb10.cfr_renamed_4, nArray, sprssb2.cfr_renamed_4);
        sprssb sprssb11 = new sprssb(nArray6);
        sprnlb.cfr_renamed_2024(sprssb3.cfr_renamed_4, sprssb11.cfr_renamed_4);
        if (!bl) {
            sprnlb.cfr_renamed_2022(sprssb11.cfr_renamed_4, sprssb5.cfr_renamed_4, sprssb11.cfr_renamed_4);
        }
        sprwtb[] sprwtbArray = new sprwtb[1];
        sprwtbArray[0] = sprssb11;
        return new sprojb(sprpib2, sprssb7, sprssb2, sprwtbArray, this.cfr_renamed_91);
    }

    /*
     * WARNING - void declaration
     */
    public sprojb(sprpib sprpib2, sprwtb sprwtb2, sprwtb sprwtb3, sprwtb[] sprwtbArray, boolean bl) {
        super((sprpib)arg0, (sprwtb)arg1, (sprwtb)arg2, (sprwtb[])arg3);
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_91 = bl;
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
        sprssb sprssb2;
        sprssb sprssb3;
        int[] nArray;
        int[] nArray2;
        sprssb sprssb4;
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
        sprojb sprojb2 = this;
        sprpib sprpib2 = sprojb2.cfr_renamed_1769();
        sprssb sprssb5 = (sprssb)sprojb2.cfr_renamed_2;
        sprssb sprssb6 = (sprssb)this.cfr_renamed_4;
        sprssb sprssb7 = (sprssb)arg0.cfr_renamed_1832();
        sprssb sprssb8 = (sprssb)arg0.cfr_renamed_1831();
        sprssb sprssb9 = (sprssb)this.cfr_renamed_0[0];
        sprssb sprssb10 = (sprssb)arg0.cfr_renamed_1964(0);
        int[] nArray5 = sprrpb.cfr_renamed_1716(24);
        int[] nArray6 = sprrpb.cfr_renamed_1716(24);
        int[] nArray7 = sprrpb.cfr_renamed_1716(12);
        int[] nArray8 = sprrpb.cfr_renamed_1716(12);
        boolean bl = sprssb9.cfr_renamed_287();
        if (bl) {
            nArray4 = sprssb7.cfr_renamed_4;
            nArray3 = sprssb8.cfr_renamed_4;
            sprssb4 = sprssb10;
        } else {
            nArray3 = nArray7;
            sprnlb.cfr_renamed_1627(sprssb9.cfr_renamed_4, nArray3);
            nArray4 = nArray6;
            sprssb4 = sprssb10;
            sprnlb.cfr_renamed_2022(nArray3, sprssb7.cfr_renamed_4, nArray4);
            sprnlb.cfr_renamed_2022(nArray3, sprssb9.cfr_renamed_4, nArray3);
            sprnlb.cfr_renamed_2022(nArray3, sprssb8.cfr_renamed_4, nArray3);
        }
        boolean bl2 = sprssb4.cfr_renamed_287();
        if (bl2) {
            nArray2 = sprssb5.cfr_renamed_4;
            nArray = sprssb6.cfr_renamed_4;
        } else {
            nArray = nArray8;
            sprnlb.cfr_renamed_1627(sprssb10.cfr_renamed_4, nArray);
            nArray2 = nArray5;
            sprnlb.cfr_renamed_2022(nArray, sprssb5.cfr_renamed_4, nArray2);
            sprnlb.cfr_renamed_2022(nArray, sprssb10.cfr_renamed_4, nArray);
            sprnlb.cfr_renamed_2022(nArray, sprssb6.cfr_renamed_4, nArray);
        }
        int[] nArray9 = sprrpb.cfr_renamed_1716(12);
        sprnlb.cfr_renamed_2021(nArray2, nArray4, nArray9);
        int[] nArray10 = sprrpb.cfr_renamed_1716(12);
        sprnlb.cfr_renamed_2021(nArray, nArray3, nArray10);
        if (sprrpb.cfr_renamed_1737(12, nArray9)) {
            if (sprrpb.cfr_renamed_1737(12, nArray10)) {
                return this.cfr_renamed_1774();
            }
            return sprpib2.cfr_renamed_1770();
        }
        int[] nArray11 = nArray7;
        sprnlb.cfr_renamed_1627(nArray9, nArray11);
        int[] nArray12 = sprrpb.cfr_renamed_1716(12);
        sprnlb.cfr_renamed_2022(nArray11, nArray9, nArray12);
        int[] nArray13 = nArray7;
        int[] nArray14 = nArray12;
        sprnlb.cfr_renamed_2022(nArray11, nArray2, nArray13);
        sprnlb.cfr_renamed_2027(nArray12, nArray14);
        sprksb.cfr_renamed_1636(nArray, nArray14, nArray5);
        sprnlb.cfr_renamed_2032(sprrpb.cfr_renamed_1738(12, nArray13, nArray13, nArray12), nArray12);
        sprssb sprssb11 = sprssb3 = new sprssb(nArray8);
        sprnlb.cfr_renamed_1627(nArray10, sprssb11.cfr_renamed_4);
        sprnlb.cfr_renamed_2021(sprssb11.cfr_renamed_4, nArray12, sprssb3.cfr_renamed_4);
        sprssb sprssb12 = sprssb2 = new sprssb(nArray12);
        sprnlb.cfr_renamed_2021(nArray13, sprssb3.cfr_renamed_4, sprssb12.cfr_renamed_4);
        sprksb.cfr_renamed_1636(sprssb12.cfr_renamed_4, nArray10, nArray6);
        sprnlb.cfr_renamed_2033(nArray5, nArray6, nArray5);
        sprnlb.cfr_renamed_2028(nArray5, sprssb12.cfr_renamed_4);
        sprssb sprssb13 = new sprssb(nArray9);
        if (!bl) {
            sprnlb.cfr_renamed_2022(sprssb13.cfr_renamed_4, sprssb9.cfr_renamed_4, sprssb13.cfr_renamed_4);
        }
        if (!bl2) {
            sprnlb.cfr_renamed_2022(sprssb13.cfr_renamed_4, sprssb10.cfr_renamed_4, sprssb13.cfr_renamed_4);
        }
        sprwtb[] sprwtbArray = new sprwtb[1];
        sprwtbArray[0] = sprssb13;
        sprwtb[] sprwtbArray2 = sprwtbArray;
        return new sprojb(sprpib2, sprssb3, sprssb2, sprwtbArray2, this.cfr_renamed_91);
    }

    @Override
    public sprrlb cfr_renamed_1977() {
        return new sprojb(null, this.cfr_renamed_1969(), this.cfr_renamed_1973());
    }
}

