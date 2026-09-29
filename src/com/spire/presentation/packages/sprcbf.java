/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spradf;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdhf;
import com.spire.presentation.packages.sprfxe;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprjo;
import com.spire.presentation.packages.sprjuy;
import com.spire.presentation.packages.sprkze;
import com.spire.presentation.packages.sprnwe;
import com.spire.presentation.packages.sprtek;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvef;
import com.spire.presentation.packages.sprvrc;
import com.spire.presentation.packages.sprwcf;
import com.spire.presentation.packages.sprwil;
import com.spire.presentation.packages.sprwxe;
import com.spire.presentation.packages.sprybl;
import java.security.SecureRandom;

public class sprcbf
implements sprjo {
    private boolean cfr_renamed_152;
    private sprgf cfr_renamed_112;
    private int cfr_renamed_119;
    private static final String cfr_renamed_91 = "SHA1PRNG";
    private int cfr_renamed_0;
    public sprkze cfr_renamed_1;
    private SecureRandom cfr_renamed_2;
    public static final String cfr_renamed_3 = "1.3.6.1.4.1.8301.3.1.3.4.2.1";
    private int cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_1214(byte[] arg0) throws sprull {
        int n;
        sprtek sprtek2;
        if (this.cfr_renamed_152) {
            throw new IllegalStateException(sprjuy.cfr_renamed_9("<l/m:w\u007fl1l+l>i6v:a\u007fc0w\u007fa:f-|/q6j1"));
        }
        int n2 = this.cfr_renamed_4 + 7 >> 3;
        int n3 = arg0.length - n2;
        byte[][] byArray = sprnwe.cfr_renamed_1121(arg0, n2);
        byte[] byArray2 = byArray[0];
        byte[] byArray3 = byArray[1];
        sprcbf sprcbf2 = this;
        spradf spradf2 = spradf.cfr_renamed_963(sprcbf2.cfr_renamed_4, byArray2);
        spradf[] spradfArray = sprfxe.cfr_renamed_5627((sprwxe)sprcbf2.cfr_renamed_1, spradf2);
        byte[] byArray4 = spradfArray[0].cfr_renamed_91();
        spradf spradf3 = spradfArray[1];
        sprtek sprtek3 = sprtek2 = new sprtek(new sprwil());
        sprtek3.cfr_renamed_1353(byArray4);
        byte[] byArray5 = new byte[n3];
        sprtek3.cfr_renamed_1354(byArray5);
        int n4 = n = 0;
        while (n4 < n3) {
            int n5 = n;
            byte by = (byte)(byArray5[n5] ^ byArray3[n]);
            byArray5[n5] = by;
            n4 = ++n;
        }
        byte[] byArray6 = sprnwe.cfr_renamed_543(byArray4, byArray5);
        sprcbf sprcbf3 = this;
        byte[] byArray7 = new byte[sprcbf3.cfr_renamed_112.cfr_renamed_1218()];
        sprcbf3.cfr_renamed_112.cfr_renamed_1197(byArray6, 0, byArray6.length);
        this.cfr_renamed_112.cfr_renamed_1219(byArray7, 0);
        sprcbf sprcbf4 = this;
        spradf2 = sprdhf.cfr_renamed_1355(sprcbf4.cfr_renamed_4, sprcbf4.cfr_renamed_119, byArray7);
        if (!spradf2.equals(spradf3)) {
            throw new sprull(sprvrc.cfr_renamed_9("\u000bJ-\u000b\u0019J-O E.\u0011iB'](G OiH [!N;_,S="));
        }
        return byArray5;
    }

    @Override
    public byte[] cfr_renamed_136(byte[] arg0) {
        int n;
        if (!this.cfr_renamed_152) {
            throw new IllegalStateException(sprjuy.cfr_renamed_9("<l/m:w\u007fl1l+l>i6v:a\u007fc0w\u007fa:f-|/q6j1"));
        }
        sprcbf sprcbf2 = this;
        spradf spradf2 = new spradf(sprcbf2.cfr_renamed_0, sprcbf2.cfr_renamed_2);
        byte[] byArray = spradf2.cfr_renamed_91();
        byte[] byArray2 = sprnwe.cfr_renamed_543(byArray, arg0);
        this.cfr_renamed_112.cfr_renamed_1197(byArray2, 0, byArray2.length);
        sprcbf sprcbf3 = this;
        byte[] byArray3 = new byte[sprcbf3.cfr_renamed_112.cfr_renamed_1218()];
        sprcbf sprcbf4 = this;
        sprcbf3.cfr_renamed_112.cfr_renamed_1219(byArray3, 0);
        spradf spradf3 = sprdhf.cfr_renamed_1355(this.cfr_renamed_4, sprcbf4.cfr_renamed_119, byArray3);
        byte[] byArray4 = sprfxe.cfr_renamed_5624((sprvef)sprcbf4.cfr_renamed_1, spradf2, spradf3).cfr_renamed_91();
        sprtek sprtek2 = new sprtek(new sprwil());
        sprtek2.cfr_renamed_1353(byArray);
        byte[] byArray5 = new byte[arg0.length];
        sprtek2.cfr_renamed_1354(byArray5);
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            byte by = (byte)(byArray5[n3] ^ arg0[n]);
            byArray5[n3] = by;
            n2 = ++n;
        }
        return sprnwe.cfr_renamed_543(byArray4, byArray5);
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        this.cfr_renamed_152 = arg0;
        if (this.cfr_renamed_152) {
            if (arg1 instanceof sprbgk) {
                sprbgk sprbgk2 = (sprbgk)arg1;
                sprcbf sprcbf2 = this;
                sprcbf2.cfr_renamed_2 = sprbgk2.cfr_renamed_1295();
                sprcbf2.cfr_renamed_1 = (sprvef)sprbgk2.cfr_renamed_284();
                sprcbf sprcbf3 = this;
                sprcbf3.cfr_renamed_5625((sprvef)sprcbf3.cfr_renamed_1);
                return;
            }
            this.cfr_renamed_2 = sprybl.cfr_renamed_2794();
            this.cfr_renamed_1 = (sprvef)arg1;
            sprcbf sprcbf4 = this;
            sprcbf4.cfr_renamed_5625((sprvef)sprcbf4.cfr_renamed_1);
            return;
        }
        this.cfr_renamed_1 = (sprwxe)arg1;
        sprcbf sprcbf5 = this;
        sprcbf5.cfr_renamed_5626((sprwxe)sprcbf5.cfr_renamed_1);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5625(sprvef sprvef2) {
        void arg0;
        sprcbf sprcbf2 = this;
        void v1 = arg0;
        this.cfr_renamed_112 = sprwcf.cfr_renamed_2390(arg0.cfr_renamed_580());
        this.cfr_renamed_4 = v1.cfr_renamed_1146();
        sprcbf2.cfr_renamed_0 = v1.cfr_renamed_1150();
        sprcbf2.cfr_renamed_119 = sprvef2.cfr_renamed_1144();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5626(sprwxe sprwxe2) {
        void arg0;
        sprcbf sprcbf2 = this;
        void v1 = arg0;
        this.cfr_renamed_112 = sprwcf.cfr_renamed_2390(v1.cfr_renamed_580());
        sprcbf2.cfr_renamed_4 = v1.cfr_renamed_1146();
        sprcbf2.cfr_renamed_119 = sprwxe2.cfr_renamed_1144();
    }

    public int cfr_renamed_5628(sprkze arg0) throws IllegalArgumentException {
        if (arg0 instanceof sprvef) {
            return ((sprvef)arg0).cfr_renamed_1146();
        }
        if (arg0 instanceof sprwxe) {
            return ((sprwxe)arg0).cfr_renamed_1146();
        }
        throw new IllegalArgumentException(sprvrc.cfr_renamed_9("^'X<[9D;_,Oi_0[,"));
    }
}

