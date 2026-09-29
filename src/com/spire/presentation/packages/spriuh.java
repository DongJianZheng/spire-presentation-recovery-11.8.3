/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbsh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprroh;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprvyh;
import com.spire.presentation.packages.sprwkh;

public class spriuh
extends sprroh {
    @Override
    public spreuh cfr_renamed_1804() {
        if (this.cfr_renamed_1952() || this.cfr_renamed_4.cfr_renamed_805()) {
            return this;
        }
        return this.cfr_renamed_1774().cfr_renamed_8630(this);
    }

    @Override
    public spreuh cfr_renamed_1773() {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        spriuh spriuh2 = this;
        return new spriuh(spriuh2.cfr_renamed_0, spriuh2.cfr_renamed_3, this.cfr_renamed_4.cfr_renamed_1773(), this.cfr_renamed_1);
    }

    @Override
    public spreuh cfr_renamed_1977() {
        return new spriuh(null, this.cfr_renamed_1969(), this.cfr_renamed_1973());
    }

    public spriuh(sprgxh arg0, sprlsh arg1, sprlsh arg2, sprlsh[] arg3) {
        super(arg0, arg1, arg2, arg3);
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
    public spreuh cfr_renamed_1774() {
        sprvyh sprvyh2;
        if (this.cfr_renamed_1952()) {
            return this;
        }
        spriuh spriuh2 = this;
        sprgxh sprgxh2 = spriuh2.cfr_renamed_1769();
        sprvyh sprvyh3 = (sprvyh)spriuh2.cfr_renamed_4;
        if (sprvyh3.cfr_renamed_805()) {
            return sprgxh2.cfr_renamed_1770();
        }
        sprvyh sprvyh4 = (sprvyh)this.cfr_renamed_3;
        sprvyh sprvyh5 = (sprvyh)this.cfr_renamed_1[0];
        int[] nArray = sprvih.cfr_renamed_1716(24);
        int[] nArray2 = sprvih.cfr_renamed_1716(12);
        int[] nArray3 = sprvih.cfr_renamed_1716(12);
        int[] nArray4 = sprvih.cfr_renamed_1716(12);
        sprbsh.cfr_renamed_8992(sprvyh3.cfr_renamed_112, nArray4, nArray);
        int[] nArray5 = sprvih.cfr_renamed_1716(12);
        sprvyh sprvyh6 = sprvyh5;
        sprbsh.cfr_renamed_8992(nArray4, nArray5, nArray);
        boolean bl = sprvyh6.cfr_renamed_287();
        int[] nArray6 = sprvyh6.cfr_renamed_112;
        if (!bl) {
            nArray6 = nArray3;
            sprbsh.cfr_renamed_8992(sprvyh5.cfr_renamed_112, nArray6, nArray);
        }
        sprbsh.cfr_renamed_2021(sprvyh4.cfr_renamed_112, nArray6, nArray2);
        int[] nArray7 = nArray3;
        sprbsh.cfr_renamed_1654(sprvyh4.cfr_renamed_112, nArray6, nArray7);
        sprbsh.cfr_renamed_8993(nArray7, nArray2, nArray7, nArray);
        int n = sprvih.cfr_renamed_1738(12, nArray7, nArray7, nArray7);
        sprbsh.cfr_renamed_2032(n, nArray7);
        int[] nArray8 = nArray4;
        sprbsh.cfr_renamed_8993(nArray4, sprvyh4.cfr_renamed_112, nArray8, nArray);
        n = sprvih.cfr_renamed_1705(12, nArray8, 2, 0);
        sprbsh.cfr_renamed_2032(n, nArray8);
        n = sprvih.cfr_renamed_1731(12, nArray5, 3, 0, nArray2);
        sprbsh.cfr_renamed_2032(n, nArray2);
        sprvyh sprvyh7 = new sprvyh(nArray5);
        sprbsh.cfr_renamed_8992(nArray7, sprvyh7.cfr_renamed_112, nArray);
        sprvyh sprvyh8 = sprvyh7;
        sprbsh.cfr_renamed_2021(sprvyh7.cfr_renamed_112, nArray8, sprvyh8.cfr_renamed_112);
        sprbsh.cfr_renamed_2021(sprvyh8.cfr_renamed_112, nArray8, sprvyh7.cfr_renamed_112);
        sprvyh sprvyh9 = sprvyh2 = new sprvyh(nArray8);
        sprbsh.cfr_renamed_2021(nArray8, sprvyh7.cfr_renamed_112, sprvyh9.cfr_renamed_112);
        sprvyh sprvyh10 = sprvyh2;
        sprbsh.cfr_renamed_8993(sprvyh9.cfr_renamed_112, nArray7, sprvyh10.cfr_renamed_112, nArray);
        sprbsh.cfr_renamed_2021(sprvyh10.cfr_renamed_112, nArray2, sprvyh2.cfr_renamed_112);
        sprvyh sprvyh11 = new sprvyh(nArray7);
        sprbsh.cfr_renamed_2024(sprvyh3.cfr_renamed_112, sprvyh11.cfr_renamed_112);
        if (!bl) {
            sprbsh.cfr_renamed_8993(sprvyh11.cfr_renamed_112, sprvyh5.cfr_renamed_112, sprvyh11.cfr_renamed_112, nArray);
        }
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = sprvyh11;
        return new spriuh(sprgxh2, sprvyh7, sprvyh2, sprlshArray);
    }

    @Override
    public spreuh cfr_renamed_8630(spreuh arg0) {
        sprvyh sprvyh2;
        sprvyh sprvyh3;
        int[] nArray;
        int[] nArray2;
        sprvyh sprvyh4;
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
        spriuh spriuh2 = this;
        sprgxh sprgxh2 = spriuh2.cfr_renamed_1769();
        sprvyh sprvyh5 = (sprvyh)spriuh2.cfr_renamed_3;
        sprvyh sprvyh6 = (sprvyh)this.cfr_renamed_4;
        sprvyh sprvyh7 = (sprvyh)arg0.cfr_renamed_1832();
        sprvyh sprvyh8 = (sprvyh)arg0.cfr_renamed_1831();
        sprvyh sprvyh9 = (sprvyh)this.cfr_renamed_1[0];
        sprvyh sprvyh10 = (sprvyh)arg0.cfr_renamed_1964(0);
        int[] nArray5 = sprvih.cfr_renamed_1716(24);
        int[] nArray6 = sprvih.cfr_renamed_1716(24);
        int[] nArray7 = sprvih.cfr_renamed_1716(24);
        int[] nArray8 = sprvih.cfr_renamed_1716(12);
        int[] nArray9 = sprvih.cfr_renamed_1716(12);
        boolean bl = sprvyh9.cfr_renamed_287();
        if (bl) {
            nArray4 = sprvyh7.cfr_renamed_112;
            nArray3 = sprvyh8.cfr_renamed_112;
            sprvyh4 = sprvyh10;
        } else {
            nArray3 = nArray8;
            sprbsh.cfr_renamed_8992(sprvyh9.cfr_renamed_112, nArray3, nArray5);
            nArray4 = nArray7;
            sprvyh4 = sprvyh10;
            sprbsh.cfr_renamed_8993(nArray3, sprvyh7.cfr_renamed_112, nArray4, nArray5);
            sprbsh.cfr_renamed_8993(nArray3, sprvyh9.cfr_renamed_112, nArray3, nArray5);
            sprbsh.cfr_renamed_8993(nArray3, sprvyh8.cfr_renamed_112, nArray3, nArray5);
        }
        boolean bl2 = sprvyh4.cfr_renamed_287();
        if (bl2) {
            nArray2 = sprvyh5.cfr_renamed_112;
            nArray = sprvyh6.cfr_renamed_112;
        } else {
            nArray = nArray9;
            sprbsh.cfr_renamed_8992(sprvyh10.cfr_renamed_112, nArray, nArray5);
            nArray2 = nArray6;
            sprbsh.cfr_renamed_8993(nArray, sprvyh5.cfr_renamed_112, nArray2, nArray5);
            sprbsh.cfr_renamed_8993(nArray, sprvyh10.cfr_renamed_112, nArray, nArray5);
            sprbsh.cfr_renamed_8993(nArray, sprvyh6.cfr_renamed_112, nArray, nArray5);
        }
        int[] nArray10 = sprvih.cfr_renamed_1716(12);
        sprbsh.cfr_renamed_2021(nArray2, nArray4, nArray10);
        int[] nArray11 = sprvih.cfr_renamed_1716(12);
        sprbsh.cfr_renamed_2021(nArray, nArray3, nArray11);
        if (sprvih.cfr_renamed_1737(12, nArray10)) {
            if (sprvih.cfr_renamed_1737(12, nArray11)) {
                return this.cfr_renamed_1774();
            }
            return sprgxh2.cfr_renamed_1770();
        }
        int[] nArray12 = nArray8;
        sprbsh.cfr_renamed_8992(nArray10, nArray12, nArray5);
        int[] nArray13 = sprvih.cfr_renamed_1716(12);
        sprbsh.cfr_renamed_8993(nArray12, nArray10, nArray13, nArray5);
        int[] nArray14 = nArray8;
        int[] nArray15 = nArray13;
        sprbsh.cfr_renamed_8993(nArray12, nArray2, nArray14, nArray5);
        sprbsh.cfr_renamed_2027(nArray13, nArray15);
        sprwkh.cfr_renamed_1636(nArray, nArray15, nArray6);
        sprbsh.cfr_renamed_2032(sprvih.cfr_renamed_1738(12, nArray14, nArray14, nArray13), nArray13);
        sprvyh sprvyh11 = sprvyh3 = new sprvyh(nArray9);
        sprbsh.cfr_renamed_8992(nArray11, sprvyh11.cfr_renamed_112, nArray5);
        sprbsh.cfr_renamed_2021(sprvyh11.cfr_renamed_112, nArray13, sprvyh3.cfr_renamed_112);
        sprvyh sprvyh12 = sprvyh2 = new sprvyh(nArray13);
        sprbsh.cfr_renamed_2021(nArray14, sprvyh3.cfr_renamed_112, sprvyh12.cfr_renamed_112);
        sprwkh.cfr_renamed_1636(sprvyh12.cfr_renamed_112, nArray11, nArray7);
        sprbsh.cfr_renamed_2033(nArray6, nArray7, nArray6);
        sprbsh.cfr_renamed_2028(nArray6, sprvyh12.cfr_renamed_112);
        sprvyh sprvyh13 = new sprvyh(nArray10);
        if (!bl) {
            sprbsh.cfr_renamed_8993(sprvyh13.cfr_renamed_112, sprvyh9.cfr_renamed_112, sprvyh13.cfr_renamed_112, nArray5);
        }
        if (!bl2) {
            sprbsh.cfr_renamed_8993(sprvyh13.cfr_renamed_112, sprvyh10.cfr_renamed_112, sprvyh13.cfr_renamed_112, nArray5);
        }
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = sprvyh13;
        sprlsh[] sprlshArray2 = sprlshArray;
        return new spriuh(sprgxh2, sprvyh3, sprvyh2, sprlshArray2);
    }

    public spriuh(sprgxh arg0, sprlsh arg1, sprlsh arg2) {
        super(arg0, arg1, arg2);
    }
}

