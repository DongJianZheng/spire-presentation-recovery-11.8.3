/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprekh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprnyh;
import com.spire.presentation.packages.sprroh;
import com.spire.presentation.packages.sprtph;
import com.spire.presentation.packages.sprvih;

public class spriyh
extends sprroh {
    public spriyh(sprgxh arg0, sprlsh arg1, sprlsh arg2, sprlsh[] arg3) {
        super(arg0, arg1, arg2, arg3);
    }

    public spriyh(sprgxh arg0, sprlsh arg1, sprlsh arg2) {
        super(arg0, arg1, arg2);
    }

    @Override
    public spreuh cfr_renamed_1773() {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        spriyh spriyh2 = this;
        return new spriyh(spriyh2.cfr_renamed_0, spriyh2.cfr_renamed_3, this.cfr_renamed_4.cfr_renamed_1773(), this.cfr_renamed_1);
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

    @Override
    public spreuh cfr_renamed_1977() {
        return new spriyh(null, this.cfr_renamed_1969(), this.cfr_renamed_1973());
    }

    @Override
    public spreuh cfr_renamed_1804() {
        if (this.cfr_renamed_1952() || this.cfr_renamed_4.cfr_renamed_805()) {
            return this;
        }
        return this.cfr_renamed_1774().cfr_renamed_8630(this);
    }

    @Override
    public spreuh cfr_renamed_1774() {
        sprtph sprtph2;
        if (this.cfr_renamed_1952()) {
            return this;
        }
        spriyh spriyh2 = this;
        sprgxh sprgxh2 = spriyh2.cfr_renamed_1769();
        sprtph sprtph3 = (sprtph)spriyh2.cfr_renamed_4;
        if (sprtph3.cfr_renamed_805()) {
            return sprgxh2.cfr_renamed_1770();
        }
        sprtph sprtph4 = (sprtph)this.cfr_renamed_3;
        sprtph sprtph5 = (sprtph)this.cfr_renamed_1[0];
        int[] nArray = sprekh.cfr_renamed_1631();
        int[] nArray2 = sprekh.cfr_renamed_1631();
        int[] nArray3 = sprekh.cfr_renamed_1631();
        sprnyh.cfr_renamed_1627(sprtph3.cfr_renamed_112, nArray3);
        int[] nArray4 = sprekh.cfr_renamed_1631();
        sprtph sprtph6 = sprtph5;
        sprnyh.cfr_renamed_1627(nArray3, nArray4);
        boolean bl = sprtph6.cfr_renamed_287();
        int[] nArray5 = sprtph6.cfr_renamed_112;
        if (!bl) {
            nArray5 = nArray2;
            sprnyh.cfr_renamed_1627(sprtph5.cfr_renamed_112, nArray5);
        }
        sprnyh.cfr_renamed_2021(sprtph4.cfr_renamed_112, nArray5, nArray);
        int[] nArray6 = nArray2;
        sprnyh.cfr_renamed_1654(sprtph4.cfr_renamed_112, nArray5, nArray6);
        sprnyh.cfr_renamed_2022(nArray6, nArray, nArray6);
        int n = sprekh.cfr_renamed_1663(nArray6, nArray6, nArray6);
        sprnyh.cfr_renamed_2032(n, nArray6);
        int[] nArray7 = nArray3;
        sprnyh.cfr_renamed_2022(nArray3, sprtph4.cfr_renamed_112, nArray7);
        n = sprvih.cfr_renamed_1705(7, nArray7, 2, 0);
        sprnyh.cfr_renamed_2032(n, nArray7);
        n = sprvih.cfr_renamed_1731(7, nArray4, 3, 0, nArray);
        sprnyh.cfr_renamed_2032(n, nArray);
        sprtph sprtph7 = new sprtph(nArray4);
        sprnyh.cfr_renamed_1627(nArray6, sprtph7.cfr_renamed_112);
        sprtph sprtph8 = sprtph7;
        sprnyh.cfr_renamed_2021(sprtph7.cfr_renamed_112, nArray7, sprtph8.cfr_renamed_112);
        sprnyh.cfr_renamed_2021(sprtph8.cfr_renamed_112, nArray7, sprtph7.cfr_renamed_112);
        sprtph sprtph9 = sprtph2 = new sprtph(nArray7);
        sprnyh.cfr_renamed_2021(nArray7, sprtph7.cfr_renamed_112, sprtph9.cfr_renamed_112);
        sprtph sprtph10 = sprtph2;
        sprnyh.cfr_renamed_2022(sprtph9.cfr_renamed_112, nArray6, sprtph10.cfr_renamed_112);
        sprnyh.cfr_renamed_2021(sprtph10.cfr_renamed_112, nArray, sprtph2.cfr_renamed_112);
        sprtph sprtph11 = new sprtph(nArray6);
        sprnyh.cfr_renamed_2024(sprtph3.cfr_renamed_112, sprtph11.cfr_renamed_112);
        if (!bl) {
            sprnyh.cfr_renamed_2022(sprtph11.cfr_renamed_112, sprtph5.cfr_renamed_112, sprtph11.cfr_renamed_112);
        }
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = sprtph11;
        return new spriyh(sprgxh2, sprtph7, sprtph2, sprlshArray);
    }

    @Override
    public spreuh cfr_renamed_8630(spreuh arg0) {
        sprtph sprtph2;
        int[] nArray;
        int[] nArray2;
        sprtph sprtph3;
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
        spriyh spriyh2 = this;
        sprgxh sprgxh2 = spriyh2.cfr_renamed_1769();
        sprtph sprtph4 = (sprtph)spriyh2.cfr_renamed_3;
        sprtph sprtph5 = (sprtph)this.cfr_renamed_4;
        sprtph sprtph6 = (sprtph)arg0.cfr_renamed_1832();
        sprtph sprtph7 = (sprtph)arg0.cfr_renamed_1831();
        sprtph sprtph8 = (sprtph)this.cfr_renamed_1[0];
        sprtph sprtph9 = (sprtph)arg0.cfr_renamed_1964(0);
        int[] nArray5 = sprekh.cfr_renamed_1633();
        int[] nArray6 = sprekh.cfr_renamed_1631();
        int[] nArray7 = sprekh.cfr_renamed_1631();
        int[] nArray8 = sprekh.cfr_renamed_1631();
        boolean bl = sprtph8.cfr_renamed_287();
        if (bl) {
            nArray4 = sprtph6.cfr_renamed_112;
            nArray3 = sprtph7.cfr_renamed_112;
            sprtph3 = sprtph9;
        } else {
            nArray3 = nArray7;
            sprnyh.cfr_renamed_1627(sprtph8.cfr_renamed_112, nArray3);
            nArray4 = nArray6;
            sprtph3 = sprtph9;
            sprnyh.cfr_renamed_2022(nArray3, sprtph6.cfr_renamed_112, nArray4);
            sprnyh.cfr_renamed_2022(nArray3, sprtph8.cfr_renamed_112, nArray3);
            sprnyh.cfr_renamed_2022(nArray3, sprtph7.cfr_renamed_112, nArray3);
        }
        boolean bl2 = sprtph3.cfr_renamed_287();
        if (bl2) {
            nArray2 = sprtph4.cfr_renamed_112;
            nArray = sprtph5.cfr_renamed_112;
        } else {
            nArray = nArray8;
            sprnyh.cfr_renamed_1627(sprtph9.cfr_renamed_112, nArray);
            nArray2 = nArray5;
            sprnyh.cfr_renamed_2022(nArray, sprtph4.cfr_renamed_112, nArray2);
            sprnyh.cfr_renamed_2022(nArray, sprtph9.cfr_renamed_112, nArray);
            sprnyh.cfr_renamed_2022(nArray, sprtph5.cfr_renamed_112, nArray);
        }
        int[] nArray9 = sprekh.cfr_renamed_1631();
        sprnyh.cfr_renamed_2021(nArray2, nArray4, nArray9);
        int[] nArray10 = nArray6;
        sprnyh.cfr_renamed_2021(nArray, nArray3, nArray10);
        if (sprekh.cfr_renamed_1660(nArray9)) {
            if (sprekh.cfr_renamed_1660(nArray10)) {
                return this.cfr_renamed_1774();
            }
            return sprgxh2.cfr_renamed_1770();
        }
        int[] nArray11 = nArray7;
        sprnyh.cfr_renamed_1627(nArray9, nArray11);
        int[] nArray12 = sprekh.cfr_renamed_1631();
        sprnyh.cfr_renamed_2022(nArray11, nArray9, nArray12);
        int[] nArray13 = nArray7;
        int[] nArray14 = nArray12;
        sprnyh.cfr_renamed_2022(nArray11, nArray2, nArray13);
        sprnyh.cfr_renamed_2027(nArray12, nArray14);
        sprekh.cfr_renamed_1636(nArray, nArray14, nArray5);
        sprnyh.cfr_renamed_2032(sprekh.cfr_renamed_1663(nArray13, nArray13, nArray12), nArray12);
        sprtph sprtph10 = sprtph2 = new sprtph(nArray8);
        sprnyh.cfr_renamed_1627(nArray10, sprtph10.cfr_renamed_112);
        sprnyh.cfr_renamed_2021(sprtph10.cfr_renamed_112, nArray12, sprtph2.cfr_renamed_112);
        sprtph sprtph11 = new sprtph(nArray12);
        sprnyh.cfr_renamed_2021(nArray13, sprtph10.cfr_renamed_112, sprtph11.cfr_renamed_112);
        sprtph sprtph12 = sprtph11;
        sprnyh.cfr_renamed_2037(sprtph12.cfr_renamed_112, nArray10, nArray5);
        sprnyh.cfr_renamed_2028(nArray5, sprtph12.cfr_renamed_112);
        sprtph sprtph13 = new sprtph(nArray9);
        if (!bl) {
            sprnyh.cfr_renamed_2022(sprtph13.cfr_renamed_112, sprtph8.cfr_renamed_112, sprtph13.cfr_renamed_112);
        }
        if (!bl2) {
            sprnyh.cfr_renamed_2022(sprtph13.cfr_renamed_112, sprtph9.cfr_renamed_112, sprtph13.cfr_renamed_112);
        }
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = sprtph13;
        sprlsh[] sprlshArray2 = sprlshArray;
        return new spriyh(sprgxh2, sprtph2, sprtph11, sprlshArray2);
    }
}

