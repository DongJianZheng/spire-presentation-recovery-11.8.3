/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvca;
import com.spire.presentation.packages.sprikb;
import com.spire.presentation.packages.sprimb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprwtb;
import com.spire.presentation.packages.spryrb;
import com.spire.presentation.packages.sprztb;

public class sprtlb
extends sprikb {
    @Override
    public sprwtb cfr_renamed_1964(int arg0) {
        if (arg0 == 1) {
            return this.cfr_renamed_2043();
        }
        return super.cfr_renamed_1964(arg0);
    }

    public sprtlb(sprpib arg0, sprwtb arg1, sprwtb arg2) {
        this(arg0, arg1, arg2, false);
    }

    @Override
    public sprrlb cfr_renamed_1804() {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        if (this.cfr_renamed_4.cfr_renamed_805()) {
            return this;
        }
        return this.cfr_renamed_2044(false).cfr_renamed_1772(this);
    }

    public sprimb cfr_renamed_2043() {
        sprimb sprimb2 = (sprimb)this.cfr_renamed_0[1];
        if (sprimb2 == null) {
            sprtlb sprtlb2 = this;
            sprimb2 = sprtlb2.cfr_renamed_2045((sprimb)sprtlb2.cfr_renamed_0[0], null);
            this.cfr_renamed_0[1] = sprimb2;
        }
        return sprimb2;
    }

    @Override
    public sprrlb cfr_renamed_1772(sprrlb arg0) {
        sprimb sprimb2;
        int[] nArray;
        int[] nArray2;
        sprimb sprimb3;
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
        sprtlb sprtlb2 = this;
        sprpib sprpib2 = sprtlb2.cfr_renamed_1769();
        sprimb sprimb4 = (sprimb)sprtlb2.cfr_renamed_2;
        sprimb sprimb5 = (sprimb)this.cfr_renamed_4;
        sprimb sprimb6 = (sprimb)this.cfr_renamed_0[0];
        sprimb sprimb7 = (sprimb)arg0.cfr_renamed_1832();
        sprimb sprimb8 = (sprimb)arg0.cfr_renamed_1831();
        sprimb sprimb9 = (sprimb)arg0.cfr_renamed_1964(0);
        int[] nArray5 = spryrb.cfr_renamed_1633();
        int[] nArray6 = spryrb.cfr_renamed_1631();
        int[] nArray7 = spryrb.cfr_renamed_1631();
        int[] nArray8 = spryrb.cfr_renamed_1631();
        boolean bl = sprimb6.cfr_renamed_287();
        if (bl) {
            nArray4 = sprimb7.cfr_renamed_112;
            nArray3 = sprimb8.cfr_renamed_112;
            sprimb3 = sprimb9;
        } else {
            nArray3 = nArray7;
            sprztb.cfr_renamed_1627(sprimb6.cfr_renamed_112, nArray3);
            nArray4 = nArray6;
            sprimb3 = sprimb9;
            sprztb.cfr_renamed_2022(nArray3, sprimb7.cfr_renamed_112, nArray4);
            sprztb.cfr_renamed_2022(nArray3, sprimb6.cfr_renamed_112, nArray3);
            sprztb.cfr_renamed_2022(nArray3, sprimb8.cfr_renamed_112, nArray3);
        }
        boolean bl2 = sprimb3.cfr_renamed_287();
        if (bl2) {
            nArray2 = sprimb4.cfr_renamed_112;
            nArray = sprimb5.cfr_renamed_112;
        } else {
            nArray = nArray8;
            sprztb.cfr_renamed_1627(sprimb9.cfr_renamed_112, nArray);
            nArray2 = nArray5;
            sprztb.cfr_renamed_2022(nArray, sprimb4.cfr_renamed_112, nArray2);
            sprztb.cfr_renamed_2022(nArray, sprimb9.cfr_renamed_112, nArray);
            sprztb.cfr_renamed_2022(nArray, sprimb5.cfr_renamed_112, nArray);
        }
        int[] nArray9 = spryrb.cfr_renamed_1631();
        sprztb.cfr_renamed_2021(nArray2, nArray4, nArray9);
        int[] nArray10 = nArray6;
        sprztb.cfr_renamed_2021(nArray, nArray3, nArray10);
        if (spryrb.cfr_renamed_1660(nArray9)) {
            if (spryrb.cfr_renamed_1660(nArray10)) {
                return this.cfr_renamed_1774();
            }
            return sprpib2.cfr_renamed_1770();
        }
        int[] nArray11 = spryrb.cfr_renamed_1631();
        sprztb.cfr_renamed_1627(nArray9, nArray11);
        int[] nArray12 = spryrb.cfr_renamed_1631();
        sprztb.cfr_renamed_2022(nArray11, nArray9, nArray12);
        int[] nArray13 = nArray7;
        sprztb.cfr_renamed_2022(nArray11, nArray2, nArray13);
        int[] nArray14 = nArray12;
        sprztb.cfr_renamed_2027(nArray12, nArray14);
        spryrb.cfr_renamed_1636(nArray, nArray14, nArray5);
        sprztb.cfr_renamed_2046(spryrb.cfr_renamed_1663(nArray13, nArray13, nArray12), nArray12);
        sprimb sprimb10 = sprimb2 = new sprimb(nArray8);
        sprztb.cfr_renamed_1627(nArray10, sprimb10.cfr_renamed_112);
        sprztb.cfr_renamed_2021(sprimb10.cfr_renamed_112, nArray12, sprimb2.cfr_renamed_112);
        sprimb sprimb11 = new sprimb(nArray12);
        sprztb.cfr_renamed_2021(nArray13, sprimb10.cfr_renamed_112, sprimb11.cfr_renamed_112);
        sprimb sprimb12 = sprimb11;
        sprztb.cfr_renamed_2037(sprimb12.cfr_renamed_112, nArray10, nArray5);
        sprztb.cfr_renamed_2028(nArray5, sprimb12.cfr_renamed_112);
        sprimb sprimb13 = new sprimb(nArray9);
        if (!bl) {
            sprztb.cfr_renamed_2022(sprimb13.cfr_renamed_112, sprimb6.cfr_renamed_112, sprimb13.cfr_renamed_112);
        }
        if (!bl2) {
            sprztb.cfr_renamed_2022(sprimb13.cfr_renamed_112, sprimb9.cfr_renamed_112, sprimb13.cfr_renamed_112);
        }
        int[] nArray15 = bl && bl2 ? nArray11 : null;
        sprimb sprimb14 = this.cfr_renamed_2045(sprimb13, nArray15);
        sprwtb[] sprwtbArray = new sprwtb[2];
        sprwtbArray[0] = sprimb13;
        sprwtbArray[1] = sprimb14;
        sprwtb[] sprwtbArray2 = sprwtbArray;
        return new sprtlb(sprpib2, sprimb2, sprimb11, sprwtbArray2, this.cfr_renamed_91);
    }

    public sprtlb(sprpib arg0, sprwtb arg1, sprwtb arg2, boolean arg3) {
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
            throw new IllegalArgumentException(sprfvca.cfr_renamed_9("h*L1Y>TrB<HrB4\r&E7\r4D7A6\r7A7@7C&^rD!\r<X>A"));
        }
        this.cfr_renamed_91 = arg3;
    }

    @Override
    public sprrlb cfr_renamed_1773() {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprtlb sprtlb2 = this;
        sprtlb sprtlb3 = this;
        return new sprtlb(this.cfr_renamed_1769(), sprtlb2.cfr_renamed_2, sprtlb2.cfr_renamed_4.cfr_renamed_1773(), sprtlb3.cfr_renamed_0, sprtlb3.cfr_renamed_91);
    }

    public sprtlb cfr_renamed_2044(boolean arg0) {
        sprimb sprimb2;
        int[] nArray;
        sprimb sprimb3 = (sprimb)this.cfr_renamed_2;
        sprimb sprimb4 = (sprimb)this.cfr_renamed_4;
        sprimb sprimb5 = (sprimb)this.cfr_renamed_0[0];
        sprimb sprimb6 = this.cfr_renamed_2043();
        int[] nArray2 = nArray = spryrb.cfr_renamed_1631();
        sprztb.cfr_renamed_1627(sprimb3.cfr_renamed_112, nArray2);
        int n = spryrb.cfr_renamed_1663(nArray, nArray, nArray);
        sprztb.cfr_renamed_2046(n += spryrb.cfr_renamed_1668(sprimb6.cfr_renamed_112, nArray), nArray);
        int[] nArray3 = spryrb.cfr_renamed_1631();
        sprztb.cfr_renamed_2024(sprimb4.cfr_renamed_112, nArray3);
        int[] nArray4 = spryrb.cfr_renamed_1631();
        sprztb.cfr_renamed_2022(nArray3, sprimb4.cfr_renamed_112, nArray4);
        int[] nArray5 = spryrb.cfr_renamed_1631();
        sprztb.cfr_renamed_2022(nArray4, sprimb3.cfr_renamed_112, nArray5);
        sprztb.cfr_renamed_2024(nArray5, nArray5);
        int[] nArray6 = spryrb.cfr_renamed_1631();
        sprztb.cfr_renamed_1627(nArray4, nArray6);
        sprztb.cfr_renamed_2024(nArray6, nArray6);
        sprimb sprimb7 = new sprimb(nArray4);
        sprztb.cfr_renamed_1627(nArray2, sprimb7.cfr_renamed_112);
        sprimb sprimb8 = sprimb7;
        sprztb.cfr_renamed_2021(sprimb7.cfr_renamed_112, nArray5, sprimb8.cfr_renamed_112);
        sprztb.cfr_renamed_2021(sprimb8.cfr_renamed_112, nArray5, sprimb7.cfr_renamed_112);
        sprimb sprimb9 = sprimb2 = new sprimb(nArray5);
        sprztb.cfr_renamed_2021(nArray5, sprimb7.cfr_renamed_112, sprimb9.cfr_renamed_112);
        sprimb sprimb10 = sprimb2;
        sprztb.cfr_renamed_2022(sprimb9.cfr_renamed_112, nArray, sprimb10.cfr_renamed_112);
        sprztb.cfr_renamed_2021(sprimb10.cfr_renamed_112, nArray6, sprimb2.cfr_renamed_112);
        sprimb sprimb11 = new sprimb(nArray3);
        if (!spryrb.cfr_renamed_1659(sprimb5.cfr_renamed_112)) {
            sprztb.cfr_renamed_2022(sprimb11.cfr_renamed_112, sprimb5.cfr_renamed_112, sprimb11.cfr_renamed_112);
        }
        sprimb sprimb12 = null;
        if (arg0) {
            sprimb sprimb13 = sprimb12 = new sprimb(nArray6);
            sprztb.cfr_renamed_2022(sprimb12.cfr_renamed_112, sprimb6.cfr_renamed_112, sprimb13.cfr_renamed_112);
            sprztb.cfr_renamed_2024(sprimb13.cfr_renamed_112, sprimb12.cfr_renamed_112);
        }
        sprwtb[] sprwtbArray = new sprwtb[2];
        sprwtbArray[0] = sprimb11;
        sprwtbArray[1] = sprimb12;
        return new sprtlb(this.cfr_renamed_1769(), sprimb7, sprimb2, sprwtbArray, this.cfr_renamed_91);
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
        return this.cfr_renamed_2044(false).cfr_renamed_1772(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprtlb(sprpib sprpib2, sprwtb sprwtb2, sprwtb sprwtb3, sprwtb[] sprwtbArray, boolean bl) {
        super((sprpib)arg0, (sprwtb)arg1, (sprwtb)arg2, (sprwtb[])arg3);
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_91 = bl;
    }

    @Override
    public sprrlb cfr_renamed_1977() {
        return new sprtlb(null, this.cfr_renamed_1969(), this.cfr_renamed_1973());
    }

    @Override
    public sprrlb cfr_renamed_1774() {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprtlb sprtlb2 = this;
        sprpib sprpib2 = sprtlb2.cfr_renamed_1769();
        if (sprtlb2.cfr_renamed_4.cfr_renamed_805()) {
            return sprpib2.cfr_renamed_1770();
        }
        return this.cfr_renamed_2044(true);
    }

    public sprimb cfr_renamed_2045(sprimb arg0, int[] arg1) {
        sprimb sprimb2 = (sprimb)this.cfr_renamed_1769().cfr_renamed_1778();
        if (arg0.cfr_renamed_287()) {
            return sprimb2;
        }
        sprimb sprimb3 = new sprimb();
        if (arg1 == null) {
            arg1 = sprimb3.cfr_renamed_112;
            sprztb.cfr_renamed_1627(arg0.cfr_renamed_112, arg1);
        }
        sprztb.cfr_renamed_1627(arg1, sprimb3.cfr_renamed_112);
        sprimb sprimb4 = sprimb3;
        sprztb.cfr_renamed_2022(sprimb3.cfr_renamed_112, sprimb2.cfr_renamed_112, sprimb4.cfr_renamed_112);
        return sprimb4;
    }
}

