/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravo;
import com.spire.presentation.packages.sprdbp;
import com.spire.presentation.packages.sprdhp;
import com.spire.presentation.packages.spredp;
import com.spire.presentation.packages.sprfip;
import com.spire.presentation.packages.sprlip;
import com.spire.presentation.packages.sprnlp;
import com.spire.presentation.packages.sprpep;
import com.spire.presentation.packages.sprqkp;
import com.spire.presentation.packages.sprrzo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.sprxdp;

@sprtea
public class sprsbp
extends spravo {
    public static final String cfr_renamed_2 = "BASE";
    public sprpep cfr_renamed_3;
    public sprpep cfr_renamed_4;

    public static sprqkp cfr_renamed_18940(sprujo arg0) {
        sprujo sprujo2 = arg0;
        long l = sprujo2.cfr_renamed_14060().cfr_renamed_3274();
        sprqkp sprqkp2 = new sprqkp();
        int n = sprujo2.cfr_renamed_13218();
        int n2 = sprujo2.cfr_renamed_13218();
        int n3 = sprujo2.cfr_renamed_13218();
        spredp[] spredpArray = null;
        if ((n3 & 0xFFFF) > 0) {
            int n4;
            spredpArray = new spredp[n3];
            int n5 = n4 = 0;
            while (n5 < (n3 & 0xFFFF)) {
                spredpArray[n4++] = new spredp(sprsbp.cfr_renamed_18941(arg0.cfr_renamed_16065(4)), arg0.cfr_renamed_13218(), arg0.cfr_renamed_13218());
                n5 = n4;
            }
        }
        if ((n & 0xFFFF) > 0) {
            sprqkp2.cfr_renamed_2 = sprsbp.cfr_renamed_18942(arg0, l + (long)(n & 0xFFFF));
        }
        if ((n2 & 0xFFFF) > 0) {
            sprqkp2.cfr_renamed_3 = sprsbp.cfr_renamed_18942(arg0, l + (long)(n2 & 0xFFFF));
        }
        if (spredpArray != null) {
            int n6;
            sprdhp[] sprdhpArray = new sprdhp[spredpArray.length];
            int n7 = n6 = 0;
            while (n7 < spredpArray.length) {
                spredp spredp2 = spredpArray[n6];
                sprdhpArray[n6++] = new sprdhp(spredp2.cfr_renamed_3, sprsbp.cfr_renamed_18942(arg0, l + (long)(spredp2.cfr_renamed_4 & 0xFFFF)), sprsbp.cfr_renamed_18942(arg0, l + (long)(spredp2.cfr_renamed_2 & 0xFFFF)));
                n7 = n6;
            }
            sprqkp2.cfr_renamed_4 = sprdhpArray;
        }
        return sprqkp2;
    }

    public static sprxdp cfr_renamed_18943(sprujo arg0) {
        sprujo sprujo2 = arg0;
        long l = sprujo2.cfr_renamed_14060().cfr_renamed_3274();
        int n = sprujo2.cfr_renamed_13218();
        int n2 = sprujo2.cfr_renamed_13218();
        int n3 = sprujo2.cfr_renamed_13218();
        sprfip[] sprfipArray = null;
        if ((n3 & 0xFFFF) > 0) {
            int n4;
            sprfipArray = new sprfip[n3];
            int n5 = n4 = 0;
            while (n5 < (n3 & 0xFFFF)) {
                sprfipArray[n4++] = new sprfip(sprsbp.cfr_renamed_18941(arg0.cfr_renamed_16065(4)), arg0.cfr_renamed_13218());
                n5 = n4;
            }
        }
        sprxdp sprxdp2 = new sprxdp();
        sprxdp2.cfr_renamed_2 = sprfipArray;
        if ((n & 0xFFFF) > 0) {
            sprujo sprujo3 = arg0;
            sprujo3.cfr_renamed_14060().cfr_renamed_11548(l + (long)(n & 0xFFFF));
            sprxdp2.cfr_renamed_1 = sprsbp.cfr_renamed_18944(sprujo3);
        }
        if ((n2 & 0xFFFF) > 0) {
            sprujo sprujo4 = arg0;
            sprujo4.cfr_renamed_14060().cfr_renamed_11548(l + (long)(n2 & 0xFFFF));
            sprxdp2.cfr_renamed_4 = sprsbp.cfr_renamed_18940(sprujo4);
        }
        return sprxdp2;
    }

    @Override
    public void cfr_renamed_18686(sprujo arg0) {
        sprujo sprujo2 = arg0;
        long l = sprujo2.cfr_renamed_14060().cfr_renamed_3274();
        int n = sprujo2.cfr_renamed_13218();
        int n2 = sprujo2.cfr_renamed_13218();
        int n3 = sprujo2.cfr_renamed_13218();
        int n4 = sprujo2.cfr_renamed_13218();
        long l2 = 0L;
        if ((n2 & 0xFFFF) == 1) {
            l2 = arg0.cfr_renamed_13220();
        }
        if ((n3 & 0xFFFF) > 0) {
            sprsbp sprsbp2 = this;
            arg0.cfr_renamed_14060().cfr_renamed_11548(l + (long)(n3 & 0xFFFF));
            sprsbp2.cfr_renamed_4 = sprsbp.cfr_renamed_18945(arg0);
            sprsbp2.cfr_renamed_4.cfr_renamed_3 = false;
        }
        if ((n4 & 0xFFFF) > 0) {
            sprsbp sprsbp3 = this;
            arg0.cfr_renamed_14060().cfr_renamed_11548(l + (long)(n4 & 0xFFFF));
            sprsbp3.cfr_renamed_3 = sprsbp.cfr_renamed_18945(arg0);
            sprsbp3.cfr_renamed_3.cfr_renamed_3 = true;
        }
        if ((l2 & 0xFFFFFFFFL) > 0L) {
            // empty if block
        }
    }

    @Override
    public String cfr_renamed_313() {
        return cfr_renamed_2;
    }

    public static sprpep cfr_renamed_18945(sprujo arg0) {
        sprujo sprujo2 = arg0;
        long l = sprujo2.cfr_renamed_14060().cfr_renamed_3274();
        int n = sprujo2.cfr_renamed_13218();
        int n2 = sprujo2.cfr_renamed_13218();
        sprpep sprpep2 = new sprpep();
        if ((n & 0xFFFF) > 0) {
            sprujo sprujo3 = arg0;
            sprujo3.cfr_renamed_14060().cfr_renamed_11548(l + (long)(n & 0xFFFF));
            sprpep2.cfr_renamed_2 = sprsbp.cfr_renamed_18946(sprujo3);
        }
        if ((n2 & 0xFFFF) > 0) {
            sprujo sprujo4 = arg0;
            sprujo4.cfr_renamed_14060().cfr_renamed_11548(l + (long)(n2 & 0xFFFF));
            sprpep2.cfr_renamed_4 = sprsbp.cfr_renamed_18947(sprujo4);
        }
        return sprpep2;
    }

    public static sprxdp[] cfr_renamed_18947(sprujo arg0) {
        int n;
        int n2;
        sprujo sprujo2 = arg0;
        long l = sprujo2.cfr_renamed_14060().cfr_renamed_3274();
        int n3 = sprujo2.cfr_renamed_13218();
        sprdbp[] sprdbpArray = new sprdbp[n3];
        int n4 = n2 = 0;
        while (n4 < (n3 & 0xFFFF)) {
            sprdbpArray[n2++] = new sprdbp(sprsbp.cfr_renamed_18941(arg0.cfr_renamed_16065(4)), arg0.cfr_renamed_13218());
            n4 = n2;
        }
        sprxdp[] sprxdpArray = new sprxdp[n3];
        int n5 = n = 0;
        while (n5 < (n3 & 0xFFFF)) {
            sprdbp sprdbp2 = sprdbpArray[n];
            sprujo sprujo3 = arg0;
            sprujo3.cfr_renamed_14060().cfr_renamed_11548(l + (long)(sprdbp2.cfr_renamed_4 & 0xFFFF));
            sprxdp sprxdp2 = sprsbp.cfr_renamed_18943(sprujo3);
            sprxdp2.cfr_renamed_3 = sprdbp2.cfr_renamed_3;
            sprxdpArray[n++] = sprxdp2;
            n5 = n;
        }
        return sprxdpArray;
    }

    public static sprlip cfr_renamed_18944(sprujo arg0) {
        int n;
        sprujo sprujo2 = arg0;
        long l = sprujo2.cfr_renamed_14060().cfr_renamed_3274();
        int n2 = sprujo2.cfr_renamed_13218();
        int n3 = sprujo2.cfr_renamed_13218();
        int[] nArray = sprrzo.cfr_renamed_18661(sprujo2, n3 & 0xFFFF);
        sprnlp[] sprnlpArray = new sprnlp[n3];
        int n4 = n = 0;
        while (n4 < (n3 & 0xFFFF)) {
            int n5 = n;
            sprnlp sprnlp2 = sprsbp.cfr_renamed_18942(arg0, l + (long)(nArray[n] & 0xFFFF));
            sprnlpArray[n5] = sprnlp2;
            n4 = ++n;
        }
        return new sprlip(n2, sprnlpArray);
    }

    public static sprnlp cfr_renamed_18942(sprujo arg0, long arg1) {
        sprujo sprujo2 = arg0;
        sprujo2.cfr_renamed_14060().cfr_renamed_11548(arg1);
        switch (sprujo2.cfr_renamed_13218()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 1: {
                return new sprnlp(1, arg0.cfr_renamed_12254());
            }
            case 2: {
                return new sprnlp(2, arg0.cfr_renamed_12254(), arg0.cfr_renamed_13218(), arg0.cfr_renamed_13218());
            }
            case 3: 
        }
        return new sprnlp();
    }

    public static String cfr_renamed_18941(byte[] arg0) {
        char[] cArray = new char[4];
        cArray[0] = (char)(arg0[0] & 0xFF);
        cArray[1] = (char)(arg0[1] & 0xFF);
        cArray[2] = (char)(arg0[2] & 0xFF);
        cArray[3] = (char)(arg0[3] & 0xFF);
        return new String(cArray);
    }

    public static String[] cfr_renamed_18946(sprujo arg0) {
        int n;
        int n2 = arg0.cfr_renamed_13218();
        String[] stringArray = new String[n2];
        int n3 = n = 0;
        while (n3 < (n2 & 0xFFFF)) {
            stringArray[n++] = sprsbp.cfr_renamed_18941(arg0.cfr_renamed_16065(4));
            n3 = n;
        }
        return stringArray;
    }
}

