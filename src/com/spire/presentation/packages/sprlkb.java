/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprikb;
import com.spire.presentation.packages.sprmlb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprqlb;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprrmo;
import com.spire.presentation.packages.sprrpb;
import com.spire.presentation.packages.sprujb;
import com.spire.presentation.packages.sprwtb;

public class sprlkb
extends sprikb {
    public sprlkb(sprpib arg0, sprwtb arg1, sprwtb arg2, boolean arg3) {
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
            throw new IllegalArgumentException(sprrmo.cfr_renamed_9("\u0000r$i1f<**d **le~-oel,o)neo)o(o+~6*,yed0f)"));
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
    public sprrlb cfr_renamed_1772(sprrlb arg0) {
        sprmlb sprmlb2;
        int[] nArray;
        int[] nArray2;
        sprmlb sprmlb3;
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
        sprlkb sprlkb2 = this;
        sprpib sprpib2 = sprlkb2.cfr_renamed_1769();
        sprmlb sprmlb4 = (sprmlb)sprlkb2.cfr_renamed_2;
        sprmlb sprmlb5 = (sprmlb)this.cfr_renamed_4;
        sprmlb sprmlb6 = (sprmlb)arg0.cfr_renamed_1832();
        sprmlb sprmlb7 = (sprmlb)arg0.cfr_renamed_1831();
        sprmlb sprmlb8 = (sprmlb)this.cfr_renamed_0[0];
        sprmlb sprmlb9 = (sprmlb)arg0.cfr_renamed_1964(0);
        int[] nArray5 = sprqlb.cfr_renamed_1633();
        int[] nArray6 = sprqlb.cfr_renamed_1631();
        int[] nArray7 = sprqlb.cfr_renamed_1631();
        int[] nArray8 = sprqlb.cfr_renamed_1631();
        boolean bl = sprmlb8.cfr_renamed_287();
        if (bl) {
            nArray4 = sprmlb6.cfr_renamed_119;
            nArray3 = sprmlb7.cfr_renamed_119;
            sprmlb3 = sprmlb9;
        } else {
            nArray3 = nArray7;
            sprujb.cfr_renamed_1627(sprmlb8.cfr_renamed_119, nArray3);
            nArray4 = nArray6;
            sprmlb3 = sprmlb9;
            sprujb.cfr_renamed_2022(nArray3, sprmlb6.cfr_renamed_119, nArray4);
            sprujb.cfr_renamed_2022(nArray3, sprmlb8.cfr_renamed_119, nArray3);
            sprujb.cfr_renamed_2022(nArray3, sprmlb7.cfr_renamed_119, nArray3);
        }
        boolean bl2 = sprmlb3.cfr_renamed_287();
        if (bl2) {
            nArray2 = sprmlb4.cfr_renamed_119;
            nArray = sprmlb5.cfr_renamed_119;
        } else {
            nArray = nArray8;
            sprujb.cfr_renamed_1627(sprmlb9.cfr_renamed_119, nArray);
            nArray2 = nArray5;
            sprujb.cfr_renamed_2022(nArray, sprmlb4.cfr_renamed_119, nArray2);
            sprujb.cfr_renamed_2022(nArray, sprmlb9.cfr_renamed_119, nArray);
            sprujb.cfr_renamed_2022(nArray, sprmlb5.cfr_renamed_119, nArray);
        }
        int[] nArray9 = sprqlb.cfr_renamed_1631();
        sprujb.cfr_renamed_2021(nArray2, nArray4, nArray9);
        int[] nArray10 = nArray6;
        sprujb.cfr_renamed_2021(nArray, nArray3, nArray10);
        if (sprqlb.cfr_renamed_1660(nArray9)) {
            if (sprqlb.cfr_renamed_1660(nArray10)) {
                return this.cfr_renamed_1774();
            }
            return sprpib2.cfr_renamed_1770();
        }
        int[] nArray11 = nArray7;
        sprujb.cfr_renamed_1627(nArray9, nArray11);
        int[] nArray12 = sprqlb.cfr_renamed_1631();
        sprujb.cfr_renamed_2022(nArray11, nArray9, nArray12);
        int[] nArray13 = nArray7;
        int[] nArray14 = nArray12;
        sprujb.cfr_renamed_2022(nArray11, nArray2, nArray13);
        sprujb.cfr_renamed_2027(nArray12, nArray14);
        sprqlb.cfr_renamed_1636(nArray, nArray14, nArray5);
        sprujb.cfr_renamed_2032(sprqlb.cfr_renamed_1663(nArray13, nArray13, nArray12), nArray12);
        sprmlb sprmlb10 = sprmlb2 = new sprmlb(nArray8);
        sprujb.cfr_renamed_1627(nArray10, sprmlb10.cfr_renamed_119);
        sprujb.cfr_renamed_2021(sprmlb10.cfr_renamed_119, nArray12, sprmlb2.cfr_renamed_119);
        sprmlb sprmlb11 = new sprmlb(nArray12);
        sprujb.cfr_renamed_2021(nArray13, sprmlb10.cfr_renamed_119, sprmlb11.cfr_renamed_119);
        sprmlb sprmlb12 = sprmlb11;
        sprujb.cfr_renamed_2037(sprmlb12.cfr_renamed_119, nArray10, nArray5);
        sprujb.cfr_renamed_2028(nArray5, sprmlb12.cfr_renamed_119);
        sprmlb sprmlb13 = new sprmlb(nArray9);
        if (!bl) {
            sprujb.cfr_renamed_2022(sprmlb13.cfr_renamed_119, sprmlb8.cfr_renamed_119, sprmlb13.cfr_renamed_119);
        }
        if (!bl2) {
            sprujb.cfr_renamed_2022(sprmlb13.cfr_renamed_119, sprmlb9.cfr_renamed_119, sprmlb13.cfr_renamed_119);
        }
        sprwtb[] sprwtbArray = new sprwtb[1];
        sprwtbArray[0] = sprmlb13;
        sprwtb[] sprwtbArray2 = sprwtbArray;
        return new sprlkb(sprpib2, sprmlb2, sprmlb11, sprwtbArray2, this.cfr_renamed_91);
    }

    @Override
    public sprrlb cfr_renamed_1774() {
        sprmlb sprmlb2;
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprlkb sprlkb2 = this;
        sprpib sprpib2 = sprlkb2.cfr_renamed_1769();
        sprmlb sprmlb3 = (sprmlb)sprlkb2.cfr_renamed_4;
        if (sprmlb3.cfr_renamed_805()) {
            return sprpib2.cfr_renamed_1770();
        }
        sprmlb sprmlb4 = (sprmlb)this.cfr_renamed_2;
        sprmlb sprmlb5 = (sprmlb)this.cfr_renamed_0[0];
        int[] nArray = sprqlb.cfr_renamed_1631();
        int[] nArray2 = sprqlb.cfr_renamed_1631();
        int[] nArray3 = sprqlb.cfr_renamed_1631();
        sprujb.cfr_renamed_1627(sprmlb3.cfr_renamed_119, nArray3);
        int[] nArray4 = sprqlb.cfr_renamed_1631();
        sprmlb sprmlb6 = sprmlb5;
        sprujb.cfr_renamed_1627(nArray3, nArray4);
        boolean bl = sprmlb6.cfr_renamed_287();
        int[] nArray5 = sprmlb6.cfr_renamed_119;
        if (!bl) {
            nArray5 = nArray2;
            sprujb.cfr_renamed_1627(sprmlb5.cfr_renamed_119, nArray5);
        }
        sprujb.cfr_renamed_2021(sprmlb4.cfr_renamed_119, nArray5, nArray);
        int[] nArray6 = nArray2;
        sprujb.cfr_renamed_1654(sprmlb4.cfr_renamed_119, nArray5, nArray6);
        sprujb.cfr_renamed_2022(nArray6, nArray, nArray6);
        int n = sprqlb.cfr_renamed_1663(nArray6, nArray6, nArray6);
        sprujb.cfr_renamed_2032(n, nArray6);
        int[] nArray7 = nArray3;
        sprujb.cfr_renamed_2022(nArray3, sprmlb4.cfr_renamed_119, nArray7);
        n = sprrpb.cfr_renamed_1705(6, nArray7, 2, 0);
        sprujb.cfr_renamed_2032(n, nArray7);
        n = sprrpb.cfr_renamed_1731(6, nArray4, 3, 0, nArray);
        sprujb.cfr_renamed_2032(n, nArray);
        sprmlb sprmlb7 = new sprmlb(nArray4);
        sprujb.cfr_renamed_1627(nArray6, sprmlb7.cfr_renamed_119);
        sprmlb sprmlb8 = sprmlb7;
        sprujb.cfr_renamed_2021(sprmlb7.cfr_renamed_119, nArray7, sprmlb8.cfr_renamed_119);
        sprujb.cfr_renamed_2021(sprmlb8.cfr_renamed_119, nArray7, sprmlb7.cfr_renamed_119);
        sprmlb sprmlb9 = sprmlb2 = new sprmlb(nArray7);
        sprujb.cfr_renamed_2021(nArray7, sprmlb7.cfr_renamed_119, sprmlb9.cfr_renamed_119);
        sprmlb sprmlb10 = sprmlb2;
        sprujb.cfr_renamed_2022(sprmlb9.cfr_renamed_119, nArray6, sprmlb10.cfr_renamed_119);
        sprujb.cfr_renamed_2021(sprmlb10.cfr_renamed_119, nArray, sprmlb2.cfr_renamed_119);
        sprmlb sprmlb11 = new sprmlb(nArray6);
        sprujb.cfr_renamed_2024(sprmlb3.cfr_renamed_119, sprmlb11.cfr_renamed_119);
        if (!bl) {
            sprujb.cfr_renamed_2022(sprmlb11.cfr_renamed_119, sprmlb5.cfr_renamed_119, sprmlb11.cfr_renamed_119);
        }
        sprwtb[] sprwtbArray = new sprwtb[1];
        sprwtbArray[0] = sprmlb11;
        return new sprlkb(sprpib2, sprmlb7, sprmlb2, sprwtbArray, this.cfr_renamed_91);
    }

    public sprlkb(sprpib arg0, sprwtb arg1, sprwtb arg2) {
        this(arg0, arg1, arg2, false);
    }

    @Override
    public sprrlb cfr_renamed_1773() {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprlkb sprlkb2 = this;
        sprlkb sprlkb3 = this;
        return new sprlkb(sprlkb2.cfr_renamed_3, sprlkb2.cfr_renamed_2, this.cfr_renamed_4.cfr_renamed_1773(), sprlkb3.cfr_renamed_0, sprlkb3.cfr_renamed_91);
    }

    @Override
    public sprrlb cfr_renamed_1977() {
        return new sprlkb(null, this.cfr_renamed_1969(), this.cfr_renamed_1973());
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

    /*
     * WARNING - void declaration
     */
    public sprlkb(sprpib sprpib2, sprwtb sprwtb2, sprwtb sprwtb3, sprwtb[] sprwtbArray, boolean bl) {
        super((sprpib)arg0, (sprwtb)arg1, (sprwtb)arg2, (sprwtb[])arg3);
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_91 = bl;
    }
}

