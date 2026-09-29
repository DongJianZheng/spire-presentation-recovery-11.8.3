/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprejy;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprkik;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmqk;
import com.spire.presentation.packages.sprnuk;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.spromk;
import com.spire.presentation.packages.sprqfk;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.spruik;
import com.spire.presentation.packages.sprxrk;
import com.spire.presentation.packages.sprytk;
import com.spire.presentation.packages.spryxaa;
import com.spire.presentation.packages.spryye;
import java.io.IOException;
import java.math.BigInteger;

public class sprxjk {
    private static final String cfr_renamed_1 = "ssh-rsa";
    private static final String cfr_renamed_2 = "ecdsa";
    private static final String cfr_renamed_3 = "ssh-dss";
    private static final String cfr_renamed_4 = "ssh-ed25519";

    public static byte[] cfr_renamed_9398(spryye arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprejy.cfr_renamed_9("\n\u001e\u0019\u001f\f\u00059\u0016\u001b\u0016\u0004\u0012\u001d\u0012\u001b\u0004I\u0000\b\u0004I\u0019\u001c\u001b\u0005Y"));
        }
        if (arg0 instanceof sprkik) {
            sprqfk sprqfk2;
            if (arg0.cfr_renamed_1352()) {
                throw new IllegalArgumentException(spryxaa.cfr_renamed_9("o\u0016|\u000eX<m$O$P$I O6\u001d2\\6\u001d#R7\u001d S&O<M1T*S"));
            }
            sprkik sprkik2 = (sprkik)arg0;
            sprqfk sprqfk3 = sprqfk2 = new sprqfk();
            sprqfk2.cfr_renamed_9853(cfr_renamed_1);
            sprqfk3.cfr_renamed_9852(sprkik2.cfr_renamed_360());
            sprqfk3.cfr_renamed_9852(sprkik2.cfr_renamed_2295());
            return sprqfk3.cfr_renamed_81();
        }
        if (arg0 instanceof sprnzk) {
            sprqfk sprqfk4 = new sprqfk();
            String string = spruik.cfr_renamed_9844(((sprnzk)arg0).cfr_renamed_284());
            if (string == null) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprejy.cfr_renamed_9("\u001c\u0019\b\u0015\u0005\u0012I\u0003\u0006W\r\u0012\u001b\u001e\u001f\u0012I\u0004\u001a\u001fI\u0014\u001c\u0005\u001f\u0012I\u0019\b\u001a\fW\u000f\u0018\u001bW")).append(((sprnzk)arg0).cfr_renamed_284().cfr_renamed_1769().getClass().getName()).toString());
            }
            sprqfk sprqfk5 = sprqfk4;
            sprqfk5.cfr_renamed_9853(new StringBuilder().insert(0, spryxaa.cfr_renamed_9("X&Y6\\hN-\\w\u0010")).append(string).toString());
            sprqfk5.cfr_renamed_9853(string);
            sprqfk4.cfr_renamed_9848(((sprnzk)arg0).cfr_renamed_1604().cfr_renamed_1972(false));
            return sprqfk4.cfr_renamed_81();
        }
        if (arg0 instanceof sprytk) {
            sprqfk sprqfk6;
            sprytk sprytk2 = (sprytk)arg0;
            sprmqk sprmqk2 = sprytk2.cfr_renamed_284();
            sprqfk sprqfk7 = sprqfk6 = new sprqfk();
            sprmqk sprmqk3 = sprmqk2;
            sprqfk sprqfk8 = sprqfk6;
            sprqfk8.cfr_renamed_9853(cfr_renamed_3);
            sprqfk8.cfr_renamed_9852(sprmqk2.cfr_renamed_1155());
            sprqfk6.cfr_renamed_9852(sprmqk3.cfr_renamed_1604());
            sprqfk7.cfr_renamed_9852(sprmqk3.cfr_renamed_1145());
            sprqfk7.cfr_renamed_9852(sprytk2.spr\u3181());
            return sprqfk7.cfr_renamed_81();
        }
        if (arg0 instanceof sprnuk) {
            sprqfk sprqfk9;
            sprqfk sprqfk10 = sprqfk9 = new sprqfk();
            sprqfk10.cfr_renamed_9853(cfr_renamed_4);
            sprqfk10.cfr_renamed_9848(((sprnuk)arg0).cfr_renamed_91());
            return sprqfk9.cfr_renamed_81();
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprejy.cfr_renamed_9("\u001c\u0019\b\u0015\u0005\u0012I\u0003\u0006W\n\u0018\u0007\u0001\f\u0005\u001dW")).append(arg0.getClass().getName()).append(spryxaa.cfr_renamed_9("eI*\u001d5H'Q,^eV D")).toString());
    }

    private /* synthetic */ sprxjk() {
    }

    public static spryye cfr_renamed_9400(byte[] arg0) {
        return sprxjk.cfr_renamed_9878(new spromk(arg0));
    }

    public static spryye cfr_renamed_9878(spromk arg0) {
        spryye spryye2;
        spryye spryye3 = null;
        String string = arg0.cfr_renamed_9857();
        if (cfr_renamed_1.equals(string)) {
            spromk spromk2 = arg0;
            BigInteger bigInteger = spromk2.cfr_renamed_9861();
            BigInteger bigInteger2 = spromk2.cfr_renamed_9861();
            spryye2 = spryye3 = new sprkik(false, bigInteger2, bigInteger);
        } else if (cfr_renamed_3.equals(string)) {
            spromk spromk3 = arg0;
            BigInteger bigInteger = spromk3.cfr_renamed_9861();
            BigInteger bigInteger3 = spromk3.cfr_renamed_9861();
            BigInteger bigInteger4 = spromk3.cfr_renamed_9861();
            BigInteger bigInteger5 = spromk3.cfr_renamed_9861();
            spryye2 = spryye3 = new sprytk(bigInteger5, new sprmqk(bigInteger, bigInteger3, bigInteger4));
        } else if (string.startsWith(cfr_renamed_2)) {
            String string2 = arg0.cfr_renamed_9857();
            sprlem sprlem2 = spruik.cfr_renamed_1837(string2);
            sprhfm sprhfm2 = spruik.cfr_renamed_9847(sprlem2);
            if (sprhfm2 == null) {
                throw new IllegalStateException(new StringBuilder().insert(0, sprejy.cfr_renamed_9("\u0002\u0007\u0016\u000b\u001b\fW\u001d\u0018I\u0011\u0000\u0019\rW\n\u0002\u001b\u0001\fW\u000f\u0018\u001bW")).append(string).append(spryxaa.cfr_renamed_9("eH6T+Ze^0O3XeS$P \u001d")).append(string2).toString());
            }
            sprgxh sprgxh2 = sprhfm2.cfr_renamed_1769();
            byte[] byArray = arg0.cfr_renamed_9855();
            spryye2 = spryye3 = new sprnzk(sprgxh2.cfr_renamed_2002(byArray), (sprqxk)new sprxrk(sprlem2, sprhfm2));
        } else {
            if (cfr_renamed_4.equals(string)) {
                byte[] byArray = arg0.cfr_renamed_9855();
                if (byArray.length != 32) {
                    throw new IllegalStateException(sprejy.cfr_renamed_9("\u0019\u0002\u000b\u001b\u0000\u0014I\u001c\f\u000eI\u0001\b\u001b\u001c\u0012I\u0018\u000fW\u001e\u0005\u0006\u0019\u000eW\u0005\u0012\u0007\u0010\u001d\u001f"));
                }
                spryye3 = new sprnuk(byArray, 0);
            }
            spryye2 = spryye3;
        }
        if (spryye2 == null) {
            throw new IllegalArgumentException(spryxaa.cfr_renamed_9("H+\\'Q \u001d1ReM$O6XeV D"));
        }
        if (arg0.cfr_renamed_9671()) {
            throw new IllegalArgumentException(sprejy.cfr_renamed_9("\u0013\f\u0014\u0006\u0013\f\u0013I\u001c\f\u000eI\u001f\b\u0004I\u0003\u001b\u0016\u0000\u001b\u0000\u0019\u000eW\r\u0016\u001d\u0016"));
        }
        return spryye3;
    }
}

