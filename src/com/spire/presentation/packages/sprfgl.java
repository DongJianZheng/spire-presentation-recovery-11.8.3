/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfe;
import com.spire.presentation.packages.sprjgl;
import com.spire.presentation.packages.sprlr;
import com.spire.presentation.packages.sprlyy;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprscl;
import com.spire.presentation.packages.sprvoy;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzph;
import java.math.BigInteger;
import java.security.SecureRandom;

public class sprfgl
implements sprlr {
    private sprnzk cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    public sprfe cfr_renamed_3284() {
        return new sprzph();
    }

    @Override
    public sprscl cfr_renamed_10458(sprscl arg0) {
        if (this.cfr_renamed_3 == null) {
            throw new IllegalStateException(sprlyy.cfr_renamed_9("L\nG,~\u0019|+e j\u0002l0];h'z/f;dig&}i`'`=`(e z,m"));
        }
        sprfgl sprfgl2 = this;
        sprqxk sprqxk2 = sprfgl2.cfr_renamed_3.cfr_renamed_284();
        BigInteger bigInteger = sprqxk2.cfr_renamed_1146();
        sprfe sprfe2 = sprfgl2.cfr_renamed_3284();
        BigInteger bigInteger2 = sprjgl.cfr_renamed_3743(bigInteger, this.cfr_renamed_4);
        spreuh[] spreuhArray = new spreuh[2];
        spreuhArray[0] = sprfe2.cfr_renamed_8926(sprqxk2.cfr_renamed_1145(), bigInteger2);
        spreuhArray[1] = this.cfr_renamed_3.cfr_renamed_1604().cfr_renamed_1830(bigInteger2).cfr_renamed_8630(sprmvh.cfr_renamed_8962(sprqxk2.cfr_renamed_1769(), arg0.spr\u3181()));
        spreuh[] spreuhArray2 = spreuhArray;
        sprqxk2.cfr_renamed_1769().cfr_renamed_8691(spreuhArray2);
        return new sprscl(spreuhArray2[0], spreuhArray2[1]);
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) {
        if (arg0 instanceof sprbgk) {
            sprbgk sprbgk2 = (sprbgk)arg0;
            if (!(sprbgk2.cfr_renamed_284() instanceof sprnzk)) {
                throw new IllegalArgumentException(sprvoy.cfr_renamed_9("\u001f\u001e\n(813>\u00118#\r;/;0?)?/)};/?}(8+(3/?9z;5/z3?*z-/?649}18#}./;3);5/7s"));
            }
            this.cfr_renamed_3 = (sprnzk)sprbgk2.cfr_renamed_284();
            this.cfr_renamed_4 = sprbgk2.cfr_renamed_1295();
            return;
        }
        if (!(arg0 instanceof sprnzk)) {
            throw new IllegalArgumentException(sprlyy.cfr_renamed_9("\fJ\u0019|+e j\u0002l0Y({(d,},{:)({,);l8| {,mio&{ig,~iy<k%`*)\"l0)={(g:o&{$'"));
        }
        this.cfr_renamed_3 = (sprnzk)arg0;
        this.cfr_renamed_4 = sprybl.cfr_renamed_2794();
    }
}

