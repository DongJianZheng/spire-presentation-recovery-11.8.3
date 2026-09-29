/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprdrh;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprlsh;
import com.spire.presentation.packages.sprolh;
import com.spire.presentation.packages.sprqxh;
import com.spire.presentation.packages.sprxqh;

public class spruth
extends sprdrh {
    @Override
    public spreuh cfr_renamed_8630(spreuh arg0) {
        sprqxh sprqxh2;
        sprqxh sprqxh3;
        sprqxh sprqxh4;
        long[] lArray;
        long[] lArray2;
        long[] lArray3;
        sprqxh sprqxh5;
        long[] lArray4;
        long[] lArray5;
        if (this.cfr_renamed_1952()) {
            return arg0;
        }
        if (arg0.cfr_renamed_1952()) {
            return this;
        }
        spruth spruth2 = this;
        sprgxh sprgxh2 = spruth2.cfr_renamed_1769();
        sprqxh sprqxh6 = (sprqxh)spruth2.cfr_renamed_3;
        sprqxh sprqxh7 = (sprqxh)arg0.cfr_renamed_1953();
        if (sprqxh6.cfr_renamed_805()) {
            if (sprqxh7.cfr_renamed_805()) {
                return sprgxh2.cfr_renamed_1770();
            }
            return arg0.cfr_renamed_8630(this);
        }
        sprqxh sprqxh8 = (sprqxh)this.cfr_renamed_4;
        sprqxh sprqxh9 = (sprqxh)this.cfr_renamed_1[0];
        sprqxh sprqxh10 = (sprqxh)arg0.cfr_renamed_1954();
        sprqxh sprqxh11 = (sprqxh)arg0.cfr_renamed_1964(0);
        long[] lArray6 = sprolh.cfr_renamed_8534();
        long[] lArray7 = sprolh.cfr_renamed_8534();
        long[] lArray8 = sprolh.cfr_renamed_8534();
        long[] lArray9 = sprolh.cfr_renamed_8534();
        long[] lArray10 = sprqxh9.cfr_renamed_287() ? null : sprxqh.cfr_renamed_8963(sprqxh9.cfr_renamed_4);
        sprqxh sprqxh12 = sprqxh7;
        if (lArray10 == null) {
            lArray5 = sprqxh12.cfr_renamed_4;
            lArray4 = sprqxh10.cfr_renamed_4;
            sprqxh5 = sprqxh11;
        } else {
            lArray5 = lArray7;
            sprxqh.cfr_renamed_8964(sprqxh12.cfr_renamed_4, lArray10, lArray7);
            lArray4 = lArray9;
            sprxqh.cfr_renamed_8964(sprqxh10.cfr_renamed_4, lArray10, lArray9);
            sprqxh5 = sprqxh11;
        }
        long[] lArray11 = sprqxh5.cfr_renamed_287() ? null : sprxqh.cfr_renamed_8963(sprqxh11.cfr_renamed_4);
        sprqxh sprqxh13 = sprqxh6;
        if (lArray11 == null) {
            lArray3 = sprqxh13.cfr_renamed_4;
            lArray2 = sprqxh8.cfr_renamed_4;
            lArray = lArray8;
        } else {
            lArray3 = lArray6;
            sprxqh.cfr_renamed_8964(sprqxh13.cfr_renamed_4, lArray11, lArray6);
            lArray2 = lArray8;
            sprxqh.cfr_renamed_8964(sprqxh8.cfr_renamed_4, lArray11, lArray8);
            lArray = lArray8;
        }
        long[] lArray12 = lArray;
        sprxqh.cfr_renamed_7206(lArray2, lArray4, lArray12);
        long[] lArray13 = lArray9;
        sprxqh.cfr_renamed_7206(lArray3, lArray5, lArray13);
        if (sprolh.cfr_renamed_8540(lArray13)) {
            if (sprolh.cfr_renamed_8540(lArray12)) {
                return this.cfr_renamed_1774();
            }
            return sprgxh2.cfr_renamed_1770();
        }
        if (sprqxh7.cfr_renamed_805()) {
            sprqxh sprqxh14;
            spreuh spreuh2 = this.cfr_renamed_1775();
            sprqxh6 = (sprqxh)spreuh2.cfr_renamed_1832();
            sprlsh sprlsh2 = spreuh2.cfr_renamed_1831();
            sprlsh sprlsh3 = sprlsh2.cfr_renamed_8663(sprqxh14 = sprqxh10).cfr_renamed_8936(sprqxh6);
            sprqxh4 = (sprqxh)sprlsh3.cfr_renamed_1048().cfr_renamed_8663(sprlsh3).cfr_renamed_8663(sprqxh6);
            if (sprqxh4.cfr_renamed_805()) {
                sprgxh sprgxh3 = sprgxh2;
                return new spruth(sprgxh3, sprqxh4, sprgxh3.cfr_renamed_1997());
            }
            sprqxh3 = (sprqxh)sprlsh3.cfr_renamed_8682(sprqxh6.cfr_renamed_8663(sprqxh4)).cfr_renamed_8663(sprqxh4).cfr_renamed_8663(sprlsh2).cfr_renamed_8936(sprqxh4).cfr_renamed_8663(sprqxh4);
            sprqxh2 = (sprqxh)sprgxh2.cfr_renamed_1652(sprck.cfr_renamed_4);
        } else {
            sprxqh.cfr_renamed_7210(lArray13, lArray13);
            long[] lArray14 = sprxqh.cfr_renamed_8963(lArray12);
            long[] lArray15 = lArray6;
            long[] lArray16 = lArray7;
            sprxqh.cfr_renamed_8964(lArray3, lArray14, lArray15);
            sprxqh.cfr_renamed_8964(lArray5, lArray14, lArray16);
            sprqxh sprqxh15 = sprqxh4 = new sprqxh(lArray6);
            sprxqh.cfr_renamed_7200(lArray15, lArray16, sprqxh15.cfr_renamed_4);
            if (sprqxh15.cfr_renamed_805()) {
                sprgxh sprgxh4 = sprgxh2;
                return new spruth(sprgxh4, sprqxh4, sprgxh4.cfr_renamed_1997());
            }
            sprqxh2 = new sprqxh(lArray8);
            sprxqh.cfr_renamed_8964(lArray13, lArray14, sprqxh2.cfr_renamed_4);
            if (lArray11 != null) {
                sprxqh.cfr_renamed_8964(sprqxh2.cfr_renamed_4, lArray11, sprqxh2.cfr_renamed_4);
            }
            long[] lArray17 = sprolh.cfr_renamed_8536();
            sprxqh.cfr_renamed_7206(lArray16, lArray13, lArray9);
            sprxqh.cfr_renamed_8965(lArray9, lArray17);
            sprxqh.cfr_renamed_7206(sprqxh8.cfr_renamed_4, sprqxh9.cfr_renamed_4, lArray9);
            sprxqh.cfr_renamed_8966(lArray9, sprqxh2.cfr_renamed_4, lArray17);
            sprqxh3 = new sprqxh(lArray9);
            sprxqh.cfr_renamed_6593(lArray17, sprqxh3.cfr_renamed_4);
            if (lArray10 != null) {
                sprxqh.cfr_renamed_8964(sprqxh2.cfr_renamed_4, lArray10, sprqxh2.cfr_renamed_4);
            }
        }
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = sprqxh2;
        return new spruth(sprgxh2, sprqxh4, sprqxh3, sprlshArray);
    }

    @Override
    public spreuh cfr_renamed_1977() {
        return new spruth(null, this.cfr_renamed_1969(), this.cfr_renamed_1973());
    }

    public spruth(sprgxh arg0, sprlsh arg1, sprlsh arg2, sprlsh[] arg3) {
        super(arg0, arg1, arg2, arg3);
    }

    @Override
    public spreuh cfr_renamed_8652(spreuh arg0) {
        if (this.cfr_renamed_1952()) {
            return arg0;
        }
        if (arg0.cfr_renamed_1952()) {
            return this.cfr_renamed_1774();
        }
        spruth spruth2 = this;
        sprgxh sprgxh2 = spruth2.cfr_renamed_1769();
        sprlsh sprlsh2 = spruth2.cfr_renamed_3;
        if (sprlsh2.cfr_renamed_805()) {
            return arg0;
        }
        spreuh spreuh2 = arg0;
        sprlsh sprlsh3 = spreuh2.cfr_renamed_1953();
        sprlsh sprlsh4 = spreuh2.cfr_renamed_1964(0);
        if (sprlsh3.cfr_renamed_805() || !sprlsh4.cfr_renamed_287()) {
            return this.cfr_renamed_1774().cfr_renamed_8630(arg0);
        }
        spruth spruth3 = this;
        sprlsh sprlsh5 = spruth3.cfr_renamed_4;
        sprlsh sprlsh6 = spruth3.cfr_renamed_1[0];
        sprlsh sprlsh7 = arg0.cfr_renamed_1954();
        sprlsh sprlsh8 = sprlsh2.cfr_renamed_1048();
        sprlsh sprlsh9 = sprlsh5;
        sprlsh sprlsh10 = sprlsh9.cfr_renamed_1048();
        sprlsh sprlsh11 = sprlsh6;
        sprlsh sprlsh12 = sprlsh11.cfr_renamed_1048();
        sprlsh sprlsh13 = sprlsh9.cfr_renamed_8682(sprlsh11);
        sprlsh sprlsh14 = sprlsh10.cfr_renamed_8663(sprlsh13);
        sprlsh sprlsh15 = sprlsh7.cfr_renamed_1908();
        sprlsh sprlsh16 = sprlsh15.cfr_renamed_8682(sprlsh12).cfr_renamed_8663(sprlsh10).cfr_renamed_8932(sprlsh14, sprlsh8, sprlsh12);
        sprlsh sprlsh17 = sprlsh3.cfr_renamed_8682(sprlsh12);
        sprlsh sprlsh18 = sprlsh17.cfr_renamed_8663(sprlsh14).cfr_renamed_1048();
        if (sprlsh18.cfr_renamed_805()) {
            if (sprlsh16.cfr_renamed_805()) {
                return arg0.cfr_renamed_1774();
            }
            return sprgxh2.cfr_renamed_1770();
        }
        if (sprlsh16.cfr_renamed_805()) {
            sprgxh sprgxh3 = sprgxh2;
            return new spruth(sprgxh3, sprlsh16, sprgxh3.cfr_renamed_1997());
        }
        sprlsh sprlsh19 = sprlsh16;
        sprlsh sprlsh20 = sprlsh19.cfr_renamed_1048().cfr_renamed_8682(sprlsh17);
        sprlsh sprlsh21 = sprlsh19.cfr_renamed_8682(sprlsh18).cfr_renamed_8682(sprlsh12);
        sprlsh sprlsh22 = sprlsh19.cfr_renamed_8663(sprlsh18).cfr_renamed_1048().cfr_renamed_8932(sprlsh14, sprlsh15, sprlsh21);
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = sprlsh21;
        return new spruth(sprgxh2, sprlsh20, sprlsh22, sprlshArray);
    }

    @Override
    public boolean cfr_renamed_1956() {
        sprlsh sprlsh2 = this.cfr_renamed_1953();
        if (sprlsh2.cfr_renamed_805()) {
            return false;
        }
        return this.cfr_renamed_1954().cfr_renamed_1930() != sprlsh2.cfr_renamed_1930();
    }

    @Override
    public sprlsh cfr_renamed_1831() {
        spruth spruth2 = this;
        sprlsh sprlsh2 = spruth2.cfr_renamed_3;
        sprlsh sprlsh3 = spruth2.cfr_renamed_4;
        if (spruth2.cfr_renamed_1952() || sprlsh2.cfr_renamed_805()) {
            return sprlsh3;
        }
        sprlsh sprlsh4 = sprlsh3.cfr_renamed_8663(sprlsh2).cfr_renamed_8682(sprlsh2);
        sprlsh sprlsh5 = this.cfr_renamed_1[0];
        if (!sprlsh5.cfr_renamed_287()) {
            sprlsh4 = sprlsh4.cfr_renamed_8936(sprlsh5);
        }
        return sprlsh4;
    }

    @Override
    public spreuh cfr_renamed_1773() {
        if (this.cfr_renamed_1952()) {
            return this;
        }
        sprlsh sprlsh2 = this.cfr_renamed_3;
        if (sprlsh2.cfr_renamed_805()) {
            return this;
        }
        spruth spruth2 = this;
        sprlsh sprlsh3 = spruth2.cfr_renamed_4;
        sprlsh sprlsh4 = spruth2.cfr_renamed_1[0];
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = sprlsh4;
        return new spruth(this.cfr_renamed_0, sprlsh2, sprlsh3.cfr_renamed_8663(sprlsh4), sprlshArray);
    }

    @Override
    public spreuh cfr_renamed_1774() {
        sprlsh sprlsh2;
        if (this.cfr_renamed_1952()) {
            return this;
        }
        spruth spruth2 = this;
        sprgxh sprgxh2 = spruth2.cfr_renamed_1769();
        sprlsh sprlsh3 = spruth2.cfr_renamed_3;
        if (sprlsh3.cfr_renamed_805()) {
            return sprgxh2.cfr_renamed_1770();
        }
        spruth spruth3 = this;
        sprlsh sprlsh4 = spruth3.cfr_renamed_4;
        sprlsh sprlsh5 = spruth3.cfr_renamed_1[0];
        boolean bl = sprlsh5.cfr_renamed_287();
        sprlsh sprlsh6 = bl ? sprlsh5 : sprlsh5.cfr_renamed_1048();
        sprlsh sprlsh7 = sprlsh4;
        if ((bl ? (sprlsh2 = sprlsh7.cfr_renamed_1048().cfr_renamed_8663(sprlsh4)) : (sprlsh2 = sprlsh7.cfr_renamed_8663(sprlsh5).cfr_renamed_8682(sprlsh4))).cfr_renamed_805()) {
            sprgxh sprgxh3 = sprgxh2;
            return new spruth(sprgxh3, sprlsh2, sprgxh3.cfr_renamed_1997());
        }
        sprlsh sprlsh8 = sprlsh2.cfr_renamed_1048();
        sprlsh sprlsh9 = bl ? sprlsh2 : sprlsh2.cfr_renamed_8682(sprlsh6);
        sprlsh sprlsh10 = sprlsh4.cfr_renamed_8663(sprlsh3).cfr_renamed_1048();
        sprlsh sprlsh11 = bl ? sprlsh5 : sprlsh6.cfr_renamed_1048();
        sprlsh sprlsh12 = sprlsh10.cfr_renamed_8663(sprlsh2).cfr_renamed_8663(sprlsh6).cfr_renamed_8682(sprlsh10).cfr_renamed_8663(sprlsh11).cfr_renamed_8663(sprlsh8).cfr_renamed_8663(sprlsh9);
        sprlsh[] sprlshArray = new sprlsh[1];
        sprlshArray[0] = sprlsh9;
        return new spruth(sprgxh2, sprlsh8, sprlsh12, sprlshArray);
    }

    public spruth(sprgxh arg0, sprlsh arg1, sprlsh arg2) {
        super(arg0, arg1, arg2);
    }
}

