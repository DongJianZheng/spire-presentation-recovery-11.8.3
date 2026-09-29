/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfqb;
import com.spire.presentation.packages.sprikb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprpvo;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprrpb;
import com.spire.presentation.packages.sprsob;
import com.spire.presentation.packages.sprwtb;

public class sprxqb
extends sprikb {
    public sprwtb cfr_renamed_2016(sprwtb arg0) {
        sprxqb sprxqb2 = this;
        return sprxqb2.cfr_renamed_2017(sprxqb2.cfr_renamed_2018(arg0));
    }

    public sprwtb cfr_renamed_2019(sprwtb arg0, sprwtb arg1, sprwtb arg2, sprwtb arg3) {
        return arg0.cfr_renamed_1983(arg1).cfr_renamed_1048().cfr_renamed_1986(arg2).cfr_renamed_1986(arg3);
    }

    /*
     * WARNING - void declaration
     */
    public sprxqb(sprpib sprpib2, sprwtb sprwtb2, sprwtb sprwtb3, sprwtb[] sprwtbArray, boolean bl) {
        super((sprpib)arg0, (sprwtb)arg1, (sprwtb)arg2, (sprwtb[])arg3);
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_91 = bl;
    }

    public sprwtb cfr_renamed_2018(sprwtb arg0) {
        sprwtb sprwtb2 = arg0;
        return sprwtb2.cfr_renamed_1983(sprwtb2);
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

    public sprxqb(sprpib arg0, sprwtb arg1, sprwtb arg2, boolean arg3) {
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
            throw new IllegalArgumentException(sprpvo.cfr_renamed_9("eAAZTUY\u0019OWE\u0019O_\u0000MH\\\u0000_I\\L]\u0000\\L\\M\\NMS\u0019IJ\u0000WUUL"));
        }
        this.cfr_renamed_91 = arg3;
    }

    public sprxqb(sprpib arg0, sprwtb arg1, sprwtb arg2) {
        this(arg0, arg1, arg2, false);
    }

    public sprwtb cfr_renamed_2020(sprwtb arg0) {
        return this.cfr_renamed_2018(arg0).cfr_renamed_1983(arg0);
    }

    @Override
    public sprrlb cfr_renamed_1774() {
        sprfqb sprfqb2;
        sprfqb sprfqb3;
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprxqb sprxqb2 = this;
        sprpib sprpib2 = sprxqb2.cfr_renamed_1769();
        sprfqb sprfqb4 = (sprfqb)sprxqb2.cfr_renamed_4;
        if (sprfqb4.cfr_renamed_805()) {
            return sprpib2.cfr_renamed_1770();
        }
        sprfqb sprfqb5 = (sprfqb)this.cfr_renamed_2;
        sprfqb sprfqb6 = (sprfqb)this.cfr_renamed_0[0];
        int[] nArray = sprrpb.cfr_renamed_1716(17);
        int[] nArray2 = sprrpb.cfr_renamed_1716(17);
        int[] nArray3 = sprrpb.cfr_renamed_1716(17);
        sprsob.cfr_renamed_1627(sprfqb4.cfr_renamed_4, nArray3);
        int[] nArray4 = sprrpb.cfr_renamed_1716(17);
        sprfqb sprfqb7 = sprfqb6;
        sprsob.cfr_renamed_1627(nArray3, nArray4);
        boolean bl = sprfqb7.cfr_renamed_287();
        int[] nArray5 = sprfqb7.cfr_renamed_4;
        if (!bl) {
            nArray5 = nArray2;
            sprsob.cfr_renamed_1627(sprfqb6.cfr_renamed_4, nArray5);
        }
        sprsob.cfr_renamed_2021(sprfqb5.cfr_renamed_4, nArray5, nArray);
        int[] nArray6 = nArray2;
        sprsob.cfr_renamed_1654(sprfqb5.cfr_renamed_4, nArray5, nArray6);
        sprsob.cfr_renamed_2022(nArray6, nArray, nArray6);
        int[] nArray7 = nArray6;
        sprrpb.cfr_renamed_1738(17, nArray7, nArray6, nArray7);
        sprsob.cfr_renamed_2023(nArray6);
        int[] nArray8 = nArray3;
        sprsob.cfr_renamed_2022(nArray3, sprfqb5.cfr_renamed_4, nArray8);
        sprrpb.cfr_renamed_1705(17, nArray8, 2, 0);
        sprsob.cfr_renamed_2023(nArray8);
        sprrpb.cfr_renamed_1731(17, nArray4, 3, 0, nArray);
        sprsob.cfr_renamed_2023(nArray);
        sprfqb sprfqb8 = sprfqb3 = new sprfqb(nArray4);
        sprsob.cfr_renamed_1627(nArray6, sprfqb8.cfr_renamed_4);
        sprsob.cfr_renamed_2021(sprfqb8.cfr_renamed_4, nArray8, sprfqb3.cfr_renamed_4);
        sprsob.cfr_renamed_2021(sprfqb8.cfr_renamed_4, nArray8, sprfqb3.cfr_renamed_4);
        sprfqb sprfqb9 = sprfqb2 = new sprfqb(nArray8);
        sprsob.cfr_renamed_2021(nArray8, sprfqb3.cfr_renamed_4, sprfqb9.cfr_renamed_4);
        sprfqb sprfqb10 = sprfqb2;
        sprsob.cfr_renamed_2022(sprfqb9.cfr_renamed_4, nArray6, sprfqb10.cfr_renamed_4);
        sprsob.cfr_renamed_2021(sprfqb10.cfr_renamed_4, nArray, sprfqb2.cfr_renamed_4);
        sprfqb sprfqb11 = new sprfqb(nArray6);
        sprsob.cfr_renamed_2024(sprfqb4.cfr_renamed_4, sprfqb11.cfr_renamed_4);
        if (!bl) {
            sprsob.cfr_renamed_2022(sprfqb11.cfr_renamed_4, sprfqb6.cfr_renamed_4, sprfqb11.cfr_renamed_4);
        }
        sprwtb[] sprwtbArray = new sprwtb[1];
        sprwtbArray[0] = sprfqb11;
        return new sprxqb(sprpib2, sprfqb3, sprfqb2, sprwtbArray, this.cfr_renamed_91);
    }

    @Override
    public sprrlb cfr_renamed_1773() {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprxqb sprxqb2 = this;
        sprxqb sprxqb3 = this;
        return new sprxqb(sprxqb2.cfr_renamed_3, sprxqb2.cfr_renamed_2, this.cfr_renamed_4.cfr_renamed_1773(), sprxqb3.cfr_renamed_0, sprxqb3.cfr_renamed_91);
    }

    @Override
    public sprrlb cfr_renamed_1977() {
        return new sprxqb(null, this.cfr_renamed_1969(), this.cfr_renamed_1973());
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
        sprfqb sprfqb2;
        sprfqb sprfqb3;
        int[] nArray;
        int[] nArray2;
        sprfqb sprfqb4;
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
        sprxqb sprxqb2 = this;
        sprpib sprpib2 = sprxqb2.cfr_renamed_1769();
        sprfqb sprfqb5 = (sprfqb)sprxqb2.cfr_renamed_2;
        sprfqb sprfqb6 = (sprfqb)this.cfr_renamed_4;
        sprfqb sprfqb7 = (sprfqb)arg0.cfr_renamed_1832();
        sprfqb sprfqb8 = (sprfqb)arg0.cfr_renamed_1831();
        sprfqb sprfqb9 = (sprfqb)this.cfr_renamed_0[0];
        sprfqb sprfqb10 = (sprfqb)arg0.cfr_renamed_1964(0);
        int[] nArray5 = sprrpb.cfr_renamed_1716(17);
        int[] nArray6 = sprrpb.cfr_renamed_1716(17);
        int[] nArray7 = sprrpb.cfr_renamed_1716(17);
        int[] nArray8 = sprrpb.cfr_renamed_1716(17);
        boolean bl = sprfqb9.cfr_renamed_287();
        if (bl) {
            nArray4 = sprfqb7.cfr_renamed_4;
            nArray3 = sprfqb8.cfr_renamed_4;
            sprfqb4 = sprfqb10;
        } else {
            nArray3 = nArray7;
            sprsob.cfr_renamed_1627(sprfqb9.cfr_renamed_4, nArray3);
            nArray4 = nArray6;
            sprfqb4 = sprfqb10;
            sprsob.cfr_renamed_2022(nArray3, sprfqb7.cfr_renamed_4, nArray4);
            sprsob.cfr_renamed_2022(nArray3, sprfqb9.cfr_renamed_4, nArray3);
            sprsob.cfr_renamed_2022(nArray3, sprfqb8.cfr_renamed_4, nArray3);
        }
        boolean bl2 = sprfqb4.cfr_renamed_287();
        if (bl2) {
            nArray2 = sprfqb5.cfr_renamed_4;
            nArray = sprfqb6.cfr_renamed_4;
        } else {
            nArray = nArray8;
            sprsob.cfr_renamed_1627(sprfqb10.cfr_renamed_4, nArray);
            nArray2 = nArray5;
            sprsob.cfr_renamed_2022(nArray, sprfqb5.cfr_renamed_4, nArray2);
            sprsob.cfr_renamed_2022(nArray, sprfqb10.cfr_renamed_4, nArray);
            sprsob.cfr_renamed_2022(nArray, sprfqb6.cfr_renamed_4, nArray);
        }
        int[] nArray9 = sprrpb.cfr_renamed_1716(17);
        sprsob.cfr_renamed_2021(nArray2, nArray4, nArray9);
        int[] nArray10 = nArray6;
        sprsob.cfr_renamed_2021(nArray, nArray3, nArray10);
        if (sprrpb.cfr_renamed_1737(17, nArray9)) {
            if (sprrpb.cfr_renamed_1737(17, nArray10)) {
                return this.cfr_renamed_1774();
            }
            return sprpib2.cfr_renamed_1770();
        }
        int[] nArray11 = nArray7;
        sprsob.cfr_renamed_1627(nArray9, nArray11);
        int[] nArray12 = sprrpb.cfr_renamed_1716(17);
        sprsob.cfr_renamed_2022(nArray11, nArray9, nArray12);
        int[] nArray13 = nArray7;
        sprsob.cfr_renamed_2022(nArray11, nArray2, nArray13);
        sprsob.cfr_renamed_2022(nArray, nArray12, nArray5);
        sprfqb sprfqb11 = sprfqb3 = new sprfqb(nArray8);
        sprsob.cfr_renamed_1627(nArray10, sprfqb11.cfr_renamed_4);
        sprsob.cfr_renamed_1654(sprfqb3.cfr_renamed_4, nArray12, sprfqb3.cfr_renamed_4);
        sprsob.cfr_renamed_2021(sprfqb11.cfr_renamed_4, nArray13, sprfqb3.cfr_renamed_4);
        sprsob.cfr_renamed_2021(sprfqb11.cfr_renamed_4, nArray13, sprfqb3.cfr_renamed_4);
        sprfqb sprfqb12 = sprfqb2 = new sprfqb(nArray12);
        sprsob.cfr_renamed_2021(nArray13, sprfqb3.cfr_renamed_4, sprfqb12.cfr_renamed_4);
        sprsob.cfr_renamed_2022(sprfqb12.cfr_renamed_4, nArray10, nArray6);
        sprsob.cfr_renamed_2021(nArray6, nArray5, sprfqb2.cfr_renamed_4);
        sprfqb sprfqb13 = new sprfqb(nArray9);
        if (!bl) {
            sprsob.cfr_renamed_2022(sprfqb13.cfr_renamed_4, sprfqb9.cfr_renamed_4, sprfqb13.cfr_renamed_4);
        }
        if (!bl2) {
            sprsob.cfr_renamed_2022(sprfqb13.cfr_renamed_4, sprfqb10.cfr_renamed_4, sprfqb13.cfr_renamed_4);
        }
        sprwtb[] sprwtbArray = new sprwtb[1];
        sprwtbArray[0] = sprfqb13;
        sprwtb[] sprwtbArray2 = sprwtbArray;
        return new sprxqb(sprpib2, sprfqb3, sprfqb2, sprwtbArray2, this.cfr_renamed_91);
    }

    public sprwtb cfr_renamed_2017(sprwtb arg0) {
        sprxqb sprxqb2 = this;
        return sprxqb2.cfr_renamed_2018(sprxqb2.cfr_renamed_2018(arg0));
    }
}

