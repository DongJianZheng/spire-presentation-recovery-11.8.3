/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprnth;
import com.spire.presentation.packages.sprroh;
import com.spire.presentation.packages.sprvih;
import com.spire.presentation.packages.sprwph;

public class sprvsh
extends sprroh {
    @Override
    public spreuh cfr_renamed_8630(spreuh arg0) {
        sprwph sprwph2;
        sprwph sprwph3;
        int[] nArray;
        int[] nArray2;
        sprwph sprwph4;
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
        sprvsh sprvsh2 = this;
        sprgxh sprgxh2 = sprvsh2.cfr_renamed_1769();
        sprwph sprwph5 = (sprwph)sprvsh2.cfr_renamed_3;
        sprwph sprwph6 = (sprwph)this.cfr_renamed_4;
        sprwph sprwph7 = (sprwph)arg0.cfr_renamed_1832();
        sprwph sprwph8 = (sprwph)arg0.cfr_renamed_1831();
        sprwph sprwph9 = (sprwph)this.cfr_renamed_1[0];
        sprwph sprwph10 = (sprwph)arg0.cfr_renamed_1964(0);
        int[] nArray5 = sprvih.cfr_renamed_1716(33);
        int[] nArray6 = sprvih.cfr_renamed_1716(17);
        int[] nArray7 = sprvih.cfr_renamed_1716(17);
        int[] nArray8 = sprvih.cfr_renamed_1716(17);
        int[] nArray9 = sprvih.cfr_renamed_1716(17);
        boolean bl = sprwph9.cfr_renamed_287();
        if (bl) {
            nArray4 = sprwph7.cfr_renamed_4;
            nArray3 = sprwph8.cfr_renamed_4;
            sprwph4 = sprwph10;
        } else {
            nArray3 = nArray8;
            sprnth.cfr_renamed_8992(sprwph9.cfr_renamed_4, nArray3, nArray5);
            nArray4 = nArray7;
            sprwph4 = sprwph10;
            sprnth.cfr_renamed_8993(nArray3, sprwph7.cfr_renamed_4, nArray4, nArray5);
            sprnth.cfr_renamed_8993(nArray3, sprwph9.cfr_renamed_4, nArray3, nArray5);
            sprnth.cfr_renamed_8993(nArray3, sprwph8.cfr_renamed_4, nArray3, nArray5);
        }
        boolean bl2 = sprwph4.cfr_renamed_287();
        if (bl2) {
            nArray2 = sprwph5.cfr_renamed_4;
            nArray = sprwph6.cfr_renamed_4;
        } else {
            nArray = nArray9;
            sprnth.cfr_renamed_8992(sprwph10.cfr_renamed_4, nArray, nArray5);
            nArray2 = nArray6;
            sprnth.cfr_renamed_8993(nArray, sprwph5.cfr_renamed_4, nArray2, nArray5);
            sprnth.cfr_renamed_8993(nArray, sprwph10.cfr_renamed_4, nArray, nArray5);
            sprnth.cfr_renamed_8993(nArray, sprwph6.cfr_renamed_4, nArray, nArray5);
        }
        int[] nArray10 = sprvih.cfr_renamed_1716(17);
        sprnth.cfr_renamed_2021(nArray2, nArray4, nArray10);
        int[] nArray11 = nArray7;
        sprnth.cfr_renamed_2021(nArray, nArray3, nArray11);
        if (sprvih.cfr_renamed_1737(17, nArray10)) {
            if (sprvih.cfr_renamed_1737(17, nArray11)) {
                return this.cfr_renamed_1774();
            }
            return sprgxh2.cfr_renamed_1770();
        }
        int[] nArray12 = nArray8;
        sprnth.cfr_renamed_8992(nArray10, nArray12, nArray5);
        int[] nArray13 = sprvih.cfr_renamed_1716(17);
        sprnth.cfr_renamed_8993(nArray12, nArray10, nArray13, nArray5);
        int[] nArray14 = nArray8;
        sprnth.cfr_renamed_8993(nArray12, nArray2, nArray14, nArray5);
        sprnth.cfr_renamed_8993(nArray, nArray13, nArray6, nArray5);
        sprwph sprwph11 = sprwph3 = new sprwph(nArray9);
        sprnth.cfr_renamed_8992(nArray11, sprwph11.cfr_renamed_4, nArray5);
        sprnth.cfr_renamed_1654(sprwph3.cfr_renamed_4, nArray13, sprwph3.cfr_renamed_4);
        sprnth.cfr_renamed_2021(sprwph11.cfr_renamed_4, nArray14, sprwph3.cfr_renamed_4);
        sprnth.cfr_renamed_2021(sprwph11.cfr_renamed_4, nArray14, sprwph3.cfr_renamed_4);
        sprwph sprwph12 = sprwph2 = new sprwph(nArray13);
        sprnth.cfr_renamed_2021(nArray14, sprwph3.cfr_renamed_4, sprwph12.cfr_renamed_4);
        sprnth.cfr_renamed_8993(sprwph12.cfr_renamed_4, nArray11, nArray7, nArray5);
        sprnth.cfr_renamed_2021(nArray7, nArray6, sprwph2.cfr_renamed_4);
        sprwph sprwph13 = new sprwph(nArray10);
        if (!bl) {
            sprnth.cfr_renamed_8993(sprwph13.cfr_renamed_4, sprwph9.cfr_renamed_4, sprwph13.cfr_renamed_4, nArray5);
        }
        if (!bl2) {
            sprnth.cfr_renamed_8993(sprwph13.cfr_renamed_4, sprwph10.cfr_renamed_4, sprwph13.cfr_renamed_4, nArray5);
        }
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = sprwph13;
        sprlsh[] sprlshArray2 = sprlshArray;
        return new sprvsh(sprgxh2, sprwph3, sprwph2, sprlshArray2);
    }

    public sprlsh cfr_renamed_8994(sprlsh arg0) {
        sprvsh sprvsh2 = this;
        return sprvsh2.cfr_renamed_8995(sprvsh2.cfr_renamed_8996(arg0));
    }

    public sprlsh cfr_renamed_8997(sprlsh arg0) {
        return this.cfr_renamed_8996(arg0).cfr_renamed_8663(arg0);
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
    public spreuh cfr_renamed_1773() {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprvsh sprvsh2 = this;
        return new sprvsh(sprvsh2.cfr_renamed_0, sprvsh2.cfr_renamed_3, this.cfr_renamed_4.cfr_renamed_1773(), this.cfr_renamed_1);
    }

    @Override
    public spreuh cfr_renamed_1804() {
        if (this.cfr_renamed_1952() || this.cfr_renamed_4.cfr_renamed_805()) {
            return this;
        }
        return this.cfr_renamed_1774().cfr_renamed_8630(this);
    }

    public sprvsh(sprgxh arg0, sprlsh arg1, sprlsh arg2, sprlsh[] arg3) {
        super(arg0, arg1, arg2, arg3);
    }

    public sprlsh cfr_renamed_8996(sprlsh arg0) {
        sprlsh sprlsh2 = arg0;
        return sprlsh2.cfr_renamed_8663(sprlsh2);
    }

    @Override
    public spreuh cfr_renamed_1977() {
        return new sprvsh(null, this.cfr_renamed_1969(), this.cfr_renamed_1973());
    }

    public sprlsh cfr_renamed_8998(sprlsh arg0, sprlsh arg1, sprlsh arg2, sprlsh arg3) {
        return arg0.cfr_renamed_8663(arg1).cfr_renamed_1048().cfr_renamed_8934(arg2).cfr_renamed_8934(arg3);
    }

    @Override
    public spreuh cfr_renamed_1774() {
        sprwph sprwph2;
        sprwph sprwph3;
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprvsh sprvsh2 = this;
        sprgxh sprgxh2 = sprvsh2.cfr_renamed_1769();
        sprwph sprwph4 = (sprwph)sprvsh2.cfr_renamed_4;
        if (sprwph4.cfr_renamed_805()) {
            return sprgxh2.cfr_renamed_1770();
        }
        sprwph sprwph5 = (sprwph)this.cfr_renamed_3;
        sprwph sprwph6 = (sprwph)this.cfr_renamed_1[0];
        int[] nArray = sprvih.cfr_renamed_1716(33);
        int[] nArray2 = sprvih.cfr_renamed_1716(17);
        int[] nArray3 = sprvih.cfr_renamed_1716(17);
        int[] nArray4 = sprvih.cfr_renamed_1716(17);
        sprnth.cfr_renamed_8992(sprwph4.cfr_renamed_4, nArray4, nArray);
        int[] nArray5 = sprvih.cfr_renamed_1716(17);
        sprwph sprwph7 = sprwph6;
        sprnth.cfr_renamed_8992(nArray4, nArray5, nArray);
        boolean bl = sprwph7.cfr_renamed_287();
        int[] nArray6 = sprwph7.cfr_renamed_4;
        if (!bl) {
            nArray6 = nArray3;
            sprnth.cfr_renamed_8992(sprwph6.cfr_renamed_4, nArray6, nArray);
        }
        sprnth.cfr_renamed_2021(sprwph5.cfr_renamed_4, nArray6, nArray2);
        int[] nArray7 = nArray3;
        sprnth.cfr_renamed_1654(sprwph5.cfr_renamed_4, nArray6, nArray7);
        sprnth.cfr_renamed_8993(nArray7, nArray2, nArray7, nArray);
        int[] nArray8 = nArray7;
        sprvih.cfr_renamed_1738(17, nArray8, nArray7, nArray8);
        sprnth.cfr_renamed_2023(nArray7);
        int[] nArray9 = nArray4;
        sprnth.cfr_renamed_8993(nArray4, sprwph5.cfr_renamed_4, nArray9, nArray);
        sprvih.cfr_renamed_1705(17, nArray9, 2, 0);
        sprnth.cfr_renamed_2023(nArray9);
        sprvih.cfr_renamed_1731(17, nArray5, 3, 0, nArray2);
        sprnth.cfr_renamed_2023(nArray2);
        sprwph sprwph8 = sprwph3 = new sprwph(nArray5);
        sprnth.cfr_renamed_8992(nArray7, sprwph8.cfr_renamed_4, nArray);
        sprnth.cfr_renamed_2021(sprwph8.cfr_renamed_4, nArray9, sprwph3.cfr_renamed_4);
        sprnth.cfr_renamed_2021(sprwph8.cfr_renamed_4, nArray9, sprwph3.cfr_renamed_4);
        sprwph sprwph9 = sprwph2 = new sprwph(nArray9);
        sprnth.cfr_renamed_2021(nArray9, sprwph3.cfr_renamed_4, sprwph9.cfr_renamed_4);
        sprwph sprwph10 = sprwph2;
        sprnth.cfr_renamed_8993(sprwph9.cfr_renamed_4, nArray7, sprwph10.cfr_renamed_4, nArray);
        sprnth.cfr_renamed_2021(sprwph10.cfr_renamed_4, nArray2, sprwph2.cfr_renamed_4);
        sprwph sprwph11 = new sprwph(nArray7);
        sprnth.cfr_renamed_2024(sprwph4.cfr_renamed_4, sprwph11.cfr_renamed_4);
        if (!bl) {
            sprnth.cfr_renamed_8993(sprwph11.cfr_renamed_4, sprwph6.cfr_renamed_4, sprwph11.cfr_renamed_4, nArray);
        }
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = sprwph11;
        return new sprvsh(sprgxh2, sprwph3, sprwph2, sprlshArray);
    }

    public sprvsh(sprgxh arg0, sprlsh arg1, sprlsh arg2) {
        super(arg0, arg1, arg2);
    }

    public sprlsh cfr_renamed_8995(sprlsh arg0) {
        sprvsh sprvsh2 = this;
        return sprvsh2.cfr_renamed_8996(sprvsh2.cfr_renamed_8996(arg0));
    }
}

