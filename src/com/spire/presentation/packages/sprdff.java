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
import com.spire.presentation.packages.sprjth;
import com.spire.presentation.packages.sprkze;
import com.spire.presentation.packages.sprnwe;
import com.spire.presentation.packages.sprqte;
import com.spire.presentation.packages.sprtek;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvef;
import com.spire.presentation.packages.sprwcf;
import com.spire.presentation.packages.sprwil;
import com.spire.presentation.packages.sprwxe;
import com.spire.presentation.packages.sprybl;
import java.security.SecureRandom;

public class sprdff
implements sprjo {
    private boolean cfr_renamed_112;
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private int cfr_renamed_0;
    private sprgf cfr_renamed_1;
    public sprkze cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    public static final String cfr_renamed_4 = "1.3.6.1.4.1.8301.3.1.3.4.2.2";

    @Override
    public byte[] cfr_renamed_136(byte[] arg0) {
        int n;
        if (!this.cfr_renamed_112) {
            throw new IllegalStateException(sprqte.cfr_renamed_9("*[9Z,@i['[=[(^ A,ViT&@iV,Q;K9F ]'"));
        }
        sprdff sprdff2 = this;
        int n2 = sprdff2.cfr_renamed_0 >> 3;
        byte[] byArray = new byte[n2];
        sprdff2.cfr_renamed_3.nextBytes(byArray);
        sprdff sprdff3 = this;
        spradf spradf2 = new spradf(sprdff3.cfr_renamed_0, sprdff3.cfr_renamed_3);
        byte[] byArray2 = spradf2.cfr_renamed_91();
        byte[] byArray3 = sprnwe.cfr_renamed_543(arg0, byArray);
        sprdff2.cfr_renamed_1.cfr_renamed_1197(byArray3, 0, byArray3.length);
        sprdff sprdff4 = this;
        byte[] byArray4 = new byte[sprdff4.cfr_renamed_1.cfr_renamed_1218()];
        sprdff sprdff5 = this;
        sprdff4.cfr_renamed_1.cfr_renamed_1219(byArray4, 0);
        spradf spradf3 = sprdhf.cfr_renamed_1355(this.cfr_renamed_91, sprdff5.cfr_renamed_119, byArray4);
        byte[] byArray5 = sprfxe.cfr_renamed_5624((sprvef)sprdff5.cfr_renamed_2, spradf2, spradf3).cfr_renamed_91();
        sprtek sprtek2 = new sprtek(new sprwil());
        sprtek2.cfr_renamed_1353(byArray2);
        byte[] byArray6 = new byte[arg0.length + n2];
        sprtek2.cfr_renamed_1354(byArray6);
        int n3 = n = 0;
        while (n3 < arg0.length) {
            int n4 = n;
            byte by = (byte)(byArray6[n4] ^ arg0[n]);
            byArray6[n4] = by;
            n3 = ++n;
        }
        int n5 = n = 0;
        while (n5 < n2) {
            int n6 = arg0.length + n;
            byte by = (byte)(byArray6[n6] ^ byArray[n]);
            byArray6[n6] = by;
            n5 = ++n;
        }
        return sprnwe.cfr_renamed_543(byArray5, byArray6);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5625(sprvef sprvef2) {
        void arg0;
        sprdff sprdff2 = this;
        void v1 = arg0;
        this.cfr_renamed_1 = sprwcf.cfr_renamed_2390(arg0.cfr_renamed_580());
        this.cfr_renamed_91 = v1.cfr_renamed_1146();
        sprdff2.cfr_renamed_0 = v1.cfr_renamed_1150();
        sprdff2.cfr_renamed_119 = sprvef2.cfr_renamed_1144();
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        this.cfr_renamed_112 = arg0;
        if (this.cfr_renamed_112) {
            if (arg1 instanceof sprbgk) {
                sprbgk sprbgk2 = (sprbgk)arg1;
                sprdff sprdff2 = this;
                sprdff2.cfr_renamed_3 = sprbgk2.cfr_renamed_1295();
                sprdff2.cfr_renamed_2 = (sprvef)sprbgk2.cfr_renamed_284();
                sprdff sprdff3 = this;
                sprdff3.cfr_renamed_5625((sprvef)sprdff3.cfr_renamed_2);
                return;
            }
            this.cfr_renamed_3 = sprybl.cfr_renamed_2794();
            this.cfr_renamed_2 = (sprvef)arg1;
            sprdff sprdff4 = this;
            sprdff4.cfr_renamed_5625((sprvef)sprdff4.cfr_renamed_2);
            return;
        }
        this.cfr_renamed_2 = (sprwxe)arg1;
        sprdff sprdff5 = this;
        sprdff5.cfr_renamed_5626((sprwxe)sprdff5.cfr_renamed_2);
    }

    public int cfr_renamed_1207(int arg0) {
        return 0;
    }

    @Override
    public byte[] cfr_renamed_1214(byte[] arg0) throws sprull {
        int n;
        sprtek sprtek2;
        if (this.cfr_renamed_112) {
            throw new IllegalStateException(sprjth.cfr_renamed_9("Nb]cHy\rbCbYbLgDxHo\rmBy\roHh_r]\u007fDdC"));
        }
        int n2 = this.cfr_renamed_91 + 7 >> 3;
        int n3 = arg0.length - n2;
        byte[][] byArray = sprnwe.cfr_renamed_1121(arg0, n2);
        byte[] byArray2 = byArray[0];
        byte[] byArray3 = byArray[1];
        sprdff sprdff2 = this;
        spradf spradf2 = spradf.cfr_renamed_963(sprdff2.cfr_renamed_91, byArray2);
        spradf[] spradfArray = sprfxe.cfr_renamed_5627((sprwxe)sprdff2.cfr_renamed_2, spradf2);
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
        this.cfr_renamed_1.cfr_renamed_1197(byArray5, 0, byArray5.length);
        sprdff sprdff3 = this;
        byte[] byArray6 = new byte[sprdff3.cfr_renamed_1.cfr_renamed_1218()];
        sprdff3.cfr_renamed_1.cfr_renamed_1219(byArray6, 0);
        sprdff sprdff4 = this;
        spradf2 = sprdhf.cfr_renamed_1355(sprdff4.cfr_renamed_91, sprdff4.cfr_renamed_119, byArray6);
        if (!spradf2.equals(spradf3)) {
            throw new sprull(sprqte.cfr_renamed_9("p(Vib(V-['Us\u0012\u0000\\?S%[-\u0012*[9Z,@=W1Fg"));
        }
        int n6 = this.cfr_renamed_0 >> 3;
        return sprnwe.cfr_renamed_1121(byArray5, n3 - n6)[0];
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5626(sprwxe sprwxe2) {
        void arg0;
        sprdff sprdff2 = this;
        void v1 = arg0;
        this.cfr_renamed_1 = sprwcf.cfr_renamed_2390(arg0.cfr_renamed_580());
        this.cfr_renamed_91 = v1.cfr_renamed_1146();
        sprdff2.cfr_renamed_0 = v1.cfr_renamed_1150();
        sprdff2.cfr_renamed_119 = sprwxe2.cfr_renamed_1144();
    }

    public int cfr_renamed_1209(int arg0) {
        return 0;
    }

    public int cfr_renamed_5628(sprkze arg0) throws IllegalArgumentException {
        if (arg0 instanceof sprvef) {
            return ((sprvef)arg0).cfr_renamed_1146();
        }
        if (arg0 instanceof sprwxe) {
            return ((sprwxe)arg0).cfr_renamed_1146();
        }
        throw new IllegalArgumentException(sprjth.cfr_renamed_9("~CxX{]d_\u007fHo\r\u007fT{H"));
    }
}

