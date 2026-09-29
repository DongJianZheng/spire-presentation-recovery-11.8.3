/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgfh;
import com.spire.presentation.packages.sprhmy;
import com.spire.presentation.packages.sprhr;
import com.spire.presentation.packages.spris;
import com.spire.presentation.packages.sprjeh;
import com.spire.presentation.packages.sprjwj;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprsqaa;
import com.spire.presentation.packages.spruih;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxp;
import com.spire.presentation.packages.sprzgi;
import java.security.Key;
import java.security.interfaces.ECPublicKey;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class sprdyj
implements sprxp {
    private final byte[] cfr_renamed_2;
    private final sprrr cfr_renamed_3;
    private final ECPublicKey cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprdyj(ECPublicKey eCPublicKey, byte[] byArray, sprrr sprrr2) {
        void arg1;
        void arg0;
        sprdyj sprdyj2 = this;
        this.cfr_renamed_4 = arg0;
        sprdyj2.cfr_renamed_2 = arg1;
        sprdyj2.cfr_renamed_3 = sprrr2;
    }

    public /* synthetic */ sprdyj(ECPublicKey arg0, byte[] arg1, sprrr arg2, sprjwj arg3) {
        this(arg0, arg1, arg2);
    }

    @Override
    public sprjeh cfr_renamed_9524(byte[] arg0) {
        spruih spruih2;
        sprlem sprlem2;
        block6: {
            try {
                sprdyj sprdyj2;
                sprdyj sprdyj3 = this;
                Cipher cipher = sprdyj3.cfr_renamed_3.cfr_renamed_1496(sprsqaa.cfr_renamed_9("w$a9y5\u007f\u0007[\u0004Z#z1\u0000E\u0004"));
                cipher.init(3, (Key)this.cfr_renamed_4, new sprzgi(this.cfr_renamed_2, true));
                byte[] byArray = cipher.wrap(new SecretKeySpec(arg0, sprhmy.cfr_renamed_9("x\u001aj")));
                int n = (sprdyj3.cfr_renamed_4.getParams().getCurve().getField().getFieldSize() + 7) / 8;
                if (byArray[0] == 4) {
                    n = 2 * n + 1;
                    sprdyj2 = this;
                } else {
                    sprdyj2 = this;
                }
                sprlem2 = sprlem.cfr_renamed_23(sprvhm.cfr_renamed_23(sprdyj2.cfr_renamed_4.getEncoded()).cfr_renamed_593().cfr_renamed_284());
                int n2 = ++n;
                spruih2 = spruih.cfr_renamed_7843().cfr_renamed_9525(sprgfh.cfr_renamed_8407(sproze.cfr_renamed_533(byArray, 0, n))).cfr_renamed_9526(sproze.cfr_renamed_533(byArray, n2, n2 + arg0.length)).cfr_renamed_9527(sproze.cfr_renamed_533(byArray, n + arg0.length, byArray.length)).cfr_renamed_9528();
                if (!sprlem2.cfr_renamed_5078(sprhr.cfr_renamed_1)) break block6;
                return sprjeh.cfr_renamed_8320(spruih2);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.getMessage(), exception);
            }
        }
        if (sprlem2.cfr_renamed_5078(spris.cfr_renamed_96)) {
            return sprjeh.cfr_renamed_8321(spruih2);
        }
        throw new IllegalStateException(sprsqaa.cfr_renamed_9("\u0002W\u0013[\u0000[\u0015\\\u0004\u0012\u001bW\t\u0012\u0013G\u0002D\u0015\u0012\u0019AP\\\u001fFPb]\u0000E\u0004P]\u0002\u00122@\u0011[\u001eB\u001f]\u001c\u0012 \u0000E\u0004\u0002\u0003"));
    }
}

