/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprroh;
import com.spire.presentation.packages.sprsrh;
import com.spire.presentation.packages.sprthh;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprxoh;

public class sprpvh
extends sprroh {
    @Override
    public spreuh cfr_renamed_8630(spreuh arg0) {
        sprsrh sprsrh2;
        int[] nArray;
        int[] nArray2;
        sprsrh sprsrh3;
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
        sprpvh sprpvh2 = this;
        sprgxh sprgxh2 = sprpvh2.cfr_renamed_1769();
        sprsrh sprsrh4 = (sprsrh)sprpvh2.cfr_renamed_3;
        sprsrh sprsrh5 = (sprsrh)this.cfr_renamed_4;
        sprsrh sprsrh6 = (sprsrh)arg0.cfr_renamed_1832();
        sprsrh sprsrh7 = (sprsrh)arg0.cfr_renamed_1831();
        sprsrh sprsrh8 = (sprsrh)this.cfr_renamed_1[0];
        sprsrh sprsrh9 = (sprsrh)arg0.cfr_renamed_1964(0);
        int[] nArray5 = sprthh.cfr_renamed_1633();
        int[] nArray6 = sprthh.cfr_renamed_1631();
        int[] nArray7 = sprthh.cfr_renamed_1631();
        int[] nArray8 = sprthh.cfr_renamed_1631();
        boolean bl = sprsrh8.cfr_renamed_287();
        if (bl) {
            nArray4 = sprsrh6.cfr_renamed_112;
            nArray3 = sprsrh7.cfr_renamed_112;
            sprsrh3 = sprsrh9;
        } else {
            nArray3 = nArray7;
            sprxoh.cfr_renamed_1627(sprsrh8.cfr_renamed_112, nArray3);
            nArray4 = nArray6;
            sprsrh3 = sprsrh9;
            sprxoh.cfr_renamed_2022(nArray3, sprsrh6.cfr_renamed_112, nArray4);
            sprxoh.cfr_renamed_2022(nArray3, sprsrh8.cfr_renamed_112, nArray3);
            sprxoh.cfr_renamed_2022(nArray3, sprsrh7.cfr_renamed_112, nArray3);
        }
        boolean bl2 = sprsrh3.cfr_renamed_287();
        if (bl2) {
            nArray2 = sprsrh4.cfr_renamed_112;
            nArray = sprsrh5.cfr_renamed_112;
        } else {
            nArray = nArray8;
            sprxoh.cfr_renamed_1627(sprsrh9.cfr_renamed_112, nArray);
            nArray2 = nArray5;
            sprxoh.cfr_renamed_2022(nArray, sprsrh4.cfr_renamed_112, nArray2);
            sprxoh.cfr_renamed_2022(nArray, sprsrh9.cfr_renamed_112, nArray);
            sprxoh.cfr_renamed_2022(nArray, sprsrh5.cfr_renamed_112, nArray);
        }
        int[] nArray9 = sprthh.cfr_renamed_1631();
        sprxoh.cfr_renamed_2021(nArray2, nArray4, nArray9);
        int[] nArray10 = nArray6;
        sprxoh.cfr_renamed_2021(nArray, nArray3, nArray10);
        if (sprthh.cfr_renamed_1660(nArray9)) {
            if (sprthh.cfr_renamed_1660(nArray10)) {
                return this.cfr_renamed_1774();
            }
            return sprgxh2.cfr_renamed_1770();
        }
        int[] nArray11 = nArray7;
        sprxoh.cfr_renamed_1627(nArray9, nArray11);
        int[] nArray12 = sprthh.cfr_renamed_1631();
        sprxoh.cfr_renamed_2022(nArray11, nArray9, nArray12);
        int[] nArray13 = nArray7;
        int[] nArray14 = nArray12;
        sprxoh.cfr_renamed_2022(nArray11, nArray2, nArray13);
        sprxoh.cfr_renamed_2027(nArray12, nArray14);
        sprthh.cfr_renamed_1636(nArray, nArray14, nArray5);
        sprxoh.cfr_renamed_2032(sprthh.cfr_renamed_1663(nArray13, nArray13, nArray12), nArray12);
        sprsrh sprsrh10 = sprsrh2 = new sprsrh(nArray8);
        sprxoh.cfr_renamed_1627(nArray10, sprsrh10.cfr_renamed_112);
        sprxoh.cfr_renamed_2021(sprsrh10.cfr_renamed_112, nArray12, sprsrh2.cfr_renamed_112);
        sprsrh sprsrh11 = new sprsrh(nArray12);
        sprxoh.cfr_renamed_2021(nArray13, sprsrh10.cfr_renamed_112, sprsrh11.cfr_renamed_112);
        sprsrh sprsrh12 = sprsrh11;
        sprxoh.cfr_renamed_2037(sprsrh12.cfr_renamed_112, nArray10, nArray5);
        sprxoh.cfr_renamed_2028(nArray5, sprsrh12.cfr_renamed_112);
        sprsrh sprsrh13 = new sprsrh(nArray9);
        if (!bl) {
            sprxoh.cfr_renamed_2022(sprsrh13.cfr_renamed_112, sprsrh8.cfr_renamed_112, sprsrh13.cfr_renamed_112);
        }
        if (!bl2) {
            sprxoh.cfr_renamed_2022(sprsrh13.cfr_renamed_112, sprsrh9.cfr_renamed_112, sprsrh13.cfr_renamed_112);
        }
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = sprsrh13;
        sprlsh[] sprlshArray2 = sprlshArray;
        return new sprpvh(sprgxh2, sprsrh2, sprsrh11, sprlshArray2);
    }

    @Override
    public spreuh cfr_renamed_1977() {
        return new sprpvh(null, this.cfr_renamed_1969(), this.cfr_renamed_1973());
    }

    @Override
    public spreuh cfr_renamed_1804() {
        if (this.cfr_renamed_1952() || this.cfr_renamed_4.cfr_renamed_805()) {
            return this;
        }
        return this.cfr_renamed_1774().cfr_renamed_8630(this);
    }

    @Override
    public spreuh cfr_renamed_8652(spreuh arg0) {
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
        return this.cfr_renamed_1774().cfr_renamed_8630(arg0);
    }

    public sprpvh(sprgxh arg0, sprlsh arg1, sprlsh arg2, sprlsh[] arg3) {
        super(arg0, arg1, arg2, arg3);
    }

    public sprpvh(sprgxh arg0, sprlsh arg1, sprlsh arg2) {
        super(arg0, arg1, arg2);
    }

    @Override
    public spreuh cfr_renamed_1774() {
        sprsrh sprsrh2;
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprpvh sprpvh2 = this;
        sprgxh sprgxh2 = sprpvh2.cfr_renamed_1769();
        sprsrh sprsrh3 = (sprsrh)sprpvh2.cfr_renamed_4;
        if (sprsrh3.cfr_renamed_805()) {
            return sprgxh2.cfr_renamed_1770();
        }
        sprsrh sprsrh4 = (sprsrh)this.cfr_renamed_3;
        sprsrh sprsrh5 = (sprsrh)this.cfr_renamed_1[0];
        int[] nArray = sprthh.cfr_renamed_1631();
        int[] nArray2 = sprthh.cfr_renamed_1631();
        int[] nArray3 = sprthh.cfr_renamed_1631();
        sprxoh.cfr_renamed_1627(sprsrh3.cfr_renamed_112, nArray3);
        int[] nArray4 = sprthh.cfr_renamed_1631();
        sprsrh sprsrh6 = sprsrh5;
        sprxoh.cfr_renamed_1627(nArray3, nArray4);
        boolean bl = sprsrh6.cfr_renamed_287();
        int[] nArray5 = sprsrh6.cfr_renamed_112;
        if (!bl) {
            nArray5 = nArray2;
            sprxoh.cfr_renamed_1627(sprsrh5.cfr_renamed_112, nArray5);
        }
        sprxoh.cfr_renamed_2021(sprsrh4.cfr_renamed_112, nArray5, nArray);
        int[] nArray6 = nArray2;
        sprxoh.cfr_renamed_1654(sprsrh4.cfr_renamed_112, nArray5, nArray6);
        sprxoh.cfr_renamed_2022(nArray6, nArray, nArray6);
        int n = sprthh.cfr_renamed_1663(nArray6, nArray6, nArray6);
        sprxoh.cfr_renamed_2032(n, nArray6);
        int[] nArray7 = nArray3;
        sprxoh.cfr_renamed_2022(nArray3, sprsrh4.cfr_renamed_112, nArray7);
        n = sprvih.cfr_renamed_1705(4, nArray7, 2, 0);
        sprxoh.cfr_renamed_2032(n, nArray7);
        n = sprvih.cfr_renamed_1731(4, nArray4, 3, 0, nArray);
        sprxoh.cfr_renamed_2032(n, nArray);
        sprsrh sprsrh7 = new sprsrh(nArray4);
        sprxoh.cfr_renamed_1627(nArray6, sprsrh7.cfr_renamed_112);
        sprsrh sprsrh8 = sprsrh7;
        sprxoh.cfr_renamed_2021(sprsrh7.cfr_renamed_112, nArray7, sprsrh8.cfr_renamed_112);
        sprxoh.cfr_renamed_2021(sprsrh8.cfr_renamed_112, nArray7, sprsrh7.cfr_renamed_112);
        sprsrh sprsrh9 = sprsrh2 = new sprsrh(nArray7);
        sprxoh.cfr_renamed_2021(nArray7, sprsrh7.cfr_renamed_112, sprsrh9.cfr_renamed_112);
        sprsrh sprsrh10 = sprsrh2;
        sprxoh.cfr_renamed_2022(sprsrh9.cfr_renamed_112, nArray6, sprsrh10.cfr_renamed_112);
        sprxoh.cfr_renamed_2021(sprsrh10.cfr_renamed_112, nArray, sprsrh2.cfr_renamed_112);
        sprsrh sprsrh11 = new sprsrh(nArray6);
        sprxoh.cfr_renamed_2024(sprsrh3.cfr_renamed_112, sprsrh11.cfr_renamed_112);
        if (!bl) {
            sprxoh.cfr_renamed_2022(sprsrh11.cfr_renamed_112, sprsrh5.cfr_renamed_112, sprsrh11.cfr_renamed_112);
        }
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = sprsrh11;
        return new sprpvh(sprgxh2, sprsrh7, sprsrh2, sprlshArray);
    }

    @Override
    public spreuh cfr_renamed_1773() {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprpvh sprpvh2 = this;
        return new sprpvh(sprpvh2.cfr_renamed_0, sprpvh2.cfr_renamed_3, this.cfr_renamed_4.cfr_renamed_1773(), this.cfr_renamed_1);
    }
}

