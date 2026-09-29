/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spradf;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdhf;
import com.spire.presentation.packages.sprdua;
import com.spire.presentation.packages.sprfxe;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprjo;
import com.spire.presentation.packages.sprkze;
import com.spire.presentation.packages.sprnwe;
import com.spire.presentation.packages.sproef;
import com.spire.presentation.packages.sprozz;
import com.spire.presentation.packages.sprtek;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvef;
import com.spire.presentation.packages.sprwcf;
import com.spire.presentation.packages.sprwil;
import com.spire.presentation.packages.sprwxe;
import com.spire.presentation.packages.sprybl;
import java.security.SecureRandom;

public class sprjdf
implements sprjo {
    public static final byte[] cfr_renamed_86 = sprdua.cfr_renamed_9("%C4\u0011!\u0007!\u0017!\u0011)\n*\u0006 C4\u0016&\u000f-\u0000d\u0000+\r7\u0017%\r0").getBytes();
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    private sprgf cfr_renamed_119;
    public static final String cfr_renamed_91 = "1.3.6.1.4.1.8301.3.1.3.4.2.3";
    private static final String cfr_renamed_0 = "SHA1PRNG";
    public sprkze cfr_renamed_1;
    private int cfr_renamed_2;
    private boolean cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    public int cfr_renamed_5628(sprkze arg0) {
        if (arg0 instanceof sprvef) {
            return ((sprvef)arg0).cfr_renamed_1146();
        }
        if (arg0 instanceof sprwxe) {
            return ((sprwxe)arg0).cfr_renamed_1146();
        }
        throw new IllegalArgumentException(sprdua.cfr_renamed_9("\u0016*\u00101\u00134\f6\u0017!\u0007d\u0017=\u0013!"));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5625(sprvef sprvef2) {
        void arg0;
        sprjdf sprjdf2 = this;
        void v1 = arg0;
        this.cfr_renamed_119 = sprwcf.cfr_renamed_2390(arg0.cfr_renamed_580());
        this.cfr_renamed_2 = v1.cfr_renamed_1146();
        sprjdf2.cfr_renamed_112 = v1.cfr_renamed_1150();
        sprjdf2.cfr_renamed_152 = sprvef2.cfr_renamed_1144();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5626(sprwxe sprwxe2) {
        void arg0;
        sprjdf sprjdf2 = this;
        void v1 = arg0;
        this.cfr_renamed_119 = sprwcf.cfr_renamed_2390(arg0.cfr_renamed_580());
        this.cfr_renamed_2 = v1.cfr_renamed_1146();
        sprjdf2.cfr_renamed_112 = v1.cfr_renamed_1150();
        sprjdf2.cfr_renamed_152 = sprwxe2.cfr_renamed_1144();
    }

    @Override
    public byte[] cfr_renamed_136(byte[] arg0) {
        int n;
        sprtek sprtek2;
        if (!this.cfr_renamed_3) {
            throw new IllegalStateException(sprozz.cfr_renamed_9("0\n#\u000b6\u0011s\n=\n'\n2\u000f:\u00106\u0007s\u0005<\u0011s\u00076\u0000!\u001a#\u0017:\f="));
        }
        sprjdf sprjdf2 = this;
        int n2 = sprjdf2.cfr_renamed_119.cfr_renamed_1218();
        int n3 = sprjdf2.cfr_renamed_112 >> 3;
        int n4 = sproef.cfr_renamed_920(sprjdf2.cfr_renamed_2, this.cfr_renamed_152).bitLength() - 1 >> 3;
        int n5 = n3 + n4 - n2 - cfr_renamed_86.length;
        if (arg0.length > n5) {
            n5 = arg0.length;
        }
        int n6 = n5 + cfr_renamed_86.length;
        int n7 = n6 + n2 - n3 - n4;
        byte[] byArray = new byte[n6];
        System.arraycopy(arg0, 0, byArray, 0, arg0.length);
        System.arraycopy(cfr_renamed_86, 0, byArray, n5, cfr_renamed_86.length);
        byte[] byArray2 = new byte[n2];
        this.cfr_renamed_4.nextBytes(byArray2);
        sprtek sprtek3 = sprtek2 = new sprtek(new sprwil());
        sprtek3.cfr_renamed_1353(byArray2);
        byte[] byArray3 = new byte[n6];
        sprtek3.cfr_renamed_1354(byArray3);
        int n8 = n = n6 - 1;
        while (n8 >= 0) {
            int n9 = n;
            byte by = (byte)(byArray3[n9] ^ byArray[n]);
            byArray3[n9] = by;
            n8 = --n;
        }
        sprjdf sprjdf3 = this;
        byte[] byArray4 = new byte[sprjdf3.cfr_renamed_119.cfr_renamed_1218()];
        sprjdf3.cfr_renamed_119.cfr_renamed_1197(byArray3, 0, byArray3.length);
        this.cfr_renamed_119.cfr_renamed_1219(byArray4, 0);
        int n10 = n2 - 1;
        int n11 = n10;
        while (n11 >= 0) {
            int n12 = n10;
            byte by = (byte)(byArray4[n12] ^ byArray2[n10]);
            byArray4[n12] = by;
            n11 = --n10;
        }
        byte[] byArray5 = sprnwe.cfr_renamed_543(byArray4, byArray3);
        byte[] byArray6 = new byte[]{};
        if (n7 > 0) {
            byArray6 = new byte[n7];
            System.arraycopy(byArray5, 0, byArray6, 0, n7);
        }
        byte[] byArray7 = new byte[n4];
        System.arraycopy(byArray5, n7, byArray7, 0, n4);
        byte[] byArray8 = new byte[n3];
        System.arraycopy(byArray5, n7 + n4, byArray8, 0, n3);
        sprjdf sprjdf4 = this;
        spradf spradf2 = spradf.cfr_renamed_963(sprjdf4.cfr_renamed_112, byArray8);
        sprjdf sprjdf5 = this;
        spradf spradf3 = sprdhf.cfr_renamed_1355(sprjdf4.cfr_renamed_2, sprjdf5.cfr_renamed_152, byArray7);
        byte[] byArray9 = sprfxe.cfr_renamed_5624((sprvef)sprjdf5.cfr_renamed_1, spradf2, spradf3).cfr_renamed_91();
        if (n7 > 0) {
            return sprnwe.cfr_renamed_543(byArray6, byArray9);
        }
        return byArray9;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        this.cfr_renamed_3 = arg0;
        if (this.cfr_renamed_3) {
            if (arg1 instanceof sprbgk) {
                sprbgk sprbgk2 = (sprbgk)arg1;
                sprjdf sprjdf2 = this;
                sprjdf2.cfr_renamed_4 = sprbgk2.cfr_renamed_1295();
                sprjdf2.cfr_renamed_1 = (sprvef)sprbgk2.cfr_renamed_284();
                sprjdf sprjdf3 = this;
                sprjdf3.cfr_renamed_5625((sprvef)sprjdf3.cfr_renamed_1);
                return;
            }
            this.cfr_renamed_4 = sprybl.cfr_renamed_2794();
            this.cfr_renamed_1 = (sprvef)arg1;
            sprjdf sprjdf4 = this;
            sprjdf4.cfr_renamed_5625((sprvef)sprjdf4.cfr_renamed_1);
            return;
        }
        this.cfr_renamed_1 = (sprwxe)arg1;
        sprjdf sprjdf5 = this;
        sprjdf5.cfr_renamed_5626((sprwxe)sprjdf5.cfr_renamed_1);
    }

    @Override
    public byte[] cfr_renamed_1214(byte[] arg0) throws sprull {
        int n;
        sprtek sprtek2;
        byte[] byArray;
        sprjdf sprjdf2;
        byte[] byArray2;
        byte[] byArray3;
        Object object;
        if (this.cfr_renamed_3) {
            throw new IllegalStateException(sprdua.cfr_renamed_9("'\n4\u000b!\u0011d\n*\n0\n%\u000f-\u0010!\u0007d\u0005+\u0011d\u0007!\u00006\u001a4\u0017-\f*"));
        }
        int n2 = this.cfr_renamed_2 >> 3;
        if (arg0.length < n2) {
            throw new sprull(sprozz.cfr_renamed_9("!2\u0007s32\u00077\n=\u0004iC\u0010\n#\u000b6\u0011'\u0006+\u0017s\u0017<\fs\u0010;\f!\u0017}"));
        }
        sprjdf sprjdf3 = this;
        int n3 = sprjdf3.cfr_renamed_119.cfr_renamed_1218();
        int n4 = sprjdf3.cfr_renamed_112 >> 3;
        int n5 = sproef.cfr_renamed_920(sprjdf3.cfr_renamed_2, this.cfr_renamed_152).bitLength() - 1 >> 3;
        int n6 = arg0.length - n2;
        if (n6 > 0) {
            object = sprnwe.cfr_renamed_1121(arg0, n6);
            byArray3 = object[0];
            byArray2 = object[1];
            sprjdf2 = this;
        } else {
            byArray3 = new byte[]{};
            byArray2 = arg0;
            sprjdf2 = this;
        }
        object = spradf.cfr_renamed_963(sprjdf2.cfr_renamed_2, byArray2);
        spradf[] spradfArray = sprfxe.cfr_renamed_5627((sprwxe)this.cfr_renamed_1, (spradf)object);
        byte[] byArray4 = spradfArray[0].cfr_renamed_91();
        spradf spradf2 = spradfArray[1];
        if (byArray4.length > n4) {
            byArray4 = sprnwe.cfr_renamed_1109(byArray4, 0, n4);
        }
        sprjdf sprjdf4 = this;
        byte[] byArray5 = sprdhf.cfr_renamed_5629(sprjdf4.cfr_renamed_2, sprjdf4.cfr_renamed_152, spradf2);
        if (byArray5.length < n5) {
            byArray = new byte[n5];
            System.arraycopy(byArray5, 0, byArray, n5 - byArray5.length, byArray5.length);
            byArray5 = byArray;
        }
        byArray = sprnwe.cfr_renamed_543(byArray3, byArray5);
        byArray = sprnwe.cfr_renamed_543(byArray, byArray4);
        int n7 = byArray.length - n3;
        byte[][] byArray6 = sprnwe.cfr_renamed_1121(byArray, n3);
        byte[] byArray7 = byArray6[0];
        byte[] byArray8 = byArray6[1];
        sprjdf sprjdf5 = this;
        byte[] byArray9 = new byte[sprjdf5.cfr_renamed_119.cfr_renamed_1218()];
        sprjdf5.cfr_renamed_119.cfr_renamed_1197(byArray8, 0, byArray8.length);
        this.cfr_renamed_119.cfr_renamed_1219(byArray9, 0);
        int n8 = n3 - 1;
        int n9 = n8;
        while (n9 >= 0) {
            int n10 = n8;
            byte by = (byte)(byArray9[n10] ^ byArray7[n8]);
            byArray9[n10] = by;
            n9 = --n8;
        }
        sprtek sprtek3 = sprtek2 = new sprtek(new sprwil());
        sprtek3.cfr_renamed_1353(byArray9);
        byte[] byArray10 = new byte[n7];
        sprtek3.cfr_renamed_1354(byArray10);
        int n11 = n = n7 - 1;
        while (n11 >= 0) {
            int n12 = n;
            byte by = (byte)(byArray10[n12] ^ byArray8[n]);
            byArray10[n12] = by;
            n11 = --n;
        }
        if (byArray10.length < n7) {
            throw new sprull(sprdua.cfr_renamed_9("\u0006\u0002 C\u0014\u0002 \u0007-\r#Yd\n*\u0015%\u000f-\u0007d\u0000-\u0013,\u00066\u0017!\u001b0"));
        }
        byte[][] byArray11 = sprnwe.cfr_renamed_1121(byArray10, n7 - cfr_renamed_86.length);
        byte[] byArray12 = byArray11[0];
        if (!sprnwe.cfr_renamed_1110(byArray11[1], cfr_renamed_86)) {
            throw new sprull(sprozz.cfr_renamed_9("\u0011\u00027C\u0003\u00027\u0007:\r4Ys\n=\u00152\u000f:\u0007s\u0000:\u0013;\u0006!\u00176\u001b'"));
        }
        return byArray12;
    }
}

